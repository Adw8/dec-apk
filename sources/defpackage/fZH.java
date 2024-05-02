package defpackage;

/* renamed from: fZH  reason: default package */
/* loaded from: classes.dex */
public final class fZH extends csA {
    private static final fZH DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile fup PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = "";
    private b0 value_ = b0.f1499R;

    static {
        fZH fzh = new fZH();
        DEFAULT_INSTANCE = fzh;
        csA.N(fZH.class, fzh);
    }

    public static dLW K() {
        return (dLW) DEFAULT_INSTANCE.O();
    }

    public static void g(fZH fzh, MH mh) {
        fzh.getClass();
        fzh.value_ = mh;
    }

    public static void j(fZH fzh, String str) {
        fzh.getClass();
        str.getClass();
        fzh.typeUrl_ = str;
    }

    public static fZH t() {
        return DEFAULT_INSTANCE;
    }

    public static void y(fZH fzh, f6h f6h) {
        fzh.getClass();
        fzh.keyMaterialType_ = f6h.v();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 3:
                return new fZH();
            case 4:
                return new dLW();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (fZH.class) {
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

    public final String V() {
        return this.typeUrl_;
    }

    public final f6h i() {
        f6h R = f6h.R(this.keyMaterialType_);
        return R == null ? f6h.UNRECOGNIZED : R;
    }

    public final b0 o() {
        return this.value_;
    }
}
