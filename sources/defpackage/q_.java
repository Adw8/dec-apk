package defpackage;

/* renamed from: q_  reason: default package */
/* loaded from: classes.dex */
public final class q_ extends k8G implements kg9 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ a1 f7360R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dgk f7361R;
    public final /* synthetic */ long v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public q_(a1 a1Var, long j, long j2, dgk dgk) {
        super(1);
        this.f7360R = a1Var;
        this.R = j;
        this.v = j2;
        this.f7361R = dgk;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        ohT oht = (ohT) obj;
        ((jDh) oht).v();
        fiv.z(oht, this.f7360R, this.R, this.v, 0.0f, this.f7361R, 104);
        return o8s.R;
    }
}
