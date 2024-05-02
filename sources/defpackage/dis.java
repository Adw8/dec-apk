package defpackage;

/* renamed from: dis  reason: default package */
/* loaded from: classes.dex */
public final class dis extends csA {
    private static final dis DEFAULT_INSTANCE;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int version_;

    static {
        dis dis = new dis();
        DEFAULT_INSTANCE = dis;
        csA.N(dis.class, dis);
    }

    public static dis g(b0 b0Var, nCG ncg) {
        return (dis) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static dis j() {
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
                return new kob(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"version_"});
            case 3:
                return new dis();
            case 4:
                return new XC(5);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (dis.class) {
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
