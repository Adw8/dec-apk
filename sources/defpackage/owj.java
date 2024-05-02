package defpackage;

import java.util.HashMap;

/* renamed from: owj  reason: default package */
/* loaded from: classes.dex */
public final class owj {
    public static final HashMap R;
    public static final HashMap v;

    static {
        HashMap hashMap = new HashMap();
        R = hashMap;
        HashMap hashMap2 = new HashMap();
        v = hashMap2;
        hashMap.put(lpk.L, "RSASSA-PSS");
        hashMap.put(kk3.R, "ED25519");
        hashMap.put(kk3.v, "ED448");
        hashMap.put(new u("1.2.840.113549.1.1.5"), "SHA1WITHRSA");
        hashMap.put(lpk.H, "SHA224WITHRSA");
        hashMap.put(lpk.Z, "SHA256WITHRSA");
        hashMap.put(lpk.m, "SHA384WITHRSA");
        hashMap.put(lpk.x, "SHA512WITHRSA");
        hashMap.put(IX.R, "SHAKE128WITHRSAPSS");
        hashMap.put(IX.v, "SHAKE256WITHRSAPSS");
        hashMap.put(aP4.c, "GOST3411WITHGOST3410");
        hashMap.put(aP4.e, "GOST3411WITHECGOST3410");
        hashMap.put(hy2.c, "GOST3411-2012-256WITHECGOST3410-2012-256");
        hashMap.put(hy2.e, "GOST3411-2012-512WITHECGOST3410-2012-512");
        hashMap.put(_p.R, "SHA1WITHPLAIN-ECDSA");
        hashMap.put(_p.v, "SHA224WITHPLAIN-ECDSA");
        hashMap.put(_p.c, "SHA256WITHPLAIN-ECDSA");
        hashMap.put(_p.e, "SHA384WITHPLAIN-ECDSA");
        hashMap.put(_p.X, "SHA512WITHPLAIN-ECDSA");
        hashMap.put(_p.L, "SHA3-224WITHPLAIN-ECDSA");
        hashMap.put(_p.Z, "SHA3-256WITHPLAIN-ECDSA");
        hashMap.put(_p.m, "SHA3-384WITHPLAIN-ECDSA");
        hashMap.put(_p.x, "SHA3-512WITHPLAIN-ECDSA");
        hashMap.put(_p.O, "RIPEMD160WITHPLAIN-ECDSA");
        hashMap.put(cFg.R, "SHA1WITHCVC-ECDSA");
        hashMap.put(cFg.v, "SHA224WITHCVC-ECDSA");
        hashMap.put(cFg.c, "SHA256WITHCVC-ECDSA");
        hashMap.put(cFg.e, "SHA384WITHCVC-ECDSA");
        hashMap.put(cFg.X, "SHA512WITHCVC-ECDSA");
        hashMap.put(lgz.R, "XMSS");
        hashMap.put(lgz.v, "XMSSMT");
        hashMap.put(lFw.X, "RIPEMD128WITHRSA");
        hashMap.put(lFw.e, "RIPEMD160WITHRSA");
        hashMap.put(lFw.O, "RIPEMD256WITHRSA");
        hashMap.put(new u("1.2.840.113549.1.1.4"), "MD5WITHRSA");
        hashMap.put(new u("1.2.840.113549.1.1.2"), "MD2WITHRSA");
        hashMap.put(new u("1.2.840.10040.4.3"), "SHA1WITHDSA");
        hashMap.put(mJI.R, "SHA1WITHECDSA");
        hashMap.put(mJI.v, "SHA224WITHECDSA");
        hashMap.put(mJI.c, "SHA256WITHECDSA");
        hashMap.put(mJI.e, "SHA384WITHECDSA");
        hashMap.put(mJI.X, "SHA512WITHECDSA");
        hashMap.put(IX.c, "SHAKE128WITHECDSA");
        hashMap.put(IX.e, "SHAKE256WITHECDSA");
        hashMap.put(fQj.c, "SHA1WITHRSA");
        hashMap.put(fQj.v, "SHA1WITHDSA");
        hashMap.put(fkm.o, "SHA224WITHDSA");
        hashMap.put(fkm.K, "SHA256WITHDSA");
        hashMap2.put(fQj.R, "SHA1");
        hashMap2.put(fkm.e, "SHA224");
        hashMap2.put(fkm.R, "SHA256");
        hashMap2.put(fkm.v, "SHA384");
        hashMap2.put(fkm.c, "SHA512");
        hashMap2.put(fkm.L, "SHA3-224");
        hashMap2.put(fkm.Z, "SHA3-256");
        hashMap2.put(fkm.m, "SHA3-384");
        hashMap2.put(fkm.x, "SHA3-512");
        hashMap2.put(lFw.v, "RIPEMD128");
        hashMap2.put(lFw.R, "RIPEMD160");
        hashMap2.put(lFw.c, "RIPEMD256");
    }

    public static String R(u uVar) {
        String str = (String) v.get(uVar);
        return str != null ? str : uVar.f7421R;
    }
}
