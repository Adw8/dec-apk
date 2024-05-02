package defpackage;

/* renamed from: E9  reason: default package */
/* loaded from: classes.dex */
public final class E9 extends csA {
    private static final E9 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 1;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fup PARSER;
    private int keySize_;
    private X0 params_;

    static {
        E9 e9 = new E9();
        DEFAULT_INSTANCE = e9;
        csA.N(E9.class, e9);
    }

    public static E9 V(b0 b0Var, nCG ncg) {
        return (E9) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(E9 e9, X0 x0) {
        e9.getClass();
        e9.params_ = x0;
    }

    public static eE i() {
        return (eE) DEFAULT_INSTANCE.O();
    }

    public static void j(E9 e9) {
        e9.keySize_ = 32;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"keySize_", "params_"});
            case 3:
                return new E9();
            case 4:
                return new eE();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (E9.class) {
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

    public final X0 t() {
        X0 x0 = this.params_;
        return x0 == null ? X0.g() : x0;
    }

    public final int y() {
        return this.keySize_;
    }
}
