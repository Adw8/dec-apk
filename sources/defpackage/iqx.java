package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.termux.terminal.Y;
import com.termux.view.TerminalView;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.util.WeakHashMap;

/* renamed from: iqx  reason: default package */
/* loaded from: classes.dex */
public abstract class iqx {
    public static final float R = (float) 48;

    public static final void L(TerminalViewModel terminalViewModel, ihm ihm, ihm ihm2, h0T h0t, h0T h0t2, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(247104204);
        Context context = (Context) jr_.x(ur.f7428R);
        nu_ nu_ = (nu_) jr_.x(ur.c);
        owM owm = lnF.X;
        jJj jjj = (jJj) jr_.x(owm);
        jr_.w(-492369756);
        Object I = jr_.I();
        f1A f1a = ppN.R;
        if (I == f1a) {
            Object obj = C1.R;
            I = (InputMethodManager) dmD.v(context, InputMethodManager.class);
            jr_.ZW(I);
        }
        jr_.g(false);
        InputMethodManager inputMethodManager = (InputMethodManager) I;
        Y y = ihm.R;
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == f1a) {
            I2 = l6.V(new _c(ihm2, 24, ihm));
            jr_.ZW(I2);
        }
        jr_.g(false);
        dH9 dh9 = (dH9) I2;
        boolean v = n3x.v(ihm2, ihm);
        int B = ((jJj) jr_.x(owm)).B(((Number) biy.m(terminalViewModel.c, jr_).getValue()).floatValue());
        h0T m = biy.m(terminalViewModel.X, jr_);
        jr_.w(-492369756);
        Object I3 = jr_.I();
        if (I3 == f1a) {
            I3 = l6.n(null);
            jr_.ZW(I3);
        }
        jr_.g(false);
        h0T h0t3 = (h0T) I3;
        caw.v(o8s.R, new ofd(y, terminalViewModel, h0t3, 19), jr_);
        jr_.w(-492369756);
        Object I4 = jr_.I();
        if (I4 == f1a) {
            I4 = l6.n(null);
            jr_.ZW(I4);
        }
        jr_.g(false);
        h0T h0t4 = (h0T) I4;
        caw.e(Boolean.valueOf(v), new e0h(v, terminalViewModel, h0t4, null), jr_);
        caw.X(Boolean.valueOf(v), (TerminalView) h0t3.getValue(), new kXP(v, terminalViewModel, h0t3, inputMethodManager, null), jr_);
        jr_.w(-1873571424);
        WeakHashMap weakHashMap = kHc.R;
        boolean booleanValue = ((Boolean) f1A.e(jr_).f5241c.v.getValue()).booleanValue();
        jr_.g(false);
        caw.X(Boolean.valueOf(v), (TerminalView) h0t3.getValue(), new moV(booleanValue, v, h0t3, inputMethodManager, null), jr_);
        jr_.w(-492369756);
        Object I5 = jr_.I();
        if (I5 == f1a) {
            I5 = new pq5();
            jr_.ZW(I5);
        }
        jr_.g(false);
        pq5 pq5 = (pq5) I5;
        ooA.R(new lML(h0t3, dh9, inputMethodManager, terminalViewModel, h0t, h0t2, 5), g4x.g(adU.c, lBz.Y, new fB0(new ofd(jjj, pq5, h0t3, 20), 8, pq5)), new lEX(h0t3, B, y, terminalViewModel, nu_, h0t, h0t2, m, h0t4), jr_, 0, 0);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new bgV(terminalViewModel, ihm, ihm2, h0t, h0t2, i);
        }
    }

    public static final void O(m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(740416028);
        if (i != 0 || !jr_.J()) {
            PO.R(ooA.m(adU.O(adU.f942R, R), n3.X, cUF.f2104R), jr_, 0);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new Hg(i, 1);
        }
    }

    public static final void R(kM4 km4, ru ruVar, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-357192764);
        if ((i & 14) == 0) {
            i2 = (jr_.O(km4) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(ruVar) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !jr_.J()) {
            ncu R2 = kM4.R(km4);
            Y6 y6 = dq.X;
            jr_.w(733328855);
            bF9 e = PO.e(y6, false, jr_);
            jr_.w(-1323940314);
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(R2);
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, e, igT.c);
                l6.p(jr_, jjj, igT.v);
                l6.p(jr_, mdz, igT.e);
                jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -2137368960);
                f7Z.v(iTI.g(ruVar.f7404e, jr_), ruVar.f7403R, dTl.T(ruVar.f7402R), 0, jr_, 8, 8);
                jQ.K(jr_, false, false, true, false);
                jr_.g(false);
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(km4, ruVar, i, 22);
        }
    }

    public static final void X(iv7 iv7, h0T h0t, m88 m88, int i) {
        int i2;
        long j;
        long j2;
        jr_ jr_ = (jr_) m88;
        jr_.q(35129045);
        if ((i & 14) == 0) {
            i2 = (jr_.O(iv7) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 112) == 0) {
            i2 |= jr_.O(h0t) ? 32 : 16;
        }
        if ((i2 & 91) != 18 || !jr_.J()) {
            if (n1P.y(jr_)) {
                jr_.w(-2114414304);
                j = cU5.e(17170471, jr_);
                jr_.g(false);
            } else {
                jr_.w(-2114414232);
                j = cU5.e(17170461, jr_);
                jr_.g(false);
            }
            if (n1P.y(jr_)) {
                jr_.w(-2114414121);
                j = cU5.e(17170492, jr_);
                jr_.g(false);
            } else {
                jr_.w(-2114414050);
                j = cU5.e(17170495, jr_);
                jr_.g(false);
            }
            jr_.w(-492369756);
            Object I = jr_.I();
            if (I == ppN.R) {
                I = l6.n(Boolean.FALSE);
                jr_.ZW(I);
            }
            jr_.g(false);
            h0T h0t2 = (h0T) I;
            if (((Boolean) h0t2.getValue()).booleanValue() || ((Boolean) h0t.getValue()).booleanValue()) {
            }
            if (((Boolean) h0t2.getValue()).booleanValue() || ((Boolean) h0t.getValue()).booleanValue()) {
                jr_.w(-2114413792);
                j2 = ((E2) jr_.x(_1.R)).x();
            } else {
                jr_.w(-2114413751);
                j2 = ((E2) jr_.x(_1.R)).N();
            }
            jr_.g(false);
            ncu m = ooA.m(adU.H(aH9.mL(adU.e(lCG.R(aff.R, o8s.R, new bFf((View) jr_.x(ur.X), h0t2, h0t, null))), (float) 4), (float) 48), j, kfX.R((float) 8));
            Y6 y6 = dq.X;
            jr_.w(733328855);
            bF9 e = PO.e(y6, false, jr_);
            jr_.w(-1323940314);
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(m);
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, e, igT.c);
                l6.p(jr_, jjj, igT.v);
                l6.p(jr_, mdz, igT.e);
                jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -2137368960);
                l6.R(new bkv[]{kft.R.v(new n3(j2))}, aH9.I(jr_, -2019954661, new he(iv7, i2, 9)), jr_, 56);
                jr_.g(false);
                jr_.g(false);
                jr_.g(true);
                jr_.g(false);
                jr_.g(false);
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(iv7, h0t, i, 25);
        }
    }

    public static final void Z(TerminalViewModel terminalViewModel, h0T h0t, h0T h0t2, boolean z, boolean z2, long j, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-2031384066);
        jr_.w(773894976);
        jr_.w(-492369756);
        Object I = jr_.I();
        if (I == ppN.R) {
            hyO hyo = new hyO(caw.N(jr_));
            jr_.ZW(hyo);
            I = hyo;
        }
        jr_.g(false);
        jy_ jy_ = ((hyO) I).R;
        jr_.g(false);
        aff aff = aff.R;
        float f = (float) 12;
        ncu X4 = aH9.X4(lCG.R(ooA.m(adU.O(adU.f942R, ((float) 48) + ((float) 8)), j, cUF.f2104R), o8s.R, new nAR(jy_, terminalViewModel, null)), f, 0.0f, 2);
        jr_.w(693286680);
        bF9 R2 = ktl.R(nA.R, dq.f2879R, jr_);
        jr_.w(-1323940314);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(X4);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            l6.p(jr_, R2, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -678309503);
            nAL nal = nAL.R;
            X(cN5.R, h0t, jr_, (i & 112) | 6);
            c(cN5.v, terminalViewModel.f2794R, 111, false, jr_, 70, 8);
            c(cN5.c, terminalViewModel.f2794R, 61, false, jr_, 70, 8);
            dTl.x(kM4.R(nal), jr_, 0);
            dTl.c(nal, !z && z2, null, null, null, null, aH9.I(jr_, 1344328506, new fB0(jy_, 13, terminalViewModel)), jr_, 1572870, 30);
            v(terminalViewModel.f2794R, mBH.v, jr_, 56);
            dTl.x(adU.H(aff, f), jr_, 6);
            v(terminalViewModel.f2794R, mBH.R, jr_, 56);
            jr_.g(false);
            jr_.g(false);
            jr_.g(true);
            jr_.g(false);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new Ys(terminalViewModel, h0t, h0t2, z, z2, j, i);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static final void c(iv7 iv7, nhg nhg, int i, boolean z, m88 m88, int i2, int i3) {
        long j;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1118724575);
        boolean z2 = (i3 & 8) != 0 ? false : z;
        if (n1P.y(jr_)) {
            jr_.w(-1027538292);
            j = cU5.e(17170471, jr_);
            jr_.g(false);
        } else {
            jr_.w(-1027538220);
            j = cU5.e(17170461, jr_);
            jr_.g(false);
        }
        j = n3.X;
        View view = (View) jr_.x(ur.X);
        jr_.w(-492369756);
        Object I = jr_.I();
        f1A f1a = ppN.R;
        if (I == f1a) {
            I = l6.n(Boolean.FALSE);
            jr_.ZW(I);
        }
        jr_.g(false);
        h0T h0t = (h0T) I;
        if (((Boolean) h0t.getValue()).booleanValue()) {
        }
        Object x = jQ.x(jr_, 773894976, -492369756);
        if (x == f1a) {
            hyO hyo = new hyO(caw.N(jr_));
            jr_.ZW(hyo);
            x = hyo;
        }
        jr_.g(false);
        jy_ jy_ = ((hyO) x).R;
        jr_.g(false);
        ncu m = ooA.m(adU.H(aH9.mL(adU.e(lCG.R(aff.R, o8s.R, new gtk(jy_, view, nhg, i, h0t, null))), (float) 4), (float) (z2 ? 48 : 32)), j, kfX.R((float) 8));
        Y6 y6 = dq.X;
        jr_.w(733328855);
        bF9 e = PO.e(y6, false, jr_);
        jr_.w(-1323940314);
        jJj jjj = (jJj) jr_.x(lnF.X);
        mdz mdz = (mdz) jr_.x(lnF.H);
        bUo buo = (bUo) jr_.x(lnF.P);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(m);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            l6.p(jr_, e, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -2137368960);
            iv7.J(jr_, Integer.valueOf(i2 & 14));
            jr_.g(false);
            jr_.g(false);
            jr_.g(true);
            jr_.g(false);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new bKj(iv7, nhg, i, z2, i2, i3);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static final void e(TerminalViewModel terminalViewModel, Activity activity, m88 m88, int i) {
        long j;
        Y y;
        jr_ jr_ = (jr_) m88;
        jr_.q(1352091559);
        h0T m = biy.m(terminalViewModel.f2800v, jr_);
        h0T m2 = biy.m(terminalViewModel.f2796R, jr_);
        caw.e(terminalViewModel.f2791R, new iEh(terminalViewModel, m2, null), jr_);
        jr_.w(-1230437534);
        ihm ihm = (ihm) m.getValue();
        long X = ((ihm == null || (y = ihm.R) == null) ? null : y.f2413R) == null ? n1P.y(jr_) ? cuh.R : cuh.v : aH9.X(((ihm) m.getValue()).R.f2413R.f3898R.f6727R[257]);
        boolean z = false;
        jr_.g(false);
        SE R2 = lLc.R(X, null, jr_, 0, 6);
        caw.e(new n3(X), new kTg(X, activity, (View) jr_.x(ur.X), null), jr_);
        jr_.w(-492369756);
        Object I = jr_.I();
        f1A f1a = ppN.R;
        if (I == f1a) {
            I = l6.n(Boolean.FALSE);
            jr_.ZW(I);
        }
        jr_.g(false);
        h0T h0t = (h0T) I;
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == f1a) {
            I2 = l6.n(Boolean.FALSE);
            jr_.ZW(I2);
        }
        jr_.g(false);
        h0T h0t2 = (h0T) I2;
        jr_.w(-1873571424);
        WeakHashMap weakHashMap = kHc.R;
        boolean booleanValue = ((Boolean) f1A.e(jr_).f5241c.v.getValue()).booleanValue();
        jr_.g(false);
        jr_.w(-492369756);
        Object I3 = jr_.I();
        if (I3 == f1a) {
            I3 = l6.n(Boolean.FALSE);
            jr_.ZW(I3);
        }
        jr_.g(false);
        h0T h0t3 = (h0T) I3;
        Boolean valueOf = Boolean.valueOf(booleanValue);
        jr_.w(511388516);
        boolean O = jr_.O(h0t3) | jr_.O(m);
        Object I4 = jr_.I();
        if (O || I4 == f1a) {
            I4 = new gbv(h0t3, m, null);
            jr_.ZW(I4);
        }
        jr_.g(false);
        caw.e(valueOf, (iv7) I4, jr_);
        if (booleanValue || ((Boolean) h0t3.getValue()).booleanValue()) {
            z = true;
        }
        ncu ncu = ooA.m(aff.R, ((n3) R2.getValue()).f6279R, cUF.f2104R);
        lBz lbz = lBz.Y;
        ncu g = g4x.g(ncu, lbz, new G9(11));
        jr_.w(-483455358);
        bF9 R3 = VA.R(nA.f6330R, dq.f2881R, jr_);
        jr_.w(-1323940314);
        owM owm = lnF.X;
        jJj jjj = (jJj) jr_.x(owm);
        owM owm2 = lnF.H;
        mdz mdz = (mdz) jr_.x(owm2);
        owM owm3 = lnF.P;
        bUo buo = (bUo) jr_.x(owm3);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(g);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            ky1 ky1 = igT.c;
            l6.p(jr_, R3, ky1);
            ky1 ky12 = igT.v;
            l6.p(jr_, jjj, ky12);
            ky1 ky13 = igT.e;
            l6.p(jr_, mdz, ky13);
            ky1 ky14 = igT.X;
            jQ.o(0, b, jQ.m(jr_, buo, ky14, jr_), jr_, 2058660585, -1163856341);
            _n _nVar = _n.R;
            ncu c = FI.c();
            jr_.w(733328855);
            bF9 e = PO.e(dq.R, false, jr_);
            jr_.w(-1323940314);
            jJj jjj2 = (jJj) jr_.x(owm);
            mdz mdz2 = (mdz) jr_.x(owm2);
            bUo buo2 = (bUo) jr_.x(owm3);
            dNH b2 = aH9.b(c);
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                jQ.o(0, b2, jQ.Z(jr_, e, ky1, jr_, jjj2, ky12, jr_, mdz2, ky13, jr_, buo2, ky14, jr_), jr_, 2058660585, -2137368960);
                l6.R(new bkv[]{iHv.R.v(null)}, aH9.I(jr_, 1769163235, new aB5(h0t, h0t2, m2, m, terminalViewModel)), jr_, 56);
                O(jr_, 0);
                jr_.g(false);
                jr_.g(false);
                jr_.g(true);
                jr_.g(false);
                jr_.g(false);
                if (n1P.y(jr_)) {
                    jr_.w(-1690144413);
                    j = cU5.e(17170472, jr_);
                    jr_.g(false);
                } else {
                    jr_.w(-1690144333);
                    j = cU5.e(17170463, jr_);
                    jr_.g(false);
                }
                dTl.v(_nVar, z, null, null, null, null, aH9.I(jr_, -422702859, new e_N(terminalViewModel, h0t, h0t2, booleanValue, j, h0t3)), jr_, 1572870, 30);
                PO.R(g4x.g(g4x.g(ooA.m(adU.f942R, ((n3) lLc.R(z ? j : ((n3) R2.getValue()).f6279R, null, jr_, 0, 6).getValue()).f6279R, cUF.f2104R), lbz, new G9(12)), lbz, new G9(10)), jr_, 0);
                jr_.g(false);
                jr_.g(false);
                jr_.g(true);
                jr_.g(false);
                jr_.g(false);
                dYh t = jr_.t();
                if (t != null) {
                    t.f2666R = new _a(terminalViewModel, activity, i, 24);
                    return;
                }
                return;
            }
            l6.u();
            throw null;
        }
        l6.u();
        throw null;
    }

    public static final void v(nhg nhg, mBH mbh, m88 m88, int i) {
        long j;
        jr_ jr_ = (jr_) m88;
        jr_.q(-224035855);
        if (n1P.y(jr_)) {
            jr_.w(1045813966);
            j = cU5.e(17170471, jr_);
            jr_.g(false);
        } else {
            jr_.w(1045814038);
            j = cU5.e(17170461, jr_);
            jr_.g(false);
        }
        j = n3.X;
        View view = (View) jr_.x(ur.X);
        jr_.w(-492369756);
        Object I = jr_.I();
        f1A f1a = ppN.R;
        if (I == f1a) {
            I = l6.n(Boolean.FALSE);
            jr_.ZW(I);
        }
        jr_.g(false);
        h0T h0t = (h0T) I;
        if (((Boolean) h0t.getValue()).booleanValue()) {
        }
        Object x = jQ.x(jr_, 773894976, -492369756);
        if (x == f1a) {
            hyO hyo = new hyO(caw.N(jr_));
            jr_.ZW(hyo);
            x = hyo;
        }
        jr_.g(false);
        jy_ jy_ = ((hyO) x).R;
        jr_.g(false);
        jr_.w(-492369756);
        Object I2 = jr_.I();
        if (I2 == f1a) {
            I2 = l6.n(new aWo(aWo.e));
            jr_.ZW(I2);
        }
        jr_.g(false);
        h0T h0t2 = (h0T) I2;
        aff aff = aff.R;
        o8s o8s = o8s.R;
        ncu R2 = lCG.R(aff, o8s, new ago(jy_, h0t2, view, nhg, mbh, h0t, null));
        jr_.w(1157296644);
        boolean O = jr_.O(h0t2);
        Object I3 = jr_.I();
        if (O || I3 == f1a) {
            I3 = new ifa(h0t2, null);
            jr_.ZW(I3);
        }
        jr_.g(false);
        ncu m = ooA.m(adU.H(adU.e(aH9.mL(lCG.R(R2, o8s, (iv7) I3), (float) 4)), (float) 64), j, kfX.R((float) 8));
        jr_.w(733328855);
        bF9 e = PO.e(dq.R, false, jr_);
        jr_.w(-1323940314);
        owM owm = lnF.X;
        jJj jjj = (jJj) jr_.x(owm);
        owM owm2 = lnF.H;
        mdz mdz = (mdz) jr_.x(owm2);
        owM owm3 = lnF.P;
        bUo buo = (bUo) jr_.x(owm3);
        h1U.R.getClass();
        fme fme = igT.R;
        dNH b = aH9.b(m);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(fme);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            ky1 ky1 = igT.c;
            l6.p(jr_, e, ky1);
            ky1 ky12 = igT.v;
            l6.p(jr_, jjj, ky12);
            ky1 ky13 = igT.e;
            l6.p(jr_, mdz, ky13);
            ky1 ky14 = igT.X;
            l6.p(jr_, buo, ky14);
            jr_.j();
            b.y(new k7Q(jr_), jr_, 0);
            jr_.w(2058660585);
            jr_.w(-2137368960);
            prr prr = adU.c;
            jr_.w(-483455358);
            bF9 R3 = VA.R(nA.f6330R, dq.f2881R, jr_);
            jr_.w(-1323940314);
            jJj jjj2 = (jJj) jr_.x(owm);
            mdz mdz2 = (mdz) jr_.x(owm2);
            bUo buo2 = (bUo) jr_.x(owm3);
            dNH b2 = aH9.b(prr);
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, R3, ky1);
                l6.p(jr_, jjj2, ky12);
                l6.p(jr_, mdz2, ky13);
                l6.p(jr_, buo2, ky14);
                jr_.j();
                b2.y(new k7Q(jr_), jr_, 0);
                jr_.w(2058660585);
                jr_.w(-1163856341);
                ncu c = FI.c();
                jr_.w(693286680);
                FW fw = nA.R;
                ky kyVar = dq.f2879R;
                bF9 R4 = ktl.R(fw, kyVar, jr_);
                jr_.w(-1323940314);
                jJj jjj3 = (jJj) jr_.x(owm);
                mdz mdz3 = (mdz) jr_.x(owm2);
                bUo buo3 = (bUo) jr_.x(owm3);
                dNH b3 = aH9.b(c);
                if (jr_.f5052R instanceof Su) {
                    jr_.mL();
                    if (jr_.f5050L) {
                        jr_.H(fme);
                    } else {
                        jr_.BF();
                    }
                    jr_.f5078e = false;
                    l6.p(jr_, R4, ky1);
                    l6.p(jr_, jjj3, ky12);
                    l6.p(jr_, mdz3, ky13);
                    l6.p(jr_, buo3, ky14);
                    jr_.j();
                    b3.y(new k7Q(jr_), jr_, 0);
                    jr_.w(2058660585);
                    jr_.w(-678309503);
                    nAL nal = nAL.R;
                    PO.R(kM4.R(nal), jr_, 0);
                    R(nal, mbh.f5971R, jr_, 6);
                    PO.R(kM4.R(nal), jr_, 0);
                    jr_.g(false);
                    jr_.g(false);
                    jr_.g(true);
                    jr_.g(false);
                    jr_.g(false);
                    ncu c2 = FI.c();
                    jr_.w(693286680);
                    bF9 R5 = ktl.R(fw, kyVar, jr_);
                    jr_.w(-1323940314);
                    jJj jjj4 = (jJj) jr_.x(owm);
                    mdz mdz4 = (mdz) jr_.x(owm2);
                    bUo buo4 = (bUo) jr_.x(owm3);
                    dNH b4 = aH9.b(c2);
                    if (jr_.f5052R instanceof Su) {
                        jr_.mL();
                        if (jr_.f5050L) {
                            jr_.H(fme);
                        } else {
                            jr_.BF();
                        }
                        jr_.f5078e = false;
                        l6.p(jr_, R5, ky1);
                        l6.p(jr_, jjj4, ky12);
                        l6.p(jr_, mdz4, ky13);
                        l6.p(jr_, buo4, ky14);
                        jr_.j();
                        b4.y(new k7Q(jr_), jr_, 0);
                        jr_.w(2058660585);
                        jr_.w(-678309503);
                        R(nal, mbh.f5972c, jr_, 6);
                        PO.R(kM4.R(nal), jr_, 0);
                        R(nal, mbh.f5973e, jr_, 6);
                        jr_.g(false);
                        jr_.g(false);
                        jr_.g(true);
                        jr_.g(false);
                        jr_.g(false);
                        ncu c3 = FI.c();
                        jr_.w(693286680);
                        bF9 R6 = ktl.R(fw, kyVar, jr_);
                        jr_.w(-1323940314);
                        jJj jjj5 = (jJj) jr_.x(owm);
                        mdz mdz5 = (mdz) jr_.x(owm2);
                        bUo buo5 = (bUo) jr_.x(owm3);
                        dNH b5 = aH9.b(c3);
                        if (jr_.f5052R instanceof Su) {
                            jr_.mL();
                            if (jr_.f5050L) {
                                jr_.H(fme);
                            } else {
                                jr_.BF();
                            }
                            jr_.f5078e = false;
                            l6.p(jr_, R6, ky1);
                            l6.p(jr_, jjj5, ky12);
                            l6.p(jr_, mdz5, ky13);
                            l6.p(jr_, buo5, ky14);
                            jr_.j();
                            b5.y(new k7Q(jr_), jr_, 0);
                            jr_.w(2058660585);
                            jr_.w(-678309503);
                            PO.R(kM4.R(nal), jr_, 0);
                            R(nal, mbh.f5975v, jr_, 6);
                            PO.R(kM4.R(nal), jr_, 0);
                            jr_.g(false);
                            jr_.g(false);
                            jr_.g(true);
                            jr_.g(false);
                            jr_.g(false);
                            jQ.K(jr_, false, false, true, false);
                            jQ.K(jr_, false, false, false, true);
                            jr_.g(false);
                            jr_.g(false);
                            dYh t = jr_.t();
                            if (t != null) {
                                t.f2666R = new _a(nhg, mbh, i, 23);
                                return;
                            }
                            return;
                        }
                        l6.u();
                        throw null;
                    }
                    l6.u();
                    throw null;
                }
                l6.u();
                throw null;
            }
            l6.u();
            throw null;
        }
        l6.u();
        throw null;
    }
}
