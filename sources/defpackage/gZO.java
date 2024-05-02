package defpackage;

/* renamed from: gZO  reason: default package */
/* loaded from: classes.dex */
public final class gZO extends k8G implements kg9 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f3787R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ n76 f3788R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3789R;
    public final /* synthetic */ long v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gZO(float f, n76 n76, boolean z, long j, long j2) {
        super(1);
        this.R = f;
        this.f3788R = n76;
        this.f3789R = z;
        this.f3787R = j;
        this.v = j2;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        h7_ h7_ = (h7_) obj;
        h7_.O = h7_.D() * this.R;
        h7_.f4080R = this.f3788R;
        h7_.f4081R = this.f3789R;
        h7_.f4078R = this.f3787R;
        h7_.f4083v = this.v;
        return o8s.R;
    }
}
