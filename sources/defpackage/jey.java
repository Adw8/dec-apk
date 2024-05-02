package defpackage;

/* renamed from: jey  reason: default package */
/* loaded from: classes.dex */
public final class jey extends csA {
    private static final jey DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private iVb params_;

    static {
        jey jey = new jey();
        DEFAULT_INSTANCE = jey;
        csA.N(jey.class, jey);
    }

    public static void j(jey jey, iVb ivb) {
        jey.getClass();
        jey.params_ = ivb;
    }

    public static jey t(b0 b0Var, nCG ncg) {
        return (jey) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static bty y() {
        return (bty) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"params_"});
            case 3:
                return new jey();
            case 4:
                return new bty();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (jey.class) {
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

    public final iVb g() {
        iVb ivb = this.params_;
        return ivb == null ? iVb.i() : ivb;
    }
}
