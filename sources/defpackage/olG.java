package defpackage;

/* renamed from: olG  reason: default package */
/* loaded from: classes.dex */
public final class olG extends csA {
    private static final olG DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private fpu params_;
    private int version_;

    static {
        olG olg = new olG();
        DEFAULT_INSTANCE = olg;
        csA.N(olG.class, olg);
    }

    public static olG V(b0 b0Var, nCG ncg) {
        return (olG) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(olG olg, fpu fpu) {
        olg.getClass();
        fpu.getClass();
        olg.params_ = fpu;
    }

    public static gB0 i() {
        return (gB0) DEFAULT_INSTANCE.O();
    }

    public static void j(olG olg) {
        olg.version_ = 0;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new olG();
            case 4:
                return new gB0();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (olG.class) {
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

    public final fpu y() {
        fpu fpu = this.params_;
        return fpu == null ? fpu.j() : fpu;
    }
}
