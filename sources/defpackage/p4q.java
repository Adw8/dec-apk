package defpackage;

/* renamed from: p4q  reason: default package */
/* loaded from: classes.dex */
public final class p4q extends csA {
    private static final p4q DEFAULT_INSTANCE;
    public static final int KEY_VALUE_FIELD_NUMBER = 3;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private b0 keyValue_ = b0.f1499R;
    private pzg params_;
    private int version_;

    static {
        p4q p4q = new p4q();
        DEFAULT_INSTANCE = p4q;
        csA.N(p4q.class, p4q);
    }

    public static p4q J(b0 b0Var, nCG ncg) {
        return (p4q) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static iPH K() {
        return (iPH) DEFAULT_INSTANCE.O();
    }

    public static void g(p4q p4q, pzg pzg) {
        p4q.getClass();
        pzg.getClass();
        p4q.params_ = pzg;
    }

    public static void j(p4q p4q) {
        p4q.version_ = 0;
    }

    public static p4q t() {
        return DEFAULT_INSTANCE;
    }

    public static void y(p4q p4q, MH mh) {
        p4q.getClass();
        p4q.keyValue_ = mh;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"version_", "params_", "keyValue_"});
            case 3:
                return new p4q();
            case 4:
                return new iPH();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (p4q.class) {
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

    public final pzg V() {
        pzg pzg = this.params_;
        return pzg == null ? pzg.y() : pzg;
    }

    public final b0 i() {
        return this.keyValue_;
    }

    public final int o() {
        return this.version_;
    }
}
