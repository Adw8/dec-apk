package defpackage;

/* renamed from: dVV  reason: default package */
/* loaded from: classes.dex */
public abstract class dVV implements kN5 {
    public final b1t R;

    public dVV(h0T h0t, boolean z) {
        this.R = new b1t(h0t, z);
    }

    public abstract void L(oDO odo);

    public final void X(fiv fiv, float f, long j) {
        b1t b1t = this.R;
        b1t.getClass();
        float R = Float.isNaN(f) ? nf0.R(fiv, b1t.f1511R, fiv.c()) : fiv.mZ(f);
        float floatValue = ((Number) ((_6) b1t.v).c()).floatValue();
        if (floatValue > 0.0f) {
            long v = n3.v(j, floatValue);
            if (b1t.f1511R) {
                float e = nqW.e(fiv.c());
                float v2 = nqW.v(fiv.c());
                JF G = fiv.G();
                long v3 = G.v();
                G.R().y();
                G.f201R.R(0.0f, 0.0f, e, v2, 1);
                fiv.X4(fiv, v, R, 0, 124);
                G.R().j();
                G.c(v3);
                return;
            }
            fiv.X4(fiv, v, R, 0, 124);
        }
    }

    public abstract void e(oDO odo, jy_ jy_);
}
