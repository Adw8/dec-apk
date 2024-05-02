package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: lt  reason: default package */
/* loaded from: classes.dex */
public abstract class lt {
    public boolean O;

    /* renamed from: R  reason: collision with other field name */
    public final oE f5850R;
    public boolean X;
    public boolean c;
    public boolean e;
    public oE v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f5852v;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5851R = true;
    public final HashMap R = new HashMap();

    public lt(oE oEVar) {
        this.f5850R = oEVar;
    }

    public static final void R(lt ltVar, XI xi, int i, poS pos) {
        int i2;
        ltVar.getClass();
        float f = (float) i;
        long N = aH9.N(f, f);
        while (true) {
            k5m k5m = (k5m) ltVar;
            switch (k5m.R) {
                case 0:
                    N = pos.V_(N);
                    break;
                default:
                    long j = pos.f7279R.c;
                    N = aWo.L(aH9.N((float) ((int) (j >> 32)), (float) dU5.v(j)), N);
                    break;
            }
            pos = pos.f7284v;
            if (n3x.v(pos, ltVar.f5850R.i())) {
                int t = xi instanceof fcC ? mLz.t(aWo.X(N)) : mLz.t(aWo.e(N));
                HashMap hashMap = ltVar.R;
                if (hashMap.containsKey(xi)) {
                    int intValue = ((Number) mHQ.K(xi, ltVar.R)).intValue();
                    fcC fcc = Qv.R;
                    t = ((Number) xi.R.J(Integer.valueOf(intValue), Integer.valueOf(t))).intValue();
                }
                hashMap.put(xi, Integer.valueOf(t));
                return;
            } else if (ltVar.v(pos).containsKey(xi)) {
                switch (k5m.R) {
                    case 0:
                        i2 = pos.P(xi);
                        break;
                    default:
                        i2 = pos.f7279R.P(xi);
                        break;
                }
                float f2 = (float) i2;
                N = aH9.N(f2, f2);
            }
        }
    }

    public final void L() {
        oE oEVar;
        k5m e;
        k5m e2;
        if (c()) {
            oEVar = this.f5850R;
        } else {
            oE I = this.f5850R.I();
            if (I != null) {
                oEVar = ((lt) I.e()).v;
                if (oEVar == null || !oEVar.e().c()) {
                    oE oEVar2 = this.v;
                    if (oEVar2 != null && !oEVar2.e().c()) {
                        oE I2 = oEVar2.I();
                        if (!(I2 == null || (e2 = I2.e()) == null)) {
                            e2.L();
                        }
                        oE I3 = oEVar2.I();
                        oEVar = (I3 == null || (e = I3.e()) == null) ? null : ((lt) e).v;
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.v = oEVar;
    }

    public final void O() {
        this.R.clear();
        this.f5850R.A(new mox(1, this));
        this.R.putAll(v(this.f5850R.i()));
        this.f5851R = false;
    }

    public final void X() {
        this.f5851R = true;
        oE I = this.f5850R.I();
        if (I != null) {
            if (this.f5852v) {
                I.r();
            } else if (this.e || this.c) {
                I.requestLayout();
            }
            if (this.X) {
                this.f5850R.r();
            }
            if (this.O) {
                I.requestLayout();
            }
            I.e().X();
        }
    }

    public final boolean c() {
        return this.f5852v || this.e || this.X || this.O;
    }

    public final boolean e() {
        L();
        return this.v != null;
    }

    public abstract Map v(poS pos);
}
