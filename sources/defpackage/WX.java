package defpackage;

/* renamed from: WX  reason: default package */
/* loaded from: classes.dex */
public final class WX extends csA {
    public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
    private static final WX DEFAULT_INSTANCE;
    public static final int HMAC_KEY_FIELD_NUMBER = 3;
    private static volatile fup PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private Sb aesCtrKey_;
    private p4q hmacKey_;
    private int version_;

    static {
        WX wx = new WX();
        DEFAULT_INSTANCE = wx;
        csA.N(WX.class, wx);
    }

    public static WX K(b0 b0Var, nCG ncg) {
        return (WX) csA.H(DEFAULT_INSTANCE, b0Var, ncg);
    }

    public static void g(WX wx, Sb sb) {
        wx.getClass();
        sb.getClass();
        wx.aesCtrKey_ = sb;
    }

    public static void j(WX wx, int i) {
        wx.version_ = i;
    }

    public static rV o() {
        return (rV) DEFAULT_INSTANCE.O();
    }

    public static void y(WX wx, p4q p4q) {
        wx.getClass();
        p4q.getClass();
        wx.hmacKey_ = p4q;
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", new Object[]{"version_", "aesCtrKey_", "hmacKey_"});
            case 3:
                return new WX();
            case 4:
                return new rV();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (WX.class) {
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
        return this.version_;
    }

    public final p4q i() {
        p4q p4q = this.hmacKey_;
        return p4q == null ? p4q.t() : p4q;
    }

    public final Sb t() {
        Sb sb = this.aesCtrKey_;
        return sb == null ? Sb.t() : sb;
    }
}
