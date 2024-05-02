package defpackage;

/* renamed from: nc  reason: default package */
/* loaded from: classes.dex */
public final class nc extends csA {
    private static final nc DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 keyValue_ = b0.f1499R;
    private int version_;

    static {
        nc ncVar = new nc();
        DEFAULT_INSTANCE = ncVar;
        csA.N(nc.class, ncVar);
    }

    public static nc V(b0 b0Var, nCG ncg) {
        return (nc) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(nc ncVar, MH mh) {
        ncVar.getClass();
        ncVar.keyValue_ = mh;
    }

    public static C8 i() {
        return (C8) DEFAULT_INSTANCE.O();
    }

    public static void j(nc ncVar) {
        ncVar.version_ = 0;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", new Object[]{"version_", "keyValue_"});
            case 3:
                return new nc();
            case 4:
                return new C8();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (nc.class) {
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
