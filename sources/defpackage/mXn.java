package defpackage;

/* renamed from: mXn  reason: default package */
/* loaded from: classes.dex */
public final class mXn extends k8G implements f_c {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ bTI f6054R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kTd f6055R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pfJ f6056R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ poS f6057R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6058R;
    public final /* synthetic */ boolean v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mXn(poS pos, kTd ktd, bTI bti, long j, pfJ pfj, boolean z, boolean z2) {
        super(0);
        this.f6057R = pos;
        this.f6055R = ktd;
        this.f6054R = bti;
        this.R = j;
        this.f6056R = pfj;
        this.f6058R = z;
        this.v = z2;
    }

    @Override // defpackage.f_c
    public final Object g() {
        this.f6057R._i(msU.C(this.f6055R, ((ift) this.f6054R).X()), this.f6054R, this.R, this.f6056R, this.f6058R, this.v);
        return o8s.R;
    }
}
