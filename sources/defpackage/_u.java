package defpackage;

/* renamed from: _u  reason: default package */
/* loaded from: classes.dex */
public final class _u extends csA {
    private static final _u DEFAULT_INSTANCE;
    public static final int KEY_SIZE_FIELD_NUMBER = 2;
    public static final int PARAMS_FIELD_NUMBER = 1;
    private static volatile fup PARSER;
    private int keySize_;
    private oC params_;

    static {
        _u _uVar = new _u();
        DEFAULT_INSTANCE = _uVar;
        csA.N(_u.class, _uVar);
    }

    public static _u V(b0 b0Var, nCG ncg) {
        return (_u) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(_u _uVar, int i) {
        _uVar.keySize_ = i;
    }

    public static nM i() {
        return (nM) DEFAULT_INSTANCE.O();
    }

    public static void j(_u _uVar, oC oCVar) {
        _uVar.getClass();
        _uVar.params_ = oCVar;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", new Object[]{"params_", "keySize_"});
            case 3:
                return new _u();
            case 4:
                return new nM();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (_u.class) {
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

    public final oC t() {
        oC oCVar = this.params_;
        return oCVar == null ? oC.g() : oCVar;
    }

    public final int y() {
        return this.keySize_;
    }
}
