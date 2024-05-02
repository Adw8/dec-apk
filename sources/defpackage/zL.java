package defpackage;

/* renamed from: zL  reason: default package */
/* loaded from: classes.dex */
public final class zL extends csA {
    private static final zL DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private int keySize_;
    private N2 params_;

    static {
        zL zLVar = new zL();
        DEFAULT_INSTANCE = zLVar;
        csA.N(zL.class, zLVar);
    }

    public static Nn V() {
        return (Nn) DEFAULT_INSTANCE.O();
    }

    public static void g(zL zLVar, int i) {
        zLVar.keySize_ = i;
    }

    public static void j(zL zLVar, N2 n2) {
        zLVar.getClass();
        zLVar.params_ = n2;
    }

    public static zL o(b0 b0Var, nCG ncg) {
        return (zL) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static zL y() {
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
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new zL();
            case 4:
                return new Nn();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (zL.class) {
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

    public final N2 i() {
        N2 n2 = this.params_;
        return n2 == null ? N2.g() : n2;
    }

    public final int t() {
        return this.keySize_;
    }
}
