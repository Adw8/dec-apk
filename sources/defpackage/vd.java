package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.d;
import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.main.MainViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.PortForwardViewModel;
import java.io.IOException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: vd  reason: default package */
/* loaded from: classes.dex */
public abstract class vd {

    /* renamed from: R  reason: collision with other field name */
    public static final aOO[] f7443R = new aOO[0];
    public static final int[] R = new int[0];

    /* renamed from: R  reason: collision with other field name */
    public static final Object[] f7444R = new Object[0];

    public static void A(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00a0, code lost:
        if (r7 >= r0) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String C(defpackage.b r9) {
        /*
            java.lang.String r9 = Q(r9)
            int r0 = r9.length()
            r1 = 1
            r2 = 0
            if (r0 <= 0) goto L_0x0062
            char r0 = r9.charAt(r2)
            r3 = 35
            if (r0 != r3) goto L_0x0062
            int r0 = r9.length()     // Catch: IOException -> 0x004a
            int r0 = r0 - r1
            mF9 r3 = defpackage.kPv.R     // Catch: Exception -> 0x002e
            byte[] r0 = r3.R(r0, r9)     // Catch: Exception -> 0x002e
            O r0 = defpackage.O.I(r0)     // Catch: IOException -> 0x004a
            boolean r3 = r0 instanceof defpackage.SF
            if (r3 == 0) goto L_0x0062
            SF r0 = (defpackage.SF) r0
            java.lang.String r9 = r0.c()
            goto L_0x0062
        L_0x002e:
            r9 = move-exception
            _ r0 = new _     // Catch: IOException -> 0x004a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: IOException -> 0x004a
            r2.<init>()     // Catch: IOException -> 0x004a
            java.lang.String r3 = "exception decoding Hex string: "
            r2.append(r3)     // Catch: IOException -> 0x004a
            java.lang.String r3 = r9.getMessage()     // Catch: IOException -> 0x004a
            r2.append(r3)     // Catch: IOException -> 0x004a
            java.lang.String r2 = r2.toString()     // Catch: IOException -> 0x004a
            r0.<init>(r1, r2, r9)     // Catch: IOException -> 0x004a
            throw r0     // Catch: IOException -> 0x004a
        L_0x004a:
            r9 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unknown encoding in name: "
            r1.append(r2)
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            r0.<init>(r9)
            throw r0
        L_0x0062:
            java.lang.String r9 = defpackage.aPR.c(r9)
            int r0 = r9.length()
            r3 = 2
            if (r0 >= r3) goto L_0x006f
            goto L_0x00d5
        L_0x006f:
            int r0 = r0 - r1
            r3 = r2
        L_0x0071:
            r4 = 92
            r5 = 32
            if (r3 >= r0) goto L_0x0088
            char r6 = r9.charAt(r3)
            if (r6 != r4) goto L_0x0088
            int r6 = r3 + 1
            char r6 = r9.charAt(r6)
            if (r6 != r5) goto L_0x0088
            int r3 = r3 + 2
            goto L_0x0071
        L_0x0088:
            int r6 = r3 + 1
            r7 = r0
        L_0x008b:
            if (r7 <= r6) goto L_0x009e
            int r8 = r7 + -1
            char r8 = r9.charAt(r8)
            if (r8 != r4) goto L_0x009e
            char r8 = r9.charAt(r7)
            if (r8 != r5) goto L_0x009e
            int r7 = r7 + -2
            goto L_0x008b
        L_0x009e:
            if (r3 > 0) goto L_0x00a2
            if (r7 >= r0) goto L_0x00a7
        L_0x00a2:
            int r7 = r7 + r1
            java.lang.String r9 = r9.substring(r3, r7)
        L_0x00a7:
            java.lang.String r0 = "  "
            int r0 = r9.indexOf(r0)
            if (r0 >= 0) goto L_0x00b0
            goto L_0x00d5
        L_0x00b0:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            char r2 = r9.charAt(r2)
            r0.append(r2)
        L_0x00bc:
            int r3 = r9.length()
            if (r1 >= r3) goto L_0x00d1
            char r3 = r9.charAt(r1)
            if (r2 != r5) goto L_0x00ca
            if (r3 == r5) goto L_0x00ce
        L_0x00ca:
            r0.append(r3)
            r2 = r3
        L_0x00ce:
            int r1 = r1 + 1
            goto L_0x00bc
        L_0x00d1:
            java.lang.String r9 = r0.toString()
        L_0x00d5:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd.C(b):java.lang.String");
    }

    public static int H(int i, int i2, int[] iArr) {
        int i3 = i - 1;
        int i4 = 0;
        while (i4 <= i3) {
            int i5 = (i4 + i3) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i4 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i3 = i5 - 1;
            }
        }
        return ~i4;
    }

    public static final void I(Context context, String str, String str2) {
        Intent intent = new Intent(str);
        if (str2 != null) {
            intent.putExtra(":settings:fragment_args_key", str2);
            Bundle bundle = new Bundle();
            bundle.putString(":settings:fragment_args_key", str2);
            intent.putExtra(":settings:show_fragment_args", bundle);
        }
        intent.setData(Uri.fromParts("package", context.getPackageName(), null));
        context.startActivity(intent);
    }

    public static boolean J(View view) {
        WeakHashMap weakHashMap = of5.f6887R;
        return eHQ.e(view) == 1;
    }

    public static boolean K(int i) {
        boolean z;
        if (i != 0) {
            ThreadLocal threadLocal = B7.R;
            double[] dArr = (double[]) threadLocal.get();
            if (dArr == null) {
                dArr = new double[3];
                threadLocal.set(dArr);
            }
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            if (dArr.length == 3) {
                double d = ((double) red) / 255.0d;
                double pow = d < 0.04045d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
                double d2 = ((double) green) / 255.0d;
                double pow2 = d2 < 0.04045d ? d2 / 12.92d : Math.pow((d2 + 0.055d) / 1.055d, 2.4d);
                double d3 = ((double) blue) / 255.0d;
                double pow3 = d3 < 0.04045d ? d3 / 12.92d : Math.pow((d3 + 0.055d) / 1.055d, 2.4d);
                z = false;
                dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
                double d4 = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
                dArr[1] = d4;
                dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
                if (d4 / 100.0d > 0.5d) {
                    return true;
                }
            } else {
                throw new IllegalArgumentException("outXyz must have a length of 3.");
            }
        } else {
            z = false;
        }
        return z;
    }

    public static final void L(MainViewModel mainViewModel, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-1699658561);
        if (((Boolean) mainViewModel.f2754R.getValue()).booleanValue()) {
            mxC.R(mainViewModel, jr_, 8);
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new ifm(mainViewModel, i, 1);
        }
    }

    public static byte[] N(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr, 32);
            int i = 0;
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b = (byte) (copyOf[31] & Byte.MAX_VALUE);
            copyOf[31] = b;
            copyOf[31] = (byte) (b | 64);
            if (bArr2.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr2, bArr2.length);
                copyOf2[31] = (byte) (copyOf2[31] & Byte.MAX_VALUE);
                int i2 = 0;
                while (true) {
                    byte[][] bArr3 = mjG.f6136R;
                    if (i2 >= 7) {
                        long[] jArr2 = new long[10];
                        for (int i3 = 0; i3 < 10; i3++) {
                            int i4 = mLz.f6004R[i3];
                            jArr2[i3] = (((((long) (copyOf2[i4 + 3] & 255)) << 24) | ((((long) (copyOf2[i4] & 255)) | (((long) (copyOf2[i4 + 1] & 255)) << 8)) | (((long) (copyOf2[i4 + 2] & 255)) << 16))) >> mLz.v[i3]) & ((long) mLz.c[i3 & 1]);
                        }
                        long[] jArr3 = new long[19];
                        long[] jArr4 = new long[19];
                        jArr4[0] = 1;
                        long[] jArr5 = new long[19];
                        jArr5[0] = 1;
                        long[] jArr6 = new long[19];
                        long[] jArr7 = new long[19];
                        long[] jArr8 = new long[19];
                        jArr8[0] = 1;
                        long[] jArr9 = new long[19];
                        long[] jArr10 = new long[19];
                        jArr10[0] = 1;
                        System.arraycopy(jArr2, 0, jArr3, 0, 10);
                        long[] jArr11 = jArr4;
                        long[] jArr12 = jArr3;
                        int i5 = 10;
                        int i6 = 0;
                        while (i < 32) {
                            int i7 = copyOf[(32 - i) - 1] & 255;
                            int i8 = 8;
                            while (i6 < i8) {
                                int i9 = (i7 >> (7 - i6)) & 1;
                                mjG.H(jArr5, jArr12, i9);
                                mjG.H(jArr6, jArr11, i9);
                                long[] copyOf3 = Arrays.copyOf(jArr5, i5);
                                long[] jArr13 = new long[19];
                                long[] jArr14 = new long[19];
                                long[] jArr15 = new long[19];
                                long[] jArr16 = new long[19];
                                long[] jArr17 = new long[19];
                                long[] jArr18 = new long[19];
                                long[] jArr19 = new long[19];
                                mLz.J(jArr5, jArr5, jArr6);
                                mLz.K(jArr6, copyOf3, jArr6);
                                long[] copyOf4 = Arrays.copyOf(jArr12, 10);
                                mLz.J(jArr12, jArr12, jArr11);
                                mLz.K(jArr11, copyOf4, jArr11);
                                mLz.C(jArr16, jArr12, jArr6);
                                mLz.C(jArr17, jArr5, jArr11);
                                mLz.g(jArr16);
                                mLz.j(jArr16);
                                mLz.g(jArr17);
                                mLz.j(jArr17);
                                System.arraycopy(jArr16, 0, copyOf4, 0, 10);
                                mLz.J(jArr16, jArr16, jArr17);
                                mLz.K(jArr17, copyOf4, jArr17);
                                mLz.o(jArr19, jArr16);
                                mLz.o(jArr18, jArr17);
                                mLz.C(jArr17, jArr18, jArr2);
                                mLz.g(jArr17);
                                mLz.j(jArr17);
                                System.arraycopy(jArr19, 0, jArr7, 0, 10);
                                System.arraycopy(jArr17, 0, jArr8, 0, 10);
                                mLz.o(jArr14, jArr5);
                                mLz.o(jArr15, jArr6);
                                mLz.C(jArr9, jArr14, jArr15);
                                mLz.g(jArr9);
                                mLz.j(jArr9);
                                mLz.K(jArr15, jArr14, jArr15);
                                Arrays.fill(jArr13, 10, 18, 0L);
                                int i10 = 0;
                                for (int i11 = 10; i10 < i11; i11 = 10) {
                                    jArr13[i10] = jArr15[i10] * 121665;
                                    i10++;
                                }
                                mLz.j(jArr13);
                                mLz.J(jArr13, jArr13, jArr14);
                                mLz.C(jArr10, jArr15, jArr13);
                                mLz.g(jArr10);
                                mLz.j(jArr10);
                                mjG.H(jArr9, jArr7, i9);
                                mjG.H(jArr10, jArr8, i9);
                                i6++;
                                i5 = 10;
                                i8 = 8;
                                jArr10 = jArr6;
                                jArr12 = jArr7;
                                jArr11 = jArr8;
                                i7 = i7;
                                i = i;
                                jArr7 = jArr12;
                                jArr6 = jArr10;
                                jArr8 = jArr11;
                                jArr = jArr;
                                jArr9 = jArr5;
                                jArr5 = jArr9;
                            }
                            i++;
                            i6 = 0;
                            i5 = 10;
                            copyOf = copyOf;
                        }
                        long[] jArr20 = new long[i5];
                        long[] jArr21 = new long[i5];
                        long[] jArr22 = new long[i5];
                        long[] jArr23 = new long[i5];
                        long[] jArr24 = new long[i5];
                        long[] jArr25 = new long[i5];
                        long[] jArr26 = new long[i5];
                        long[] jArr27 = new long[i5];
                        long[] jArr28 = new long[i5];
                        long[] jArr29 = new long[i5];
                        long[] jArr30 = new long[i5];
                        mLz.o(jArr21, jArr6);
                        mLz.o(jArr30, jArr21);
                        mLz.o(jArr29, jArr30);
                        mLz.U(jArr22, jArr29, jArr6);
                        mLz.U(jArr23, jArr22, jArr21);
                        mLz.o(jArr29, jArr23);
                        mLz.U(jArr24, jArr29, jArr22);
                        mLz.o(jArr29, jArr24);
                        mLz.o(jArr30, jArr29);
                        mLz.o(jArr29, jArr30);
                        mLz.o(jArr30, jArr29);
                        mLz.o(jArr29, jArr30);
                        mLz.U(jArr25, jArr29, jArr24);
                        mLz.o(jArr29, jArr25);
                        mLz.o(jArr30, jArr29);
                        for (int i12 = 2; i12 < 10; i12 += 2) {
                            mLz.o(jArr29, jArr30);
                            mLz.o(jArr30, jArr29);
                        }
                        mLz.U(jArr26, jArr30, jArr25);
                        mLz.o(jArr29, jArr26);
                        mLz.o(jArr30, jArr29);
                        for (int i13 = 2; i13 < 20; i13 += 2) {
                            mLz.o(jArr29, jArr30);
                            mLz.o(jArr30, jArr29);
                        }
                        mLz.U(jArr29, jArr30, jArr26);
                        mLz.o(jArr30, jArr29);
                        mLz.o(jArr29, jArr30);
                        for (int i14 = 2; i14 < 10; i14 += 2) {
                            mLz.o(jArr30, jArr29);
                            mLz.o(jArr29, jArr30);
                        }
                        mLz.U(jArr27, jArr29, jArr25);
                        mLz.o(jArr29, jArr27);
                        mLz.o(jArr30, jArr29);
                        for (int i15 = 2; i15 < 50; i15 += 2) {
                            mLz.o(jArr29, jArr30);
                            mLz.o(jArr30, jArr29);
                        }
                        mLz.U(jArr28, jArr30, jArr27);
                        mLz.o(jArr30, jArr28);
                        mLz.o(jArr29, jArr30);
                        for (int i16 = 2; i16 < 100; i16 += 2) {
                            mLz.o(jArr30, jArr29);
                            mLz.o(jArr29, jArr30);
                        }
                        mLz.U(jArr30, jArr29, jArr28);
                        mLz.o(jArr29, jArr30);
                        mLz.o(jArr30, jArr29);
                        for (int i17 = 2; i17 < 50; i17 += 2) {
                            mLz.o(jArr29, jArr30);
                            mLz.o(jArr30, jArr29);
                        }
                        mLz.U(jArr29, jArr30, jArr27);
                        mLz.o(jArr30, jArr29);
                        mLz.o(jArr29, jArr30);
                        mLz.o(jArr30, jArr29);
                        mLz.o(jArr29, jArr30);
                        mLz.o(jArr30, jArr29);
                        mLz.U(jArr20, jArr30, jArr23);
                        mLz.U(jArr, jArr5, jArr20);
                        long[] jArr31 = new long[10];
                        long[] jArr32 = new long[10];
                        long[] jArr33 = new long[11];
                        long[] jArr34 = new long[11];
                        long[] jArr35 = new long[11];
                        mLz.U(jArr31, jArr2, jArr);
                        mLz.J(jArr32, jArr2, jArr);
                        long[] jArr36 = new long[10];
                        jArr36[0] = 486662;
                        mLz.J(jArr34, jArr32, jArr36);
                        mLz.U(jArr34, jArr34, jArr11);
                        mLz.J(jArr34, jArr34, jArr12);
                        mLz.U(jArr34, jArr34, jArr31);
                        mLz.U(jArr34, jArr34, jArr12);
                        for (int i18 = 0; i18 < 10; i18++) {
                            jArr33[i18] = jArr34[i18] * 4;
                        }
                        mLz.j(jArr33);
                        mLz.U(jArr34, jArr31, jArr11);
                        mLz.K(jArr34, jArr34, jArr11);
                        mLz.U(jArr35, jArr32, jArr12);
                        mLz.J(jArr34, jArr34, jArr35);
                        mLz.o(jArr34, jArr34);
                        if (cpc.Y(mLz.X(jArr33), mLz.X(jArr34))) {
                            return mLz.X(jArr);
                        }
                        StringBuilder U = opT.U("Arithmetic error in curve multiplication with the public key: ");
                        U.append(lTs.L(bArr2));
                        throw new IllegalStateException(U.toString());
                    } else if (!cpc.Y(bArr3[i2], copyOf2)) {
                        i2++;
                    } else {
                        StringBuilder U2 = opT.U("Banned public key: ");
                        U2.append(lTs.L(bArr3[i2]));
                        throw new InvalidKeyException(U2.toString());
                    }
                }
            } else {
                throw new InvalidKeyException("Public key length is not 32-byte");
            }
        } else {
            throw new InvalidKeyException("Private key must have 32 bytes.");
        }
    }

    public static final void O(mpr mpr, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-554584199);
        aff aff = aff.R;
        ncu zw = aH9.zw(adU.f942R, 0.0f, (float) 64, 0.0f, 0.0f, 13);
        xt L = nA.L((float) 24);
        vV vVVar = dq.f2893v;
        jr_.w(-483455358);
        bF9 R2 = VA.R(L, vVVar, jr_);
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
            l6.p(jr_, R2, igT.c);
            l6.p(jr_, jjj, igT.v);
            l6.p(jr_, mdz, igT.e);
            jQ.o(0, b, jQ.m(jr_, buo, igT.X, jr_), jr_, 2058660585, -1163856341);
            gQc.X(iTI.g(R.drawable.illust_not_found, jr_), null, adU.H(aff, (float) 256), null, null, 0.0f, null, jr_, 440, 120);
            g1c.c("No forwarded ports", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_.x(dB8.R)).L, jr_, 6, 0, 32766);
            R(null, "Add port", false, new gVU(mpr, 5), jr_, 48, 5);
            jQ.K(jr_, false, false, true, false);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new izD(mpr, i, 1);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static int P(char c) {
        if ('0' <= c && c <= '9') {
            return c - '0';
        }
        return (('a' > c || c > 'f') ? c - 'A' : c - 'a') + 10;
    }

    public static String Q(b bVar) {
        StringBuffer stringBuffer = new StringBuffer();
        int i = 0;
        if (!(bVar instanceof SF) || (bVar instanceof kRc)) {
            try {
                stringBuffer.append('#');
                byte[] V = bVar.v().V();
                mF9 mf9 = kPv.R;
                stringBuffer.append(aPR.R(kPv.R(V, V.length)));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Other value has no encoded form");
            }
        } else {
            String c = ((SF) bVar).c();
            if (c.length() > 0 && c.charAt(0) == '#') {
                stringBuffer.append('\\');
            }
            stringBuffer.append(c);
        }
        int length = stringBuffer.length();
        int i2 = 2;
        if (!(stringBuffer.length() >= 2 && stringBuffer.charAt(0) == '\\' && stringBuffer.charAt(1) == '#')) {
            i2 = 0;
        }
        while (i2 != length) {
            char charAt = stringBuffer.charAt(i2);
            if (!(charAt == '\"' || charAt == '\\' || charAt == '+' || charAt == ',')) {
                switch (charAt) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        break;
                    default:
                        i2++;
                        continue;
                }
            }
            stringBuffer.insert(i2, "\\");
            i2 += 2;
            length++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.length() > i && stringBuffer.charAt(i) == ' ') {
                stringBuffer.insert(i, "\\");
                i += 2;
            }
        }
        int length2 = stringBuffer.length() - 1;
        while (length2 >= i && stringBuffer.charAt(length2) == ' ') {
            stringBuffer.insert(length2, '\\');
            length2--;
        }
        return stringBuffer.toString();
    }

    /* JADX WARNING: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void R(defpackage.ncu r19, java.lang.String r20, boolean r21, defpackage.f_c r22, defpackage.m88 r23, int r24, int r25) {
        /*
        // Method dump skipped, instructions count: 224
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd.R(ncu, java.lang.String, boolean, f_c, m88, int, int):void");
    }

    public static int U(long[] jArr, int i, long j) {
        int i2 = i - 1;
        int i3 = 0;
        while (i3 <= i2) {
            int i4 = (i3 + i2) >>> 1;
            int i5 = (jArr[i4] > j ? 1 : (jArr[i4] == j ? 0 : -1));
            if (i5 < 0) {
                i3 = i4 + 1;
            } else if (i5 <= 0) {
                return i4;
            } else {
                i2 = i4 - 1;
            }
        }
        return ~i3;
    }

    public static h89 V(View view) {
        ViewGroup i = i(view);
        if (i == null) {
            return null;
        }
        return new h89(i, 0);
    }

    public static final void X(ForwardedPort forwardedPort, PortForwardViewModel portForwardViewModel, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-635989855);
        dTl.e(null, null, n3x.X(((n3) jr_.x(kft.R)).f6279R, jr_, 32768, 13), null, null, aH9.I(jr_, 2000713747, new ezT((dM_) d7V.f2502R.get(forwardedPort.f2732R), forwardedPort, portForwardViewModel, 3)), jr_, 196608, 27);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(forwardedPort, portForwardViewModel, i, 18);
        }
    }

    public static int Y(int i, int i2, float f) {
        return B7.v(B7.c(i2, Math.round(((float) Color.alpha(i2)) * f)), i);
    }

    public static final void Z(PortForwardViewModel portForwardViewModel, mpr mpr, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-1757369775);
        hDC.v("Port forwarding", mpr, null, aH9.I(jr_, 291320846, new x9(9, mpr)), null, aH9.I(jr_, 1581174909, new ezT(mpr, portForwardViewModel, biy.m(portForwardViewModel.f2774R, jr_), 4)), jr_, 199750, 20);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(portForwardViewModel, mpr, i, 19);
        }
    }

    public static final void c(ncu ncu, String str, T_ t_, ngd ngd, f_c f_c, m88 m88, int i, int i2) {
        int i3;
        ncu ncu2;
        T_ t_2;
        ngd ngd2;
        ngd ngd3;
        T_ t_3;
        ncu ncu3;
        ngd ngd4;
        T_ t_4;
        int i4;
        int i5;
        jr_ jr_ = (jr_) m88;
        jr_.q(-372198549);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            ncu2 = ncu;
        } else if ((i & 14) == 0) {
            ncu2 = ncu;
            i3 = (jr_.O(ncu2) ? 4 : 2) | i;
        } else {
            ncu2 = ncu;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= jr_.O(str) ? 32 : 16;
        }
        if ((i & 896) == 0) {
            if ((i2 & 4) == 0) {
                t_2 = t_;
                if (jr_.O(t_2)) {
                    i5 = 256;
                    i3 |= i5;
                }
            } else {
                t_2 = t_;
            }
            i5 = 128;
            i3 |= i5;
        } else {
            t_2 = t_;
        }
        if ((i & 7168) == 0) {
            if ((i2 & 8) == 0) {
                ngd2 = ngd;
                if (jr_.O(ngd2)) {
                    i4 = 2048;
                    i3 |= i4;
                }
            } else {
                ngd2 = ngd;
            }
            i4 = 1024;
            i3 |= i4;
        } else {
            ngd2 = ngd;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 57344) == 0) {
            i3 |= jr_.O(f_c) ? 16384 : 8192;
        }
        if ((46811 & i3) != 9362 || !jr_.J()) {
            jr_.a();
            if ((i & 1) == 0 || jr_.K()) {
                ncu3 = i6 != 0 ? aff.R : ncu2;
                if ((i2 & 4) != 0) {
                    t_4 = Al.R(jr_);
                    i3 &= -897;
                } else {
                    t_4 = t_2;
                }
                if ((i2 & 8) != 0) {
                    ngd4 = Al.f4R;
                    i3 &= -7169;
                    jr_.y();
                    msU.c(f_c, ncu3, false, null, t_4, null, null, ngd4, null, aH9.I(jr_, 77430873, new YJ(str, i3, 2)), jr_, 805306368 | ((i3 >> 12) & 14) | ((i3 << 3) & 112) | (57344 & (i3 << 6)) | ((i3 << 12) & 29360128), 364);
                    t_3 = t_4;
                    ngd3 = ngd4;
                }
            } else {
                jr_.E();
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                ncu3 = ncu2;
                t_4 = t_2;
            }
            ngd4 = ngd2;
            jr_.y();
            msU.c(f_c, ncu3, false, null, t_4, null, null, ngd4, null, aH9.I(jr_, 77430873, new YJ(str, i3, 2)), jr_, 805306368 | ((i3 >> 12) & 14) | ((i3 << 3) & 112) | (57344 & (i3 << 6)) | ((i3 << 12) & 29360128), 364);
            t_3 = t_4;
            ngd3 = ngd4;
        } else {
            jr_.E();
            ncu3 = ncu2;
            t_3 = t_2;
            ngd3 = ngd2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new p9(ncu3, str, t_3, ngd3, f_c, i, i2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void e(java.lang.String r27, java.lang.String r28, defpackage.iv7 r29, defpackage.m88 r30, int r31, int r32) {
        /*
        // Method dump skipped, instructions count: 211
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vd.e(java.lang.String, java.lang.String, iv7, m88, int, int):void");
    }

    public static kJe g(d dVar, hv5 hv5) {
        jsT R2 = ((ktS) ((haQ) hDC.C(haQ.class, dVar))).R();
        if (dVar.getIntent() != null) {
            dVar.getIntent().getExtras();
        }
        hv5.getClass();
        return new kJe((Set) R2.R, hv5, (pkd) R2.v);
    }

    public static Typeface h(Configuration configuration, Typeface typeface) {
        int i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        return Typeface.create(typeface, iTI.X(typeface.getWeight() + configuration.fontWeightAdjustment, 1, 1000), typeface.isItalic());
    }

    public static ViewGroup i(View view) {
        if (view == null) {
            return null;
        }
        View rootView = view.getRootView();
        ViewGroup viewGroup = (ViewGroup) rootView.findViewById(16908290);
        if (viewGroup != null) {
            return viewGroup;
        }
        if (rootView == view || !(rootView instanceof ViewGroup)) {
            return null;
        }
        return (ViewGroup) rootView;
    }

    public static byte[] j() {
        byte[] R2 = opU.R(32);
        R2[0] = (byte) (R2[0] | 7);
        byte b = (byte) (R2[31] & 63);
        R2[31] = b;
        R2[31] = (byte) (b | 128);
        return R2;
    }

    public static void m(StringBuffer stringBuffer, Bk bk, Hashtable hashtable) {
        String str = (String) hashtable.get(bk.f43R);
        if (str == null) {
            str = bk.f43R.f7421R;
        }
        stringBuffer.append(str);
        stringBuffer.append('=');
        stringBuffer.append(Q(bk.R));
    }

    public static String n(String str) {
        int i;
        if (str.length() == 0 || (str.indexOf(92) < 0 && str.indexOf(34) < 0)) {
            return str.trim();
        }
        char[] charArray = str.toCharArray();
        StringBuffer stringBuffer = new StringBuffer(str.length());
        if (charArray[0] == '\\' && charArray[1] == '#') {
            i = 2;
            stringBuffer.append("\\#");
        } else {
            i = 0;
        }
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        char c = 0;
        while (i != charArray.length) {
            char c2 = charArray[i];
            if (c2 != ' ') {
                z3 = true;
            }
            if (c2 != '\"') {
                if (c2 == '\\' && !z && !z2) {
                    i2 = stringBuffer.length();
                    z = true;
                } else if (c2 != ' ' || z || z3) {
                    if (z) {
                        if (('0' <= c2 && c2 <= '9') || ('a' <= c2 && c2 <= 'f') || ('A' <= c2 && c2 <= 'F')) {
                            if (c != 0) {
                                stringBuffer.append((char) (P(c2) + (P(c) * 16)));
                                z = false;
                                c = 0;
                            } else {
                                c = c2;
                            }
                        }
                    }
                }
                i++;
            } else if (!z) {
                z2 = !z2;
                z = false;
                i++;
            }
            stringBuffer.append(c2);
            z = false;
            i++;
        }
        if (stringBuffer.length() > 0) {
            while (stringBuffer.charAt(stringBuffer.length() - 1) == ' ' && i2 != stringBuffer.length() - 1) {
                stringBuffer.setLength(stringBuffer.length() - 1);
            }
        }
        return stringBuffer.toString();
    }

    public static kJe o(pm2 pm2, hv5 hv5) {
        jsT R2 = ((mGN) ((nZw) hDC.C(nZw.class, pm2))).f5988R.R();
        Bundle bundle = pm2.c;
        hv5.getClass();
        return new kJe((Set) R2.R, hv5, (pkd) R2.v);
    }

    public static int t(View view, int i) {
        Context context = view.getContext();
        TypedValue r = hDC.r(i, view.getContext(), view.getClass().getCanonicalName());
        int i2 = r.resourceId;
        if (i2 == 0) {
            return r.data;
        }
        Object obj = C1.R;
        return dmD.R(context, i2);
    }

    public static PorterDuff.Mode u(int i, PorterDuff.Mode mode) {
        if (i == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    public static final void v(ncu ncu, String str, f_c f_c, m88 m88, int i, int i2) {
        int i3;
        ncu ncu2;
        ncu ncu3;
        jr_ jr_ = (jr_) m88;
        jr_.q(513162165);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            ncu2 = ncu;
        } else if ((i & 14) == 0) {
            ncu2 = ncu;
            i3 = (jr_.O(ncu2) ? 4 : 2) | i;
        } else {
            ncu2 = ncu;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= jr_.O(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= jr_.O(f_c) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !jr_.J()) {
            ncu3 = i4 != 0 ? aff.R : ncu2;
            msU.O(f_c, ncu3, false, null, null, null, null, null, null, aH9.I(jr_, -1265827048, new YJ(str, i3, 1)), jr_, 805306368 | ((i3 >> 6) & 14) | ((i3 << 3) & 112), 508);
        } else {
            jr_.E();
            ncu3 = ncu2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new iW6(ncu3, str, f_c, i, i2);
        }
    }

    public static final void x(int i, pm2 pm2) {
        pm2.X().f6117R = new exj(i, true);
        pm2.X().f6121c = new exj(i, true);
        pm2.X().f6123v = new exj(0, false);
        pm2.X().f6122e = new exj(0, false);
    }

    public static int y(Context context, int i, int i2) {
        TypedValue W = hDC.W(context, i);
        if (W == null) {
            return i2;
        }
        int i3 = W.resourceId;
        if (i3 == 0) {
            return W.data;
        }
        Object obj = C1.R;
        return dmD.R(context, i3);
    }

    public static byte[] z(byte[] bArr) {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return N(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
