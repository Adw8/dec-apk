package defpackage;

/* renamed from: Sb  reason: default package */
/* loaded from: classes.dex */
public final class Sb extends csA {
    private static final Sb DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 keyValue_ = b0.f1499R;
    private N2 params_;
    private int version_;

    static {
        Sb sb = new Sb();
        DEFAULT_INSTANCE = sb;
        csA.N(Sb.class, sb);
    }

    public static Sb J(b0 b0Var, nCG ncg) {
        return (Sb) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static aw K() {
        return (aw) DEFAULT_INSTANCE.O();
    }

    public static void g(Sb sb, N2 n2) {
        sb.getClass();
        n2.getClass();
        sb.params_ = n2;
    }

    public static void j(Sb sb) {
        sb.version_ = 0;
    }

    public static Sb t() {
        return DEFAULT_INSTANCE;
    }

    public static void y(Sb sb, MH mh) {
        sb.getClass();
        sb.keyValue_ = mh;
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
                return new Sb();
            case 4:
                return new aw();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (Sb.class) {
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

    public final N2 V() {
        N2 n2 = this.params_;
        return n2 == null ? N2.g() : n2;
    }

    public final b0 i() {
        return this.keyValue_;
    }

    public final int o() {
        return this.version_;
    }
}
