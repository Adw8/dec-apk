package defpackage;

/* renamed from: bnP  reason: default package */
/* loaded from: classes.dex */
public final class bnP extends k8G implements lR3 {
    public final /* synthetic */ int O;
    public final /* synthetic */ iEm R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f1811R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f1812R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bnP(p2E p2e, iEm iem, boolean z, int i, int i2) {
        super(3);
        this.X = i2;
        this.f1811R = p2e;
        this.R = iem;
        this.f1812R = z;
        this.O = i;
    }

    public final void R(m88 m88, int i) {
        switch (this.X) {
            case 0:
                if ((i & 81) == 16) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                        return;
                    }
                }
                hw1 hw1 = hw1.U;
                p2E p2e = this.f1811R;
                iEm iem = this.R;
                boolean z = this.f1812R;
                int i2 = this.O;
                hw1.m(p2e, null, iem, z, 0, m88, ((i2 >> 24) & 14) | 196608 | ((i2 >> 15) & 896) | (i2 & 7168), 18);
                return;
            default:
                if ((i & 81) == 16) {
                    jr_ jr_2 = (jr_) m88;
                    if (jr_2.J()) {
                        jr_2.E();
                        return;
                    }
                }
                hw1 hw12 = hw1.U;
                p2E p2e2 = this.f1811R;
                iEm iem2 = this.R;
                boolean z2 = this.f1812R;
                int i3 = this.O;
                hw12.m(p2e2, null, iem2, z2, 0, m88, ((i3 >> 27) & 14) | 196608 | ((i3 >> 18) & 896) | ((i3 >> 3) & 7168), 18);
                return;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                cY9 cy9 = (cY9) obj;
                R((m88) obj2, ((Number) obj3).intValue());
                break;
            default:
                cY9 cy92 = (cY9) obj;
                R((m88) obj2, ((Number) obj3).intValue());
                break;
        }
        return o8s.R;
    }
}
