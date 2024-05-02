package defpackage;

/* renamed from: lH1  reason: default package */
/* loaded from: classes.dex */
public final class lH1 extends csA {
    private static final lH1 DEFAULT_INSTANCE;
    public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
    public static final int KEYSET_INFO_FIELD_NUMBER = 3;
    private static volatile fup PARSER;
    private b0 encryptedKeyset_ = b0.f1499R;
    private cLd keysetInfo_;

    static {
        lH1 lh1 = new lH1();
        DEFAULT_INSTANCE = lh1;
        csA.N(lH1.class, lh1);
    }

    public static void g(lH1 lh1, cLd cld) {
        lh1.getClass();
        lh1.keysetInfo_ = cld;
    }

    public static lH1 i(byte[] bArr, nCG ncg) {
        return (lH1) csA.U(DEFAULT_INSTANCE, bArr, ncg);
    }

    public static void j(lH1 lh1, MH mh) {
        lh1.getClass();
        lh1.encryptedKeyset_ = mh;
    }

    public static k8_ t() {
        return (k8_) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\n\u0003\t", new Object[]{"encryptedKeyset_", "keysetInfo_"});
            case 3:
                return new lH1();
            case 4:
                return new k8_();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (lH1.class) {
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

    public final b0 y() {
        return this.encryptedKeyset_;
    }
}
