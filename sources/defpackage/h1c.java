package defpackage;

/* renamed from: h1c  reason: default package */
/* loaded from: classes.dex */
public final class h1c extends k8G implements f_c {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f4023R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ bTI f4024R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kTd f4025R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pfJ f4026R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ poS f4027R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4028R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1c(poS pos, kTd ktd, bTI bti, long j, pfJ pfj, boolean z, boolean z2, float f) {
        super(0);
        this.f4027R = pos;
        this.f4025R = ktd;
        this.f4024R = bti;
        this.f4023R = j;
        this.f4026R = pfj;
        this.f4028R = z;
        this.v = z2;
        this.R = f;
    }

    @Override // defpackage.f_c
    public final Object g() {
        this.f4027R.s3(msU.C(this.f4025R, ((ift) this.f4024R).X()), this.f4024R, this.f4023R, this.f4026R, this.f4028R, this.v, this.R);
        return o8s.R;
    }
}
