package defpackage;

/* renamed from: oC  reason: default package */
/* loaded from: classes.dex */
public final class oC extends csA {
    private static final oC DEFAULT_INSTANCE;
    public static final int IV_SIZE_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private int ivSize_;

    static {
        oC oCVar = new oC();
        DEFAULT_INSTANCE = oCVar;
        csA.N(oC.class, oCVar);
    }

    public static oC g() {
        return DEFAULT_INSTANCE;
    }

    public static void j(oC oCVar) {
        oCVar.ivSize_ = 16;
    }

    public static _O t() {
        return (_O) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"ivSize_"});
            case 3:
                return new oC();
            case 4:
                return new _O();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (oC.class) {
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

    public final int y() {
        return this.ivSize_;
    }
}
