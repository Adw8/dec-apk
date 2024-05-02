package defpackage;

import android.content.Context;
import android.view.View;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.onboarding.support.DeviceSupportViewModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: pdD  reason: default package */
/* loaded from: classes.dex */
public abstract class pdD {
    public static Class R;

    /* renamed from: R  reason: collision with other field name */
    public static final float[] f7137R = {0.80405736f, 0.026893456f, 0.04586542f, 0.3188387f, 0.9319606f, 0.26299807f, -0.11419419f, 0.05105356f, 0.83999807f};

    /* renamed from: v  reason: collision with other field name */
    public static final float[] f7138v = {1.2485008f, -0.032856926f, -0.057883114f, -0.48331892f, 1.1044513f, -0.3194066f, 0.19910365f, -0.07159331f, 1.202023f};

    /* renamed from: R  reason: collision with other field name */
    public static final tm f7136R = new tm(5);

    /* renamed from: R  reason: collision with other field name */
    public static final lcp f7135R = new lcp(1);
    public static final lcp v = new lcp(2);
    public static final lcp c = new lcp(3);
    public static final lcp e = new lcp(4);
    public static final lcp X = new lcp(5);
    public static final lcp O = new lcp(6);
    public static final lcp L = new lcp(7);
    public static final lcp Z = new lcp(8);
    public static final lcp m = new lcp(0);

    public /* synthetic */ pdD() {
    }

    public static int C(ArrayList arrayList, Comparable comparable) {
        int i = 0;
        int size = arrayList.size();
        int size2 = arrayList.size();
        if (size < 0) {
            throw new IllegalArgumentException("fromIndex (0) is greater than toIndex (" + size + ").");
        } else if (size <= size2) {
            int i2 = size - 1;
            while (i <= i2) {
                int i3 = (i + i2) >>> 1;
                int N = gvP.N((Comparable) arrayList.get(i3), comparable);
                if (N < 0) {
                    i = i3 + 1;
                } else if (N <= 0) {
                    return i3;
                } else {
                    i2 = i3 - 1;
                }
            }
            return -(i + 1);
        } else {
            throw new IndexOutOfBoundsException("toIndex (" + size + ") is greater than size (" + size2 + ").");
        }
    }

    public static final cwX J(f_c f_c) {
        int I = jQ.I(3);
        if (I == 0) {
            return new bV5(f_c);
        }
        if (I == 1) {
            return new ovT(f_c);
        }
        if (I == 2) {
            return new iA3(f_c);
        }
        throw new j8f((Object) null);
    }

    public static final float L(int i, float f, float f2, float f3, float[] fArr) {
        float f4 = f * fArr[i];
        return (f3 * fArr[i + 6]) + (f2 * fArr[i + 3]) + f4;
    }

    public static final List Q(List list) {
        int size = list.size();
        return size != 0 ? size != 1 ? list : Collections.singletonList(list.get(0)) : fcD.R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long T(java.lang.String r21, long r22, long r24, long r26) {
        /*
        // Method dump skipped, instructions count: 255
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdD.T(java.lang.String, long, long, long):long");
    }

    public static final ArrayList U(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new x7(objArr, true));
    }

    public static final int V(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i >= i2) {
                return i2;
            }
            int i4 = i2 % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            int i5 = i % i3;
            if (i5 < 0) {
                i5 += i3;
            }
            int i6 = (i4 - i5) % i3;
            if (i6 < 0) {
                i6 += i3;
            }
            return i2 - i6;
        } else if (i3 >= 0) {
            throw new IllegalArgumentException("Step is zero.");
        } else if (i <= i2) {
            return i2;
        } else {
            int i7 = -i3;
            int i8 = i % i7;
            if (i8 < 0) {
                i8 += i7;
            }
            int i9 = i2 % i7;
            if (i9 < 0) {
                i9 += i7;
            }
            int i10 = (i8 - i9) % i7;
            if (i10 < 0) {
                i10 += i7;
            }
            return i2 + i10;
        }
    }

    public static long W(String str) {
        int i;
        int length = str.length();
        boolean z = true;
        if (length >= 0) {
            if (length > str.length()) {
                z = false;
            }
            if (z) {
                long j = 0;
                int i2 = 0;
                while (i2 < length) {
                    char charAt = str.charAt(i2);
                    if (charAt < 128) {
                        j++;
                    } else {
                        if (charAt < 2048) {
                            i = 2;
                        } else if (charAt < 55296 || charAt > 57343) {
                            i = 3;
                        } else {
                            int i3 = i2 + 1;
                            char charAt2 = i3 < length ? str.charAt(i3) : 0;
                            if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                                j++;
                                i2 = i3;
                            } else {
                                j += (long) 4;
                                i2 += 2;
                            }
                        }
                        j += (long) i;
                    }
                    i2++;
                }
                return j;
            }
            StringBuilder C = opT.C("endIndex > string.length: ", length, " > ");
            C.append(str.length());
            throw new IllegalArgumentException(C.toString().toString());
        }
        throw new IllegalArgumentException(jQ.U("endIndex < beginIndex: ", length, " < ", 0).toString());
    }

    public static final void X(DeviceSupportViewModel deviceSupportViewModel, m88 m88, int i) {
        int i2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-618651072);
        if ((i & 14) == 0) {
            i2 = (jr_.O(deviceSupportViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 11) != 2 || !jr_.J()) {
            vV vVVar = dq.f2893v;
            jr_.w(-483455358);
            aff aff = aff.R;
            bF9 R2 = VA.R(nA.f6330R, vVVar, jr_);
            jr_.w(-1323940314);
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(aff);
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
                jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -1163856341);
                v(deviceSupportViewModel.c ? deviceSupportViewModel.v ? R.string.onboarding_device_support_root : R.string.onboarding_device_support_root_not_rooted : R.string.onboarding_device_support, jr_, 0);
                cpc.N(deviceSupportViewModel.c ? R.string.onboarding_device_support_root_message : R.string.onboarding_device_support_message, new String[]{cUF.Z((Context) jr_.x(ur.f7428R))}, jr_, 64);
                if (deviceSupportViewModel.c && deviceSupportViewModel.v) {
                    vd.c(aH9.zw(aff, 0.0f, (float) 32, 0.0f, 0.0f, 13), "Use root", null, null, new bBd(3, deviceSupportViewModel), jr_, 54, 12);
                }
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
            t.f2666R = new m2w(i, 10, deviceSupportViewModel);
        }
    }

    public static final List Y(Object... objArr) {
        return objArr.length > 0 ? Arrays.asList(objArr) : fcD.R;
    }

    public static int d(csz csz, String str, int i, int i2) {
        int j = csz.j();
        if (j >= i && j <= i2) {
            return j;
        }
        throw new j8f(String.format("Expected %s but was %s at path %s", str, Integer.valueOf(j), csz.Z()), 0);
    }

    public static final void g(String str, dEt det) {
        if (det != null) {
            boolean z = true;
            if (det.f2536R == null) {
                if (det.f2544v == null) {
                    if (det.c != null) {
                        z = false;
                    }
                    if (!z) {
                        throw new IllegalArgumentException(opT.H(str, ".priorResponse != null").toString());
                    }
                    return;
                }
                throw new IllegalArgumentException(opT.H(str, ".cacheResponse != null").toString());
            }
            throw new IllegalArgumentException(opT.H(str, ".networkResponse != null").toString());
        }
    }

    public static final ArrayList h(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new x7(objArr, true));
    }

    public static final int i(List list) {
        return list.size() - 1;
    }

    public static final void k() {
        throw new ArithmeticException("Index overflow has happened.");
    }

    public static boolean m(O o, O o2) {
        return o == o2 || !(o == null || o2 == null || !o.equals(o2));
    }

    public static final void o(nbD nbd, Throwable th) {
        try {
            pqS pqs = (pqS) nbd.O(dq.f2883c);
            if (pqs != null) {
                pqs.a(nbd, th);
            } else {
                i7E.R(nbd, th);
            }
        } catch (Throwable th2) {
            if (th != th2) {
                RuntimeException runtimeException = new RuntimeException("Exception while trying to handle coroutine exception", th2);
                l6.U(runtimeException, th);
                th = runtimeException;
            }
            i7E.R(nbd, th);
        }
    }

    public static final Object p(plU plu) {
        Object obj;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        nbD v2 = plu.v();
        dTl.K(v2);
        aOO U = n3x.U(plu);
        na6 na6 = null;
        if (U instanceof na6) {
            na6 = (na6) U;
        }
        if (na6 == null) {
            obj = o8s.R;
        } else {
            if (na6.f6470R.zw(v2)) {
                na6.f6469R = o8s.R;
                na6.e = 1;
                na6.f6470R.X4(v2, na6);
            } else {
                nbD M = v2.M(new jtz());
                na6.f6469R = o8s.R;
                na6.e = 1;
                na6.f6470R.X4(M, na6);
            }
            obj = bgr;
        }
        return obj == bgr ? obj : o8s.R;
    }

    public static int r(String str, int i, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        return (int) T(str, (long) i, (long) i2, (long) i3);
    }

    public static final dEt s(dEt det) {
        eUn eun = new eUn(det);
        eun.f3110R = new opD(det.f2534R.X(), det.f2534R.c());
        return eun.R();
    }

    public static final Class t(fUt fut) {
        Class R2 = ((f2) fut).R();
        if (!R2.isPrimitive()) {
            return R2;
        }
        String name = R2.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? R2 : Double.class;
            case 104431:
                return !name.equals("int") ? R2 : Integer.class;
            case 3039496:
                return !name.equals("byte") ? R2 : Byte.class;
            case 3052374:
                return !name.equals("char") ? R2 : Character.class;
            case 3327612:
                return !name.equals("long") ? R2 : Long.class;
            case 3625364:
                return !name.equals("void") ? R2 : Void.class;
            case 64711720:
                return !name.equals("boolean") ? R2 : Boolean.class;
            case 97526364:
                return !name.equals("float") ? R2 : Float.class;
            case 109413500:
                return !name.equals("short") ? R2 : Short.class;
            default:
                return R2;
        }
    }

    public static long u(long j) {
        short s = (short) ((int) (j & 65535));
        short s2 = (short) ((int) ((j >>> 16) & 65535));
        short s3 = (short) (s + s2);
        short s4 = (short) (s2 ^ s);
        return ((((long) ((short) ((s4 >>> 22) | (s4 << 10)))) | (((long) ((short) (((short) ((s3 >>> 23) | (s3 << 9))) + s))) << 16)) << 16) | ((long) ((short) (((short) (((short) ((s << 13) | (s >>> 19))) ^ s4)) ^ (s4 << 5))));
    }

    public static final void v(int i, m88 m88, int i2) {
        int i3;
        jr_ jr_;
        jr_ jr_2 = (jr_) m88;
        jr_2.q(-266856095);
        if ((i2 & 14) == 0) {
            i3 = (jr_2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) != 2 || !jr_2.J()) {
            jr_ = jr_2;
            g1c.c(dtx.h(i, jr_2), adU.X(aH9.zw(aff.R, 0.0f, (float) 64, 0.0f, 0.0f, 13)), 0, 0, null, null, null, 0, null, new pvy(3), 0, 0, false, 0, null, kMk.R(((c_P) jr_2.x(dB8.R)).c, 0, 0, lIe.X, 262139), jr_, 48, 0, 32252);
        } else {
            jr_2.E();
            jr_ = jr_2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new mCj(i, i2, 2);
        }
    }

    public static boolean y(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        if (file.isFile()) {
            return file.delete();
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return true;
        }
        for (File file2 : listFiles) {
            if (!y(file2)) {
                return false;
            }
        }
        return file.delete();
    }

    public abstract void A(w8 w8Var, w8 w8Var2);

    public max H() {
        return new max(this, 1);
    }

    public abstract Object I();

    public max K() {
        return new max(this, 0);
    }

    public abstract boolean N(az azVar, WQ wq, WQ wq2);

    public abstract boolean P(az azVar, Object obj, Object obj2);

    public abstract void S(w8 w8Var, Thread thread);

    public abstract void Z(kK5 kk5, Object obj);

    public abstract boolean j(az azVar, w8 w8Var, w8 w8Var2);

    public abstract boolean n();

    public abstract View z(int i);

    public /* synthetic */ pdD(int i) {
    }
}
