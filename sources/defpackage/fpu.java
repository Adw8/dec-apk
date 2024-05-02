package defpackage;

/* renamed from: fpu  reason: default package */
/* loaded from: classes.dex */
public final class fpu extends csA {
    private static final fpu DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private k1p dekTemplate_;
    private String kekUri_ = "";

    static {
        fpu fpu = new fpu();
        DEFAULT_INSTANCE = fpu;
        csA.N(fpu.class, fpu);
    }

    public static fpu i(b0 b0Var, nCG ncg) {
        return (fpu) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static fpu j() {
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
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new fpu();
            case 4:
                return new XC(3);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (fpu.class) {
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

    public final k1p g() {
        k1p k1p = this.dekTemplate_;
        return k1p == null ? k1p.t() : k1p;
    }

    public final boolean t() {
        return this.dekTemplate_ != null;
    }

    public final String y() {
        return this.kekUri_;
    }
}
