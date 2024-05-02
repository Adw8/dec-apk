package defpackage;

import java.util.Arrays;

/* renamed from: pz6  reason: default package */
/* loaded from: classes.dex */
public final class pz6 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public short f7330R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f7331R;

    /* renamed from: R  reason: collision with other field name */
    public char[] f7332R;

    /* renamed from: R  reason: collision with other field name */
    public final long[] f7333R;
    public boolean v;

    public pz6(long j, int i) {
        this.R = i;
        this.f7332R = new char[(int) (((float) i) * 1.5f)];
        this.f7333R = new long[i];
        R(j);
    }

    public final void R(long j) {
        Arrays.fill(this.f7332R, ' ');
        Arrays.fill(this.f7333R, j);
        this.f7330R = (short) this.R;
        this.v = false;
    }

    public final void c(int i, int i2, long j) {
        int i3;
        if (i >= 0) {
            long[] jArr = this.f7333R;
            if (i < jArr.length) {
                jArr[i] = j;
                int z = lTs.z(i2);
                boolean z2 = true;
                if (!this.v) {
                    if (i2 >= 65536 || z != 1) {
                        this.v = true;
                    } else {
                        this.f7332R[i] = (char) i2;
                        return;
                    }
                }
                boolean z3 = z <= 0;
                boolean z4 = i > 0 && e(i + -1);
                if (!z3) {
                    if (z4) {
                        c(i - 1, 32, j);
                    }
                    if (z != 2 || !e(i + 1)) {
                        z2 = false;
                    }
                    if (z2) {
                        c(i + 1, 32, j);
                    }
                } else if (z4) {
                    i--;
                }
                char[] cArr = this.f7332R;
                int v = v(i);
                char c = cArr[v];
                boolean isHighSurrogate = Character.isHighSurrogate(c);
                int i4 = c;
                if (isHighSurrogate) {
                    i4 = Character.toCodePoint(c, cArr[v + 1]);
                }
                int z5 = lTs.z(i4 == 1 ? 1 : 0);
                int i5 = i + z5;
                int v2 = (i5 < this.R ? v(i5) : this.f7330R) - v;
                int charCount = Character.charCount(i2);
                if (z3) {
                    charCount += v2;
                }
                int i6 = v + v2;
                int i7 = v + charCount;
                int i8 = charCount - v2;
                if (i8 > 0) {
                    short s = this.f7330R;
                    int i9 = s - i6;
                    if (s + i8 > cArr.length) {
                        char[] cArr2 = new char[cArr.length + this.R];
                        System.arraycopy(cArr, 0, cArr2, 0, i6);
                        System.arraycopy(cArr, i6, cArr2, i7, i9);
                        this.f7332R = cArr2;
                        cArr = cArr2;
                    } else {
                        System.arraycopy(cArr, i6, cArr, i7, i9);
                    }
                } else if (i8 < 0) {
                    System.arraycopy(cArr, i6, cArr, i7, this.f7330R - i6);
                }
                this.f7330R = (short) (this.f7330R + i8);
                if (!z3) {
                    v2 = 0;
                }
                Character.toChars(i2, cArr, v + v2);
                if (z5 == 2) {
                    i3 = 1;
                    if (z == 1) {
                        short s2 = this.f7330R;
                        if (s2 + 1 > cArr.length) {
                            char[] cArr3 = new char[cArr.length + this.R];
                            System.arraycopy(cArr, 0, cArr3, 0, i7);
                            System.arraycopy(cArr, i7, cArr3, i7 + 1, this.f7330R - i7);
                            this.f7332R = cArr3;
                            cArr = cArr3;
                        } else {
                            System.arraycopy(cArr, i7, cArr, i7 + 1, s2 - i7);
                        }
                        cArr[i7] = ' ';
                        this.f7330R = (short) (this.f7330R + 1);
                        return;
                    }
                } else {
                    i3 = 1;
                }
                if (z5 == i3 && z == 2) {
                    int i10 = this.R;
                    if (i == i10 - 1) {
                        throw new IllegalArgumentException("Cannot put wide character in last column");
                    } else if (i == i10 - 2) {
                        this.f7330R = (short) i7;
                        return;
                    } else {
                        if (Character.isHighSurrogate(this.f7332R[i7])) {
                            i3 = 2;
                        }
                        int i11 = i3 + i7;
                        System.arraycopy(cArr, i11, cArr, i7, this.f7330R - i11);
                        this.f7330R = (short) (this.f7330R - (i11 - i7));
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        StringBuilder y = jQ.y("TerminalRow.setChar(): columnToSet=", i, ", codePoint=", i2, ", style=");
        y.append(j);
        throw new IllegalArgumentException(y.toString());
    }

    public final boolean e(int i) {
        short s = 0;
        int i2 = 0;
        while (s < this.f7330R) {
            int i3 = s + 1;
            char c = this.f7332R[s];
            boolean isHighSurrogate = Character.isHighSurrogate(c);
            int i4 = c;
            if (isHighSurrogate) {
                i3++;
                i4 = Character.toCodePoint(c, this.f7332R[i3]);
            }
            int z = lTs.z(i4 == 1 ? 1 : 0);
            if (z > 0) {
                if (i2 == i && z == 2) {
                    return true;
                }
                i2 += z;
                if (i2 > i) {
                    return false;
                }
            }
            s = i3;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r3 >= r6.f7330R) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0035, code lost:
        if (java.lang.Character.isHighSurrogate(r6.f7332R[r3]) == false) goto L_0x004c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0037, code lost:
        r7 = r6.f7332R;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0047, code lost:
        if (defpackage.lTs.z(java.lang.Character.toCodePoint(r7[r3], r7[r3 + 1])) > 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0049, code lost:
        r3 = r3 + 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0054, code lost:
        if (defpackage.lTs.z(r6.f7332R[r3]) > 0) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0056, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0059, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int v(int r7) {
        /*
            r6 = this;
            int r0 = r6.R
            if (r7 != r0) goto L_0x0007
            short r6 = r6.f7330R
            return r6
        L_0x0007:
            r0 = 0
            r1 = r0
        L_0x0009:
            char[] r2 = r6.f7332R
            int r3 = r0 + 1
            char r2 = r2[r0]
            boolean r4 = java.lang.Character.isHighSurrogate(r2)
            if (r4 == 0) goto L_0x0020
            char[] r4 = r6.f7332R
            int r5 = r3 + 1
            char r3 = r4[r3]
            int r2 = java.lang.Character.toCodePoint(r2, r3)
            r3 = r5
        L_0x0020:
            int r2 = defpackage.lTs.z(r2)
            if (r2 <= 0) goto L_0x005d
            int r1 = r1 + r2
            if (r1 != r7) goto L_0x005a
        L_0x0029:
            short r7 = r6.f7330R
            if (r3 >= r7) goto L_0x0059
            char[] r7 = r6.f7332R
            char r7 = r7[r3]
            boolean r7 = java.lang.Character.isHighSurrogate(r7)
            if (r7 == 0) goto L_0x004c
            char[] r7 = r6.f7332R
            char r0 = r7[r3]
            int r1 = r3 + 1
            char r7 = r7[r1]
            int r7 = java.lang.Character.toCodePoint(r0, r7)
            int r7 = defpackage.lTs.z(r7)
            if (r7 > 0) goto L_0x0059
            int r3 = r3 + 2
            goto L_0x0029
        L_0x004c:
            char[] r7 = r6.f7332R
            char r7 = r7[r3]
            int r7 = defpackage.lTs.z(r7)
            if (r7 > 0) goto L_0x0059
            int r3 = r3 + 1
            goto L_0x0029
        L_0x0059:
            return r3
        L_0x005a:
            if (r1 <= r7) goto L_0x005d
            return r0
        L_0x005d:
            r0 = r3
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pz6.v(int):int");
    }
}
