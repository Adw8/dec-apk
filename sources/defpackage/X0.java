package defpackage;

/* renamed from: X0  reason: default package */
/* loaded from: classes.dex */
public final class X0 extends csA {
    private static final X0 DEFAULT_INSTANCE;
    private static volatile fup PARSER = null;
    public static final int TAG_SIZE_FIELD_NUMBER = 1;
    private int tagSize_;

    static {
        X0 x0 = new X0();
        DEFAULT_INSTANCE = x0;
        csA.N(X0.class, x0);
    }

    public static X0 g() {
        return DEFAULT_INSTANCE;
    }

    public static void j(X0 x0) {
        x0.tagSize_ = 16;
    }

    public static Yc t() {
        return (Yc) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"tagSize_"});
            case 3:
                return new X0();
            case 4:
                return new Yc();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (X0.class) {
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

    public final int y() {
        return this.tagSize_;
    }
}
