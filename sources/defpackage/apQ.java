package defpackage;

/* renamed from: apQ  reason: default package */
/* loaded from: classes.dex */
public final class apQ extends csA {
    private static final apQ DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile fup PARSER = null;
    public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 keyValue_ = b0.f1499R;
    private hDg publicKey_;
    private int version_;

    static {
        apQ apq = new apQ();
        DEFAULT_INSTANCE = apq;
        csA.N(apQ.class, apq);
    }

    public static apQ K(b0 b0Var, nCG ncg) {
        return (apQ) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(apQ apq, hDg hdg) {
        apq.getClass();
        apq.publicKey_ = hdg;
    }

    public static void j(apQ apq) {
        apq.version_ = 0;
    }

    public static koq o() {
        return (koq) DEFAULT_INSTANCE.O();
    }

    public static void y(apQ apq, MH mh) {
        apq.getClass();
        apq.keyValue_ = mh;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "publicKey_", "keyValue_"});
            case 3:
                return new apQ();
            case 4:
                return new koq();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (apQ.class) {
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

    public final hDg i() {
        hDg hdg = this.publicKey_;
        return hdg == null ? hDg.i() : hdg;
    }

    public final b0 t() {
        return this.keyValue_;
    }
}
