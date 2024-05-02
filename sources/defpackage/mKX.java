package defpackage;

/* renamed from: mKX  reason: default package */
/* loaded from: classes.dex */
public final class mKX extends csA {
    private static final mKX DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private pzg params_;
    private int version_;

    static {
        mKX mkx = new mKX();
        DEFAULT_INSTANCE = mkx;
        csA.N(mKX.class, mkx);
    }

    public static dfC V() {
        return (dfC) DEFAULT_INSTANCE.O();
    }

    public static void g(mKX mkx, int i) {
        mkx.keySize_ = i;
    }

    public static void j(mKX mkx, pzg pzg) {
        mkx.getClass();
        mkx.params_ = pzg;
    }

    public static mKX o(b0 b0Var, nCG ncg) {
        return (mKX) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static mKX y() {
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
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\u000b\u0003\u000b", new Object[]{"params_", "keySize_", "version_"});
            case 3:
                return new mKX();
            case 4:
                return new dfC();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (mKX.class) {
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

    public final pzg i() {
        pzg pzg = this.params_;
        return pzg == null ? pzg.y() : pzg;
    }

    public final int t() {
        return this.keySize_;
    }
}
