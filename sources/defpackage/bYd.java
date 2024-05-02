package defpackage;

/* renamed from: bYd  reason: default package */
/* loaded from: classes.dex */
public final class bYd implements gP7 {
    public final bRW R;

    /* renamed from: R  reason: collision with other field name */
    public final g3 f1720R;

    /* renamed from: R  reason: collision with other field name */
    public final gL6 f1721R;

    /* renamed from: R  reason: collision with other field name */
    public final h5 f1722R;

    /* renamed from: R  reason: collision with other field name */
    public final htg f1723R;

    /* renamed from: R  reason: collision with other field name */
    public final mox f1724R = new mox(8, this);

    public bYd(g3 g3Var, aX aXVar) {
        h5 h5Var = cVK.R;
        htg htg = new htg(cVK.f2106R);
        gL6 gl6 = new gL6(8);
        this.f1720R = g3Var;
        this.R = aXVar;
        this.f1722R = h5Var;
        this.f1723R = htg;
        this.f1721R = gl6;
    }

    public final dMv R(nlN nln) {
        dMv dmv;
        h5 h5Var = this.f1722R;
        V4 v4 = new V4(this, 25, nln);
        synchronized (((dq) h5Var.R)) {
            dmv = (dMv) ((e2I) h5Var.v).R(nln);
            if (dmv != null) {
                if (!dmv.O()) {
                    dMv dmv2 = (dMv) ((e2I) h5Var.v).c(nln);
                }
            }
            try {
                dmv = (dMv) v4.x(new V4(h5Var, 26, nln));
                synchronized (((dq) h5Var.R)) {
                    if (((e2I) h5Var.v).R(nln) == null && dmv.O()) {
                        ((e2I) h5Var.v).v(nln, dmv);
                    }
                }
            } catch (Exception e) {
                throw new IllegalStateException("Could not load font", e);
            }
        }
        return dmv;
    }

    public final dMv v(deI dei, lIe lie, int i, int i2) {
        this.R.getClass();
        lIe R = this.R.R(lie);
        this.R.getClass();
        this.R.getClass();
        this.f1720R.getClass();
        return R(new nlN(dei, R, i, i2, null));
    }
}
