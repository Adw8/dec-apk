package defpackage;

import java.util.HashMap;

/* renamed from: oG3  reason: default package */
/* loaded from: classes.dex */
public abstract class oG3 {
    public static HashMap R = new HashMap();
    public static HashMap v = new HashMap();

    static {
        R.put(lpk.j, "MD2");
        R.put(lpk.g, "MD4");
        R.put(lpk.y, "MD5");
        HashMap hashMap = R;
        u uVar = fQj.R;
        hashMap.put(uVar, "SHA-1");
        HashMap hashMap2 = R;
        u uVar2 = fkm.e;
        hashMap2.put(uVar2, "SHA-224");
        HashMap hashMap3 = R;
        u uVar3 = fkm.R;
        hashMap3.put(uVar3, "SHA-256");
        HashMap hashMap4 = R;
        u uVar4 = fkm.v;
        hashMap4.put(uVar4, "SHA-384");
        HashMap hashMap5 = R;
        u uVar5 = fkm.c;
        hashMap5.put(uVar5, "SHA-512");
        R.put(fkm.X, "SHA-512(224)");
        R.put(fkm.O, "SHA-512(256)");
        R.put(lFw.v, "RIPEMD-128");
        R.put(lFw.R, "RIPEMD-160");
        R.put(lFw.c, "RIPEMD-128");
        R.put(fjc.v, "RIPEMD-128");
        R.put(fjc.R, "RIPEMD-160");
        R.put(aP4.R, "GOST3411");
        R.put(li9.R, "Tiger");
        R.put(fjc.c, "Whirlpool");
        HashMap hashMap6 = R;
        u uVar6 = fkm.L;
        hashMap6.put(uVar6, "SHA3-224");
        HashMap hashMap7 = R;
        u uVar7 = fkm.Z;
        hashMap7.put(uVar7, "SHA3-256");
        HashMap hashMap8 = R;
        u uVar8 = fkm.m;
        hashMap8.put(uVar8, "SHA3-384");
        HashMap hashMap9 = R;
        u uVar9 = fkm.x;
        hashMap9.put(uVar9, "SHA3-512");
        R.put(fkm.H, "SHAKE128");
        R.put(fkm.U, "SHAKE256");
        R.put(h2Q.R, "SM3");
        HashMap hashMap10 = R;
        u uVar10 = bzN.R;
        hashMap10.put(uVar10, "BLAKE3-256");
        v.put("SHA-1", new wa(uVar, eVe.R));
        v.put("SHA-224", new wa(uVar2));
        v.put("SHA224", new wa(uVar2));
        v.put("SHA-256", new wa(uVar3));
        v.put("SHA256", new wa(uVar3));
        v.put("SHA-384", new wa(uVar4));
        v.put("SHA384", new wa(uVar4));
        v.put("SHA-512", new wa(uVar5));
        v.put("SHA512", new wa(uVar5));
        v.put("SHA3-224", new wa(uVar6));
        v.put("SHA3-256", new wa(uVar7));
        v.put("SHA3-384", new wa(uVar8));
        v.put("SHA3-512", new wa(uVar9));
        v.put("BLAKE3-256", new wa(uVar10));
    }
}
