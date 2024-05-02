package defpackage;

/* renamed from: Da  reason: default package */
/* loaded from: classes.dex */
public final class Da extends csA {
    private static final Da DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 keyValue_ = b0.f1499R;
    private int version_;

    static {
        Da da = new Da();
        DEFAULT_INSTANCE = da;
        csA.N(Da.class, da);
    }

    public static Da V(b0 b0Var, nCG ncg) {
        return (Da) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(Da da, MH mh) {
        da.getClass();
        da.keyValue_ = mh;
    }

    public static D0 i() {
        return (D0) DEFAULT_INSTANCE.O();
    }

    public static void j(Da da) {
        da.version_ = 0;
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
                return new Da();
            case 4:
                return new D0();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (Da.class) {
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
