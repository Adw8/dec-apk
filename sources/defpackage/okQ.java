package defpackage;

/* renamed from: okQ  reason: default package */
/* loaded from: classes.dex */
public final class okQ extends csA {
    private static final okQ DEFAULT_INSTANCE;
    public static final int KEY_DATA_FIELD_NUMBER = 1;
    public static final int KEY_ID_FIELD_NUMBER = 3;
    public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
    private static volatile fup PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 2;
    private fZH keyData_;
    private int keyId_;
    private int outputPrefixType_;
    private int status_;

    static {
        okQ okq = new okQ();
        DEFAULT_INSTANCE = okq;
        csA.N(okQ.class, okq);
    }

    public static oMZ Y() {
        return (oMZ) DEFAULT_INSTANCE.O();
    }

    public static void g(okQ okq, hPF hpf) {
        okq.getClass();
        okq.outputPrefixType_ = hpf.v();
    }

    public static void j(okQ okq, fZH fzh) {
        okq.getClass();
        okq.keyData_ = fzh;
    }

    public static void t(okQ okq, int i) {
        okq.keyId_ = i;
    }

    public static void y(okQ okq, aLF alf) {
        okq.getClass();
        okq.status_ = alf.R();
    }

    public final boolean J() {
        return this.keyData_ != null;
    }

    public final aLF K() {
        int i = this.status_;
        aLF alf = i != 0 ? i != 1 ? i != 2 ? i != 3 ? null : aLF.DESTROYED : aLF.DISABLED : aLF.ENABLED : aLF.UNKNOWN_STATUS;
        return alf == null ? aLF.UNRECOGNIZED : alf;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
            case 3:
                return new okQ();
            case 4:
                return new oMZ();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (okQ.class) {
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

    public final int V() {
        return this.keyId_;
    }

    public final fZH i() {
        fZH fzh = this.keyData_;
        return fzh == null ? fZH.t() : fzh;
    }

    public final hPF o() {
        hPF R = hPF.R(this.outputPrefixType_);
        return R == null ? hPF.UNRECOGNIZED : R;
    }
}
