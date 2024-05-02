package defpackage;

import java.util.List;

/* renamed from: mvf  reason: default package */
/* loaded from: classes.dex */
public final class mvf implements bF9 {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jJj f6236R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kY5 f6237R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f6238R;

    public mvf(kY5 ky5, kg9 kg9, jJj jjj, int i) {
        this.f6237R = ky5;
        this.f6238R = kg9;
        this.f6236R = jjj;
        this.R = i;
    }

    @Override // defpackage.bF9
    public final int c(poS pos, List list, int i) {
        this.f6237R.f5333R.v(pos.f7272R.f3603R);
        oq3 oq3 = this.f6237R.f5333R.f2514R;
        if (oq3 != null) {
            return msU.V(oq3.R());
        }
        throw new IllegalStateException("layoutIntrinsics must be called first");
    }

    /* JADX INFO: finally extract failed */
    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        kY5 ky5 = this.f6237R;
        dR6 c = ift.c();
        try {
            dR6 m = c.m();
            mjp c2 = ky5.c();
            iRR irr = c2 != null ? c2.f6140R : null;
            dR6.P(m);
            c.c();
            iRR R = this.f6237R.f5333R.R(j, mzf.getLayoutDirection(), irr);
            Integer valueOf = Integer.valueOf((int) (R.f4589R >> 32));
            Integer valueOf2 = Integer.valueOf(ltH.v(R.f4589R));
            int intValue = valueOf.intValue();
            int intValue2 = valueOf2.intValue();
            if (!n3x.v(irr, R)) {
                kY5 ky52 = this.f6237R;
                ky52.c.R(new mjp(R));
                ky52.f5344v = false;
                this.f6238R.x(R);
            }
            this.f6237R.f5343v.R(new hoI(this.f6236R.l(this.R == 1 ? msU.V(R.e(0)) : 0)));
            return mzf.f(intValue, intValue2, mHQ.J(new kSh(Qv.R, Integer.valueOf(mLz.t(R.R))), new kSh(Qv.v, Integer.valueOf(mLz.t(R.v)))), e2p.R);
        } catch (Throwable th) {
            c.c();
            throw th;
        }
    }
}
