package defpackage;

/* renamed from: iVb  reason: default package */
/* loaded from: classes.dex */
public final class iVb extends csA {
    public static final int AEAD_FIELD_NUMBER = 3;
    private static final iVb DEFAULT_INSTANCE;
    public static final int KDF_FIELD_NUMBER = 2;
    public static final int KEM_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private int aead_;
    private int kdf_;
    private int kem_;

    static {
        iVb ivb = new iVb();
        DEFAULT_INSTANCE = ivb;
        csA.N(iVb.class, ivb);
    }

    public static dM4 K() {
        return (dM4) DEFAULT_INSTANCE.O();
    }

    public static void g(iVb ivb, oiA oia) {
        ivb.getClass();
        ivb.kdf_ = oia.R();
    }

    public static iVb i() {
        return DEFAULT_INSTANCE;
    }

    public static void j(iVb ivb, inw inw) {
        ivb.getClass();
        ivb.kem_ = inw.v();
    }

    public static void y(iVb ivb, ow2 ow2) {
        ivb.getClass();
        ivb.aead_ = ow2.R();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"kem_", "kdf_", "aead_"});
            case 3:
                return new iVb();
            case 4:
                return new dM4();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (iVb.class) {
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

    public final oiA V() {
        int i = this.kdf_;
        oiA oia = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : oiA.HKDF_SHA512 : oiA.HKDF_SHA384 : oiA.HKDF_SHA256 : oiA.KDF_UNKNOWN;
        return oia == null ? oiA.UNRECOGNIZED : oia;
    }

    public final inw o() {
        inw R = inw.R(this.kem_);
        return R == null ? inw.UNRECOGNIZED : R;
    }

    public final ow2 t() {
        int i = this.aead_;
        ow2 ow2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : ow2.CHACHA20_POLY1305 : ow2.AES_256_GCM : ow2.AES_128_GCM : ow2.AEAD_UNKNOWN;
        return ow2 == null ? ow2.UNRECOGNIZED : ow2;
    }
}
