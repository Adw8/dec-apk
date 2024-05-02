package defpackage;

/* renamed from: ge4  reason: default package */
/* loaded from: classes.dex */
public final class ge4 extends csA {
    private static final ge4 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private jhs params_;

    static {
        ge4 ge4 = new ge4();
        DEFAULT_INSTANCE = ge4;
        csA.N(ge4.class, ge4);
    }

    public static void j(ge4 ge4, jhs jhs) {
        ge4.getClass();
        ge4.params_ = jhs;
    }

    public static ge4 t(b0 b0Var, nCG ncg) {
        return (ge4) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static fo3 y() {
        return (fo3) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"params_"});
            case 3:
                return new ge4();
            case 4:
                return new fo3();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (ge4.class) {
                        try {
                            fup = PARSER;
                            if (fup == null) {
                                fup = new mBE();
                                PARSER = fup;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return fup;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final jhs g() {
        jhs jhs = this.params_;
        return jhs == null ? jhs.t() : jhs;
    }
}
