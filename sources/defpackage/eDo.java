package defpackage;

/* renamed from: eDo  reason: default package */
/* loaded from: classes.dex */
public final class eDo implements dH9 {
    public final /* synthetic */ aGK R;

    /* renamed from: R  reason: collision with other field name */
    public final c0y f3037R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f3038R;
    public kg9 v;

    public eDo(aGK agk, c0y c0y, kg9 kg9, kg9 kg92) {
        this.R = agk;
        this.f3037R = c0y;
        this.f3038R = kg9;
        this.v = kg92;
    }

    @Override // defpackage.dH9
    public final Object getValue() {
        v(this.R.f814R.c());
        return this.f3037R.getValue();
    }

    public final void v(cyg cyg) {
        Object x = this.v.x(cyg.v);
        if (this.R.f814R.X()) {
            this.f3037R.e(this.v.x(cyg.R), x, (nKE) this.f3038R.x(cyg));
            return;
        }
        this.f3037R.X(x, (nKE) this.f3038R.x(cyg));
    }
}
