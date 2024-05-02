package defpackage;

/* renamed from: pA  reason: default package */
/* loaded from: classes.dex */
public final class pA extends csA {
    private static final pA DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 3;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 keyValue_ = b0.f1499R;
    private X0 params_;
    private int version_;

    static {
        pA pAVar = new pA();
        DEFAULT_INSTANCE = pAVar;
        csA.N(pA.class, pAVar);
    }

    public static pA K(b0 b0Var, nCG ncg) {
        return (pA) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(pA pAVar, MH mh) {
        pAVar.getClass();
        pAVar.keyValue_ = mh;
    }

    public static void j(pA pAVar) {
        pAVar.version_ = 0;
    }

    public static kx o() {
        return (kx) DEFAULT_INSTANCE.O();
    }

    public static void y(pA pAVar, X0 x0) {
        pAVar.getClass();
        x0.getClass();
        pAVar.params_ = x0;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"version_", "keyValue_", "params_"});
            case 3:
                return new pA();
            case 4:
                return new kx();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (pA.class) {
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

    public final int V() {
        return this.version_;
    }

    public final X0 i() {
        X0 x0 = this.params_;
        return x0 == null ? X0.g() : x0;
    }

    public final b0 t() {
        return this.keyValue_;
    }
}
