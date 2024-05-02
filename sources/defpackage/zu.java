package defpackage;

/* renamed from: zu  reason: default package */
/* loaded from: classes.dex */
public final class zu extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ iv7 R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zu(iv7 iv7, int i, iv7 iv72, int i2) {
        super(2);
        this.X = i2;
        this.R = iv7;
        this.O = i;
        this.v = iv72;
    }

    @Override // defpackage.iv7
    public final /* bridge */ /* synthetic */ Object J(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
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
                iv7 iv7 = this.R;
                jr_ jr_2 = (jr_) m88;
                jr_2.w(-1969500760);
                if (iv7 != null) {
                    iv7.J(m88, Integer.valueOf((this.O >> 9) & 14));
                }
                jr_2.g(false);
                this.v.J(m88, Integer.valueOf((this.O >> 3) & 14));
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                        return;
                    }
                }
                ll.v(RJ.R, RJ.v, aH9.I(m88, -1243689536, new zu(this.R, this.O, this.v, 0)), m88, 438);
                return;
        }
    }
}
