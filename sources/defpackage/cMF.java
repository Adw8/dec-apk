package defpackage;

/* renamed from: cMF  reason: default package */
/* loaded from: classes.dex */
public final class cMF extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ String R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cMF(String str, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = str;
        this.O = i;
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
                g1c.c(this.R, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, (this.O >> 3) & 14, 0, 65534);
                return;
            case 1:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                g1c.c(this.R, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, (this.O >> 6) & 14, 0, 65534);
                return;
            case 2:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                g1c.c(this.R, null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, m88, (this.O >> 3) & 14, 0, 65534);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_4 = (jr_) m88;
                    if (jr_4.J()) {
                        jr_4.E();
                        return;
                    }
                }
                g1c.c(this.R, null, 0, 0, null, null, null, 0, null, new pvy(3), 0, 2, false, 1, null, null, m88, this.O & 14, 3120, 54782);
                return;
        }
    }
}
