package defpackage;

/* renamed from: N2  reason: default package */
/* loaded from: classes.dex */
public final class N2 extends csA {
    private static final N2 DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private int ivSize_;

    static {
        N2 n2 = new N2();
        DEFAULT_INSTANCE = n2;
        csA.N(N2.class, n2);
    }

    public static N2 g() {
        return DEFAULT_INSTANCE;
    }

    public static void j(N2 n2) {
        n2.ivSize_ = 16;
    }

    public static iI t() {
        return (iI) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new N2();
            case 4:
                return new iI();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (N2.class) {
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

    public final int y() {
        return this.ivSize_;
    }
}
