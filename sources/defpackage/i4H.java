package defpackage;

/* renamed from: i4H  reason: default package */
/* loaded from: classes.dex */
public abstract class i4H implements nmZ, h0T {
    public final dqr R;

    /* renamed from: R  reason: collision with other field name */
    public gC2 f4450R;

    public i4H(Object obj, dqr dqr) {
        this.R = dqr;
        this.f4450R = new gC2(obj);
    }

    @Override // defpackage.nmZ
    public final jJG C() {
        return this.f4450R;
    }

    @Override // defpackage.nmZ
    public final void H(jJG jjg) {
        this.f4450R = (gC2) jjg;
    }

    @Override // defpackage.h0T
    public final void R(Object obj) {
        dR6 L;
        jJG jjg;
        gC2 gc2 = (gC2) jwU.O(this.f4450R);
        if (!this.R.R(gc2.R, obj)) {
            gC2 gc22 = this.f4450R;
            synchronized (jwU.f5150R) {
                int i = dR6.c;
                L = jwU.L();
                if (L.L()) {
                    L.C(this);
                }
                int e = L.e();
                if (((jJG) gc2).R == e) {
                    jjg = gc2;
                } else {
                    jJG m = jwU.m(gc22, this);
                    m.R = e;
                    L.C(this);
                    jjg = m;
                }
                ((gC2) jjg).R = obj;
            }
            jwU.x(L, this);
        }
    }

    @Override // defpackage.h0T, defpackage.dH9
    public final Object getValue() {
        return ((gC2) jwU.C(this.f4450R, this)).R;
    }

    public final String toString() {
        StringBuilder U = opT.U("MutableState(value=");
        U.append(((gC2) jwU.O(this.f4450R)).R);
        U.append(")@");
        U.append(hashCode());
        return U.toString();
    }

    @Override // defpackage.nmZ
    public final jJG v(jJG jjg, jJG jjg2, jJG jjg3) {
        gC2 gc2 = (gC2) jjg;
        if (this.R.R(((gC2) jjg2).R, ((gC2) jjg3).R)) {
            return jjg2;
        }
        this.R.getClass();
        return null;
    }
}
