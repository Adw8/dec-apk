package defpackage;

/* renamed from: kda  reason: default package */
/* loaded from: classes.dex */
public final class kda extends csA {
    private static final kda DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private nHi params_;
    private int version_;

    static {
        kda kda = new kda();
        DEFAULT_INSTANCE = kda;
        csA.N(kda.class, kda);
    }

    public static kda V(b0 b0Var, nCG ncg) {
        return (kda) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(kda kda, nHi nhi) {
        kda.getClass();
        nhi.getClass();
        kda.params_ = nhi;
    }

    public static bTL i() {
        return (bTL) DEFAULT_INSTANCE.O();
    }

    public static void j(kda kda) {
        kda.version_ = 0;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new kda();
            case 4:
                return new bTL();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (kda.class) {
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

    public final int t() {
        return this.version_;
    }

    public final nHi y() {
        nHi nhi = this.params_;
        return nhi == null ? nHi.j() : nhi;
    }
}