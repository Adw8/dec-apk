package defpackage;

/* renamed from: cPF  reason: default package */
/* loaded from: classes.dex */
public final class cPF extends k8G implements f_c {
    public final /* synthetic */ dH9 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dRB f2080R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h0T f2081R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jJj f2082R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jUs f2083R;
    public final /* synthetic */ dH9 X;
    public final /* synthetic */ dH9 c;
    public final /* synthetic */ dH9 e;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cPF(f30 f30, jJj jjj, dH9 dh9, dH9 dh92, dH9 dh93, h0T h0t, dH9 dh94, dRB drb, dH9 dh95) {
        super(0);
        this.f2083R = f30;
        this.f2082R = jjj;
        this.R = dh9;
        this.v = dh92;
        this.c = dh93;
        this.f2081R = h0t;
        this.e = dh94;
        this.f2080R = drb;
        this.X = dh95;
    }

    @Override // defpackage.f_c
    public final Object g() {
        if (((Boolean) this.R.getValue()).booleanValue()) {
            jUs jus = this.f2083R;
            long j = ((aWo) this.v.getValue()).f906R;
            Object x = ((kg9) this.c.getValue()).x(this.f2082R);
            h0T h0t = this.f2081R;
            long j2 = ((aWo) x).f906R;
            jus.R(j, aH9.f(j2) ? aWo.L(((aWo) h0t.getValue()).f906R, j2) : aWo.e, ((Number) this.e.getValue()).floatValue());
            f30 f30 = (f30) this.f2083R;
            long R = iTI.R(f30.R.getWidth(), f30.R.getHeight());
            dRB drb = this.f2080R;
            jJj jjj = this.f2082R;
            dH9 dh9 = this.X;
            if (!ltH.R(R, drb.R)) {
                drb.R = R;
                kg9 kg9 = (kg9) dh9.getValue();
                if (kg9 != null) {
                    kg9.x(new o2S(jjj.C(iTI.J(R))));
                }
            }
        } else {
            ((f30) this.f2083R).R.dismiss();
        }
        return o8s.R;
    }
}
