package defpackage;

/* renamed from: lDz  reason: default package */
/* loaded from: classes.dex */
public final class lDz extends csA {
    private static final lDz DEFAULT_INSTANCE;
    private static volatile fup PARSER = null;
    public static final int PRIVATE_KEY_FIELD_NUMBER = 3;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 privateKey_ = b0.f1499R;
    private fWO publicKey_;
    private int version_;

    static {
        lDz ldz = new lDz();
        DEFAULT_INSTANCE = ldz;
        csA.N(lDz.class, ldz);
    }

    public static lDz J(b0 b0Var, nCG ncg) {
        return (lDz) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static cz5 K() {
        return (cz5) DEFAULT_INSTANCE.O();
    }

    public static void g(lDz ldz, fWO fwo) {
        ldz.getClass();
        ldz.publicKey_ = fwo;
    }

    public static void j(lDz ldz) {
        ldz.version_ = 0;
    }

    public static void y(lDz ldz, MH mh) {
        ldz.getClass();
        ldz.privateKey_ = mh;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "publicKey_", "privateKey_"});
            case 3:
                return new lDz();
            case 4:
                return new cz5();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (lDz.class) {
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

    public final fWO i() {
        fWO fwo = this.publicKey_;
        return fwo == null ? fWO.t() : fwo;
    }

    public final boolean o() {
        return this.publicKey_ != null;
    }

    public final b0 t() {
        return this.privateKey_;
    }
}
