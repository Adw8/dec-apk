package defpackage;

/* renamed from: v_  reason: default package */
/* loaded from: classes.dex */
public final class v_ {
    public long R = 0;

    /* renamed from: R  reason: collision with other field name */
    public v_ f7442R;

    public final void L() {
        this.R = 0;
        v_ v_Var = this.f7442R;
        if (v_Var != null) {
            v_Var.L();
        }
    }

    public final boolean O(int i) {
        if (i >= 64) {
            c();
            return this.f7442R.O(i - 64);
        }
        long j = 1 << i;
        long j2 = this.R;
        boolean z = (j2 & j) != 0;
        long j3 = j2 & (~j);
        this.R = j3;
        long j4 = j - 1;
        this.R = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
        v_ v_Var = this.f7442R;
        if (v_Var != null) {
            if (v_Var.e(0)) {
                Z(63);
            }
            this.f7442R.O(0);
        }
        return z;
    }

    public final void R(int i) {
        if (i >= 64) {
            v_ v_Var = this.f7442R;
            if (v_Var != null) {
                v_Var.R(i - 64);
                return;
            }
            return;
        }
        this.R &= ~(1 << i);
    }

    public final void X(int i, boolean z) {
        if (i >= 64) {
            c();
            this.f7442R.X(i - 64, z);
            return;
        }
        long j = this.R;
        boolean z2 = (Long.MIN_VALUE & j) != 0;
        long j2 = (1 << i) - 1;
        this.R = ((j & (~j2)) << 1) | (j & j2);
        if (z) {
            Z(i);
        } else {
            R(i);
        }
        if (z2 || this.f7442R != null) {
            c();
            this.f7442R.X(0, z2);
        }
    }

    public final void Z(int i) {
        if (i >= 64) {
            c();
            this.f7442R.Z(i - 64);
            return;
        }
        this.R |= 1 << i;
    }

    public final void c() {
        if (this.f7442R == null) {
            this.f7442R = new v_();
        }
    }

    public final boolean e(int i) {
        if (i >= 64) {
            c();
            return this.f7442R.e(i - 64);
        }
        return ((1 << i) & this.R) != 0;
    }

    public final String toString() {
        if (this.f7442R == null) {
            return Long.toBinaryString(this.R);
        }
        return this.f7442R.toString() + "xx" + Long.toBinaryString(this.R);
    }

    public final int v(int i) {
        v_ v_Var = this.f7442R;
        if (v_Var == null) {
            if (i >= 64) {
                return Long.bitCount(this.R);
            }
            return Long.bitCount(((1 << i) - 1) & this.R);
        } else if (i < 64) {
            return Long.bitCount(((1 << i) - 1) & this.R);
        } else {
            return Long.bitCount(this.R) + v_Var.v(i - 64);
        }
    }
}
