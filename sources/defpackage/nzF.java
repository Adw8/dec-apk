package defpackage;

/* renamed from: nzF  reason: default package */
/* loaded from: classes.dex */
public final class nzF extends k8G implements lR3 {
    public final /* synthetic */ kg9 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nzF(int i, kg9 kg9) {
        super(3);
        this.X = i;
        this.R = kg9;
    }

    public final ncu R(ncu ncu, m88 m88) {
        switch (this.X) {
            case 0:
                jr_ jr_ = (jr_) m88;
                jr_.w(1176407768);
                kg9 kg9 = this.R;
                jr_.w(1157296644);
                boolean O = jr_.O(kg9);
                Object I = jr_.I();
                if (O || I == ppN.R) {
                    I = new kCH(kg9);
                    jr_.ZW(I);
                }
                jr_.g(false);
                kCH kch = (kCH) I;
                jr_.g(false);
                return kch;
            case 1:
                jr_ jr_2 = (jr_) m88;
                Object x = jQ.x(jr_2, -1689569019, -492369756);
                if (x == ppN.R) {
                    x = new SD();
                    jr_2.ZW(x);
                }
                jr_2.g(false);
                ncu I2 = ncu.I(new lYY((SD) x, this.R));
                jr_2.g(false);
                return I2;
            case 2:
                jr_ jr_3 = (jr_) m88;
                Object x2 = jQ.x(jr_3, -1741761824, -492369756);
                f1A f1a = ppN.R;
                if (x2 == f1a) {
                    x2 = l6.n(null);
                    jr_3.ZW(x2);
                }
                jr_3.g(false);
                h0T h0t = (h0T) x2;
                aff aff = aff.R;
                kg9 kg92 = this.R;
                jr_3.w(511388516);
                boolean O2 = jr_3.O(h0t) | jr_3.O(kg92);
                Object I3 = jr_3.I();
                if (O2 || I3 == f1a) {
                    I3 = new V4(h0t, 17, kg92);
                    jr_3.ZW(I3);
                }
                jr_3.g(false);
                bsy bsy = jq5.R;
                ncu g = g4x.g(aff, lBz.Y, new nzF(3, (kg9) I3));
                jr_3.g(false);
                return g;
            default:
                jr_ jr_4 = (jr_) m88;
                jr_4.w(607036704);
                kg9 kg93 = this.R;
                jr_4.w(1157296644);
                boolean O3 = jr_4.O(kg93);
                Object I4 = jr_4.I();
                if (O3 || I4 == ppN.R) {
                    I4 = new dhh(kg93);
                    jr_4.ZW(I4);
                }
                jr_4.g(false);
                dhh dhh = (dhh) I4;
                jr_4.w(1157296644);
                boolean O4 = jr_4.O(dhh);
                Object I5 = jr_4.I();
                if (O4 || I5 == ppN.R) {
                    I5 = new oGC(dhh, 1);
                    jr_4.ZW(I5);
                }
                jr_4.g(false);
                caw.L((f_c) I5, jr_4);
                jr_4.g(false);
                return dhh;
        }
    }

    @Override // defpackage.lR3
    public final /* bridge */ /* synthetic */ Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 1:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 2:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            default:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
        }
    }
}
