package defpackage;

/* renamed from: jhs  reason: default package */
/* loaded from: classes.dex */
public final class jhs extends csA {
    private static final jhs DEFAULT_INSTANCE;
    public static final int DEM_PARAMS_FIELD_NUMBER = 2;
    public static final int EC_POINT_FORMAT_FIELD_NUMBER = 3;
    public static final int KEM_PARAMS_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private cMp demParams_;
    private int ecPointFormat_;
    private lVo kemParams_;

    static {
        jhs jhs = new jhs();
        DEFAULT_INSTANCE = jhs;
        csA.N(jhs.class, jhs);
    }

    public static bTS K() {
        return (bTS) DEFAULT_INSTANCE.O();
    }

    public static void g(jhs jhs, cMp cmp) {
        jhs.getClass();
        jhs.demParams_ = cmp;
    }

    public static void j(jhs jhs, lVo lvo) {
        jhs.getClass();
        jhs.kemParams_ = lvo;
    }

    public static jhs t() {
        return DEFAULT_INSTANCE;
    }

    public static void y(jhs jhs, ljd ljd) {
        jhs.getClass();
        jhs.ecPointFormat_ = ljd.R();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", new Object[]{"kemParams_", "demParams_", "ecPointFormat_"});
            case 3:
                return new jhs();
            case 4:
                return new bTS();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (jhs.class) {
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

    public final ljd V() {
        int i = this.ecPointFormat_;
        ljd ljd = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : ljd.DO_NOT_USE_CRUNCHY_UNCOMPRESSED : ljd.COMPRESSED : ljd.UNCOMPRESSED : ljd.UNKNOWN_FORMAT;
        return ljd == null ? ljd.UNRECOGNIZED : ljd;
    }

    public final cMp i() {
        cMp cmp = this.demParams_;
        return cmp == null ? cMp.y() : cmp;
    }

    public final lVo o() {
        lVo lvo = this.kemParams_;
        return lvo == null ? lVo.i() : lvo;
    }
}
