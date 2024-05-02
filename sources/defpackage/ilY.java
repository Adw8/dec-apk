package defpackage;

import java.util.ArrayList;

/* renamed from: ilY  reason: default package */
/* loaded from: classes.dex */
public final class ilY {
    public int L;
    public int O;
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final mq9 f4712R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4713R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f4714R;

    /* renamed from: R  reason: collision with other field name */
    public final Object[] f4715R;
    public int X = -1;
    public int Z;
    public int c;
    public int e;
    public final int v;

    public ilY(mq9 mq9) {
        this.f4712R = mq9;
        this.f4714R = mq9.f6199R;
        int i = mq9.e;
        this.R = i;
        this.f4715R = mq9.f6200R;
        this.v = mq9.X;
        this.e = i;
    }

    public final void C(int i) {
        if (this.O == 0) {
            this.c = i;
            int i2 = this.R;
            int i3 = i < i2 ? this.f4714R[(i * 5) + 2] : -1;
            this.X = i3;
            if (i3 < 0) {
                this.e = i2;
            } else {
                this.e = l6.e(this.f4714R, i3) + i3;
            }
            this.L = 0;
            this.Z = 0;
            return;
        }
        vC.e("Cannot reposition while in an empty region".toString());
        throw null;
    }

    public final Object H(int[] iArr, int i) {
        int i2 = i * 5;
        boolean z = true;
        int i3 = iArr[i2 + 1];
        if ((536870912 & i3) == 0) {
            z = false;
        }
        if (!z) {
            return null;
        }
        return this.f4715R[l6.i(i3 >> 30) + iArr[i2 + 4]];
    }

    public final Object L(int i, int i2) {
        int m = l6.m(this.f4714R, i);
        int i3 = i + 1;
        int i4 = m + i2;
        return i4 < (i3 < this.R ? this.f4714R[(i3 * 5) + 4] : this.v) ? this.f4715R[i4] : ppN.R;
    }

    public final int N() {
        int i = 1;
        if (this.O == 0) {
            if (!l6.O(this.f4714R, this.c)) {
                i = l6.Z(this.f4714R, this.c);
            }
            int i2 = this.c;
            this.c = l6.e(this.f4714R, i2) + i2;
            return i;
        }
        vC.e("Cannot skip while in an empty region".toString());
        throw null;
    }

    public final int O() {
        int i = this.c;
        if (i < this.e) {
            return this.f4714R[i * 5];
        }
        return 0;
    }

    public final void P() {
        if (this.O == 0) {
            this.c = this.e;
        } else {
            vC.e("Cannot skip the enclosing group while in an empty region".toString());
            throw null;
        }
    }

    public final WB R(int i) {
        ArrayList arrayList = this.f4712R.R;
        int k = l6.k(arrayList, i, this.R);
        if (k >= 0) {
            return (WB) arrayList.get(k);
        }
        WB wb = new WB(i);
        arrayList.add(-(k + 1), wb);
        return wb;
    }

    public final int U(int i) {
        return this.f4714R[(i * 5) + 2];
    }

    public final Object X() {
        int i = this.c;
        if (i < this.e) {
            return v(this.f4714R, i);
        }
        return 0;
    }

    public final int Z(int i) {
        return l6.e(this.f4714R, i);
    }

    public final void c() {
        boolean z = true;
        this.f4713R = true;
        mq9 mq9 = this.f4712R;
        mq9.getClass();
        if (this.f4712R != mq9 || mq9.O <= 0) {
            z = false;
        }
        if (z) {
            mq9.O--;
        } else {
            vC.e("Unexpected reader close()".toString());
            throw null;
        }
    }

    public final void e() {
        if (this.O == 0) {
            if (this.c == this.e) {
                int[] iArr = this.f4714R;
                int i = iArr[(this.X * 5) + 2];
                this.X = i;
                this.e = i < 0 ? this.R : l6.e(iArr, i) + i;
                return;
            }
            vC.e("endGroup() not called at the end of a group".toString());
            throw null;
        }
    }

    public final void j() {
        if (this.O <= 0) {
            int[] iArr = this.f4714R;
            int i = this.c;
            if (iArr[(i * 5) + 2] == this.X) {
                this.X = i;
                this.e = l6.e(iArr, i) + i;
                int i2 = this.c;
                int i3 = i2 + 1;
                this.c = i3;
                this.L = l6.m(this.f4714R, i2);
                this.Z = i2 >= this.R - 1 ? this.v : this.f4714R[(i3 * 5) + 4];
                return;
            }
            throw new IllegalArgumentException("Invalid slot table detected".toString());
        }
    }

    public final boolean m(int i) {
        return l6.O(this.f4714R, i);
    }

    public final String toString() {
        StringBuilder U = opT.U("SlotReader(current=");
        U.append(this.c);
        U.append(", key=");
        U.append(O());
        U.append(", parent=");
        U.append(this.X);
        U.append(", end=");
        return jQ.P(U, this.e, ')');
    }

    public final Object v(int[] iArr, int i) {
        int i2;
        if (!l6.X(iArr, i)) {
            return ppN.R;
        }
        Object[] objArr = this.f4715R;
        int i3 = i * 5;
        if (i3 >= iArr.length) {
            i2 = iArr.length;
        } else {
            i2 = l6.i(iArr[i3 + 1] >> 29) + iArr[i3 + 4];
        }
        return objArr[i2];
    }

    public final Object x(int i) {
        if (!l6.O(this.f4714R, i)) {
            return null;
        }
        int[] iArr = this.f4714R;
        return l6.O(iArr, i) ? this.f4715R[iArr[(i * 5) + 4]] : ppN.R;
    }
}
