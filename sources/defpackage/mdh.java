package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: mdh  reason: default package */
/* loaded from: classes.dex */
public final class mdh {
    public static final /* synthetic */ int C = 0;
    public int H;
    public int L;
    public int O;
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public ArrayList f6087R;

    /* renamed from: R  reason: collision with other field name */
    public final mq9 f6089R;

    /* renamed from: R  reason: collision with other field name */
    public pgc f6090R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6091R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f6092R;

    /* renamed from: R  reason: collision with other field name */
    public Object[] f6093R;
    public int X;
    public int Z;
    public int c;
    public int e;
    public int m;
    public int v;
    public int x;

    /* renamed from: R  reason: collision with other field name */
    public final l7M f6088R = new l7M();

    /* renamed from: v  reason: collision with other field name */
    public final l7M f6095v = new l7M();

    /* renamed from: c  reason: collision with other field name */
    public final l7M f6094c = new l7M();
    public int U = -1;

    static {
        new f1A(16, 0);
    }

    public mdh(mq9 mq9) {
        this.f6089R = mq9;
        int[] iArr = mq9.f6199R;
        this.f6092R = iArr;
        Object[] objArr = mq9.f6200R;
        this.f6093R = objArr;
        this.f6087R = mq9.R;
        int i = mq9.e;
        this.R = i;
        this.v = (iArr.length / 5) - i;
        this.c = i;
        int i2 = mq9.X;
        this.O = i2;
        this.L = objArr.length - i2;
        this.Z = i;
    }

    public static void i(mdh mdh) {
        int i = mdh.U;
        int N = mdh.N(i);
        int[] iArr = mdh.f6092R;
        boolean z = true;
        int i2 = (N * 5) + 1;
        int i3 = iArr[i2];
        if ((i3 & 134217728) == 0) {
            z = false;
        }
        if (!z) {
            iArr[i2] = i3 | 134217728;
            if (!l6.v(iArr, N)) {
                mdh.G(mdh.h(i));
            }
        }
    }

    public final Object A(int i, Object obj) {
        int s = s(this.f6092R, N(this.H));
        boolean z = true;
        int L = L(this.f6092R, N(this.H + 1));
        int i2 = s + i;
        if (i2 < s || i2 >= L) {
            z = false;
        }
        if (z) {
            int Z = Z(i2);
            Object[] objArr = this.f6093R;
            Object obj2 = objArr[Z];
            objArr[Z] = obj;
            return obj2;
        }
        StringBuilder C2 = opT.C("Write to an invalid slot index ", i, " for group ");
        C2.append(this.H);
        vC.e(C2.toString().toString());
        throw null;
    }

    public final void B(int i, Object obj) {
        int N = N(i);
        int[] iArr = this.f6092R;
        if (N < iArr.length && l6.O(iArr, N)) {
            this.f6093R[Z(L(this.f6092R, N))] = obj;
            return;
        }
        vC.e(("Updating the node of a group at " + i + " that was not created with as a node group").toString());
        throw null;
    }

    public final int C() {
        return (this.f6092R.length / 5) - this.v;
    }

    public final void G(int i) {
        if (i >= 0) {
            pgc pgc = this.f6090R;
            if (pgc == null) {
                pgc = new pgc();
                this.f6090R = pgc;
            }
            pgc.R(i);
        }
    }

    public final void H(int i) {
        boolean z = true;
        if (this.m <= 0) {
            int i2 = this.U;
            if (i2 != i) {
                if (i < i2 || i >= this.c) {
                    z = false;
                }
                if (z) {
                    int i3 = this.H;
                    int i4 = this.e;
                    int i5 = this.X;
                    this.H = i;
                    T();
                    this.H = i3;
                    this.e = i4;
                    this.X = i5;
                    return;
                }
                vC.e(("Started group at " + i + " must be a subgroup of the group at " + i2).toString());
                throw null;
            }
            return;
        }
        vC.e("Cannot call ensureStarted() while inserting".toString());
        throw null;
    }

    public final int I(int[] iArr, int i) {
        int i2 = iArr[(N(i) * 5) + 2];
        return i2 > -2 ? i2 : C() + i2 + 2;
    }

    public final void J(WB wb, mdh mdh) {
        boolean z = true;
        vC.m(mdh.m > 0);
        vC.m(this.m == 0);
        vC.m(wb.R());
        int c = c(wb) + 1;
        int i = this.H;
        vC.m(i <= c && c < this.c);
        int h = h(c);
        int P = P(c);
        int Z = t(c) ? 1 : l6.Z(this.f6092R, N(c));
        f1A.R(this, c, mdh, false, false);
        G(h);
        boolean z2 = Z > 0;
        while (h >= i) {
            int N = N(h);
            int[] iArr = this.f6092R;
            l6.x(N, l6.e(iArr, N) - P, iArr);
            if (z2) {
                if (l6.O(this.f6092R, N)) {
                    z2 = false;
                } else {
                    int[] iArr2 = this.f6092R;
                    l6.H(N, l6.Z(iArr2, N) - Z, iArr2);
                }
            }
            h = h(h);
        }
        if (z2) {
            if (this.x < Z) {
                z = false;
            }
            vC.m(z);
            this.x -= Z;
        }
    }

    public final void K(int i, int i2) {
        int i3 = this.L;
        int i4 = this.O;
        int i5 = this.Z;
        if (i4 != i) {
            Object[] objArr = this.f6093R;
            if (i < i4) {
                System.arraycopy(objArr, i, objArr, i + i3, i4 - i);
            } else {
                int i6 = i4 + i3;
                System.arraycopy(objArr, i6, objArr, i4, (i + i3) - i6);
            }
            Arrays.fill(objArr, i, i + i3, (Object) null);
        }
        int min = Math.min(i2 + 1, C());
        if (i5 != min) {
            int length = this.f6093R.length - i3;
            if (min < i5) {
                int N = N(min);
                int N2 = N(i5);
                int i7 = this.R;
                while (N < N2) {
                    int[] iArr = this.f6092R;
                    int i8 = (N * 5) + 4;
                    int i9 = iArr[i8];
                    if (i9 >= 0) {
                        iArr[i8] = -((length - i9) + 1);
                        N++;
                        if (N == i7) {
                            N += this.v;
                        }
                    } else {
                        vC.e("Unexpected anchor value, expected a positive anchor".toString());
                        throw null;
                    }
                }
            } else {
                int N3 = N(i5);
                int N4 = N(min);
                while (N3 < N4) {
                    int[] iArr2 = this.f6092R;
                    int i10 = (N3 * 5) + 4;
                    int i11 = iArr2[i10];
                    if (i11 < 0) {
                        iArr2[i10] = i11 + length + 1;
                        N3++;
                        if (N3 == this.R) {
                            N3 += this.v;
                        }
                    } else {
                        vC.e("Unexpected anchor value, expected a negative anchor".toString());
                        throw null;
                    }
                }
            }
            this.Z = min;
        }
        this.O = i;
    }

    public final int L(int[] iArr, int i) {
        if (i >= this.f6092R.length / 5) {
            return this.f6093R.length - this.L;
        }
        int i2 = iArr[(i * 5) + 4];
        return i2 < 0 ? (this.f6093R.length - this.L) + i2 + 1 : i2;
    }

    public final int N(int i) {
        return i < this.R ? i : i + this.v;
    }

    public final void O() {
        boolean z = true;
        this.f6091R = true;
        if (this.f6088R.v == 0) {
            o(C());
            K(this.f6093R.length - this.L, this.R);
            u();
        }
        mq9 mq9 = this.f6089R;
        int[] iArr = this.f6092R;
        int i = this.R;
        Object[] objArr = this.f6093R;
        int i2 = this.O;
        ArrayList arrayList = this.f6087R;
        mq9.getClass();
        if (this.f6089R != mq9 || !mq9.f6198R) {
            z = false;
        }
        if (z) {
            mq9.f6198R = false;
            mq9.f6199R = iArr;
            mq9.e = i;
            mq9.f6200R = objArr;
            mq9.X = i2;
            mq9.R = arrayList;
            return;
        }
        throw new IllegalArgumentException("Unexpected writer close()".toString());
    }

    public final int P(int i) {
        return l6.e(this.f6092R, N(i));
    }

    public final void Q(int i, int i2, int i3) {
        if (i2 > 0) {
            int i4 = this.L;
            int i5 = i + i2;
            K(i5, i3);
            this.O = i;
            this.L = i4 + i2;
            Arrays.fill(this.f6093R, i, i5, (Object) null);
            int i6 = this.X;
            if (i6 >= i) {
                this.X = i6 - i2;
            }
        }
    }

    public final void R(int i) {
        boolean z = true;
        if (i >= 0) {
            if (!(this.m <= 0)) {
                throw new IllegalStateException("Cannot call seek() while inserting".toString());
            } else if (i != 0) {
                int i2 = this.H + i;
                if (i2 < this.U || i2 > this.c) {
                    z = false;
                }
                if (z) {
                    this.H = i2;
                    int L = L(this.f6092R, N(i2));
                    this.e = L;
                    this.X = L;
                    return;
                }
                StringBuilder U = opT.U("Cannot seek outside the current group (");
                U.append(this.U);
                U.append('-');
                U.append(this.c);
                U.append(')');
                vC.e(U.toString().toString());
                throw null;
            }
        } else {
            vC.e("Cannot seek backwards".toString());
            throw null;
        }
    }

    public final int S() {
        int N = N(this.H);
        int e = l6.e(this.f6092R, N) + this.H;
        this.H = e;
        this.e = L(this.f6092R, N(e));
        if (l6.O(this.f6092R, N)) {
            return 1;
        }
        return l6.Z(this.f6092R, N);
    }

    public final void T() {
        if (this.m == 0) {
            f1A f1a = ppN.R;
            r(0, f1a, f1a, false);
            return;
        }
        vC.e("Key must be supplied when inserting".toString());
        throw null;
    }

    public final void U(int i, int i2, int i3) {
        if (i >= this.R) {
            i = -((C() - i) + 2);
        }
        while (i3 < i2) {
            this.f6092R[(N(i3) * 5) + 2] = i;
            int e = l6.e(this.f6092R, N(i3)) + i3;
            U(i3, e, i3 + 1);
            i3 = e;
        }
    }

    public final void V(mq9 mq9, int i) {
        vC.m(this.m > 0);
        if (i == 0 && this.H == 0 && this.f6089R.e == 0) {
            int[] iArr = this.f6092R;
            Object[] objArr = this.f6093R;
            ArrayList arrayList = this.f6087R;
            int[] iArr2 = mq9.f6199R;
            int i2 = mq9.e;
            Object[] objArr2 = mq9.f6200R;
            int i3 = mq9.X;
            this.f6092R = iArr2;
            this.f6093R = objArr2;
            this.f6087R = mq9.R;
            this.R = i2;
            this.v = (iArr2.length / 5) - i2;
            this.O = i3;
            this.L = objArr2.length - i3;
            this.Z = i2;
            mq9.f6199R = iArr;
            mq9.e = 0;
            mq9.f6200R = objArr;
            mq9.X = 0;
            mq9.R = arrayList;
            return;
        }
        mdh H = mq9.H();
        try {
            f1A.R(H, i, this, true, true);
        } finally {
            H.O();
        }
    }

    public final Object W(int i, int i2) {
        int s = s(this.f6092R, N(i));
        boolean z = true;
        int L = L(this.f6092R, N(i + 1));
        int i3 = i2 + s;
        if (s > i3 || i3 >= L) {
            z = false;
        }
        if (!z) {
            return ppN.R;
        }
        return this.f6093R[Z(i3)];
    }

    public final void X() {
        int i = this.m;
        this.m = i + 1;
        if (i == 0) {
            this.f6095v.v(((this.f6092R.length / 5) - this.v) - this.c);
        }
    }

    public final Object Y(int i) {
        int N = N(i);
        if (l6.O(this.f6092R, N)) {
            return this.f6093R[Z(L(this.f6092R, N))];
        }
        return null;
    }

    public final int Z(int i) {
        return i < this.O ? i : i + this.L;
    }

    public final int c(WB wb) {
        int i = wb.R;
        return i < 0 ? i + C() : i;
    }

    public final void d() {
        int i = this.c;
        this.H = i;
        this.e = L(this.f6092R, N(i));
    }

    public final int e(int[] iArr, int i) {
        return l6.i(iArr[(i * 5) + 1] >> 29) + L(iArr, i);
    }

    public final void g(int i) {
        if (i > 0) {
            int i2 = this.H;
            o(i2);
            int i3 = this.R;
            int i4 = this.v;
            int[] iArr = this.f6092R;
            int length = iArr.length / 5;
            int i5 = length - i4;
            int i6 = 0;
            if (i4 < i) {
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                int[] iArr2 = new int[max * 5];
                int i7 = max - i5;
                System.arraycopy(iArr, 0, iArr2, 0, (i3 * 5) - 0);
                int i8 = (i4 + i3) * 5;
                System.arraycopy(iArr, i8, iArr2, (i3 + i7) * 5, (length * 5) - i8);
                this.f6092R = iArr2;
                i4 = i7;
            }
            int i9 = this.c;
            if (i9 >= i3) {
                this.c = i9 + i;
            }
            int i10 = i3 + i;
            this.R = i10;
            this.v = i4 - i;
            int L = i5 > 0 ? L(this.f6092R, N(i2 + i)) : 0;
            if (this.Z >= i3) {
                i6 = this.O;
            }
            int i11 = this.L;
            int length2 = this.f6093R.length;
            if (L > i6) {
                L = -(((length2 - i11) - L) + 1);
            }
            for (int i12 = i3; i12 < i10; i12++) {
                this.f6092R[(i12 * 5) + 4] = L;
            }
            int i13 = this.Z;
            if (i13 >= i3) {
                this.Z = i13 + i;
            }
        }
    }

    public final int h(int i) {
        return I(this.f6092R, i);
    }

    public final boolean j(int i, int i2) {
        int i3;
        int i4;
        if (i2 == this.U) {
            i3 = this.c;
        } else {
            l7M l7m = this.f6088R;
            int i5 = l7m.v;
            if (i2 > (i5 > 0 ? l7m.f5588R[i5 - 1] : 0)) {
                i4 = P(i2);
            } else {
                int i6 = 0;
                while (true) {
                    if (i6 >= i5) {
                        i6 = -1;
                        break;
                    } else if (l7m.f5588R[i6] == i2) {
                        break;
                    } else {
                        i6++;
                    }
                }
                if (i6 < 0) {
                    i4 = P(i2);
                } else {
                    i3 = ((this.f6092R.length / 5) - this.v) - this.f6095v.f5588R[i6];
                }
            }
            i3 = i4 + i2;
        }
        return i > i2 && i < i3;
    }

    public final void k(Object obj) {
        if (this.m > 0) {
            y(1, this.U);
        }
        Object[] objArr = this.f6093R;
        int i = this.e;
        this.e = i + 1;
        Object obj2 = objArr[Z(i)];
        int i2 = this.e;
        if (i2 <= this.X) {
            this.f6093R[Z(i2 - 1)] = obj;
        } else {
            vC.e("Writing to an invalid slot".toString());
            throw null;
        }
    }

    public final void m() {
        int i = 1;
        int i2 = 0;
        boolean z = this.m > 0;
        int i3 = this.H;
        int i4 = this.c;
        int i5 = this.U;
        int N = N(i5);
        int i6 = this.x;
        int i7 = i3 - i5;
        boolean O = l6.O(this.f6092R, N);
        if (z) {
            l6.x(N, i7, this.f6092R);
            l6.H(N, i6, this.f6092R);
            int R = this.f6094c.R();
            if (!O) {
                i = i6;
            }
            this.x = R + i;
            this.U = I(this.f6092R, i5);
            return;
        }
        if (i3 != i4) {
            i = 0;
        }
        if (i != 0) {
            int e = l6.e(this.f6092R, N);
            int Z = l6.Z(this.f6092R, N);
            l6.x(N, i7, this.f6092R);
            l6.H(N, i6, this.f6092R);
            int R2 = this.f6088R.R();
            this.c = ((this.f6092R.length / 5) - this.v) - this.f6095v.R();
            this.U = R2;
            int I = I(this.f6092R, i5);
            int R3 = this.f6094c.R();
            this.x = R3;
            if (I == R2) {
                if (!O) {
                    i2 = i6 - Z;
                }
                this.x = R3 + i2;
                return;
            }
            int i8 = i7 - e;
            int i9 = O ? 0 : i6 - Z;
            if (!(i8 == 0 && i9 == 0)) {
                while (I != 0 && I != R2 && (i9 != 0 || i8 != 0)) {
                    int N2 = N(I);
                    if (i8 != 0) {
                        l6.x(N2, l6.e(this.f6092R, N2) + i8, this.f6092R);
                    }
                    if (i9 != 0) {
                        int[] iArr = this.f6092R;
                        l6.H(N2, l6.Z(iArr, N2) + i9, iArr);
                    }
                    if (l6.O(this.f6092R, N2)) {
                        i9 = 0;
                    }
                    I = I(this.f6092R, I);
                }
            }
            this.x += i9;
            return;
        }
        vC.e("Expected to be at the end of a group".toString());
        throw null;
    }

    public final boolean n(int i, int i2) {
        boolean z;
        boolean z2 = false;
        if (i2 <= 0) {
            return false;
        }
        ArrayList arrayList = this.f6087R;
        o(i);
        if (!arrayList.isEmpty()) {
            int i3 = i2 + i;
            int L = l6.L(this.f6087R, i3, (this.f6092R.length / 5) - this.v);
            if (L >= this.f6087R.size()) {
                L--;
            }
            int i4 = L + 1;
            int i5 = 0;
            while (L >= 0) {
                WB wb = (WB) this.f6087R.get(L);
                int c = c(wb);
                if (c < i) {
                    break;
                }
                if (c < i3) {
                    wb.R = Integer.MIN_VALUE;
                    if (i5 == 0) {
                        i5 = L + 1;
                    }
                    i4 = L;
                }
                L--;
            }
            z = i4 < i5;
            if (z) {
                this.f6087R.subList(i4, i5).clear();
            }
        } else {
            z = false;
        }
        this.R = i;
        this.v += i2;
        int i6 = this.Z;
        if (i6 > i) {
            this.Z = Math.max(i, i6 - i2);
        }
        int i7 = this.c;
        if (i7 >= this.R) {
            this.c = i7 - i2;
        }
        int i8 = this.U;
        if (i8 >= 0 && l6.v(this.f6092R, N(i8))) {
            z2 = true;
        }
        if (z2) {
            G(this.U);
        }
        return z;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        r2 = r8.f6092R;
        r4 = r9 * 5;
        r5 = r0 * 5;
        r6 = r1 * 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        if (r9 >= r1) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006a, code lost:
        java.lang.System.arraycopy(r2, r4, r2, r5 + r4, r6 - r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0070, code lost:
        r7 = r6 + r5;
        java.lang.System.arraycopy(r2, r7, r2, r6, (r4 + r5) - r7);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void o(int r9) {
        /*
            r8 = this;
            int r0 = r8.v
            int r1 = r8.R
            if (r1 == r9) goto L_0x00b4
            java.util.ArrayList r2 = r8.f6087R
            boolean r2 = r2.isEmpty()
            r3 = 1
            r2 = r2 ^ r3
            if (r2 == 0) goto L_0x005e
            int r2 = r8.v
            int[] r4 = r8.f6092R
            int r4 = r4.length
            int r4 = r4 / 5
            int r4 = r4 - r2
            if (r1 >= r9) goto L_0x003c
            java.util.ArrayList r2 = r8.f6087R
            int r2 = defpackage.l6.L(r2, r1, r4)
        L_0x0020:
            java.util.ArrayList r5 = r8.f6087R
            int r5 = r5.size()
            if (r2 >= r5) goto L_0x005e
            java.util.ArrayList r5 = r8.f6087R
            java.lang.Object r5 = r5.get(r2)
            WB r5 = (defpackage.WB) r5
            int r6 = r5.R
            if (r6 >= 0) goto L_0x005e
            int r6 = r6 + r4
            if (r6 >= r9) goto L_0x005e
            r5.R = r6
            int r2 = r2 + 1
            goto L_0x0020
        L_0x003c:
            java.util.ArrayList r2 = r8.f6087R
            int r2 = defpackage.l6.L(r2, r9, r4)
        L_0x0042:
            java.util.ArrayList r5 = r8.f6087R
            int r5 = r5.size()
            if (r2 >= r5) goto L_0x005e
            java.util.ArrayList r5 = r8.f6087R
            java.lang.Object r5 = r5.get(r2)
            WB r5 = (defpackage.WB) r5
            int r6 = r5.R
            if (r6 < 0) goto L_0x005e
            int r6 = r4 - r6
            int r6 = -r6
            r5.R = r6
            int r2 = r2 + 1
            goto L_0x0042
        L_0x005e:
            if (r0 <= 0) goto L_0x0077
            int[] r2 = r8.f6092R
            int r4 = r9 * 5
            int r5 = r0 * 5
            int r6 = r1 * 5
            if (r9 >= r1) goto L_0x0070
            int r5 = r5 + r4
            int r6 = r6 - r4
            java.lang.System.arraycopy(r2, r4, r2, r5, r6)
            goto L_0x0077
        L_0x0070:
            int r7 = r6 + r5
            int r4 = r4 + r5
            int r4 = r4 - r7
            java.lang.System.arraycopy(r2, r7, r2, r6, r4)
        L_0x0077:
            if (r9 >= r1) goto L_0x007b
            int r1 = r9 + r0
        L_0x007b:
            int[] r2 = r8.f6092R
            int r2 = r2.length
            int r2 = r2 / 5
            if (r1 >= r2) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r3 = 0
        L_0x0084:
            defpackage.vC.m(r3)
        L_0x0087:
            if (r1 >= r2) goto L_0x00b4
            int[] r3 = r8.f6092R
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L_0x0096
            r5 = r3
            goto L_0x009d
        L_0x0096:
            int r5 = r8.C()
            int r5 = r5 + r3
            int r5 = r5 + 2
        L_0x009d:
            if (r5 >= r9) goto L_0x00a0
            goto L_0x00a8
        L_0x00a0:
            int r6 = r8.C()
            int r6 = r6 - r5
            int r6 = r6 + 2
            int r5 = -r6
        L_0x00a8:
            if (r5 == r3) goto L_0x00ae
            int[] r3 = r8.f6092R
            r3[r4] = r5
        L_0x00ae:
            int r1 = r1 + 1
            if (r1 != r9) goto L_0x0087
            int r1 = r1 + r0
            goto L_0x0087
        L_0x00b4:
            r8.R = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mdh.o(int):void");
    }

    public final void p(Object obj) {
        int N = N(this.H);
        if (l6.X(this.f6092R, N)) {
            this.f6093R[Z(e(this.f6092R, N))] = obj;
        } else {
            vC.e("Updating the data of a group that was not created with a data slot".toString());
            throw null;
        }
    }

    public final void r(int i, Object obj, Object obj2, boolean z) {
        int i2;
        int i3 = 1;
        Object[] objArr = this.m > 0 ? 1 : null;
        this.f6094c.v(this.x);
        if (objArr != null) {
            g(1);
            int i4 = this.H;
            int N = N(i4);
            f1A f1a = ppN.R;
            int i5 = obj != f1a ? 1 : 0;
            if (z || obj2 == f1a) {
                i3 = 0;
            }
            int[] iArr = this.f6092R;
            int i6 = this.U;
            int i7 = this.e;
            int i8 = z ? 1073741824 : 0;
            int i9 = i5 != 0 ? 536870912 : 0;
            int i10 = i3 != 0 ? 268435456 : 0;
            int i11 = N * 5;
            iArr[i11 + 0] = i;
            iArr[i11 + 1] = i8 | i9 | i10;
            iArr[i11 + 2] = i6;
            iArr[i11 + 3] = 0;
            iArr[i11 + 4] = i7;
            this.X = i7;
            int i12 = (z ? 1 : 0) + i5 + i3;
            if (i12 > 0) {
                y(i12, i4);
                Object[] objArr2 = this.f6093R;
                int i13 = this.e;
                if (z) {
                    i13++;
                    objArr2[i13] = obj2;
                }
                if (i5 != 0) {
                    i13++;
                    objArr2[i13] = obj;
                }
                if (i3 != 0) {
                    i13++;
                    objArr2[i13] = obj2;
                }
                this.e = i13;
            }
            this.x = 0;
            i2 = i4 + 1;
            this.U = i4;
            this.H = i2;
        } else {
            this.f6088R.v(this.U);
            this.f6095v.v(((this.f6092R.length / 5) - this.v) - this.c);
            int i14 = this.H;
            int N2 = N(i14);
            if (!n3x.v(obj2, ppN.R)) {
                if (z) {
                    B(this.H, obj2);
                } else {
                    p(obj2);
                }
            }
            this.e = s(this.f6092R, N2);
            this.X = L(this.f6092R, N(this.H + 1));
            this.x = l6.Z(this.f6092R, N2);
            this.U = i14;
            this.H = i14 + 1;
            i2 = i14 + l6.e(this.f6092R, N2);
        }
        this.c = i2;
    }

    public final int s(int[] iArr, int i) {
        if (i >= this.f6092R.length / 5) {
            return this.f6093R.length - this.L;
        }
        int m = l6.m(iArr, i);
        return m < 0 ? (this.f6093R.length - this.L) + m + 1 : m;
    }

    public final boolean t(int i) {
        return l6.O(this.f6092R, N(i));
    }

    public final String toString() {
        StringBuilder U = opT.U("SlotWriter(current = ");
        U.append(this.H);
        U.append(" end=");
        U.append(this.c);
        U.append(" size = ");
        U.append(C());
        U.append(" gap=");
        U.append(this.R);
        U.append('-');
        U.append(this.R + this.v);
        U.append(')');
        return U.toString();
    }

    public final void u() {
        boolean z;
        boolean z2;
        pgc pgc = this.f6090R;
        if (pgc != null) {
            while (!pgc.R.isEmpty()) {
                int v = pgc.v();
                int N = N(v);
                int i = v + 1;
                int P = P(v) + v;
                while (true) {
                    z = false;
                    if (i >= P) {
                        z2 = false;
                        break;
                    }
                    if ((this.f6092R[(N(i) * 5) + 1] & 201326592) != 0) {
                        z2 = true;
                        break;
                    }
                    i += P(i);
                }
                if (l6.v(this.f6092R, N) != z2) {
                    z = true;
                }
                if (z) {
                    int[] iArr = this.f6092R;
                    int i2 = (N * 5) + 1;
                    if (z2) {
                        iArr[i2] = iArr[i2] | 67108864;
                    } else {
                        iArr[i2] = iArr[i2] & -67108865;
                    }
                    int h = h(v);
                    if (h >= 0) {
                        pgc.R(h);
                    }
                }
            }
        }
    }

    public final WB v(int i) {
        ArrayList arrayList = this.f6087R;
        int k = l6.k(arrayList, i, C());
        if (k >= 0) {
            return (WB) arrayList.get(k);
        }
        if (i > this.R) {
            i = -(C() - i);
        }
        WB wb = new WB(i);
        arrayList.add(-(k + 1), wb);
        return wb;
    }

    public final void x() {
        int i = this.m;
        boolean z = true;
        if (i > 0) {
            int i2 = i - 1;
            this.m = i2;
            if (i2 == 0) {
                if (this.f6094c.v != this.f6088R.v) {
                    z = false;
                }
                if (z) {
                    this.c = ((this.f6092R.length / 5) - this.v) - this.f6095v.R();
                } else {
                    vC.e("startGroup/endGroup mismatch while inserting".toString());
                    throw null;
                }
            }
        } else {
            throw new IllegalStateException("Unbalanced begin/end insert".toString());
        }
    }

    public final void y(int i, int i2) {
        if (i > 0) {
            K(this.e, i2);
            int i3 = this.O;
            int i4 = this.L;
            if (i4 < i) {
                Object[] objArr = this.f6093R;
                int length = objArr.length;
                int i5 = length - i4;
                int max = Math.max(Math.max(length * 2, i5 + i), 32);
                Object[] objArr2 = new Object[max];
                for (int i6 = 0; i6 < max; i6++) {
                    objArr2[i6] = null;
                }
                int i7 = max - i5;
                int i8 = i4 + i3;
                System.arraycopy(objArr, 0, objArr2, 0, i3 + 0);
                System.arraycopy(objArr, i8, objArr2, i3 + i7, length - i8);
                this.f6093R = objArr2;
                i4 = i7;
            }
            int i9 = this.X;
            if (i9 >= i3) {
                this.X = i9 + i;
            }
            this.O = i3 + i;
            this.L = i4 - i;
        }
    }

    public final boolean z() {
        if (this.m == 0) {
            int i = this.H;
            int i2 = this.e;
            int S = S();
            pgc pgc = this.f6090R;
            if (pgc != null) {
                while ((!pgc.R.isEmpty()) && ((Number) dF.b(pgc.R)).intValue() >= i) {
                    pgc.v();
                }
            }
            boolean n = n(i, this.H - i);
            Q(i2, this.e - i2, i - 1);
            this.H = i;
            this.e = i2;
            this.x -= S;
            return n;
        }
        vC.e("Cannot remove group while inserting".toString());
        throw null;
    }
}
