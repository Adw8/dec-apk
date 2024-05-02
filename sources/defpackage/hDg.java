package defpackage;

/* renamed from: hDg  reason: default package */
/* loaded from: classes.dex */
public final class hDg extends csA {
    private static final hDg DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    public static final int X_FIELD_NUMBER = 3;
    public static final int Y_FIELD_NUMBER = 4;
    private jhs params_;
    private int version_;
    private b0 x_;
    private b0 y_;

    static {
        hDg hdg = new hDg();
        DEFAULT_INSTANCE = hdg;
        csA.N(hDg.class, hdg);
    }

    public hDg() {
        MH mh = b0.f1499R;
        this.x_ = mh;
        this.y_ = mh;
    }

    public static gEZ Y() {
        return (gEZ) DEFAULT_INSTANCE.O();
    }

    public static void g(hDg hdg, jhs jhs) {
        hdg.getClass();
        jhs.getClass();
        hdg.params_ = jhs;
    }

    public static hDg h(b0 b0Var, nCG ncg) {
        return (hDg) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static hDg i() {
        return DEFAULT_INSTANCE;
    }

    public static void j(hDg hdg) {
        hdg.version_ = 0;
    }

    public static void t(hDg hdg, MH mh) {
        hdg.getClass();
        hdg.y_ = mh;
    }

    public static void y(hDg hdg, MH mh) {
        hdg.getClass();
        hdg.x_ = mh;
    }

    public final b0 J() {
        return this.y_;
    }

    public final b0 K() {
        return this.x_;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", new Object[]{"version_", "params_", "x_", "y_"});
            case 3:
                return new hDg();
            case 4:
                return new gEZ();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (hDg.class) {
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

    public final jhs V() {
        jhs jhs = this.params_;
        return jhs == null ? jhs.t() : jhs;
    }

    public final int o() {
        return this.version_;
    }
}
