package defpackage;

import android.os.ParcelFileDescriptor;
import dev.kdrag0n.virt.NativeLib;
import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: x9  reason: default package */
/* loaded from: classes.dex */
public final class x9 extends k8G implements lR3 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x9(int i, Object obj) {
        super(3);
        this.X = i;
        this.R = obj;
    }

    public final ncu R(ncu ncu, m88 m88) {
        kMk kmk;
        switch (this.X) {
            case 0:
                jr_ jr_ = (jr_) m88;
                jr_.w(-992853993);
                nW z = g4x.z(jr_);
                jr_.w(1157296644);
                boolean O = jr_.O(z);
                Object I = jr_.I();
                if (O || I == ppN.R) {
                    I = new sR(z);
                    jr_.ZW(I);
                }
                jr_.g(false);
                sR sRVar = (sR) I;
                ze zeVar = (ze) this.R;
                if (zeVar instanceof M4) {
                    caw.v(zeVar, new V4(zeVar, 8, sRVar), jr_);
                }
                jr_.g(false);
                return sRVar;
            case 1:
                jr_ jr_2 = (jr_) m88;
                jr_2.w(-852052847);
                nW z2 = g4x.z(jr_2);
                jr_2.w(1157296644);
                boolean O2 = jr_2.O(z2);
                Object I2 = jr_2.I();
                if (O2 || I2 == ppN.R) {
                    I2 = new bP(z2);
                    jr_2.ZW(I2);
                }
                jr_2.g(false);
                bP bPVar = (bP) I2;
                bPVar.R = (Zs) this.R;
                jr_2.g(false);
                return bPVar;
            case 2:
            default:
                jr_ jr_3 = (jr_) m88;
                jr_3.w(-307396750);
                jzQ jzq = (jzQ) this.R;
                jr_3.w(1157296644);
                boolean O3 = jr_3.O(jzq);
                Object I3 = jr_3.I();
                if (O3 || I3 == ppN.R) {
                    I3 = new mkt(jzq);
                    jr_3.ZW(I3);
                }
                jr_3.g(false);
                mkt mkt = (mkt) I3;
                jr_3.g(false);
                return mkt;
            case 3:
                jr_ jr_4 = (jr_) m88;
                jr_4.w(1582736677);
                jJj jjj = (jJj) jr_4.x(lnF.X);
                gP7 gp7 = (gP7) jr_4.x(lnF.Z);
                mdz mdz = (mdz) jr_4.x(lnF.H);
                kMk kmk2 = (kMk) this.R;
                jr_4.w(511388516);
                boolean O4 = jr_4.O(kmk2) | jr_4.O(mdz);
                Object I4 = jr_4.I();
                if (O4 || I4 == ppN.R) {
                    I4 = hDC.T(kmk2, mdz);
                    jr_4.ZW(I4);
                }
                jr_4.g(false);
                kMk kmk3 = (kMk) I4;
                jr_4.w(511388516);
                boolean O5 = jr_4.O(gp7) | jr_4.O(kmk3);
                Object I5 = jr_4.I();
                if (O5 || I5 == ppN.R) {
                    eBF ebf = kmk3.f5283R;
                    deI dei = ebf.f3012R;
                    lIe lie = ebf.f3017R;
                    if (lie == null) {
                        lie = lIe.e;
                    }
                    ned ned = ebf.f3018R;
                    int i = ned != null ? ned.R : 0;
                    hqI hqi = ebf.f3015R;
                    I5 = ((bYd) gp7).v(dei, lie, i, hqi != null ? hqi.R : 1);
                    jr_4.ZW(I5);
                }
                jr_4.g(false);
                dH9 dh9 = (dH9) I5;
                kMk kmk4 = (kMk) this.R;
                jr_4.w(-492369756);
                Object I6 = jr_4.I();
                if (I6 == ppN.R) {
                    kmk = kmk3;
                    I6 = new c8i(mdz, jjj, gp7, kmk4, dh9.getValue());
                    jr_4.ZW(I6);
                } else {
                    kmk = kmk3;
                }
                jr_4.g(false);
                c8i c8i = (c8i) I6;
                Object value = dh9.getValue();
                if (mdz != c8i.f1981R || !n3x.v(jjj, c8i.f1978R) || !n3x.v(gp7, c8i.f1977R) || !n3x.v(kmk, c8i.f1980R) || !n3x.v(value, c8i.f1979R)) {
                    c8i.f1981R = mdz;
                    c8i.f1978R = jjj;
                    c8i.f1977R = gp7;
                    c8i.f1980R = kmk;
                    c8i.f1979R = value;
                    c8i.R = crU.R(kmk, jjj, gp7, crU.R, 1);
                }
                b4H b4h = new b4H(new x9(2, c8i));
                jr_4.g(false);
                return b4h;
            case 4:
                jr_ jr_5 = (jr_) m88;
                jr_5.w(1980580247);
                jJj jjj2 = (jJj) jr_5.x(lnF.X);
                jr_5.w(-492369756);
                Object I7 = jr_5.I();
                f1A f1a = ppN.R;
                if (I7 == f1a) {
                    I7 = l6.n(new ltH(0));
                    jr_5.ZW(I7);
                }
                jr_5.g(false);
                h0T h0t = (h0T) I7;
                _c _cVar = new _c((fBS) this.R, h0t, 5);
                jr_5.w(511388516);
                boolean O6 = jr_5.O(h0t) | jr_5.O(jjj2);
                Object I8 = jr_5.I();
                if (O6 || I8 == f1a) {
                    I8 = new bfp(jjj2, h0t, 1);
                    jr_5.ZW(I8);
                }
                jr_5.g(false);
                ct ctVar = eDJ.f3033R;
                ncu y = g4x.y(ncu, new fB0(_cVar, 2, (kg9) I8));
                jr_5.g(false);
                return y;
        }
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        switch (this.X) {
            case 0:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 1:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 2:
                long j = ((oys) obj3).f7046R;
                adU.c(0.0f, 3);
                long j2 = ((c8i) this.R).R;
                l0f L = ((pc0) obj2).L(oys.R(j, caw.x((int) (j2 >> 32), oys.x(j), oys.Z(j)), 0, caw.x(ltH.v(j2), oys.m(j), oys.L(j)), 0, 10));
                return ((mZf) obj).f(L.e, L.X, iia.R, new kW9(L, 5));
            case 3:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 4:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 6:
                m88 m88 = ((k7Q) obj).R;
                ((Number) obj3).intValue();
                ncu I = g4x.I((m88) obj2, (ncu) this.R);
                jr_ jr_ = (jr_) m88;
                jr_.w(509942095);
                h1U.R.getClass();
                l6.p(m88, I, igT.f4693R);
                jr_.g(false);
                return o8s.R;
            case 7:
                String str = (String) obj2;
                String str2 = (String) obj3;
                int detachFd = ((ParcelFileDescriptor) obj).detachFd();
                pby[] pbyArr = kxm.R;
                String str3 = ((iHI) this.R).R.getApplicationInfo().nativeLibraryDir;
                NativeLib.l(detachFd, str3 + "/libgosftp.so");
                return Boolean.TRUE;
            case VmNativeCallback.$stable:
                w0 w0Var = (w0) obj;
                ((Number) obj3).intValue();
                ncu zw = aH9.zw(aff.R, 0.0f, (float) 16, 0.0f, 0.0f, 13);
                h0T h0t = (h0T) this.R;
                jr_ jr_2 = (jr_) ((m88) obj2);
                jr_2.w(1157296644);
                boolean O = jr_2.O(h0t);
                Object I2 = jr_2.I();
                if (O || I2 == ppN.R) {
                    I2 = new chb(h0t, 0);
                    jr_2.ZW(I2);
                }
                jr_2.g(false);
                vd.v(zw, "More", (f_c) I2, jr_2, 54, 0);
                return o8s.R;
            default:
                kM4 km4 = (kM4) obj;
                m88 m882 = (m88) obj2;
                if ((((Number) obj3).intValue() & 81) == 16) {
                    jr_ jr_3 = (jr_) m882;
                    if (jr_3.J()) {
                        jr_3.E();
                        return o8s.R;
                    }
                }
                g4x.e(new gVU((mpr) this.R, 6), null, false, null, null, moa.R, m882, 196608, 30);
                return o8s.R;
        }
    }
}
