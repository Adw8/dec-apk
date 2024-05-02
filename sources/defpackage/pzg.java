package defpackage;

/* renamed from: pzg  reason: default package */
/* loaded from: classes.dex */
public final class pzg extends csA {
    private static final pzg DEFAULT_INSTANCE;
    public static final int HASH_FIELD_NUMBER = 1;
    private static volatile fup PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 2;
    private int hash_;
    private int tagSize_;

    static {
        pzg pzg = new pzg();
        DEFAULT_INSTANCE = pzg;
        csA.N(pzg.class, pzg);
    }

    public static bHr V() {
        return (bHr) DEFAULT_INSTANCE.O();
    }

    public static void g(pzg pzg, int i) {
        pzg.tagSize_ = i;
    }

    public static void j(pzg pzg, clj clj) {
        pzg.getClass();
        pzg.hash_ = clj.v();
    }

    public static pzg y() {
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
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", new Object[]{"hash_", "tagSize_"});
            case 3:
                return new pzg();
            case 4:
                return new bHr();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (pzg.class) {
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
        return this.tagSize_;
    }

    public final clj t() {
        clj R = clj.R(this.hash_);
        return R == null ? clj.UNRECOGNIZED : R;
    }
}
