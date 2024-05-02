package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: Lx  reason: default package */
/* loaded from: classes.dex */
public final class Lx implements eXP {
    @Override // defpackage.eXP
    public final dEt R(ety ety) {
        lMx lmx = ety.f3237R;
        System.currentTimeMillis();
        j0 j0Var = ety.f3235R;
        dEt det = null;
        r1 r1Var = new r1(j0Var, null);
        if (j0Var != null) {
            bv bvVar = (bv) j0Var.O;
            if (bvVar == null) {
                bv bvVar2 = bv.R;
                bvVar = ppN.P((bd4) j0Var.c);
                j0Var.O = bvVar;
            }
            if (bvVar.O) {
                r1Var = new r1(null, null);
            }
        }
        j0 j0Var2 = r1Var.f7378R;
        dEt det2 = r1Var.R;
        boolean z = lmx instanceof lMx;
        if (j0Var2 == null && det2 == null) {
            eUn eun = new eUn();
            eun.f3115R = ety.f3235R;
            eun.f3118R = nX1.HTTP_1_1;
            eun.R = 504;
            eun.f3116R = "Unsatisfiable Request (only-if-cached)";
            eun.f3109R = -1;
            eun.v = System.currentTimeMillis();
            return eun.R();
        } else if (j0Var2 == null) {
            eUn eun2 = new eUn(det2);
            dEt s = pdD.s(det2);
            pdD.g("cacheResponse", s);
            eun2.f3119v = s;
            return eun2.R();
        } else {
            dEt v = ety.v(j0Var2);
            if (det2 != null) {
                if (v.e == 304) {
                    eUn eun3 = new eUn(det2);
                    bd4 bd4 = det2.f2535R;
                    bd4 bd42 = v.f2535R;
                    ArrayList arrayList = new ArrayList(20);
                    int length = bd4.R.length / 2;
                    for (int i = 0; i < length; i++) {
                        String v2 = bd4.v(i);
                        String H = bd4.H(i);
                        if (iH_.Q("Warning", v2)) {
                            bd4 = bd4;
                            if (iH_._(H, "1", false)) {
                            }
                        } else {
                            bd4 = bd4;
                        }
                        if ((iH_.Q("Content-Length", v2) || iH_.Q("Content-Encoding", v2) || iH_.Q("Content-Type", v2)) || !atb.m(v2) || bd42.R(v2) == null) {
                            arrayList.add(v2);
                            arrayList.add(iH_.vr(H).toString());
                        }
                    }
                    int length2 = bd42.R.length / 2;
                    for (int i2 = 0; i2 < length2; i2++) {
                        String v3 = bd42.v(i2);
                        if (!(iH_.Q("Content-Length", v3) || iH_.Q("Content-Encoding", v3) || iH_.Q("Content-Type", v3)) && atb.m(v3)) {
                            String H2 = bd42.H(i2);
                            arrayList.add(v3);
                            arrayList.add(iH_.vr(H2).toString());
                        }
                    }
                    Object[] array = arrayList.toArray(new String[0]);
                    if (array != null) {
                        iRl irl = new iRl();
                        irl.R.addAll(Arrays.asList((String[]) array));
                        eun3.f3114R = irl;
                        eun3.f3109R = v.R;
                        eun3.v = v.v;
                        dEt s2 = pdD.s(det2);
                        pdD.g("cacheResponse", s2);
                        eun3.f3119v = s2;
                        dEt s3 = pdD.s(v);
                        pdD.g("networkResponse", s3);
                        eun3.f3111R = s3;
                        eun3.R();
                        v.f2534R.close();
                        throw null;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                asb.v(det2.f2534R);
            }
            eUn eun4 = new eUn(v);
            if (det2 != null) {
                det = pdD.s(det2);
            }
            pdD.g("cacheResponse", det);
            eun4.f3119v = det;
            dEt s4 = pdD.s(v);
            pdD.g("networkResponse", s4);
            eun4.f3111R = s4;
            return eun4.R();
        }
    }
}
