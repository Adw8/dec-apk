package defpackage;

/* renamed from: fax */
/* loaded from: classes.dex */
public final class fax extends csA {
    public static final int CONFIG_NAME_FIELD_NUMBER;
    private static final fax DEFAULT_INSTANCE;
    public static final int ENTRY_FIELD_NUMBER;
    private static volatile fup PARSER;
    private String configName_ = "";
    private aFq entry_ = pvq.R;

    static {
        fax fax = new fax();
        DEFAULT_INSTANCE = fax;
        csA.N(fax.class, fax);
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"configName_", "entry_", kTo.class});
            case 3:
                return new fax();
            case 4:
                return new XC(4);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (fax.class) {
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
}
