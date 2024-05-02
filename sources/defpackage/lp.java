package defpackage;

/* renamed from: lp  reason: default package */
/* loaded from: classes.dex */
public final class lp extends mjG implements g4j {

    /* renamed from: R  reason: collision with other field name */
    public mdz f5836R;

    /* renamed from: R  reason: collision with other field name */
    public final n3 f5837R;

    /* renamed from: R  reason: collision with other field name */
    public final n76 f5838R;

    /* renamed from: R  reason: collision with other field name */
    public nqW f5839R;

    /* renamed from: R  reason: collision with other field name */
    public vC f5840R;

    /* renamed from: R  reason: collision with other field name */
    public final a1 f5835R = null;
    public final float R = 1.0f;

    public lp(n3 n3Var, n76 n76) {
        this.f5837R = n3Var;
        this.f5838R = n76;
    }

    @Override // defpackage.g4j
    public final void A(ohT oht) {
        if (this.f5838R == cUF.f2104R) {
            n3 n3Var = this.f5837R;
            if (n3Var != null) {
                fiv.H(oht, n3Var.f6279R, 0, 0, 126);
            }
            a1 a1Var = this.f5835R;
            if (a1Var != null) {
                fiv.z(oht, a1Var, 0, 0, this.R, null, 118);
            }
        } else {
            jDh jdh = (jDh) oht;
            long c = jdh.c();
            nqW nqw = this.f5839R;
            int i = nqW.R;
            boolean z = false;
            if ((nqw instanceof nqW) && c == nqw.f6610R) {
                z = true;
            }
            vC R = (!z || jdh.getLayoutDirection() != this.f5836R) ? this.f5838R.R(jdh.c(), jdh.getLayoutDirection(), jdh) : this.f5840R;
            n3 n3Var2 = this.f5837R;
            if (n3Var2 != null) {
                long j = n3Var2.f6279R;
                faV fav = faV.R;
                fiv.R.getClass();
                int i2 = clQ.R;
                if (R instanceof kW2) {
                    gIA gia = ((kW2) R).R;
                    jdh.d(j, aH9.N(gia.f3720R, gia.v), n1P.e(gia.c - gia.f3720R, gia.e - gia.v), 1.0f, fav, null, i2);
                } else if (R instanceof j43) {
                    j43 j43 = (j43) R;
                    dm dmVar = j43.f4817R;
                    if (dmVar != null) {
                        jdh.E(dmVar, j, 1.0f, fav, null, i2);
                    } else {
                        bwp bwp = j43.R;
                        float v = buB.v(bwp.f1861e);
                        jdh.xN(j, aH9.N(bwp.R, bwp.v), n1P.e(bwp.c - bwp.R, bwp.e - bwp.v), g4x.R(v, v), fav, 1.0f, null, i2);
                    }
                } else {
                    throw new j8f((Object) null);
                }
            }
            a1 a1Var2 = this.f5835R;
            if (a1Var2 != null) {
                float f = this.R;
                faV fav2 = faV.R;
                fiv.R.getClass();
                int i3 = clQ.R;
                if (R instanceof kW2) {
                    gIA gia2 = ((kW2) R).R;
                    jdh.h(a1Var2, aH9.N(gia2.f3720R, gia2.v), n1P.e(gia2.c - gia2.f3720R, gia2.e - gia2.v), f, fav2, null, i3);
                } else if (R instanceof j43) {
                    j43 j432 = (j43) R;
                    dm dmVar2 = j432.f4817R;
                    if (dmVar2 != null) {
                        jdh.o(dmVar2, a1Var2, f, fav2, null, i3);
                    } else {
                        bwp bwp2 = j432.R;
                        float v2 = buB.v(bwp2.f1861e);
                        jdh.vl(a1Var2, aH9.N(bwp2.R, bwp2.v), n1P.e(bwp2.c - bwp2.R, bwp2.e - bwp2.v), g4x.R(v2, v2), f, fav2, null, i3);
                    }
                } else {
                    throw new j8f((Object) null);
                }
            }
            this.f5840R = R;
            this.f5839R = new nqW(jdh.c());
            this.f5836R = jdh.getLayoutDirection();
        }
        ((jDh) oht).v();
    }

    public final boolean equals(Object obj) {
        lp lpVar = obj instanceof lp ? (lp) obj : null;
        if (lpVar == null || !n3x.v(this.f5837R, lpVar.f5837R) || !n3x.v(this.f5835R, lpVar.f5835R)) {
            return false;
        }
        return ((this.R > lpVar.R ? 1 : (this.R == lpVar.R ? 0 : -1)) == 0) && n3x.v(this.f5838R, lpVar.f5838R);
    }

    public final int hashCode() {
        n3 n3Var = this.f5837R;
        int i = 0;
        int R = (n3Var != null ? ejC.R(n3Var.f6279R) : 0) * 31;
        a1 a1Var = this.f5835R;
        if (a1Var != null) {
            i = a1Var.hashCode();
        }
        return this.f5838R.hashCode() + jQ.c(this.R, (R + i) * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Background(color=");
        U.append(this.f5837R);
        U.append(", brush=");
        U.append(this.f5835R);
        U.append(", alpha = ");
        U.append(this.R);
        U.append(", shape=");
        U.append(this.f5838R);
        U.append(')');
        return U.toString();
    }
}
