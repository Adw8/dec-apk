package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: a0  reason: default package */
/* loaded from: classes.dex */
public final class a0 extends k8G implements kg9 {

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f711X;
    public static final a0 R = new a0(0);
    public static final a0 v = new a0(1);
    public static final a0 c = new a0(2);
    public static final a0 e = new a0(3);
    public static final a0 X = new a0(4);
    public static final a0 O = new a0(5);
    public static final a0 L = new a0(6);
    public static final a0 Z = new a0(7);
    public static final a0 m = new a0(8);
    public static final a0 x = new a0(11);
    public static final a0 H = new a0(12);
    public static final a0 U = new a0(13);
    public static final a0 C = new a0(14);
    public static final a0 N = new a0(15);
    public static final a0 P = new a0(16);
    public static final a0 j = new a0(17);
    public static final a0 g = new a0(18);
    public static final a0 y = new a0(19);
    public static final a0 t = new a0(20);
    public static final a0 i = new a0(21);
    public static final a0 V = new a0(22);
    public static final a0 o = new a0(23);
    public static final a0 K = new a0(24);
    public static final a0 J = new a0(25);
    public static final a0 Y = new a0(26);
    public static final a0 h = new a0(27);
    public static final a0 I = new a0(28);
    public static final a0 u = new a0(29);

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a0(int i2) {
        super(1);
        this.f711X = i2;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        switch (this.f711X) {
            case 0:
                long j2 = ((n3) obj).f6279R;
                long R2 = n3.R(j2, K6.f228R);
                float Z2 = n3.Z(R2);
                float L2 = n3.L(R2);
                float X2 = n3.X(R2);
                float[] fArr = pdD.f7137R;
                double d = (double) 0.33333334f;
                return new oO(n3.e(j2), (float) Math.pow((double) pdD.L(0, Z2, L2, X2, fArr), d), (float) Math.pow((double) pdD.L(1, Z2, L2, X2, fArr), d), (float) Math.pow((double) pdD.L(2, Z2, L2, X2, fArr), d));
            case 1:
                a0 a0Var = R;
                _0 _0 = new _0(0, (u_) obj);
                oHg ohg = kYZ.R;
                return new oHg(a0Var, _0);
            case 2:
                long j3 = ((b3a) obj).f1515R;
                return new ct(Float.intBitsToFloat((int) (j3 >> 32)), b3a.R(j3));
            case 3:
                ct ctVar = (ct) obj;
                return new b3a(aH9.y(ctVar.R, ctVar.v));
            case 4:
                ((Number) obj).intValue();
                return 0;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((Number) obj).intValue();
                return 0;
            case 6:
                ((Number) obj).intValue();
                return 0;
            case 7:
                ((Number) obj).intValue();
                return 0;
            case VmNativeCallback.$stable /* 8 */:
                cyg cyg = (cyg) obj;
                return nf2.v;
            case 9:
                Hd hd = (Hd) obj;
                return o8s.R;
            case 10:
                Hd hd2 = (Hd) obj;
                return o8s.R;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                Hd hd3 = (Hd) obj;
                return o8s.R;
            case 12:
                long j4 = ((esE) obj).f3230R;
                return new ct(esE.R(j4), esE.v(j4));
            case 13:
                ct ctVar2 = (ct) obj;
                return new esE(gvP.R(ctVar2.R, ctVar2.v));
            case 14:
                return new O2(((hoI) obj).R);
            case 15:
                return new hoI(((O2) obj).R);
            case 16:
                return new O2(((Number) obj).floatValue());
            case 17:
                return Float.valueOf(((O2) obj).R);
            case 18:
                long j5 = ((dU5) obj).f2628R;
                return new ct((float) ((int) (j5 >> 32)), (float) dU5.v(j5));
            case 19:
                ct ctVar3 = (ct) obj;
                return new dU5(cU5.v(mLz.t(ctVar3.R), mLz.t(ctVar3.v)));
            case 20:
                long j6 = ((ltH) obj).R;
                return new ct((float) ((int) (j6 >> 32)), (float) ltH.v(j6));
            case 21:
                ct ctVar4 = (ct) obj;
                return new ltH(iTI.R(mLz.t(ctVar4.R), mLz.t(ctVar4.v)));
            case 22:
                return new O2((float) ((Number) obj).intValue());
            case 23:
                return Integer.valueOf((int) ((O2) obj).R);
            case 24:
                long j7 = ((aWo) obj).f906R;
                return new ct(aWo.e(j7), aWo.X(j7));
            case 25:
                ct ctVar5 = (ct) obj;
                return new aWo(aH9.N(ctVar5.R, ctVar5.v));
            case 26:
                gIA gia = (gIA) obj;
                return new oO(gia.f3720R, gia.v, gia.c, gia.e);
            case 27:
                oO oOVar = (oO) obj;
                return new gIA(oOVar.R, oOVar.v, oOVar.c, oOVar.e);
            case 28:
                long j8 = ((nqW) obj).f6610R;
                return new ct(nqW.e(j8), nqW.v(j8));
            default:
                ct ctVar6 = (ct) obj;
                return new nqW(n1P.e(ctVar6.R, ctVar6.v));
        }
    }
}
