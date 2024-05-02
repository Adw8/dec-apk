package defpackage;

/* renamed from: D1  reason: default package */
/* loaded from: classes.dex */
public final class D1 extends csA {
    private static final D1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 keyValue_ = b0.f1499R;
    private int version_;

    static {
        D1 d1 = new D1();
        DEFAULT_INSTANCE = d1;
        csA.N(D1.class, d1);
    }

    public static D1 V(b0 b0Var, nCG ncg) {
        return (D1) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(D1 d1, MH mh) {
        d1.getClass();
        d1.keyValue_ = mh;
    }

    public static Ns i() {
        return (Ns) DEFAULT_INSTANCE.O();
    }

    public static void j(D1 d1) {
        d1.version_ = 0;
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
                return new D1();
            case 4:
                return new Ns();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (D1.class) {
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
