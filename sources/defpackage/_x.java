package defpackage;

/* renamed from: _x  reason: default package */
/* loaded from: classes.dex */
public final class _x extends csA {
    public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
    private static final _x DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
    private static volatile fup PARSER;
    private zL aesCtrKeyFormat_;
    private mKX hmacKeyFormat_;

    static {
        _x _xVar = new _x();
        DEFAULT_INSTANCE = _xVar;
        csA.N(_x.class, _xVar);
    }

    public static _x V(b0 b0Var, nCG ncg) {
        return (_x) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(_x _xVar, mKX mkx) {
        _xVar.getClass();
        _xVar.hmacKeyFormat_ = mkx;
    }

    public static vl i() {
        return (vl) DEFAULT_INSTANCE.O();
    }

    public static void j(_x _xVar, zL zLVar) {
        _xVar.getClass();
        _xVar.aesCtrKeyFormat_ = zLVar;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"aesCtrKeyFormat_", "hmacKeyFormat_"});
            case 3:
                return new _x();
            case 4:
                return new vl();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (_x.class) {
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

    public final mKX t() {
        mKX mkx = this.hmacKeyFormat_;
        return mkx == null ? mKX.y() : mkx;
    }

    public final zL y() {
        zL zLVar = this.aesCtrKeyFormat_;
        return zLVar == null ? zL.y() : zLVar;
    }
}
