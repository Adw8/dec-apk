package defpackage;

/* renamed from: doB  reason: default package */
/* loaded from: classes.dex */
public final class doB extends k8G implements kg9 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ long f2864R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f2865R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gug f2866R;
    public final /* synthetic */ dH9 c;
    public final /* synthetic */ dH9 e;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public doB(ija ija, ija ija2, ija ija3, ija ija4, float f, long j, gug gug) {
        super(1);
        this.f2865R = ija;
        this.v = ija2;
        this.c = ija3;
        this.e = ija4;
        this.R = f;
        this.f2864R = j;
        this.f2866R = gug;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        fiv fiv = (fiv) obj;
        float abs = Math.abs(((Number) this.v.getValue()).floatValue() - ((Number) this.c.getValue()).floatValue());
        float floatValue = ((Number) this.c.getValue()).floatValue() + ((Number) this.e.getValue()).floatValue() + (((((Number) this.f2865R.getValue()).floatValue() * 216.0f) % 360.0f) - 0.049804688f);
        float f = this.R;
        long j = this.f2864R;
        gug gug = this.f2866R;
        float f2 = (float) 2;
        float f3 = (((f / (oI9.R / f2)) * 57.29578f) / 2.0f) + floatValue;
        float max = Math.max(abs, 0.1f);
        float f4 = gug.R / f2;
        float e = nqW.e(fiv.c()) - (f2 * f4);
        fiv.w(fiv, j, f3, max, aH9.N(f4, f4), n1P.e(e, e), gug);
        return o8s.R;
    }
}
