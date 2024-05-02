package defpackage;

/* renamed from: cMp  reason: default package */
/* loaded from: classes.dex */
public final class cMp extends csA {
    public static final int AEAD_DEM_FIELD_NUMBER = 2;
    private static final cMp DEFAULT_INSTANCE;
    private static volatile fup PARSER;
    private k1p aeadDem_;

    static {
        cMp cmp = new cMp();
        DEFAULT_INSTANCE = cmp;
        csA.N(cMp.class, cmp);
    }

    public static void j(cMp cmp, k1p k1p) {
        cmp.getClass();
        cmp.aeadDem_ = k1p;
    }

    public static blC t() {
        return (blC) DEFAULT_INSTANCE.O();
    }

    public static cMp y() {
        return DEFAULT_INSTANCE;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"aeadDem_"});
            case 3:
                return new cMp();
            case 4:
                return new blC();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (cMp.class) {
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

    public final k1p g() {
        k1p k1p = this.aeadDem_;
        return k1p == null ? k1p.t() : k1p;
    }
}
