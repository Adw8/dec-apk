package defpackage;

/* renamed from: Ak  reason: default package */
/* loaded from: classes.dex */
public final class Ak extends csA {
    private static final Ak DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int keySize_;
    private int version_;

    static {
        Ak ak = new Ak();
        DEFAULT_INSTANCE = ak;
        csA.N(Ak.class, ak);
    }

    public static void j(Ak ak) {
        ak.keySize_ = 64;
    }

    public static Ak t(b0 b0Var, nCG ncg) {
        return (Ak) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static Ko y() {
        return (Ko) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new Ak();
            case 4:
                return new Ko();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (Ak.class) {
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

    public final int g() {
        return this.keySize_;
    }
}
