package defpackage;

/* renamed from: hIO  reason: default package */
/* loaded from: classes.dex */
public final class hIO extends k8G implements lR3 {
    public final /* synthetic */ int X;
    public static final hIO R = new hIO(1);
    public static final hIO v = new hIO(2);
    public static final hIO c = new hIO(4);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hIO(int i) {
        super(3);
        this.X = i;
    }

    public final Integer R(liQ liq, int i, int i2) {
        switch (this.X) {
            case 2:
                return Integer.valueOf(caw.x(caw.x(i2, i - 1, i + 1), 0, ((h4N) liq).f4040R.L().O() - 1));
            default:
                return Integer.valueOf(i2);
        }
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                iYf iyf = (iYf) obj;
                ((Number) obj3).intValue();
                jr_ jr_ = (jr_) ((m88) obj2);
                jr_.w(945678692);
                jr_.w(1157296644);
                boolean O = jr_.O(iyf);
                Object I = jr_.I();
                if (O || I == ppN.R) {
                    I = new mkt(iyf.zw());
                    jr_.ZW(I);
                }
                jr_.g(false);
                mkt mkt = (mkt) I;
                jr_.g(false);
                return mkt;
            case 1:
                ncu ncu = (ncu) obj;
                ((Number) obj3).intValue();
                jr_ jr_2 = (jr_) ((m88) obj2);
                Object x = jQ.x(jr_2, -326009031, -492369756);
                f1A f1a = ppN.R;
                if (x == f1a) {
                    x = new pi1();
                    jr_2.ZW(x);
                }
                jr_2.g(false);
                pi1 pi1 = (pi1) x;
                jr_2.w(1157296644);
                boolean O2 = jr_2.O(pi1);
                Object I2 = jr_2.I();
                if (O2 || I2 == f1a) {
                    I2 = new lud(pi1, 0);
                    jr_2.ZW(I2);
                }
                jr_2.g(false);
                caw.L((f_c) I2, jr_2);
                bsy bsy = ofC.R;
                ncu I3 = ncu.I(pi1).I(ofC.f6889R);
                jr_2.g(false);
                return I3;
            case 2:
                return R((liQ) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            case 3:
                return R((liQ) obj, ((Number) obj2).intValue(), ((Number) obj3).intValue());
            default:
                kM4 km4 = (kM4) obj;
                m88 m88 = (m88) obj2;
                if ((((Number) obj3).intValue() & 81) == 16) {
                    jr_ jr_3 = (jr_) m88;
                    if (jr_3.J()) {
                        jr_3.E();
                    }
                }
                return o8s.R;
        }
    }
}
