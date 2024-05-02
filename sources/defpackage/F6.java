package defpackage;

import java.io.Serializable;
import java.util.Arrays;

/* renamed from: F6  reason: default package */
/* loaded from: classes.dex */
public class F6 implements Serializable, Comparable {
    public static final F6 R = new F6(new byte[0]);

    /* renamed from: R  reason: collision with other field name */
    public transient String f114R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f115R;
    public transient int e;

    static {
        new kgV(19, 0);
    }

    public F6(byte[] bArr) {
        this.f115R = bArr;
    }

    public boolean L(F6 f6, int i) {
        return f6.O(0, 0, i, this.f115R);
    }

    public boolean O(int i, int i2, int i3, byte[] bArr) {
        boolean z;
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f115R;
        if (i > bArr2.length - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int i4 = 0;
        while (true) {
            if (i4 >= i3) {
                z = true;
                break;
            } else if (bArr2[i4 + i] != bArr[i4 + i2]) {
                z = false;
                break;
            } else {
                i4++;
            }
        }
        return z;
    }

    public String R() {
        return g5O.R(this.f115R, g5O.v);
    }

    public byte X(int i) {
        return this.f115R[i];
    }

    public F6 Z() {
        byte b;
        int i = 0;
        while (true) {
            byte[] bArr = this.f115R;
            if (i >= bArr.length) {
                return this;
            }
            byte b2 = bArr[i];
            byte b3 = (byte) 65;
            if (b2 < b3 || b2 > (b = (byte) 90)) {
                i++;
            } else {
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                copyOf[i] = (byte) (b2 + 32);
                for (int i2 = i + 1; i2 < copyOf.length; i2++) {
                    byte b4 = copyOf[i2];
                    if (b4 >= b3 && b4 <= b) {
                        copyOf[i2] = (byte) (b4 + 32);
                    }
                }
                return new F6(copyOf);
            }
        }
    }

    public String c() {
        byte[] bArr = this.f115R;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = me6.f6099R;
            cArr[i] = cArr2[(b >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b & 15];
        }
        return new String(cArr);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002a, code lost:
        if (r0 < r1) goto L_0x002c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r6 < r7) goto L_0x002c;
     */
    @Override // java.lang.Comparable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int compareTo(java.lang.Object r9) {
        /*
            r8 = this;
            F6 r9 = (defpackage.F6) r9
            int r0 = r8.v()
            int r1 = r9.v()
            int r2 = java.lang.Math.min(r0, r1)
            r3 = 0
            r4 = r3
        L_0x0010:
            r5 = -1
            if (r4 >= r2) goto L_0x0027
            byte r6 = r8.X(r4)
            r6 = r6 & 255(0xff, float:3.57E-43)
            byte r7 = r9.X(r4)
            r7 = r7 & 255(0xff, float:3.57E-43)
            if (r6 != r7) goto L_0x0024
            int r4 = r4 + 1
            goto L_0x0010
        L_0x0024:
            if (r6 >= r7) goto L_0x002e
            goto L_0x002c
        L_0x0027:
            if (r0 != r1) goto L_0x002a
            goto L_0x002f
        L_0x002a:
            if (r0 >= r1) goto L_0x002e
        L_0x002c:
            r3 = r5
            goto L_0x002f
        L_0x002e:
            r3 = 1
        L_0x002f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F6.compareTo(java.lang.Object):int");
    }

    public byte[] e() {
        return this.f115R;
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof F6) {
            F6 f6 = (F6) obj;
            int v = f6.v();
            byte[] bArr = this.f115R;
            if (v == bArr.length && f6.O(0, 0, bArr.length, bArr)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f115R);
        this.e = hashCode;
        return hashCode;
    }

    public final String m() {
        String str = this.f114R;
        if (str != null) {
            return str;
        }
        String str2 = new String(e(), O1.R);
        this.f114R = str2;
        return str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0101, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:109:0x0112, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x0121, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x0133, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:124:0x0140, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x0188, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0199, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01aa, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x01b9, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x01cf, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x01dc, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x01e3, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x0222, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x0225, code lost:
        r5 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x009b, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x00aa, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x00b5, code lost:
        if (r4 == 64) goto L_0x0226;
     */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0225 A[EDGE_INSN: B:238:0x0225->B:216:0x0225 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0225 A[EDGE_INSN: B:243:0x0225->B:216:0x0225 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:248:0x0225 A[EDGE_INSN: B:248:0x0225->B:216:0x0225 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:260:0x0225 A[EDGE_INSN: B:260:0x0225->B:216:0x0225 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:266:0x0225 A[EDGE_INSN: B:266:0x0225->B:216:0x0225 ?: BREAK  , SYNTHETIC] */
    @Override // java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String toString() {
        /*
        // Method dump skipped, instructions count: 755
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.F6.toString():java.lang.String");
    }

    public int v() {
        return this.f115R.length;
    }

    public void x(ME me, int i) {
        me.write(this.f115R, 0, i);
    }
}
