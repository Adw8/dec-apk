package defpackage;

/* renamed from: rm */
/* loaded from: classes.dex */
public final class rm extends csA {
    private static final rm DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER;
    private static volatile fup PARSER;
    public static final int VERSION_FIELD_NUMBER;
    private b0 keyValue_ = b0.f1499R;
    private int version_;

    static {
        rm rmVar = new rm();
        DEFAULT_INSTANCE = rmVar;
        csA.N(rm.class, rmVar);
    }

    public static rm V(b0 b0Var, nCG ncg) {
        return (rm) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(rm rmVar, MH mh) {
        rmVar.getClass();
        rmVar.keyValue_ = mh;
    }

    public static UT i() {
        return (UT) DEFAULT_INSTANCE.O();
    }

    public static void j(rm rmVar) {
        rmVar.version_ = 0;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new rm();
            case 4:
                return new UT();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (rm.class) {
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

    public final b0 y() {
        return this.keyValue_;
    }
}
