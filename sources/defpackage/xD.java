package defpackage;

/* renamed from: xD  reason: default package */
/* loaded from: classes.dex */
public final class xD extends k8G implements kg9 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f7469R;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public xD(float f, n76 n76, eGS egs, a1 a1Var) {
        super(1);
        this.R = f;
        this.f7469R = n76;
        this.v = egs;
        this.c = a1Var;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        dm dmVar;
        SD sd = (SD) obj;
        if (!(sd.D() * this.R >= 0.0f && nqW.c(sd.c()) > 0.0f)) {
            return sd.R(ih.R);
        }
        float f = (float) 2;
        float min = Math.min(hoI.R(this.R, 0.0f) ? 1.0f : (float) Math.ceil((double) (sd.D() * this.R)), (float) Math.ceil((double) (nqW.c(sd.c()) / f)));
        float f2 = min / f;
        long N = aH9.N(f2, f2);
        long e = n1P.e(nqW.e(sd.c()) - min, nqW.v(sd.c()) - min);
        boolean z = f * min > nqW.c(sd.c());
        vC R = ((n76) this.f7469R).R(sd.c(), sd.R.getLayoutDirection(), sd);
        if (R instanceof j43) {
            eGS egs = (eGS) this.v;
            a1 a1Var = (a1) this.c;
            j43 j43 = (j43) R;
            if (dTl.S(j43.R)) {
                return sd.R(new h_(z, a1Var, j43.R.f1859R, f2, min, N, e, new gug(min, 0.0f, 0, 0, 30)));
            }
            Bh bh = (Bh) egs.R;
            if (bh == null) {
                bh = new Bh();
                egs.R = bh;
            }
            cnO cno = bh.f38R;
            if (cno == null) {
                cno = g4x.L();
                bh.f38R = cno;
            }
            bwp bwp = j43.R;
            dm dmVar2 = (dm) cno;
            dmVar2.e();
            dmVar2.v(bwp);
            if (!z) {
                dm L = g4x.L();
                float f3 = (bwp.c - bwp.R) - min;
                float f4 = (bwp.e - bwp.v) - min;
                long l = gQc.l(min, bwp.f1859R);
                long l2 = gQc.l(min, bwp.f1862v);
                long l3 = gQc.l(min, bwp.f1861e);
                long l4 = gQc.l(min, bwp.f1860c);
                dmVar = dmVar2;
                L.v(new bwp(min, min, f3, f4, l, l2, l4, l3));
                dmVar.c(dmVar, L, 0);
            } else {
                dmVar = dmVar2;
            }
            return sd.R(new V4(dmVar, 1, a1Var));
        } else if (R instanceof kW2) {
            a1 a1Var2 = (a1) this.c;
            if (z) {
                N = aWo.v;
            }
            if (z) {
                e = sd.c();
            }
            return sd.R(new q_(a1Var2, N, e, z ? faV.R : new gug(min, 0.0f, 0, 0, 30)));
        } else {
            throw new j8f((Object) null);
        }
    }
}
