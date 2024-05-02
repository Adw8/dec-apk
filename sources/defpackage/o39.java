package defpackage;

/* renamed from: o39  reason: default package */
/* loaded from: classes.dex */
public final class o39 extends k8G implements f_c {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f6656R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f6657R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pso f6658R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public o39(kg9 kg9, pso pso, long j, float f) {
        super(0);
        this.f6657R = kg9;
        this.f6658R = pso;
        this.f6656R = j;
        this.R = f;
    }

    @Override // defpackage.f_c
    public final Object g() {
        kg9 kg9 = this.f6657R;
        pso pso = this.f6658R;
        long j = this.f6656R;
        float f = this.R;
        if (kg9 == null) {
            h57.c(pso.R(), j, f);
        } else {
            h57.Z(pso.R(), j, f, kg9);
        }
        return o8s.R;
    }
}
