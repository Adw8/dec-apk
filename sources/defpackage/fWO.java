package defpackage;

/* renamed from: fWO  reason: default package */
/* loaded from: classes.dex */
public final class fWO extends csA {
    private static final fWO DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 3;
    public static final int VERSION_FIELD_NUMBER = 1;
    private iVb params_;
    private b0 publicKey_ = b0.f1499R;
    private int version_;

    static {
        fWO fwo = new fWO();
        DEFAULT_INSTANCE = fwo;
        csA.N(fWO.class, fwo);
    }

    public static g1r J() {
        return (g1r) DEFAULT_INSTANCE.O();
    }

    public static fWO Y(b0 b0Var, nCG ncg) {
        return (fWO) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(fWO fwo, iVb ivb) {
        fwo.getClass();
        ivb.getClass();
        fwo.params_ = ivb;
    }

    public static void j(fWO fwo) {
        fwo.version_ = 0;
    }

    public static fWO t() {
        return DEFAULT_INSTANCE;
    }

    public static void y(fWO fwo, MH mh) {
        fwo.getClass();
        fwo.publicKey_ = mh;
    }

    public final boolean K() {
        return this.params_ != null;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "publicKey_"});
            case 3:
                return new fWO();
            case 4:
                return new g1r();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (fWO.class) {
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

    public final b0 V() {
        return this.publicKey_;
    }

    public final iVb i() {
        iVb ivb = this.params_;
        return ivb == null ? iVb.i() : ivb;
    }

    public final int o() {
        return this.version_;
    }
}
