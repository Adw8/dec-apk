package defpackage;

/* renamed from: L3  reason: default package */
/* loaded from: classes.dex */
public final class L3 extends csA {
    private static final L3 DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 3;
    private int keySize_;
    private int version_;

    static {
        L3 l3 = new L3();
        DEFAULT_INSTANCE = l3;
        csA.N(L3.class, l3);
    }

    public static void j(L3 l3, int i) {
        l3.keySize_ = i;
    }

    public static L3 t(b0 b0Var, nCG ncg) {
        return (L3) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static G1 y() {
        return (G1) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002\u000b\u0003\u000b", new Object[]{"keySize_", "version_"});
            case 3:
                return new L3();
            case 4:
                return new G1();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (L3.class) {
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
