package defpackage;

import java.util.Arrays;

/* renamed from: idE  reason: default package */
/* loaded from: classes.dex */
public final class idE {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public pz6[] f4673R;
    public int c;
    public int v;
    public int e = 0;
    public int X = 0;

    public idE(int i, int i2, int i3) {
        this.c = i;
        this.R = i2;
        this.v = i3;
        this.f4673R = new pz6[i2];
        e(0, 0, i, i3, 32, ffC.f3495R);
    }

    public final String L(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        StringBuilder sb = new StringBuilder();
        int i7 = this.c;
        int i8 = -this.e;
        if (i2 >= i8) {
            i8 = i2;
        }
        int i9 = this.v;
        int i10 = i4 >= i9 ? i9 - 1 : i4;
        int i11 = i8;
        while (i11 <= i10) {
            int i12 = i11 == i8 ? i : 0;
            if (i11 != i10 || (i5 = i3 + 1) > i7) {
                i5 = i7;
            }
            pz6 pz6 = this.f4673R[O(i11)];
            int v = pz6.v(i12);
            int v2 = i5 < this.c ? pz6.v(i5) : pz6.f7330R;
            if (v2 == v) {
                v2 = pz6.v(i5 + 1);
            }
            char[] cArr = pz6.f7332R;
            boolean z = this.f4673R[O(i11)].f7331R;
            if (!z || i5 != i7) {
                int i13 = -1;
                for (int i14 = v; i14 < v2; i14++) {
                    if (cArr[i14] != ' ') {
                        i13 = i14;
                    }
                }
                i6 = i13;
            } else {
                i6 = v2 - 1;
            }
            int i15 = (i6 - v) + 1;
            if (i6 != -1 && i15 > 0) {
                sb.append(cArr, v, i15);
            }
            if (!z && i11 < i10 && i11 < this.v - 1) {
                sb.append('\n');
            }
            i11++;
        }
        return sb.toString();
    }

    public final int O(int i) {
        if (i < (-this.e) || i > this.v) {
            StringBuilder C = opT.C("extRow=", i, ", mScreenRows=");
            C.append(this.v);
            C.append(", mActiveTranscriptRows=");
            C.append(this.e);
            throw new IllegalArgumentException(C.toString());
        }
        int i2 = this.X + i;
        int i3 = this.R;
        return i2 < 0 ? i3 + i2 : i2 % i3;
    }

    public final pz6 R(int i) {
        pz6[] pz6Arr = this.f4673R;
        pz6 pz6 = pz6Arr[i];
        if (pz6 != null) {
            return pz6;
        }
        pz6 pz62 = new pz6(0, this.c);
        pz6Arr[i] = pz62;
        return pz62;
    }

    public final void X() {
        int i = this.X;
        int i2 = this.e;
        if (i < i2) {
            pz6[] pz6Arr = this.f4673R;
            int i3 = this.R;
            Arrays.fill(pz6Arr, (i + i3) - i2, i3, (Object) null);
            Arrays.fill(this.f4673R, 0, this.X, (Object) null);
        } else {
            Arrays.fill(this.f4673R, i - i2, i, (Object) null);
        }
        this.e = 0;
    }

    public final void Z(int i, int i2, long j) {
        int i3 = i2 - 1;
        if (i > i3 || i < 0 || i2 > this.v) {
            StringBuilder y = jQ.y("topMargin=", i, ", bottomMargin=", i2, ", mScreenRows=");
            y.append(this.v);
            throw new IllegalArgumentException(y.toString());
        }
        c(this.X, i);
        c(O(i2), this.v - i2);
        int i4 = this.R;
        this.X = (this.X + 1) % i4;
        int i5 = this.e;
        if (i5 < i4 - this.v) {
            this.e = i5 + 1;
        }
        int O = O(i3);
        pz6[] pz6Arr = this.f4673R;
        pz6 pz6 = pz6Arr[O];
        if (pz6 == null) {
            pz6Arr[O] = new pz6(j, this.c);
        } else {
            pz6.R(j);
        }
    }

    public final void c(int i, int i2) {
        if (i2 != 0) {
            int i3 = this.R;
            int i4 = i2 - 1;
            pz6 pz6 = this.f4673R[((i + i4) + 1) % i3];
            while (i4 >= 0) {
                pz6[] pz6Arr = this.f4673R;
                int i5 = i + i4;
                pz6Arr[(i5 + 1) % i3] = pz6Arr[i5 % i3];
                i4--;
            }
            this.f4673R[i % i3] = pz6;
        }
    }

    public final void e(int i, int i2, int i3, int i4, int i5, long j) {
        if (i < 0 || i + i3 > this.c || i2 < 0 || i2 + i4 > this.v) {
            StringBuilder y = jQ.y("Illegal arguments! blockSet(", i, ", ", i2, ", ");
            y.append(i3);
            y.append(", ");
            y.append(i4);
            y.append(", ");
            y.append(i5);
            y.append(", ");
            y.append(this.c);
            y.append(", ");
            throw new IllegalArgumentException(jQ.j(y, this.v, ")"));
        }
        for (int i6 = 0; i6 < i4; i6++) {
            for (int i7 = 0; i7 < i3; i7++) {
                m(i + i7, i2 + i6, i5, j);
            }
        }
    }

    public final void m(int i, int i2, int i3, long j) {
        if (i2 < 0 || i2 >= this.v || i < 0 || i >= this.c) {
            StringBuilder y = jQ.y("TerminalBuffer.setChar(): row=", i2, ", column=", i, ", mScreenRows=");
            y.append(this.v);
            y.append(", mColumns=");
            y.append(this.c);
            throw new IllegalArgumentException(y.toString());
        }
        R(O(i2)).c(i, i3, j);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:39:0x0089 */
    public final void v(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        idE ide = this;
        int i10 = i;
        if (i3 != 0) {
            if (i10 < 0 || (i7 = i10 + i3) > (i8 = ide.c) || i2 < 0 || i2 + i4 > (i9 = ide.v) || i5 < 0 || i5 + i3 > i8 || i6 < 0 || i6 + i4 > i9) {
                throw new IllegalArgumentException();
            }
            boolean z = i2 > i6;
            int i11 = 0;
            while (i11 < i4) {
                int i12 = z ? i11 : i4 - (i11 + 1);
                pz6 R = ide.R(ide.O(i2 + i12));
                pz6 R2 = ide.R(ide.O(i12 + i6));
                R2.v |= R.v;
                int v = R.v(i10);
                int v2 = R.v(i7);
                boolean z2 = i10 > 0 && R.e(i10 + -1);
                char[] cArr = R.f7332R;
                char[] cArr2 = cArr;
                if (R2 == R) {
                    cArr2 = Arrays.copyOf(cArr, cArr.length);
                }
                int i13 = i5;
                int i14 = i10;
                int i15 = 0;
                while (v < v2) {
                    char c = cArr2[v];
                    boolean isHighSurrogate = Character.isHighSurrogate(c);
                    char c2 = c;
                    if (isHighSurrogate) {
                        v++;
                        c2 = Character.toCodePoint(c, cArr2[v]);
                    }
                    if (z2) {
                        c2 = 32;
                        z2 = false;
                    }
                    int z3 = lTs.z(c2 == 1 ? 1 : 0);
                    if (z3 > 0) {
                        i13 += i15;
                        i14 += i15;
                        i15 = z3;
                    }
                    R2.c(i13, c2, R.f7333R[i14]);
                    v++;
                }
                i11++;
                ide = this;
                i10 = i;
            }
        }
    }
}
