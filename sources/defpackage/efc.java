package defpackage;

/* renamed from: efc  reason: default package */
/* loaded from: classes.dex */
public final class efc extends k8G implements iv7 {
    public final /* synthetic */ dH9 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ efc(dH9 dh9, int i) {
        super(2);
        this.X = i;
        this.R = dh9;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 1:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 2:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            case 3:
                R((m88) obj, ((Number) obj2).intValue());
                break;
            default:
                R((m88) obj, ((Number) obj2).intValue());
                break;
        }
        return o8s.R;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                if ((i & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                dH9 dh9 = this.R;
                kPU kpu = daH.R;
                ((iv7) dh9.getValue()).J(m88, 0);
                return;
            case 1:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                ((iv7) this.R.getValue()).J(m88, 0);
                return;
            case 2:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                cU5.c(cU5.N(aff.R, false, t6.R), aH9.I(m88, -533674951, new efc(this.R, 1)), m88, 48, 0);
                return;
            case 3:
                if ((i & 11) == 2) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                }
                dH9 dh92 = this.R;
                kPU kpu2 = Gm.R;
                ((iv7) dh92.getValue()).J(m88, 0);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_5 = (jr_) m88;
                    if (jr_5.J()) {
                        jr_5.E();
                        return;
                    }
                }
                b1n b1n = (b1n) this.R.getValue();
                g1c.c(jQ.C("Delete ", b1n != null ? b1n.v : null, "?"), null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, 0, 0, 65534);
                return;
        }
    }
}
