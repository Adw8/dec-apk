package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import dev.kdrag0n.app.ui.drm.LicenseInvalidViewModel;
import dev.kdrag0n.virtcontainer.R;
import java.io.File;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* renamed from: cUF  reason: default package */
/* loaded from: classes.dex */
public abstract class cUF {

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f2105R = {R.attr.dynamicColorThemeOverlay};
    public static final aYa R = new aYa((Object) null);

    /* renamed from: R  reason: collision with other field name */
    public static final v9 f2104R = new v9(2);

    public static String C(File file) {
        if (file.getName().endsWith(".apk")) {
            String replaceFirst = file.getName().replaceFirst("(_\\d+)?\\.apk", "");
            return (replaceFirst.equals("base-master") || replaceFirst.equals("base-main")) ? "" : replaceFirst.startsWith("base-") ? replaceFirst.replace("base-", "config.") : replaceFirst.replace("-", ".config.").replace(".config.master", "").replace(".config.main", "");
        }
        throw new IllegalArgumentException("Non-apk found in splits directory.");
    }

    public static bFN L(iVb ivb) {
        if (ivb.o() == inw.DHKEM_X25519_HKDF_SHA256) {
            return new gL6(26, new zI("HmacSha256", 1));
        }
        if (ivb.o() == inw.DHKEM_P256_HKDF_SHA256) {
            return h5.x(k_8.NIST_P256);
        }
        if (ivb.o() == inw.DHKEM_P384_HKDF_SHA384) {
            return h5.x(k_8.NIST_P384);
        }
        if (ivb.o() == inw.DHKEM_P521_HKDF_SHA512) {
            return h5.x(k_8.NIST_P521);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    public static zI O(iVb ivb) {
        if (ivb.V() == oiA.HKDF_SHA256) {
            return new zI("HmacSha256", 1);
        }
        if (ivb.V() == oiA.HKDF_SHA384) {
            return new zI("HmacSha384", 1);
        }
        if (ivb.V() == oiA.HKDF_SHA512) {
            return new zI("HmacSha512", 1);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }

    public static final void R(m5f m5f, F4 f4, LicenseInvalidViewModel licenseInvalidViewModel, m88 m88, int i) {
        boolean z;
        Throwable th;
        boolean z2;
        String str;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1893224054);
        Context context = (Context) jr_.x(ur.f7428R);
        Object x = jQ.x(jr_, 773894976, -492369756);
        Object obj = ppN.R;
        if (x == obj) {
            Object hyo = new hyO(caw.N(jr_));
            jr_.ZW(hyo);
            x = hyo;
        }
        jr_.g(false);
        jy_ jy_ = ((hyO) x).R;
        jr_.g(false);
        String h = dtx.h(R.string.drm_domain_patreon, jr_);
        h0T m = biy.m(m5f.f5914R, jr_);
        boolean v = n3x.v((iwX) m.getValue(), fed.R);
        aff aff = aff.R;
        prr prr = adU.f943v;
        vV vVVar = dq.f2893v;
        jr_.w(-483455358);
        bF9 R2 = VA.R(nA.f6330R, vVVar, jr_);
        jr_.w(-1323940314);
        kxN kxn = lnF.X;
        jJj jjj = (jJj) jr_.x(kxn);
        kxN kxn2 = lnF.H;
        mdz mdz = (mdz) jr_.x(kxn2);
        kxN kxn3 = lnF.P;
        bUo buo = (bUo) jr_.x(kxn3);
        h1U.R.getClass();
        f_c f_c = igT.R;
        dNH b = aH9.b(prr);
        if (jr_.f5052R instanceof Su) {
            jr_.mL();
            if (jr_.f5050L) {
                jr_.H(f_c);
            } else {
                jr_.BF();
            }
            jr_.f5078e = false;
            ky1 ky1 = igT.c;
            l6.p(jr_, R2, ky1);
            ky1 ky12 = igT.v;
            l6.p(jr_, jjj, ky12);
            ky1 ky13 = igT.e;
            l6.p(jr_, mdz, ky13);
            ky1 ky14 = igT.X;
            jQ.o(0, b, jQ.m(jr_, buo, ky14, jr_), jr_, 2058660585, -1163856341);
            String h2 = dtx.h(v ? R.string.drm_license_invalid_title_oldversion : R.string.drm_license_invalid_title, jr_);
            kxN kxn4 = dB8.R;
            g1c.c(h2, adU.X(aH9.zw(aff, 0.0f, (float) 64, 0.0f, (float) 48, 5)), 0, 0, null, null, null, 0, null, new pvy(3), 0, 0, false, 0, null, kMk.R(((c_P) jr_.x(kxn4)).c, 0, 0, lIe.X, 262139), jr_, 48, 0, 32252);
            ncu X = adU.X(aH9.mL(dTl.B(FI.c(), dTl.s(jr_)), (float) 24));
            ga_ ga_ = ga_.R;
            Object valueOf = Boolean.valueOf(v);
            jr_.w(511388516);
            boolean O = jr_.O(valueOf) | jr_.O(h);
            Object I = jr_.I();
            boolean z3 = true;
            if (O || I == obj) {
                z = v;
                I = new lRS(1, h, z);
                jr_.ZW(I);
            } else {
                z = v;
            }
            boolean z4 = false;
            jr_.g(false);
            ooA.R(ga_, X, (kg9) I, jr_, 6, 0);
            jr_.w(-2108308984);
            if (!z) {
                ncu zw = aH9.zw(aff, 0.0f, 0.0f, 0.0f, (float) 4, 7);
                iwX iwx = (iwX) m.getValue();
                if (iwx instanceof mRo) {
                    str = afN.R(-63741636498316L);
                } else if (iwx instanceof bBw) {
                    str = afN.R(-63750226432908L);
                } else if (iwx instanceof p0k) {
                    str = afN.R(-63797471073164L);
                } else if (iwx instanceof iBb) {
                    str = afN.R(-63853305648012L);
                } else if (iwx instanceof mFE) {
                    str = afN.R(-63913435190156L);
                } else if (iwx instanceof eDg) {
                    str = afN.R(-63973564732300L);
                } else if (iwx instanceof hoq) {
                    str = afN.R(-64029399307148L);
                } else if (iwx instanceof fed) {
                    str = afN.R(-64089528849292L);
                } else if (iwx == null) {
                    str = afN.R(-64158248326028L);
                } else {
                    throw new j8f((Object) null);
                }
                g1c.c(str, zw, ((E2) jr_.x(_1.R)).i(), 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_.x(kxn4)).H, jr_, 48, 0, 32760);
                th = null;
                z3 = true;
                vd.v(null, dtx.h(R.string.settings_menu_debug_report, jr_), new bBd(1, licenseInvalidViewModel), jr_, 0, 1);
                z4 = false;
            } else {
                th = null;
            }
            jr_.g(z4);
            oy oyVar = nA.f6331v;
            prr prr2 = adU.f942R;
            jr_.w(693286680);
            bF9 R3 = ktl.R(oyVar, dq.f2879R, jr_);
            jr_.w(-1323940314);
            jJj jjj2 = (jJj) jr_.x(kxn);
            mdz mdz2 = (mdz) jr_.x(kxn2);
            bUo buo2 = (bUo) jr_.x(kxn3);
            dNH b2 = aH9.b(prr2);
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(f_c);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = z4;
                k7Q Z = jQ.Z(jr_, R3, ky1, jr_, jjj2, ky12, jr_, mdz2, ky13, jr_, buo2, ky14, jr_);
                int i2 = z4 ? 1 : 0;
                int i3 = z4 ? 1 : 0;
                int i4 = z4 ? 1 : 0;
                jQ.o(i2, b2, Z, jr_, 2058660585, -678309503);
                if (z) {
                    jr_.w(-2096624827);
                    z2 = z4;
                    dTl.x(adU.Z(aff, z2 ? 1.0f : 0.0f), jr_, 6);
                    vd.R(aH9.mL(aff, (float) 16), dtx.h(R.string.drm_license_invalid_update, jr_), false, new gEM(context, 2), jr_, 6, 4);
                    jr_.g(z2);
                } else {
                    boolean z5 = z4 ? 1 : 0;
                    Object[] objArr = z4 ? 1 : 0;
                    Object[] objArr2 = z4 ? 1 : 0;
                    z2 = z5;
                    jr_.w(-2096624466);
                    float f = (float) 16;
                    vd.v(aH9.mL(aff, f), dtx.h(R.string.drm_license_invalid_retry, jr_), new _c(jy_, 18, m5f), jr_, 6, 0);
                    vd.R(aH9.mL(aff, f), dtx.h(R.string.drm_license_invalid_buy, jr_), false, new gEM(context, 3), jr_, 6, 4);
                    jr_.g(z2);
                }
                jQ.K(jr_, z2, z2, z3, z2);
                jQ.K(jr_, z2, z2, z2, z3);
                jr_.g(z2);
                jr_.g(z2);
                dYh t = jr_.t();
                if (t != null) {
                    t.f2666R = new dR(m5f, f4, licenseInvalidViewModel, i, 9);
                    return;
                }
                return;
            }
            l6.u();
            throw th;
        }
        l6.u();
        throw null;
    }

    public static a25 X(iVb ivb) {
        if (ivb.t() == ow2.AES_128_GCM) {
            return new n4(16);
        }
        if (ivb.t() == ow2.AES_256_GCM) {
            return new n4(32);
        }
        if (ivb.t() == ow2.CHACHA20_POLY1305) {
            return new n2G(17, null);
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    public static final String Z(Context context) {
        return context.getApplicationInfo().loadLabel(context.getPackageManager()).toString();
    }

    public static final void c(List list, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(35148863);
        aH9.H(null, null, null, false, null, null, null, false, new Wn(list, 3, (Context) jr_.x(ur.f7428R)), jr_, 0, 255);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 7, list);
        }
    }

    public static Object e(b1t b1t) {
        boolean z;
        Exception exc;
        Exception exc2;
        if (b1t != null) {
            synchronized (b1t.R) {
                z = b1t.f1511R;
            }
            if (!z) {
                i1p i1p = new i1p();
                r0 r0Var = nk8.f6535R;
                ((aAx) b1t.v).v(new kVh((Executor) r0Var, (iXM) i1p));
                b1t.m();
                ((aAx) b1t.v).v(new kVh((Executor) r0Var, (jeO) i1p));
                b1t.m();
                i1p.R.await();
                if (b1t.X()) {
                    return b1t.c();
                }
                synchronized (b1t.R) {
                    exc = (Exception) b1t.e;
                }
                throw new ExecutionException(exc);
            } else if (b1t.X()) {
                return b1t.c();
            } else {
                synchronized (b1t.R) {
                    exc2 = (Exception) b1t.e;
                }
                throw new ExecutionException(exc2);
            }
        } else {
            throw new NullPointerException("Task must not be null");
        }
    }

    public static Application m(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        throw new IllegalStateException("Could not find an Application in the given context: " + context);
    }

    public static final String v(Object obj) {
        Class<?> cls = obj.getClass();
        String simpleName = cls.getSimpleName();
        return simpleName.length() == 0 ? (String) dF.zw(iH_.b(cls.getName(), new char[]{'.'}, 0, 6)) : simpleName;
    }

    public static void x(b1t b1t) {
        cMT cmt;
        CV cv = new CV(16);
        imB imb = (imB) b1t.e;
        if (((ArrayList) cv.f59R) != null) {
            cv.v = imb;
            for (List<npR> list : ((ConcurrentMap) b1t.R).values()) {
                for (npR npr : list) {
                    int ordinal = npr.f6604R.ordinal();
                    if (ordinal == 1) {
                        cmt = cMT.R;
                    } else if (ordinal == 2) {
                        cmt = cMT.v;
                    } else if (ordinal == 3) {
                        cmt = cMT.c;
                    } else {
                        throw new IllegalStateException("Unknown key status");
                    }
                    int i = npr.R;
                    o02 C = npr.f6605R.C();
                    ArrayList arrayList = (ArrayList) cv.f59R;
                    if (arrayList != null) {
                        arrayList.add(new klr(cmt, i, C));
                    } else {
                        throw new IllegalStateException("addEntry cannot be called after build()");
                    }
                }
            }
            npR npr2 = (npR) b1t.v;
            if (npr2 != null) {
                int i2 = npr2.R;
                if (((ArrayList) cv.f59R) != null) {
                    cv.c = Integer.valueOf(i2);
                } else {
                    throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
                }
            }
            try {
                cv.c();
            } catch (GeneralSecurityException e) {
                throw new IllegalStateException(e);
            }
        } else {
            throw new IllegalStateException("setAnnotations cannot be called after build()");
        }
    }

    public abstract void H(Throwable th);

    public abstract void U(piu piu);
}
