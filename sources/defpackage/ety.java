package defpackage;

import java.util.List;

/* renamed from: ety  reason: default package */
/* loaded from: classes.dex */
public final class ety {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final fPH f3234R;

    /* renamed from: R  reason: collision with other field name */
    public final j0 f3235R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3236R;

    /* renamed from: R  reason: collision with other field name */
    public final lMx f3237R;
    public int X;
    public final int c;
    public final int e;
    public final int v;

    public ety(lMx lmx, List list, int i, fPH fph, j0 j0Var, int i2, int i3, int i4) {
        this.f3237R = lmx;
        this.f3236R = list;
        this.R = i;
        this.f3234R = fph;
        this.f3235R = j0Var;
        this.v = i2;
        this.c = i3;
        this.e = i4;
    }

    public static ety R(ety ety, int i, fPH fph, j0 j0Var, int i2) {
        if ((i2 & 1) != 0) {
            i = ety.R;
        }
        if ((i2 & 2) != 0) {
            fph = ety.f3234R;
        }
        if ((i2 & 4) != 0) {
            j0Var = ety.f3235R;
        }
        return new ety(ety.f3237R, ety.f3236R, i, fph, j0Var, (i2 & 8) != 0 ? ety.v : 0, (i2 & 16) != 0 ? ety.c : 0, (i2 & 32) != 0 ? ety.e : 0);
    }

    public final dEt v(j0 j0Var) {
        boolean z = false;
        if (this.R < this.f3236R.size()) {
            this.X++;
            fPH fph = this.f3234R;
            if (fph != null) {
                fve v = fph.f3411R.v();
                a7_ a7_ = (a7_) j0Var.f4786R;
                a7_ a7_2 = v.f3625R.f3093R;
                if (a7_.f737R == a7_2.f737R && n3x.v(a7_.e, a7_2.e)) {
                    if (!(this.X == 1)) {
                        StringBuilder U = opT.U("network interceptor ");
                        U.append(this.f3236R.get(this.R - 1));
                        U.append(" must call proceed() exactly once");
                        throw new IllegalStateException(U.toString().toString());
                    }
                } else {
                    StringBuilder U2 = opT.U("network interceptor ");
                    U2.append(this.f3236R.get(this.R - 1));
                    U2.append(" must retain the same host and port");
                    throw new IllegalStateException(U2.toString().toString());
                }
            }
            ety R = R(this, this.R + 1, null, j0Var, 58);
            eXP exp = (eXP) this.f3236R.get(this.R);
            dEt R2 = exp.R(R);
            if (R2 != null) {
                if (this.f3234R != null) {
                    if (this.R + 1 >= this.f3236R.size() || R.X == 1) {
                        z = true;
                    }
                    if (!z) {
                        throw new IllegalStateException(("network interceptor " + exp + " must call proceed() exactly once").toString());
                    }
                }
                return R2;
            }
            throw new NullPointerException("interceptor " + exp + " returned null");
        }
        throw new IllegalStateException("Check failed.".toString());
    }
}
