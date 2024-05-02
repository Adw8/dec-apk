package defpackage;

/* renamed from: WL  reason: default package */
/* loaded from: classes.dex */
public final class WL extends k8G implements f_c {
    public final /* synthetic */ bkb R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ cvV f602R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f603R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f604R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ mdz f605R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public WL(bkb bkb, f_c f_c, cvV cvv, String str, mdz mdz) {
        super(0);
        this.R = bkb;
        this.f603R = f_c;
        this.f602R = cvv;
        this.f604R = str;
        this.f605R = mdz;
    }

    @Override // defpackage.f_c
    public final Object g() {
        this.R.H(this.f603R, this.f602R, this.f604R, this.f605R);
        return o8s.R;
    }
}
