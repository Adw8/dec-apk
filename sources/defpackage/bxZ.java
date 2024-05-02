package defpackage;

/* renamed from: bxZ  reason: default package */
/* loaded from: classes.dex */
public final class bxZ extends k8G implements kg9 {
    public final /* synthetic */ dq7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ eLb f1872R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gAN f1873R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f1874R;
    public final /* synthetic */ int X;
    public final /* synthetic */ eLb v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bxZ(eLb elb, jd2 jd2, eLb elb2, dq7 dq7, boolean z, int i) {
        super(1);
        this.f1872R = elb;
        this.f1873R = jd2;
        this.v = elb2;
        this.R = dq7;
        this.f1874R = z;
        this.X = i;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        Hd hd = (Hd) obj;
        float floatValue = ((Number) hd.v()).floatValue() - this.f1872R.R;
        float R = this.f1873R.R(floatValue);
        this.f1872R.R = ((Number) hd.v()).floatValue();
        this.v.R = ((Number) hd.c()).floatValue();
        if (Math.abs(floatValue - R) > 0.5f) {
            hd.R();
        }
        jMO e = this.R.f2897R.e();
        if (e == null) {
            hd.R();
        } else {
            if (hd.e() && this.f1874R) {
                if (((Number) hd.c()).floatValue() > 0.0f && e.R.v == this.X - 1) {
                    hd.R();
                } else if (((Number) hd.c()).floatValue() < 0.0f && e.R.v == this.X) {
                    hd.R();
                }
            }
            if (hd.e() && dq7.v(this.R, hd, e, this.X, new mCa(5, this.f1873R))) {
                hd.R();
            }
        }
        return o8s.R;
    }
}
