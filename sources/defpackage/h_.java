package defpackage;

/* renamed from: h_  reason: default package */
/* loaded from: classes.dex */
public final class h_ extends k8G implements kg9 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f4304R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ a1 f4305R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gug f4306R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4307R;
    public final /* synthetic */ long c;
    public final /* synthetic */ float v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ long f4308v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h_(boolean z, a1 a1Var, long j, float f, float f2, long j2, long j3, gug gug) {
        super(1);
        this.f4307R = z;
        this.f4305R = a1Var;
        this.f4304R = j;
        this.R = f;
        this.v = f2;
        this.f4308v = j2;
        this.c = j3;
        this.f4306R = gug;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        ohT oht = (ohT) obj;
        jDh jdh = (jDh) oht;
        jdh.v();
        if (this.f4307R) {
            fiv.BF(oht, this.f4305R, 0, 0, this.f4304R, null, 246);
        } else {
            float v = buB.v(this.f4304R);
            float f = this.R;
            if (v < f) {
                float f2 = this.v;
                float e = nqW.e(jdh.c()) - this.v;
                float v2 = nqW.v(jdh.c()) - this.v;
                a1 a1Var = this.f4305R;
                long j = this.f4304R;
                JF jf = jdh.R.R;
                long v3 = jf.v();
                jf.R().y();
                jf.f201R.R(f2, f2, e, v2, 0);
                fiv.BF(jdh, a1Var, 0, 0, j, null, 246);
                jf.R().j();
                jf.c(v3);
            } else {
                fiv.BF(oht, this.f4305R, this.f4308v, this.c, gQc.l(f, this.f4304R), this.f4306R, 208);
            }
        }
        return o8s.R;
    }
}
