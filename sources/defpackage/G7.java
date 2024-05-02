package defpackage;

/* renamed from: G7  reason: default package */
/* loaded from: classes.dex */
public final class G7 extends csA {
    private static final G7 DEFAULT_INSTANCE;
    private static volatile fup PARSER;

    static {
        G7 g7 = new G7();
        DEFAULT_INSTANCE = g7;
        csA.N(G7.class, g7);
    }

    public static G7 g(b0 b0Var, nCG ncg) {
        return (G7) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static G7 j() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0000", null);
            case 3:
                return new G7();
            case 4:
                return new XC(0);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (G7.class) {
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
}
