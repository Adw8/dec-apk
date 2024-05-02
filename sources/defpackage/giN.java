package defpackage;

/* renamed from: giN  reason: default package */
/* loaded from: classes.dex */
public final class giN extends k8G implements lR3 {
    public final /* synthetic */ fzf R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f3880R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3881R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public giN(boolean z, boolean z2, fzf fzf, e3Q e3q) {
        super(3);
        this.f3881R = z;
        this.v = z2;
        this.R = fzf;
        this.f3880R = e3q;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        ncu ncu = (ncu) obj;
        ((Number) obj3).intValue();
        jr_ jr_ = (jr_) ((m88) obj2);
        jr_.w(290332169);
        boolean z = this.f3881R;
        jr_.w(-492369756);
        Object I = jr_.I();
        if (I == ppN.R) {
            I = new p2E();
            jr_.ZW(I);
        }
        jr_.g(false);
        ncu Y = ooA.Y(z, (p2E) I, (f8n) jr_.x(pbX.R), this.v, this.R, this.f3880R);
        jr_.g(false);
        return Y;
    }
}
