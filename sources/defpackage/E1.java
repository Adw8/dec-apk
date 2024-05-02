package defpackage;

/* renamed from: E1  reason: default package */
/* loaded from: classes.dex */
public final class E1 extends csA {
    private static final E1 DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 keyValue_ = b0.f1499R;
    private oC params_;
    private int version_;

    static {
        E1 e1 = new E1();
        DEFAULT_INSTANCE = e1;
        csA.N(E1.class, e1);
    }

    public static E1 K(b0 b0Var, nCG ncg) {
        return (E1) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(E1 e1, oC oCVar) {
        e1.getClass();
        oCVar.getClass();
        e1.params_ = oCVar;
    }

    public static void j(E1 e1) {
        e1.version_ = 0;
    }

    public static YO o() {
        return (YO) DEFAULT_INSTANCE.O();
    }

    public static void y(E1 e1, MH mh) {
        e1.getClass();
        e1.keyValue_ = mh;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new E1();
            case 4:
                return new YO();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (E1.class) {
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

    public final oC i() {
        oC oCVar = this.params_;
        return oCVar == null ? oC.g() : oCVar;
    }

    public final b0 t() {
        return this.keyValue_;
    }
}
