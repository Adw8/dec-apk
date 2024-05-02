package defpackage;

/* renamed from: kzT  reason: default package */
/* loaded from: classes.dex */
public final class kzT extends k8G implements lR3 {
    public final /* synthetic */ c71 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ d5M f5533R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fBS f5534R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kY5 f5535R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f5536R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kzT(c71 c71, boolean z, d5M d5m, fBS fbs, kY5 ky5) {
        super(3);
        this.R = c71;
        this.f5536R = z;
        this.f5533R = d5m;
        this.f5534R = fbs;
        this.f5535R = ky5;
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        m3z m3z = m3z.None;
        int intValue = ((Number) obj).intValue();
        int intValue2 = ((Number) obj2).intValue();
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        if (!booleanValue) {
            intValue = this.R.L(intValue);
        }
        if (!booleanValue) {
            intValue2 = this.R.L(intValue2);
        }
        boolean z = false;
        if (this.f5536R) {
            long j = this.f5533R.R;
            int i = odN.R;
            if (!(intValue == ((int) (j >> 32)) && intValue2 == odN.c(j))) {
                if ((intValue > intValue2 ? intValue2 : intValue) >= 0) {
                    if ((intValue < intValue2 ? intValue2 : intValue) <= this.f5533R.f2488R.length()) {
                        if (booleanValue || intValue == intValue2) {
                            fBS fbs = this.f5534R;
                            kY5 ky5 = fbs.f3345R;
                            if (ky5 != null) {
                                ky5.f5342R = false;
                            }
                            fbs.C(m3z);
                        } else {
                            this.f5534R.Z();
                        }
                        this.f5535R.f5335R.x(new d5M(this.f5533R.f2488R, dtx.e(intValue, intValue2), (odN) null));
                        z = true;
                    }
                }
                fBS fbs2 = this.f5534R;
                kY5 ky52 = fbs2.f3345R;
                if (ky52 != null) {
                    ky52.f5342R = false;
                }
                fbs2.C(m3z);
            }
        }
        return Boolean.valueOf(z);
    }
}
