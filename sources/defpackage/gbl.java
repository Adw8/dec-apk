package defpackage;

import android.view.View;

/* renamed from: gbl  reason: default package */
/* loaded from: classes.dex */
public final class gbl {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public a40 f3796R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f3797R;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f3798v;

    public gbl() {
        e();
    }

    public final void R() {
        this.v = this.f3797R ? this.f3796R.O() : this.f3796R.Z();
    }

    public final void c(View view, int i) {
        int x = this.f3796R.x();
        if (x >= 0) {
            v(view, i);
            return;
        }
        this.R = i;
        if (this.f3797R) {
            int O = (this.f3796R.O() - x) - this.f3796R.v(view);
            this.v = this.f3796R.O() - O;
            if (O > 0) {
                int c = this.v - this.f3796R.c(view);
                int Z = this.f3796R.Z();
                int min = c - (Math.min(this.f3796R.e(view) - Z, 0) + Z);
                if (min < 0) {
                    this.v = Math.min(O, -min) + this.v;
                    return;
                }
                return;
            }
            return;
        }
        int e = this.f3796R.e(view);
        int Z2 = e - this.f3796R.Z();
        this.v = e;
        if (Z2 > 0) {
            int O2 = (this.f3796R.O() - Math.min(0, (this.f3796R.O() - x) - this.f3796R.v(view))) - (this.f3796R.c(view) + e);
            if (O2 < 0) {
                this.v -= Math.min(Z2, -O2);
            }
        }
    }

    public final void e() {
        this.R = -1;
        this.v = Integer.MIN_VALUE;
        this.f3797R = false;
        this.f3798v = false;
    }

    public final String toString() {
        StringBuilder U = opT.U("AnchorInfo{mPosition=");
        U.append(this.R);
        U.append(", mCoordinate=");
        U.append(this.v);
        U.append(", mLayoutFromEnd=");
        U.append(this.f3797R);
        U.append(", mValid=");
        U.append(this.f3798v);
        U.append('}');
        return U.toString();
    }

    public final void v(View view, int i) {
        if (this.f3797R) {
            this.v = this.f3796R.x() + this.f3796R.v(view);
        } else {
            this.v = this.f3796R.e(view);
        }
        this.R = i;
    }
}
