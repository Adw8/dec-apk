package defpackage;

/* renamed from: k1p  reason: default package */
/* loaded from: classes.dex */
public final class k1p extends csA {
    private static final k1p DEFAULT_INSTANCE;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
    private static volatile fup PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int outputPrefixType_;
    private String typeUrl_ = "";
    private b0 value_ = b0.f1499R;

    static {
        k1p k1p = new k1p();
        DEFAULT_INSTANCE = k1p;
        csA.N(k1p.class, k1p);
    }

    public static a4y K() {
        return (a4y) DEFAULT_INSTANCE.O();
    }

    public static void g(k1p k1p, MH mh) {
        k1p.getClass();
        k1p.value_ = mh;
    }

    public static void j(k1p k1p, String str) {
        k1p.getClass();
        str.getClass();
        k1p.typeUrl_ = str;
    }

    public static k1p t() {
        return DEFAULT_INSTANCE;
    }

    public static void y(k1p k1p, hPF hpf) {
        k1p.getClass();
        k1p.outputPrefixType_ = hpf.v();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "outputPrefixType_"});
            case 3:
                return new k1p();
            case 4:
                return new a4y();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (k1p.class) {
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

    public final String V() {
        return this.typeUrl_;
    }

    public final hPF i() {
        hPF R = hPF.R(this.outputPrefixType_);
        return R == null ? hPF.UNRECOGNIZED : R;
    }

    public final b0 o() {
        return this.value_;
    }
}
