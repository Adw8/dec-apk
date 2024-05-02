package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.ArrayList;
import java.util.List;

/* renamed from: oLA  reason: default package */
/* loaded from: classes.dex */
public final class oLA extends k8G implements iv7 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f6769X;
    public static final oLA R = new oLA(0);
    public static final oLA v = new oLA(1);
    public static final oLA c = new oLA(2);
    public static final oLA e = new oLA(3);
    public static final oLA X = new oLA(4);
    public static final oLA O = new oLA(5);
    public static final oLA L = new oLA(6);
    public static final oLA Z = new oLA(7);
    public static final oLA m = new oLA(8);
    public static final oLA x = new oLA(9);
    public static final oLA H = new oLA(10);
    public static final oLA U = new oLA(11);
    public static final oLA C = new oLA(12);
    public static final oLA N = new oLA(13);
    public static final oLA P = new oLA(14);
    public static final oLA j = new oLA(15);
    public static final oLA g = new oLA(16);
    public static final oLA y = new oLA(17);
    public static final oLA t = new oLA(18);
    public static final oLA i = new oLA(19);
    public static final oLA V = new oLA(20);
    public static final oLA o = new oLA(21);
    public static final oLA K = new oLA(22);
    public static final oLA J = new oLA(23);
    public static final oLA Y = new oLA(24);
    public static final oLA h = new oLA(25);
    public static final oLA I = new oLA(26);
    public static final oLA u = new oLA(27);
    public static final oLA z = new oLA(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oLA(int i2) {
        super(2);
        this.f6769X = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        String str;
        aAC aac;
        Object obj3;
        int i2 = this.f6769X;
        int i3 = 0;
        switch (i2) {
            case 0:
                o8s o8s = (o8s) obj;
                o8s o8s2 = (o8s) obj2;
                switch (i2) {
                    case 0:
                        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
                    default:
                        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
                }
            case 1:
                o8s o8s3 = (o8s) obj;
                o8s o8s4 = (o8s) obj2;
                switch (i2) {
                    case 0:
                        throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
                    default:
                        throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
                }
            case 2:
                String str2 = (String) obj;
                String str3 = (String) obj2;
                switch (i2) {
                    case 2:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str2;
                }
            case 3:
                fzf fzf = (fzf) obj;
                int i4 = ((fzf) obj2).R;
                return fzf;
            case 4:
                String str4 = (String) obj;
                String str5 = (String) obj2;
                switch (i2) {
                    case 2:
                        throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
                    default:
                        return str4;
                }
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 6:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 7:
                Tp tp = (Tp) obj;
                Tp tp2 = (Tp) obj2;
                if (tp == null || (str = tp.f537R) == null) {
                    str = tp2.f537R;
                }
                if (tp == null || (aac = tp.R) == null) {
                    aac = tp2.R;
                }
                return new Tp(str, aac);
            case VmNativeCallback.$stable:
                return obj == null ? obj2 : obj;
            case 9:
                dWm dwm = (dWm) obj;
                bz bzVar = (bz) obj2;
                String str6 = bzVar.R;
                k_s k_s = mOh.R;
                List list3 = bzVar.f1883R;
                k_s k_s2 = mOh.v;
                return pdD.U(str6, mOh.R(list3, k_s2, dwm), mOh.R(bzVar.v, k_s2, dwm), mOh.R(bzVar.c, k_s2, dwm));
            case 10:
                dWm dwm2 = (dWm) obj;
                List list4 = (List) obj2;
                ArrayList arrayList2 = new ArrayList(list4.size());
                int size = list4.size();
                while (i3 < size) {
                    arrayList2.add(mOh.R((m3) list4.get(i3), mOh.c, dwm2));
                    i3++;
                }
                return arrayList2;
            case lVo.HKDF_SALT_FIELD_NUMBER:
                dWm dwm3 = (dWm) obj;
                m3 m3Var = (m3) obj2;
                Object obj4 = m3Var.f5897R;
                lS lSVar = obj4 instanceof kne ? lS.Paragraph : obj4 instanceof eBF ? lS.Span : obj4 instanceof iO4 ? lS.VerbatimTts : obj4 instanceof hov ? lS.Url : lS.String;
                int ordinal = lSVar.ordinal();
                if (ordinal == 0) {
                    obj3 = mOh.R((kne) m3Var.f5897R, mOh.O, dwm3);
                } else if (ordinal == 1) {
                    obj3 = mOh.R((eBF) m3Var.f5897R, mOh.L, dwm3);
                } else if (ordinal == 2) {
                    obj3 = mOh.R((iO4) m3Var.f5897R, mOh.e, dwm3);
                } else if (ordinal == 3) {
                    obj3 = mOh.R((hov) m3Var.f5897R, mOh.X, dwm3);
                } else if (ordinal == 4) {
                    obj3 = m3Var.f5897R;
                    k_s k_s3 = mOh.R;
                } else {
                    throw new j8f((Object) null);
                }
                return pdD.U(lSVar, obj3, Integer.valueOf(m3Var.R), Integer.valueOf(m3Var.v), m3Var.f5898R);
            case 12:
                dWm dwm4 = (dWm) obj;
                return Float.valueOf(((L0) obj2).R);
            case 13:
                dWm dwm5 = (dWm) obj;
                return new ejC(((n3) obj2).f6279R);
            case 14:
                dWm dwm6 = (dWm) obj;
                return Integer.valueOf(((lIe) obj2).f5651e);
            case 15:
                dWm dwm7 = (dWm) obj;
                List list5 = ((d5E) obj2).R;
                ArrayList arrayList3 = new ArrayList(list5.size());
                int size2 = list5.size();
                while (i3 < size2) {
                    arrayList3.add(mOh.R((kA9) list5.get(i3), mOh.t, dwm7));
                    i3++;
                }
                return arrayList3;
            case 16:
                dWm dwm8 = (dWm) obj;
                return ((kA9) obj2).R.R.toLanguageTag();
            case 17:
                dWm dwm9 = (dWm) obj;
                long j2 = ((aWo) obj2).f906R;
                if (aWo.v(j2, aWo.e)) {
                    return Boolean.FALSE;
                }
                Float valueOf = Float.valueOf(aWo.e(j2));
                k_s k_s4 = mOh.R;
                return pdD.U(valueOf, Float.valueOf(aWo.X(j2)));
            case 18:
                dWm dwm10 = (dWm) obj;
                kne kne = (kne) obj2;
                pvy pvy = kne.f5429R;
                k_s k_s5 = mOh.R;
                mRi mri = kne.f5428R;
                mRi mri2 = mRi.R;
                return pdD.U(pvy, kne.f5423R, mOh.R(new eT9(kne.R), mOh.j, dwm10), mOh.R(mri, mOh.x, dwm10));
            case 19:
                dWm dwm11 = (dWm) obj;
                hpO hpo = (hpO) obj2;
                return pdD.U(mOh.R(new n3(hpo.f4390R), mOh.P, dwm11), mOh.R(new aWo(hpo.v), mOh.g, dwm11), Float.valueOf(hpo.f4389R));
            case 20:
                dWm dwm12 = (dWm) obj;
                eBF ebf = (eBF) obj2;
                n3 n3Var = new n3(ebf.R());
                k_s k_s6 = mOh.P;
                eT9 et9 = new eT9(ebf.R);
                k_s k_s7 = mOh.j;
                lIe lie = ebf.f3017R;
                lIe lie2 = lIe.R;
                hpO hpo2 = ebf.f3014R;
                hpO hpo3 = hpO.R;
                return pdD.U(mOh.R(n3Var, k_s6, dwm12), mOh.R(et9, k_s7, dwm12), mOh.R(lie, mOh.H, dwm12), ebf.f3018R, ebf.f3015R, -1, ebf.f3016R, mOh.R(new eT9(ebf.v), k_s7, dwm12), mOh.R(ebf.f3008R, mOh.U, dwm12), mOh.R(ebf.f3013R, mOh.m, dwm12), mOh.R(ebf.f3011R, mOh.y, dwm12), mOh.R(new n3(ebf.c), k_s6, dwm12), mOh.R(ebf.f3009R, mOh.Z, dwm12), mOh.R(hpo2, mOh.N, dwm12));
            case 21:
                dWm dwm13 = (dWm) obj;
                return Integer.valueOf(((ari) obj2).f1478R);
            case 22:
                dWm dwm14 = (dWm) obj;
                h5a h5a = (h5a) obj2;
                return pdD.U(Float.valueOf(h5a.f4049R), Float.valueOf(h5a.v));
            case 23:
                dWm dwm15 = (dWm) obj;
                mRi mri3 = (mRi) obj2;
                eT9 et92 = new eT9(mri3.f6045R);
                k_s k_s8 = mOh.j;
                return pdD.U(mOh.R(et92, k_s8, dwm15), mOh.R(new eT9(mri3.v), k_s8, dwm15));
            case 24:
                dWm dwm16 = (dWm) obj;
                long j3 = ((odN) obj2).f6859R;
                int i5 = odN.R;
                Integer valueOf2 = Integer.valueOf((int) (j3 >> 32));
                k_s k_s9 = mOh.R;
                return pdD.U(valueOf2, Integer.valueOf(odN.c(j3)));
            case 25:
                dWm dwm17 = (dWm) obj;
                long j4 = ((eT9) obj2).f3107R;
                Float valueOf3 = Float.valueOf(eT9.c(j4));
                k_s k_s10 = mOh.R;
                return pdD.U(valueOf3, new lqt(eT9.v(j4)));
            case 26:
                dWm dwm18 = (dWm) obj;
                String str7 = ((hov) obj2).R;
                k_s k_s11 = mOh.R;
                return str7;
            case 27:
                dWm dwm19 = (dWm) obj;
                String str8 = ((iO4) obj2).R;
                k_s k_s12 = mOh.R;
                return str8;
            case 28:
                dWm dwm20 = (dWm) obj;
                d5M d5m = (d5M) obj2;
                return pdD.U(mOh.R(d5m.f2488R, mOh.R, dwm20), mOh.R(new odN(d5m.R), mOh.C, dwm20));
            default:
                m88 m88 = (m88) obj;
                if ((((Number) obj2).intValue() & 11) == 2) {
                    jr_ jr_ = (jr_) m88;
                    if (jr_.J()) {
                        jr_.E();
                    }
                }
                return o8s.R;
        }
    }
}
