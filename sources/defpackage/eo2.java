package defpackage;

/* renamed from: eo2  reason: default package */
/* loaded from: classes.dex */
public final class eo2 extends k8G implements lR3 {
    public final /* synthetic */ h4f R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kIU f3202R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eo2(kIU kiu, h4f h4f, int i) {
        super(3);
        this.X = i;
        this.f3202R = kiu;
        this.R = h4f;
    }

    public final nKE R(cyg cyg, m88 m88) {
        ipq ipq;
        aMr amr = aMr.PostExit;
        aMr amr2 = aMr.Visible;
        aMr amr3 = aMr.PreEnter;
        switch (this.X) {
            case 0:
                jr_ jr_ = (jr_) m88;
                jr_.w(-9520302);
                nKE nke = null;
                if (cyg.R(amr3, amr2)) {
                    a80 a80 = this.f3202R.R.R;
                    if (a80 != null) {
                        nke = a80.f742R;
                    }
                    if (nke == null) {
                        nke = nf2.R;
                    }
                } else if (cyg.R(amr2, amr)) {
                    a80 a802 = this.R.R.R;
                    if (a802 != null) {
                        nke = a802.f742R;
                    }
                    if (nke == null) {
                        nke = nf2.R;
                    }
                } else {
                    nke = nf2.R;
                }
                jr_.g(false);
                return nke;
            default:
                jr_ jr_2 = (jr_) m88;
                jr_2.w(-9519413);
                if (cyg.R(amr3, amr2)) {
                    this.f3202R.R.getClass();
                    ipq = nf2.R;
                } else if (cyg.R(amr2, amr)) {
                    this.R.R.getClass();
                    ipq = nf2.R;
                } else {
                    ipq = nf2.R;
                }
                jr_2.g(false);
                return ipq;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ((Number) obj3).intValue();
                return R((cyg) obj, (m88) obj2);
            default:
                ((Number) obj3).intValue();
                return R((cyg) obj, (m88) obj2);
        }
    }
}
