package defpackage;

import java.util.List;

/* renamed from: dxG  reason: default package */
/* loaded from: classes.dex */
public final class dxG extends csA {
    private static final dxG DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile fup PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private aFq key_ = pvq.R;
    private int primaryKeyId_;

    static {
        dxG dxg = new dxG();
        DEFAULT_INSTANCE = dxg;
        csA.N(dxG.class, dxg);
    }

    public static dxG K(byte[] bArr, nCG ncg) {
        return (dxG) csA.U(DEFAULT_INSTANCE, bArr, ncg);
    }

    public static void g(dxG dxg, okQ okq) {
        dxg.getClass();
        aFq afq = dxg.key_;
        if (!((vB) afq).R) {
            int size = afq.size();
            dxg.key_ = afq.e(size == 0 ? 10 : size * 2);
        }
        dxg.key_.add(okq);
    }

    public static void j(dxG dxg, int i) {
        dxg.primaryKeyId_ = i;
    }

    public static l9K o() {
        return (l9K) DEFAULT_INSTANCE.O();
    }

    @Override // defpackage.csA
    public final Object L(hZW hzw) {
        switch (hzw.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new kob(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", okQ.class});
            case 3:
                return new dxG();
            case 4:
                return new l9K();
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                return DEFAULT_INSTANCE;
            case 6:
                fup fup = PARSER;
                if (fup == null) {
                    synchronized (dxG.class) {
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
        return this.primaryKeyId_;
    }

    public final List i() {
        return this.key_;
    }

    public final int t() {
        return this.key_.size();
    }

    public final okQ y(int i) {
        return (okQ) this.key_.get(i);
    }
}
