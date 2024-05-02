package defpackage;

import java.util.HashMap;

/* renamed from: cPk  reason: default package */
/* loaded from: classes.dex */
public final class cPk {
    public static final HashMap R;

    /* renamed from: R  reason: collision with other field name */
    public static owj f2088R = new owj();

    /* renamed from: R  reason: collision with other field name */
    public kgV f2089R;

    static {
        HashMap hashMap = new HashMap();
        R = hashMap;
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        HashMap hashMap4 = new HashMap();
        HashMap hashMap5 = new HashMap();
        hashMap.put(fQj.R, "SHA1");
        hashMap.put(fkm.e, "SHA224");
        hashMap.put(fkm.R, "SHA256");
        hashMap.put(fkm.v, "SHA384");
        hashMap.put(fkm.c, "SHA512");
        hashMap.put(lFw.v, "RIPEMD128");
        hashMap.put(lFw.R, "RIPEMD160");
        hashMap.put(lFw.c, "RIPEMD256");
        hashMap2.put(lpk.R, "RSA/ECB/PKCS1Padding");
        hashMap2.put(aP4.v, "ECGOST3410");
        u uVar = lpk.K;
        hashMap3.put(uVar, "DESEDEWrap");
        hashMap3.put(lpk.J, "RC2Wrap");
        u uVar2 = fkm.g;
        hashMap3.put(uVar2, "AESWrap");
        u uVar3 = fkm.t;
        hashMap3.put(uVar3, "AESWrap");
        u uVar4 = fkm.V;
        hashMap3.put(uVar4, "AESWrap");
        u uVar5 = bPd.R;
        hashMap3.put(uVar5, "CamelliaWrap");
        u uVar6 = bPd.v;
        hashMap3.put(uVar6, "CamelliaWrap");
        u uVar7 = bPd.c;
        hashMap3.put(uVar7, "CamelliaWrap");
        u uVar8 = jIG.R;
        hashMap3.put(uVar8, "SEEDWrap");
        u uVar9 = lpk.N;
        hashMap3.put(uVar9, "DESede");
        hashMap5.put(uVar, 192);
        hashMap5.put(uVar2, 128);
        hashMap5.put(uVar3, 192);
        hashMap5.put(uVar4, 256);
        hashMap5.put(uVar5, 128);
        hashMap5.put(uVar6, 192);
        hashMap5.put(uVar7, 256);
        hashMap5.put(uVar8, 128);
        hashMap5.put(uVar9, 192);
        hashMap4.put(fkm.P, "AES");
        hashMap4.put(fkm.j, "AES");
        hashMap4.put(fkm.y, "AES");
        hashMap4.put(fkm.i, "AES");
        hashMap4.put(uVar9, "DESede");
        hashMap4.put(lpk.P, "RC2");
    }

    public cPk(kgV kgv) {
        this.f2089R = kgv;
    }
}
