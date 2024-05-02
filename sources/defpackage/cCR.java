package defpackage;

/* renamed from: cCR  reason: default package */
/* loaded from: classes.dex */
public final class cCR extends k8G implements kg9 {
    public final /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f2015R;
    public final /* synthetic */ int X = 0;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cCR(kY5 ky5, boolean z, fBS fbs) {
        super(1);
        this.R = ky5;
        this.f2015R = z;
        this.v = fbs;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.X) {
            case 0:
                phU phu = (phU) obj;
                n1P.O((cXX) this.R, phu);
                long K = n1P.K(phu, false);
                phu.R();
                nDS nds = (nDS) this.v;
                if (this.f2015R) {
                    K = aWo.Z(-1.0f, K);
                }
                nds.e(new hGa(K));
                return o8s.R;
            default:
                hjM hjm = (hjM) obj;
                kY5 ky5 = (kY5) this.R;
                ky5.f5338R = hjm;
                if (this.f2015R) {
                    if (ky5.R() == m3z.Selection) {
                        if (((kY5) this.R).f5342R) {
                            ((fBS) this.v).N();
                        } else {
                            ((fBS) this.v).H();
                        }
                        ((kY5) this.R).X.R(Boolean.valueOf(n1P.g((fBS) this.v, true)));
                        ((kY5) this.R).O.R(Boolean.valueOf(n1P.g((fBS) this.v, false)));
                    } else if (((kY5) this.R).R() == m3z.Cursor) {
                        ((kY5) this.R).L.R(Boolean.valueOf(n1P.g((fBS) this.v, true)));
                    }
                }
                mjp c = ((kY5) this.R).c();
                if (c != null) {
                    c.R = hjm;
                }
                return o8s.R;
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cCR(Object obj, gn gnVar, boolean z) {
        super(1);
        this.R = obj;
        this.v = gnVar;
        this.f2015R = z;
    }
}
