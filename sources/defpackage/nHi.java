package defpackage;

/* renamed from: nHi  reason: default package */
/* loaded from: classes.dex */
public final class nHi extends csA {
    private static final nHi DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private String keyUri_ = "";

    static {
        nHi nhi = new nHi();
        DEFAULT_INSTANCE = nhi;
        csA.N(nHi.class, nhi);
    }

    public static nHi j() {
        return DEFAULT_INSTANCE;
    }

    public static nHi y(b0 b0Var, nCG ncg) {
        return (nHi) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"keyUri_"});
            case 3:
                return new nHi();
            case 4:
                return new XC(2);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (nHi.class) {
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

    public final String g() {
        return this.keyUri_;
    }
}
