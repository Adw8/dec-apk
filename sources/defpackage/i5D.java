package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* renamed from: i5D  reason: default package */
/* loaded from: classes.dex */
public final class i5D extends k8G implements kg9 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f4453X;
    public static final i5D R = new i5D(0);
    public static final i5D v = new i5D(1);
    public static final i5D c = new i5D(2);
    public static final i5D e = new i5D(3);
    public static final i5D X = new i5D(4);
    public static final i5D O = new i5D(5);
    public static final i5D L = new i5D(6);
    public static final i5D Z = new i5D(7);
    public static final i5D m = new i5D(8);
    public static final i5D x = new i5D(9);
    public static final i5D H = new i5D(10);
    public static final i5D U = new i5D(11);
    public static final i5D C = new i5D(12);
    public static final i5D N = new i5D(13);
    public static final i5D P = new i5D(14);
    public static final i5D j = new i5D(15);
    public static final i5D g = new i5D(17);
    public static final i5D y = new i5D(18);
    public static final i5D t = new i5D(19);
    public static final i5D i = new i5D(20);
    public static final i5D V = new i5D(21);
    public static final i5D o = new i5D(22);
    public static final i5D K = new i5D(23);
    public static final i5D J = new i5D(24);
    public static final i5D Y = new i5D(25);
    public static final i5D h = new i5D(26);
    public static final i5D I = new i5D(27);
    public static final i5D u = new i5D(28);
    public static final i5D z = new i5D(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i5D(int i2) {
        super(1);
        this.f4453X = i2;
    }

    public final e9E R(e9E e9e) {
        boolean z2 = true;
        switch (this.f4453X) {
            case 27:
                f25 f25 = e9e.f2984R;
                if (f25 == null || f25.O != e9e.e) {
                    z2 = false;
                }
                if (z2) {
                    return f25;
                }
                return null;
            case 28:
                f25 f252 = e9e.f2984R;
                if (f252 == null || f252.O != e9e.e) {
                    z2 = false;
                }
                if (z2) {
                    return f252;
                }
                return null;
            default:
                return e9e.f2984R;
        }
    }

    public final Context v(Context context) {
        switch (this.f4453X) {
            case 23:
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            default:
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
        }
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        eT9 et9 = null;
        lqt lqt = null;
        Integer num = null;
        et9 = null;
        switch (this.f4453X) {
            case 0:
                return new L0(((Float) obj).floatValue());
            case 1:
                return new n3(((ejC) obj).R);
            case 2:
                return new lIe(((Integer) obj).intValue());
            case 3:
                List list = (List) obj;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    Object obj2 = list.get(i2);
                    arrayList.add((!n3x.v(obj2, Boolean.FALSE) && obj2 != null) ? (kA9) mOh.t.R(obj2) : null);
                }
                return new d5E(arrayList);
            case 4:
                return new kA9(new Vg(Locale.forLanguageTag((String) obj)));
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if (n3x.v(obj, Boolean.FALSE)) {
                    return new aWo(aWo.e);
                }
                List list2 = (List) obj;
                Object obj3 = list2.get(0);
                float floatValue = (obj3 != null ? (Float) obj3 : null).floatValue();
                Object obj4 = list2.get(1);
                return new aWo(aH9.N(floatValue, (obj4 != null ? (Float) obj4 : null).floatValue()));
            case 6:
                List list3 = (List) obj;
                Object obj5 = list3.get(0);
                pvy pvy = obj5 != null ? (pvy) obj5 : null;
                Object obj6 = list3.get(1);
                cF0 cf0 = obj6 != null ? (cF0) obj6 : null;
                Object obj7 = list3.get(2);
                lqt[] lqtArr = eT9.R;
                k_s k_s = mOh.j;
                Boolean bool = Boolean.FALSE;
                long j2 = ((!n3x.v(obj7, bool) && obj7 != null) ? (eT9) k_s.R(obj7) : null).f3107R;
                Object obj8 = list3.get(3);
                mRi mri = mRi.R;
                return new kne(pvy, cf0, j2, (!n3x.v(obj8, bool) && obj8 != null) ? (mRi) mOh.x.R(obj8) : null, null, null, null, null);
            case 7:
                List list4 = (List) obj;
                Object obj9 = list4.get(0);
                int i3 = n3.R;
                k_s k_s2 = mOh.P;
                Boolean bool2 = Boolean.FALSE;
                long j3 = ((!n3x.v(obj9, bool2) && obj9 != null) ? (n3) k_s2.R(obj9) : null).f6279R;
                Object obj10 = list4.get(1);
                int i4 = aWo.R;
                long j4 = ((!n3x.v(obj10, bool2) && obj10 != null) ? (aWo) mOh.g.R(obj10) : null).f906R;
                Object obj11 = list4.get(2);
                return new hpO(j3, j4, (obj11 != null ? (Float) obj11 : null).floatValue());
            case VmNativeCallback.$stable:
                List list5 = (List) obj;
                Object obj12 = list5.get(0);
                int i5 = n3.R;
                k_s k_s3 = mOh.P;
                Boolean bool3 = Boolean.FALSE;
                long j5 = ((!n3x.v(obj12, bool3) && obj12 != null) ? (n3) k_s3.R(obj12) : null).f6279R;
                Object obj13 = list5.get(1);
                lqt[] lqtArr2 = eT9.R;
                k_s k_s4 = mOh.j;
                long j6 = ((!n3x.v(obj13, bool3) && obj13 != null) ? (eT9) k_s4.R(obj13) : null).f3107R;
                Object obj14 = list5.get(2);
                lIe lie = lIe.R;
                lIe lie2 = (!n3x.v(obj14, bool3) && obj14 != null) ? (lIe) mOh.H.R(obj14) : null;
                Object obj15 = list5.get(3);
                ned ned = obj15 != null ? (ned) obj15 : null;
                Object obj16 = list5.get(4);
                hqI hqi = obj16 != null ? (hqI) obj16 : null;
                Object obj17 = list5.get(6);
                String str = obj17 != null ? (String) obj17 : null;
                Object obj18 = list5.get(7);
                long j7 = ((!n3x.v(obj18, bool3) && obj18 != null) ? (eT9) k_s4.R(obj18) : null).f3107R;
                Object obj19 = list5.get(8);
                L0 l0 = (!n3x.v(obj19, bool3) && obj19 != null) ? (L0) mOh.U.R(obj19) : null;
                Object obj20 = list5.get(9);
                h5a h5a = (!n3x.v(obj20, bool3) && obj20 != null) ? (h5a) mOh.m.R(obj20) : null;
                Object obj21 = list5.get(10);
                d5E d5e = (!n3x.v(obj21, bool3) && obj21 != null) ? (d5E) mOh.y.R(obj21) : null;
                Object obj22 = list5.get(11);
                long j8 = ((!n3x.v(obj22, bool3) && obj22 != null) ? (n3) k_s3.R(obj22) : null).f6279R;
                Object obj23 = list5.get(12);
                ari ari = (!n3x.v(obj23, bool3) && obj23 != null) ? (ari) mOh.Z.R(obj23) : null;
                Object obj24 = list5.get(13);
                hpO hpo = hpO.R;
                return new eBF(j5, j6, lie2, ned, hqi, (deI) null, str, j7, l0, h5a, d5e, j8, ari, (!n3x.v(obj24, bool3) && obj24 != null) ? (hpO) mOh.N.R(obj24) : null, 32);
            case 9:
                return new ari(((Integer) obj).intValue());
            case 10:
                List list6 = (List) obj;
                return new h5a(((Number) list6.get(0)).floatValue(), ((Number) list6.get(1)).floatValue());
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                List list7 = (List) obj;
                Object obj25 = list7.get(0);
                lqt[] lqtArr3 = eT9.R;
                k_s k_s5 = mOh.j;
                Boolean bool4 = Boolean.FALSE;
                long j9 = ((!n3x.v(obj25, bool4) && obj25 != null) ? (eT9) k_s5.R(obj25) : null).f3107R;
                Object obj26 = list7.get(1);
                if (!n3x.v(obj26, bool4) && obj26 != null) {
                    et9 = (eT9) k_s5.R(obj26);
                }
                return new mRi(j9, et9.f3107R);
            case 12:
                List list8 = (List) obj;
                Object obj27 = list8.get(0);
                int intValue = (obj27 != null ? (Integer) obj27 : null).intValue();
                Object obj28 = list8.get(1);
                if (obj28 != null) {
                    num = (Integer) obj28;
                }
                return new odN(dtx.e(intValue, num.intValue()));
            case 13:
                List list9 = (List) obj;
                Object obj29 = list9.get(0);
                float floatValue2 = (obj29 != null ? (Float) obj29 : null).floatValue();
                Object obj30 = list9.get(1);
                if (obj30 != null) {
                    lqt = (lqt) obj30;
                }
                return new eT9(gQc.r(floatValue2, lqt.R));
            case 14:
                return new hov((String) obj);
            case 15:
                return new iO4((String) obj);
            case 16:
                List list10 = (List) obj;
                Object obj31 = list10.get(0);
                k_s k_s6 = mOh.R;
                Boolean bool5 = Boolean.FALSE;
                bz bzVar = (!n3x.v(obj31, bool5) && obj31 != null) ? (bz) k_s6.R(obj31) : null;
                Object obj32 = list10.get(1);
                int i6 = odN.R;
                return new d5M(bzVar, ((!n3x.v(obj32, bool5) && obj32 != null) ? (odN) mOh.C.R(obj32) : null).f6859R, (odN) null);
            case 17:
                List list11 = (List) obj;
                return o8s.R;
            case 18:
                int i7 = ((j8k) obj).R;
                return o8s.R;
            case 19:
                List list12 = (List) obj;
                return o8s.R;
            case 20:
                int i8 = ((j8k) obj).R;
                return o8s.R;
            case 21:
                View view = (View) obj;
                return o8s.R;
            case 22:
                f3V f3v = (f3V) obj;
                return new avO();
            case 23:
                return v((Context) obj);
            case 24:
                return v((Context) obj);
            case 25:
                VO vo = (VO) obj;
                vo.R = 0;
                vo.v = 0;
                return o8s.R;
            case 26:
                ((oRR) obj).R = true;
                return o8s.R;
            case 27:
                return R((e9E) obj);
            case 28:
                return R((e9E) obj);
            default:
                return R((e9E) obj);
        }
    }
}
