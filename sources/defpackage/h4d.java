package defpackage;

/* renamed from: h4d  reason: default package */
/* loaded from: classes.dex */
public final class h4d extends csA {
    private static final h4d DEFAULT_INSTANCE;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile fup PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;
    private String typeUrl_ = "";

    static {
        h4d h4d = new h4d();
        DEFAULT_INSTANCE = h4d;
        csA.N(h4d.class, h4d);
    }

    public static dLU V() {
        return (dLU) DEFAULT_INSTANCE.O();
    }

    public static void g(h4d h4d, hPF hpf) {
        h4d.getClass();
        h4d.outputPrefixType_ = hpf.v();
    }

    public static void j(h4d h4d, String str) {
        h4d.getClass();
        str.getClass();
        h4d.typeUrl_ = str;
    }

    public static void t(h4d h4d, int i) {
        h4d.keyId_ = i;
    }

    public static void y(h4d h4d, aLF alf) {
        h4d.getClass();
        h4d.status_ = alf.R();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new h4d();
            case 4:
                return new dLU();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (h4d.class) {
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

    public final int i() {
        return this.keyId_;
    }
}
