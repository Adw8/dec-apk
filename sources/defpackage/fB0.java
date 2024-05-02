package defpackage;

import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import dev.kdrag0n.virt.NativeLib;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: fB0  reason: default package */
/* loaded from: classes.dex */
public final class fB0 extends k8G implements lR3 {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fB0(Object obj, int i, Object obj2) {
        super(3);
        this.X = i;
        this.R = obj;
        this.v = obj2;
    }

    public final ncu R(ncu ncu, m88 m88) {
        switch (this.X) {
            case 0:
                jr_ jr_ = (jr_) m88;
                jr_.w(-353972293);
                f8n f8n = (f8n) this.R;
                if (f8n == null) {
                    f8n = dDL.R;
                }
                kN5 R = f8n.R((j4B) this.v, jr_);
                jr_.w(1157296644);
                boolean O = jr_.O(R);
                Object I = jr_.I();
                if (O || I == ppN.R) {
                    I = new eQa(R);
                    jr_.ZW(I);
                }
                jr_.g(false);
                eQa eqa = (eQa) I;
                jr_.g(false);
                return eqa;
            case 1:
                jr_ jr_2 = (jr_) m88;
                jr_2.w(-102778667);
                jr_2.w(773894976);
                jr_2.w(-492369756);
                Object I2 = jr_2.I();
                f1A f1a = ppN.R;
                if (I2 == f1a) {
                    hyO hyo = new hyO(caw.N(jr_2));
                    jr_2.ZW(hyo);
                    I2 = hyo;
                }
                jr_2.g(false);
                jy_ jy_ = ((hyO) I2).R;
                jr_2.g(false);
                jr_2.w(-492369756);
                Object I3 = jr_2.I();
                if (I3 == f1a) {
                    I3 = l6.n(null);
                    jr_2.ZW(I3);
                }
                jr_2.g(false);
                h0T h0t = (h0T) I3;
                h0T s = l6.s((kg9) this.R, jr_2);
                p2E p2e = (p2E) this.v;
                jr_2.w(511388516);
                boolean O2 = jr_2.O(h0t) | jr_2.O(p2e);
                Object I4 = jr_2.I();
                if (O2 || I4 == f1a) {
                    I4 = new mr_(h0t, p2e, 3);
                    jr_2.ZW(I4);
                }
                jr_2.g(false);
                caw.v(p2e, (kg9) I4, jr_2);
                aff aff = aff.R;
                p2E p2e2 = (p2E) this.v;
                ncu R2 = lCG.R(aff, p2e2, new fFY(jy_, h0t, p2e2, s, null));
                jr_2.g(false);
                return R2;
            case 2:
                jr_ jr_3 = (jr_) m88;
                jr_3.w(759876635);
                f_c f_c = (f_c) this.R;
                ct ctVar = eDJ.f3033R;
                Object x = jQ.x(jr_3, -1589795249, -492369756);
                f1A f1a2 = ppN.R;
                if (x == f1a2) {
                    x = l6.V(f_c);
                    jr_3.ZW(x);
                }
                jr_3.g(false);
                dH9 dh9 = (dH9) x;
                jr_3.w(-492369756);
                Object I5 = jr_3.I();
                if (I5 == f1a2) {
                    I5 = new _6(new aWo(((aWo) dh9.getValue()).f906R), eDJ.f3035R, new aWo(eDJ.R));
                    jr_3.ZW(I5);
                }
                jr_3.g(false);
                _6 _6 = (_6) I5;
                caw.e(o8s.R, new jvE(dh9, _6, null), jr_3);
                SE se = _6.f680R;
                jr_3.g(false);
                kg9 kg9 = (kg9) this.v;
                jr_3.w(1157296644);
                boolean O3 = jr_3.O(se);
                Object I6 = jr_3.I();
                if (O3 || I6 == f1a2) {
                    I6 = new fBj(se, 4);
                    jr_3.ZW(I6);
                }
                jr_3.g(false);
                ncu ncu2 = (ncu) kg9.x(I6);
                jr_3.g(false);
                return ncu2;
            case 3:
            case 4:
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 6:
            default:
                jr_ jr_4 = (jr_) m88;
                jr_4.w(664422852);
                jJj jjj = (jJj) jr_4.x(lnF.X);
                bUo buo = (bUo) jr_4.x(lnF.P);
                jr_4.w(1157296644);
                boolean O4 = jr_4.O(jjj);
                Object I7 = jr_4.I();
                if (O4 || I7 == ppN.R) {
                    I7 = new iTB(buo, jjj);
                    jr_4.ZW(I7);
                }
                jr_4.g(false);
                iTB itb = (iTB) I7;
                btA bta = new btA(2);
                bta.R(itb);
                bta.v((Object[]) this.R);
                caw.O(bta.O(new Object[bta.X()]), new gU0(itb, (iv7) this.v, null), jr_4);
                jr_4.g(false);
                return itb;
            case 7:
                jr_ jr_5 = (jr_) m88;
                jr_5.w(410346167);
                jr_5.w(773894976);
                jr_5.w(-492369756);
                Object I8 = jr_5.I();
                f1A f1a3 = ppN.R;
                if (I8 == f1a3) {
                    hyO hyo2 = new hyO(caw.N(jr_5));
                    jr_5.ZW(hyo2);
                    I8 = hyo2;
                }
                jr_5.g(false);
                jy_ jy_2 = ((hyO) I8).R;
                jr_5.g(false);
                lh8 lh8 = (lh8) this.R;
                jr_5.w(100475956);
                if (lh8 == null) {
                    jr_5.w(-492369756);
                    Object I9 = jr_5.I();
                    if (I9 == f1a3) {
                        I9 = new lh8();
                        jr_5.ZW(I9);
                    }
                    jr_5.g(false);
                    lh8 = (lh8) I9;
                }
                jr_5.g(false);
                i_c i_c = (i_c) this.v;
                jr_5.w(1618982084);
                boolean O5 = jr_5.O(i_c) | jr_5.O(lh8) | jr_5.O(jy_2);
                Object I10 = jr_5.I();
                if (O5 || I10 == f1a3) {
                    lh8.f5804R = jy_2;
                    I10 = new gyU(lh8, i_c);
                    jr_5.ZW(I10);
                }
                jr_5.g(false);
                gyU gyu = (gyU) I10;
                jr_5.g(false);
                return gyu;
            case VmNativeCallback.$stable:
                jr_ jr_6 = (jr_) m88;
                Object x2 = jQ.x(jr_6, 374375707, -492369756);
                if (x2 == ppN.R) {
                    x2 = new nCn();
                    jr_6.ZW(x2);
                }
                jr_6.g(false);
                nCn ncn = (nCn) x2;
                ncn.R = (kg9) this.R;
                pq5 pq5 = (pq5) this.v;
                pq5 pq52 = ncn.f6351R;
                if (pq52 != null) {
                    pq52.R = null;
                }
                ncn.f6351R = pq5;
                if (pq5 != null) {
                    pq5.R = ncn;
                }
                jr_6.g(false);
                return ncn;
        }
    }

    public final void c(m88 m88) {
        switch (this.X) {
            case 12:
                aff aff = aff.R;
                float f = (float) 16;
                ncu zw = aH9.zw(aff, 0.0f, f, 0.0f, 0.0f, 13);
                List list = (List) this.R;
                CreateViewModel createViewModel = (CreateViewModel) this.v;
                jr_ jr_ = (jr_) m88;
                jr_.w(-483455358);
                bF9 R = VA.R(nA.f6330R, dq.f2881R, jr_);
                jr_.w(-1323940314);
                jJj jjj = (jJj) jr_.x(lnF.X);
                mdz mdz = (mdz) jr_.x(lnF.H);
                bUo buo = (bUo) jr_.x(lnF.P);
                h1U.R.getClass();
                fme fme = igT.R;
                dNH b = aH9.b(zw);
                if (jr_.f5052R instanceof Su) {
                    jr_.mL();
                    if (jr_.f5050L) {
                        jr_.H(fme);
                    } else {
                        jr_.BF();
                    }
                    jr_.f5078e = false;
                    l6.p(jr_, R, igT.c);
                    l6.p(jr_, jjj, igT.v);
                    l6.p(jr_, mdz, igT.e);
                    jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -1163856341);
                    dTl.x(adU.O(aff, f), jr_, 6);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (d7V.f2503R.contains((dM_) obj)) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        lTs.R(createViewModel, (dM_) it.next(), jr_, 8);
                    }
                    jQ.K(jr_, false, false, true, false);
                    jr_.g(false);
                    return;
                }
                l6.u();
                throw null;
            default:
                g4x.e(new _c((jy_) this.R, 25, (TerminalViewModel) this.v), aH9.zw(aff.R, 0.0f, 0.0f, (float) 8, 0.0f, 11), false, null, null, cN5.e, m88, 196656, 28);
                return;
        }
    }

    /* JADX INFO: finally extract failed */
    public final void v(Su su, mdh mdh, h1W h1w) {
        boolean z = false;
        switch (this.X) {
            case 3:
                ((kg9) this.R).x(((jr_) this.v).f5055R);
                return;
            case 4:
                blo blo = (blo) this.R;
                int c = mdh.c((WB) this.v);
                vC.m(mdh.H < c);
                jr_.h(mdh, su, c);
                int i = mdh.H;
                int i2 = mdh.U;
                while (i2 >= 0 && !mdh.t(i2)) {
                    i2 = mdh.h(i2);
                }
                int i3 = i2 + 1;
                int i4 = 0;
                while (i3 < i) {
                    if (mdh.j(i, i3)) {
                        if (mdh.t(i3)) {
                            i4 = 0;
                        }
                        i3++;
                    } else {
                        i4 += mdh.t(i3) ? 1 : l6.Z(mdh.f6092R, mdh.N(i3));
                        i3 += mdh.P(i3);
                    }
                }
                while (true) {
                    int i5 = mdh.H;
                    if (i5 >= c) {
                        if (i5 == c) {
                            z = true;
                        }
                        vC.m(z);
                        blo.e = i4;
                        return;
                    } else if (mdh.j(c, i5)) {
                        int i6 = mdh.H;
                        if (i6 < mdh.c && l6.O(mdh.f6092R, mdh.N(i6))) {
                            su.O(mdh.Y(mdh.H));
                            i4 = 0;
                        }
                        mdh.T();
                    } else {
                        i4 += mdh.S();
                    }
                }
                break;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                mdh.X();
                mq9 mq9 = (mq9) this.R;
                WB wb = (WB) this.v;
                wb.getClass();
                mdh.V(mq9, mq9.v(wb));
                mdh.x();
                return;
            default:
                jr_ jr_ = (jr_) this.R;
                p4d p4d = (p4d) this.v;
                jr_.getClass();
                mq9 mq92 = new mq9();
                mdh H = mq92.H();
                try {
                    H.X();
                    p4d.getClass();
                    H.r(126665345, null, ppN.R, false);
                    mdh.i(H);
                    p4d.getClass();
                    H.k(null);
                    p4d.getClass();
                    mdh.J(null, H);
                    H.S();
                    H.m();
                    H.x();
                    H.O();
                    jr_.f5057R.Z(p4d, new mBo(mq92));
                    return;
                } catch (Throwable th) {
                    H.O();
                    throw th;
                }
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
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 3:
                v((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            case 4:
                v((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                v((Su) obj, (mdh) obj2, (h1W) obj3);
                return o8s.R;
            case 6:
            default:
                w0 w0Var = (w0) obj;
                ((Number) obj3).intValue();
                c((m88) obj2);
                return o8s.R;
            case 7:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case VmNativeCallback.$stable:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 9:
                ((Number) obj3).intValue();
                return R((ncu) obj, (m88) obj2);
            case 10:
                eBF ebf = (eBF) obj;
                int intValue = ((Number) obj2).intValue();
                int intValue2 = ((Number) obj3).intValue();
                Spannable spannable = (Spannable) this.R;
                bBk bbk = (bBk) this.v;
                deI dei = ebf.f3012R;
                lIe lie = ebf.f3017R;
                if (lie == null) {
                    lie = lIe.e;
                }
                ned ned = ebf.f3018R;
                ned ned2 = new ned(ned != null ? ned.R : 0);
                hqI hqi = ebf.f3015R;
                spannable.setSpan(new hSS((Typeface) bbk.m(dei, lie, ned2, new hqI(hqi != null ? hqi.R : 1))), intValue, intValue2, 33);
                return o8s.R;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                ivW ivw = ((iHI) this.R).v;
                Boolean bool = Boolean.TRUE;
                ivw.H(bool);
                NativeLib.a((String) this.v, ((ParcelFileDescriptor) obj).detachFd(), (String) obj2, (String) obj3);
                pby[] pbyArr = kxm.R;
                ((iHI) this.R).v.H(Boolean.FALSE);
                return bool;
            case 12:
                w0 w0Var2 = (w0) obj;
                ((Number) obj3).intValue();
                c((m88) obj2);
                return o8s.R;
        }
    }
}
