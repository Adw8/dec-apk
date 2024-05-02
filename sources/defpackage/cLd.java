package defpackage;

/* renamed from: cLd  reason: default package */
/* loaded from: classes.dex */
public final class cLd extends csA {
    private static final cLd DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private aFq keyInfo_ = pvq.R;
    private int primaryKeyId_;

    static {
        cLd cld = new cLd();
        DEFAULT_INSTANCE = cld;
        csA.N(cLd.class, cld);
    }

    public static void g(cLd cld, h4d h4d) {
        cld.getClass();
        aFq afq = cld.keyInfo_;
        if (!((vB) afq).R) {
            int size = afq.size();
            cld.keyInfo_ = afq.e(size == 0 ? 10 : size * 2);
        }
        cld.keyInfo_.add(h4d);
    }

    public static void j(cLd cld, int i) {
        cld.primaryKeyId_ = i;
    }

    public static aZR t() {
        return (aZR) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", h4d.class});
            case 3:
                return new cLd();
            case 4:
                return new aZR();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (cLd.class) {
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

    public final h4d y() {
        return (h4d) this.keyInfo_.get(0);
    }
}
