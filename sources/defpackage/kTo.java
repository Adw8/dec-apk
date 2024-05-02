package defpackage;

/* renamed from: kTo */
/* loaded from: classes.dex */
public final class kTo extends csA {
    public static final int CATALOGUE_NAME_FIELD_NUMBER;
    private static final kTo DEFAULT_INSTANCE;
    public static final int KEY_MANAGER_VERSION_FIELD_NUMBER;
    public static final int NEW_KEY_ALLOWED_FIELD_NUMBER;
    private static volatile fup PARSER;
    public static final int PRIMITIVE_NAME_FIELD_NUMBER;
    public static final int TYPE_URL_FIELD_NUMBER;
    private int keyManagerVersion_;
    private boolean newKeyAllowed_;
    private String primitiveName_ = "";
    private String typeUrl_ = "";
    private String catalogueName_ = "";

    static {
        kTo kto = new kTo();
        DEFAULT_INSTANCE = kto;
        csA.N(kTo.class, kto);
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", new Object[]{"primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_"});
            case 3:
                return new kTo();
            case 4:
                return new XC(1);
            case CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (kTo.class) {
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
