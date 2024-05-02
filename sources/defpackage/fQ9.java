package defpackage;

import dev.kdrag0n.virtcontainer.R;

/* renamed from: fQ9  reason: default package */
/* loaded from: classes.dex */
public final class fQ9 extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ f_c R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fQ9(f_c f_c, int i, int i2) {
        super(2);
        this.X = i2;
        this.R = f_c;
        this.O = i;
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
                vd.v(null, dtx.h(R.string.allow, m88), this.R, m88, (this.O >> 3) & 896, 1);
                return;
            default:
                if ((i & 11) == 2) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                vd.v(null, dtx.h(R.string.cancel, m88), this.R, m88, (this.O >> 6) & 896, 1);
                return;
        }
    }
}
