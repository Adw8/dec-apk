package defpackage;

/* renamed from: l80  reason: default package */
/* loaded from: classes.dex */
public final class l80 extends k8G implements kg9 {
    public final /* synthetic */ c71 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ d5M f5594R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ djV f5595R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fBS f5596R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f5597R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kY5 f5598R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kef f5599R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ze f5600R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public l80(kY5 ky5, kef kef, d5M d5m, djV djv, fBS fbs, jy_ jy_, ze zeVar, c71 c71) {
        super(1);
        this.f5598R = ky5;
        this.f5599R = kef;
        this.f5594R = d5m;
        this.f5595R = djv;
        this.f5596R = fbs;
        this.f5597R = jy_;
        this.f5600R = zeVar;
        this.R = c71;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        mjp c;
        mgi mgi = (mgi) ((okg) obj);
        if (this.f5598R.v() != mgi.v()) {
            this.f5598R.f5341R.R(Boolean.valueOf(mgi.v()));
            kef kef = this.f5599R;
            if (kef != null) {
                kY5 ky5 = this.f5598R;
                d5M d5m = this.f5594R;
                djV djv = this.f5595R;
                if (ky5.v()) {
                    ky5.f5340R = f1A.X(kef, d5m, ky5.f5336R, djv, ky5.f5335R, ky5.v);
                } else {
                    dTl.W(ky5);
                }
                if (mgi.v() && (c = this.f5598R.c()) != null) {
                    l6.z(this.f5597R, null, 0, new eaP(this.f5600R, this.f5594R, this.f5598R, c, this.R, null), 3);
                }
            }
            if (!mgi.v()) {
                this.f5596R.L(null);
            }
        }
        return o8s.R;
    }
}
