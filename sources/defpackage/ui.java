package defpackage;

/* renamed from: ui  reason: default package */
/* loaded from: classes.dex */
public final class ui extends csA {
    private static final ui DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private int keySize_;
    private int version_;

    static {
        ui uiVar = new ui();
        DEFAULT_INSTANCE = uiVar;
        csA.N(ui.class, uiVar);
    }

    public static void j(ui uiVar, int i) {
        uiVar.keySize_ = i;
    }

    public static ui t(b0 b0Var, nCG ncg) {
        return (ui) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static Mq y() {
        return (Mq) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\u000b", new Object[]{"version_", "keySize_"});
            case 3:
                return new ui();
            case 4:
                return new Mq();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (ui.class) {
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

    public final int g() {
        return this.keySize_;
    }
}
