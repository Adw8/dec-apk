package defpackage;

/* renamed from: lVo  reason: default package */
/* loaded from: classes.dex */
public final class lVo extends csA {
    public static final int CURVE_TYPE_FIELD_NUMBER = 1;
    private static final lVo DEFAULT_INSTANCE;
    public static final int HKDF_HASH_TYPE_FIELD_NUMBER = 2;
    public static final int HKDF_SALT_FIELD_NUMBER = 11;
    private static volatile fup PARSER;
    private int curveType_;
    private int hkdfHashType_;
    private b0 hkdfSalt_ = b0.f1499R;

    static {
        lVo lvo = new lVo();
        DEFAULT_INSTANCE = lvo;
        csA.N(lVo.class, lvo);
    }

    public static juz K() {
        return (juz) DEFAULT_INSTANCE.O();
    }

    public static void g(lVo lvo) {
        clj clj = clj.SHA256;
        lvo.getClass();
        lvo.hkdfHashType_ = clj.v();
    }

    public static lVo i() {
        return DEFAULT_INSTANCE;
    }

    public static void j(lVo lvo) {
        giU giu = giU.NIST_P256;
        lvo.getClass();
        lvo.curveType_ = giu.v();
    }

    public static void y(lVo lvo, MH mh) {
        lvo.getClass();
        lvo.hkdfSalt_ = mh;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"curveType_", "hkdfHashType_", "hkdfSalt_"});
            case 3:
                return new lVo();
            case 4:
                return new juz();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (lVo.class) {
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

    public final clj V() {
        clj R = clj.R(this.hkdfHashType_);
        return R == null ? clj.UNRECOGNIZED : R;
    }

    public final b0 o() {
        return this.hkdfSalt_;
    }

    public final giU t() {
        giU R = giU.R(this.curveType_);
        return R == null ? giU.UNRECOGNIZED : R;
    }
}
