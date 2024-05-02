package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.hardware.usb.UsbDevice;
import android.net.Uri;
import android.os.Bundle;
import android.util.Base64;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import androidx.lifecycle.ProcessLifecycleOwner;
import androidx.lifecycle.SavedStateHandleAttacher;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.main.MainViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.usb.UsbViewModel;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: mxC  reason: default package */
/* loaded from: classes.dex */
public abstract class mxC {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public static final iNr f6245R;

    /* renamed from: R  reason: collision with other field name */
    public static Thread f6246R;
    public static final lmI c;
    public static final lmI e;
    public static final iNr v;

    /* renamed from: R  reason: collision with other field name */
    public static final lmI f6247R = new lmI("RESUME_TOKEN");

    /* renamed from: v  reason: collision with other field name */
    public static final lmI f6250v = new lmI("UNLOCK_FAIL");

    /* renamed from: R  reason: collision with other field name */
    public static final ppN f6248R = new ppN();

    /* renamed from: v  reason: collision with other field name */
    public static final ppN f6251v = new ppN();

    /* renamed from: c  reason: collision with other field name */
    public static final ppN f6249c = new ppN();

    static {
        lmI lmi = new lmI("LOCKED");
        c = lmi;
        lmI lmi2 = new lmI("UNLOCKED");
        e = lmi2;
        f6245R = new iNr(lmi);
        v = new iNr(lmi2);
    }

    public static void A(byte[] bArr, aiw aiw, exD exd, long j, int i, long j2) {
        InputStream X;
        int i2 = i;
        if (i2 < 0) {
            throw new IOException("copyLength negative");
        } else if (j >= 0) {
            long j3 = (long) i2;
            if (j3 <= j2) {
                try {
                    bu7 bu7 = new bu7(aiw, j, j3);
                    synchronized (bu7) {
                        X = bu7.X(0, bu7.v - bu7.R);
                    }
                    while (i2 > 0) {
                        int min = Math.min(i2, 16384);
                        int i3 = 0;
                        while (i3 < min) {
                            int read = X.read(bArr, i3, min - i3);
                            if (read != -1) {
                                i3 += read;
                            } else {
                                throw new IOException("truncated input stream");
                            }
                        }
                        exd.write(bArr, 0, min);
                        i2 -= min;
                    }
                    X.close();
                } catch (EOFException e2) {
                    throw new IOException("patch underrun", e2);
                }
            } else {
                throw new IOException("Output length overrun");
            }
        } else {
            throw new IOException("inputOffset negative");
        }
    }

    public static final void C(adL adl) {
        iMP imp = adl.O().f5900R;
        if (!(imp == iMP.INITIALIZED || imp == iMP.CREATED)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        } else if (adl.c().v() == null) {
            ahX ahx = new ahX(adl.c(), (ly1) adl);
            adl.c().c("androidx.lifecycle.internal.SavedStateHandlesProvider", ahx);
            adl.O().R(new SavedStateHandleAttacher(ahx));
        }
    }

    public static final nmx H(o0y o0y) {
        adL adl = (adL) o0y.R(f6248R);
        if (adl != null) {
            ly1 ly1 = (ly1) o0y.R(f6251v);
            if (ly1 != null) {
                Bundle bundle = (Bundle) o0y.R(f6249c);
                String str = (String) o0y.R(dq.U);
                if (str != null) {
                    kod v2 = adl.c().v();
                    ahX ahx = v2 instanceof ahX ? (ahX) v2 : null;
                    if (ahx != null) {
                        avO P = P(ly1);
                        nmx nmx = (nmx) P.R.get(str);
                        if (nmx != null) {
                            return nmx;
                        }
                        Class[] clsArr = nmx.R;
                        boolean z = true;
                        if (!ahx.f981R) {
                            ahx.R = ahx.f980R.R("androidx.lifecycle.internal.SavedStateHandlesProvider");
                            ahx.f981R = true;
                            avO avo = (avO) ahx.f979R.getValue();
                        }
                        Bundle bundle2 = ahx.R;
                        Bundle bundle3 = bundle2 != null ? bundle2.getBundle(str) : null;
                        Bundle bundle4 = ahx.R;
                        if (bundle4 != null) {
                            bundle4.remove(str);
                        }
                        Bundle bundle5 = ahx.R;
                        z = false;
                        if (bundle5 == null || !bundle5.isEmpty()) {
                        }
                        if (z) {
                            ahx.R = null;
                        }
                        nmx y = dq.y(bundle3, bundle);
                        P.R.put(str, y);
                        return y;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static void I(int i, long j, byte[] bArr) {
        int i2 = 0;
        while (i2 < 4) {
            bArr[i + i2] = (byte) ((int) (255 & j));
            i2++;
            j >>= 8;
        }
    }

    public static final void J(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException | SecurityException unused) {
        }
    }

    public static void K(Context context) {
        String packageName = context.getPackageName();
        J(context, "https://play.google.com/store/apps/details?id=" + packageName);
    }

    public static final void L(UsbViewModel usbViewModel, mpr mpr, kg9 kg9, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-333836893);
        hDC.v("USB devices", mpr, null, null, null, aH9.I(jr_, 1973659343, new baP(mpr, usbViewModel, kg9, i, biy.m(usbViewModel.f2789R, jr_), 1)), jr_, 196678, 28);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new dR(usbViewModel, mpr, kg9, i, 12);
        }
    }

    public static final LifecycleCoroutineScopeImpl N() {
        return gQc.Q(ProcessLifecycleOwner.R);
    }

    public static final void O(mpr mpr, m88 m88, int i) {
        jr_ jr_;
        jr_ jr_2 = (jr_) m88;
        jr_2.q(1958937528);
        if ((i & 1) != 0 || !jr_2.J()) {
            aff aff = aff.R;
            ncu zw = aH9.zw(adU.f942R, 0.0f, (float) 64, 0.0f, 0.0f, 13);
            xt L = nA.L((float) 24);
            vV vVVar = dq.f2893v;
            jr_2.w(-483455358);
            bF9 R2 = VA.R(L, vVVar, jr_2);
            jr_2.w(-1323940314);
            jJj jjj = (jJj) jr_2.x(lnF.X);
            mdz mdz = (mdz) jr_2.x(lnF.H);
            bUo buo = (bUo) jr_2.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(zw);
            if (jr_2.f5052R instanceof Su) {
                jr_2.mL();
                if (jr_2.f5050L) {
                    jr_2.H(fme);
                } else {
                    jr_2.BF();
                }
                jr_2.f5078e = false;
                l6.p(jr_2, R2, igT.c);
                l6.p(jr_2, jjj, igT.v);
                l6.p(jr_2, mdz, igT.e);
                jQ.o(0, b, jQ.m(jr_2, buo, igT.X, jr_2), jr_2, 2058660585, -1163856341);
                gQc.X(iTI.g(R.drawable.illust_not_found, jr_2), null, adU.H(aff, (float) 256), null, null, 0.0f, null, jr_2, 440, 120);
                jr_ = jr_2;
                g1c.c("No devices connected", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_2.x(dB8.R)).L, jr_, 6, 0, 32766);
                jQ.K(jr_, false, false, true, false);
                jr_.g(false);
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_2.E();
            jr_ = jr_2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new izD(mpr, i, 2);
        }
    }

    public static final avO P(ly1 ly1) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new jLq(g8d.R(avO.class).R()));
        Object[] array = arrayList.toArray(new jLq[0]);
        if (array != null) {
            jLq[] jlqArr = (jLq[]) array;
            return (avO) new CV(ly1, new lia((jLq[]) Arrays.copyOf(jlqArr, jlqArr.length))).L(avO.class, "androidx.lifecycle.internal.SavedStateHandlesVM");
        }
        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
    }

    public static void Q(aiw aiw, InputStream inputStream, exD exd, long j) {
        byte[] bArr = new byte[16384];
        DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(inputStream, 4096));
        int readInt = dataInputStream.readInt();
        if (readInt != -771763713) {
            String valueOf = String.valueOf(String.format("%x", Integer.valueOf(readInt)));
            throw new iH7(valueOf.length() != 0 ? "Unexpected magic=".concat(valueOf) : new String("Unexpected magic="));
        }
        int read = dataInputStream.read();
        if (read == 4) {
            long j2 = 0;
            while (true) {
                long j3 = j - j2;
                try {
                    int read2 = dataInputStream.read();
                    if (read2 == -1) {
                        throw new IOException("Patch file overrun");
                    } else if (read2 != 0) {
                        switch (read2) {
                            case 247:
                                read2 = dataInputStream.readUnsignedShort();
                                S(bArr, dataInputStream, exd, read2, j3);
                                break;
                            case 248:
                                read2 = dataInputStream.readInt();
                                S(bArr, dataInputStream, exd, read2, j3);
                                break;
                            case 249:
                                long readUnsignedShort = (long) dataInputStream.readUnsignedShort();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    A(bArr, aiw, exd, readUnsignedShort, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 250:
                                read2 = dataInputStream.readUnsignedShort();
                                A(bArr, aiw, exd, (long) dataInputStream.readUnsignedShort(), read2, j3);
                                break;
                            case 251:
                                read2 = dataInputStream.readInt();
                                A(bArr, aiw, exd, (long) dataInputStream.readUnsignedShort(), read2, j3);
                                break;
                            case 252:
                                long readInt2 = (long) dataInputStream.readInt();
                                read2 = dataInputStream.read();
                                if (read2 != -1) {
                                    A(bArr, aiw, exd, readInt2, read2, j3);
                                    break;
                                } else {
                                    throw new IOException("Unexpected end of patch");
                                }
                            case 253:
                                read2 = dataInputStream.readUnsignedShort();
                                A(bArr, aiw, exd, (long) dataInputStream.readInt(), read2, j3);
                                break;
                            case 254:
                                read2 = dataInputStream.readInt();
                                A(bArr, aiw, exd, (long) dataInputStream.readInt(), read2, j3);
                                break;
                            case 255:
                                long readLong = dataInputStream.readLong();
                                read2 = dataInputStream.readInt();
                                A(bArr, aiw, exd, readLong, read2, j3);
                                break;
                            default:
                                S(bArr, dataInputStream, exd, read2, j3);
                                break;
                        }
                        j2 += (long) read2;
                    } else {
                        return;
                    }
                } finally {
                    exd.flush();
                }
            }
        } else {
            StringBuilder sb = new StringBuilder(30);
            sb.append("Unexpected version=");
            sb.append(read);
            throw new iH7(sb.toString());
        }
    }

    public static final void R(MainViewModel mainViewModel, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(1084308334);
        Context context = (Context) jr_.x(ur.f7428R);
        RJ.R(new nr0(mainViewModel, 0), aH9.I(jr_, -1176103898, new azM(context, 12, mainViewModel)), null, aH9.I(jr_, -704747548, new bkx(10, mainViewModel)), bOj.R, bOj.v, aH9.I(jr_, 2286977, new oR8(context, 0)), null, 0, 0, 0, 0, 0.0f, null, jr_, 1797168, 0, 16260);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new ifm(mainViewModel, i, 0);
        }
    }

    public static void S(byte[] bArr, DataInputStream dataInputStream, exD exd, int i, long j) {
        if (i < 0) {
            throw new IOException("copyLength negative");
        } else if (((long) i) <= j) {
            while (i > 0) {
                try {
                    int min = Math.min(i, 16384);
                    dataInputStream.readFully(bArr, 0, min);
                    exd.write(bArr, 0, min);
                    i -= min;
                } catch (EOFException unused) {
                    throw new IOException("patch underrun");
                }
            }
        } else {
            throw new IOException("Output length overrun");
        }
    }

    public static byte[] U(byte[] bArr) {
        if (bArr.length == 16) {
            byte[] bArr2 = new byte[16];
            for (int i = 0; i < 16; i++) {
                byte b = (byte) ((bArr[i] << 1) & 254);
                bArr2[i] = b;
                if (i < 15) {
                    bArr2[i] = (byte) (((byte) ((bArr[i + 1] >> 7) & 1)) | b);
                }
            }
            bArr2[15] = (byte) (((byte) ((bArr[0] >> 7) & 135)) ^ bArr2[15]);
            return bArr2;
        }
        throw new IllegalArgumentException("value must be a block.");
    }

    public static final void V(nu_ nu_, iv7 iv7) {
        l6.z(gQc.Q(nu_), null, 0, new arD(nu_, iv7, null), 3);
    }

    public static final void X(AdbPairViewModel adbPairViewModel, f_c f_c, f_c f_c2, f_c f_c3, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(118600865);
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
            adbPairViewModel.R.getClass();
            cpc.N(R.string.onboarding_adb_pair_message_unpriv, new String[]{cUF.Z((Context) jr_.x(ur.f7428R))}, jr_, 64);
            jr_.w(-60589467);
            if (adbPairViewModel.f2764v) {
                vd.c(aH9.zw(aff, 0.0f, (float) 32, 0.0f, 0.0f, 13), "Use root", null, null, new Vr(adbPairViewModel, 0), jr_, 54, 12);
            }
            jQ.K(jr_, false, false, false, true);
            jr_.g(false);
            jr_.g(false);
            jr_.w(-60589240);
            if (((Boolean) adbPairViewModel.v.getValue()).booleanValue()) {
                int i2 = i << 6;
                cpc.g(R.drawable.ic_fluent_alert_on_24_regular, dtx.h(R.string.onboarding_adb_pair_dialog_notification_permission, jr_), dtx.h(R.string.onboarding_adb_pair_dialog_notification_permission_desc, jr_), f_c, f_c2, jr_, (i2 & 7168) | (i2 & 57344), 0);
            }
            jr_.g(false);
            if (((Boolean) adbPairViewModel.f2762R.getValue()).booleanValue()) {
                e(adbPairViewModel, f_c3, jr_, ((i >> 6) & 112) | 8);
            }
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new tJ(adbPairViewModel, f_c, f_c2, f_c3, i, 3);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static void Y(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() != null && colorStateList != null && colorStateList.isStateful()) {
            int[] drawableState = textInputLayout.getDrawableState();
            int[] drawableState2 = checkableImageButton.getDrawableState();
            int length = drawableState.length;
            int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
            System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
            int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
            Drawable mutate = drawable.mutate();
            cAO.Z(mutate, ColorStateList.valueOf(colorForState));
            checkableImageButton.setImageDrawable(mutate);
        }
    }

    public static void Z(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                cAO.Z(drawable, colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                cAO.Z(drawable, ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                cAO.m(drawable, mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static hgO c() {
        return new hgO(false);
    }

    public static final void e(AdbPairViewModel adbPairViewModel, f_c f_c, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-1289420561);
        RJ.R(new Vr(adbPairViewModel, 1), aH9.I(jr_, 360404903, new azM(adbPairViewModel, 13, f_c)), null, null, aVR.R, aVR.v, aH9.I(jr_, 1314783682, new oR8((Context) jr_.x(ur.f7428R), 1)), null, 0, 0, 0, 0, 0.0f, null, jr_, 1794096, 0, 16268);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new _a(adbPairViewModel, f_c, i, 17);
        }
    }

    public static final boolean g() {
        String str = System.getenv("PATH");
        if (str == null) {
            return false;
        }
        List<String> b = iH_.b(str, new char[]{':'}, 0, 6);
        if (b.isEmpty()) {
            return false;
        }
        for (String str2 : b) {
            if (new File(opT.H(str2, "/su")).canExecute()) {
                return true;
            }
        }
        return false;
    }

    public static void h(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap weakHashMap = of5.f6887R;
        boolean R2 = bib.R(checkableImageButton);
        boolean z = false;
        int i = 1;
        boolean z2 = onLongClickListener != null;
        if (R2 || z2) {
            z = true;
        }
        checkableImageButton.setFocusable(z);
        checkableImageButton.setClickable(R2);
        checkableImageButton.setPressable(R2);
        checkableImageButton.setLongClickable(z2);
        if (!z) {
            i = 2;
        }
        mHC.t(checkableImageButton, i);
    }

    public static final void i(pm2 pm2, iv7 iv7) {
        kGM kgm = pm2.f7241R;
        if (kgm != null) {
            V(kgm, iv7);
            return;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public static boolean j() {
        return "The Android Project".equals(System.getProperty("java.vendor"));
    }

    public static final Object m(aOO aoo, nWQ nwq, h2V h2v) {
        Object v2 = l6.K(nwq).v(h2v, aoo);
        return v2 == bGR.COROUTINE_SUSPENDED ? v2 : o8s.R;
    }

    public static String n(List list) {
        int read;
        MessageDigest instance = MessageDigest.getInstance("SHA256");
        byte[] bArr = new byte[8192];
        Iterator it = list.iterator();
        while (it.hasNext()) {
            FileInputStream fileInputStream = new FileInputStream((File) it.next());
            do {
                try {
                    read = fileInputStream.read(bArr);
                    if (read > 0) {
                        instance.update(bArr, 0, read);
                    }
                } catch (Throwable th) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable unused) {
                    }
                    throw th;
                }
            } while (read != -1);
            fileInputStream.close();
        }
        return Base64.encodeToString(instance.digest(), 11);
    }

    public static long o(int i, byte[] bArr) {
        return ((long) (((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16))) & 4294967295L;
    }

    public static final o7V t(nWQ nwq, jy_ jy_, h2V h2v) {
        return l6.z(jy_, null, 0, new nIf(null, nwq, h2v), 3);
    }

    public static final Object u(long j, f_c f_c, aOO aoo) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        return l6.D(j, new iRS(l6.C(g8W.R, new eux(newSingleThreadExecutor), new bYm(j, f_c, null), 2), newSingleThreadExecutor, null), aoo);
    }

    public static final void v(UsbDevice usbDevice, UsbViewModel usbViewModel, kg9 kg9, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-1688213802);
        dTl.e(null, null, n3x.X(((n3) jr_.x(kft.R)).f6279R, jr_, 32768, 13), null, null, aH9.I(jr_, -1955274588, new w6(((List) biy.m(usbViewModel.v, jr_).getValue()).contains(usbDevice), usbViewModel, usbDevice, kg9, 1)), jr_, 196608, 27);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new dR(usbDevice, usbViewModel, kg9, i, 11);
        }
    }

    public static byte[] x(byte[] bArr, byte[] bArr2) {
        if (bArr.length == 32) {
            byte b = 0;
            long o = (o(0, bArr) >> 0) & 67108863 & 67108863;
            long o2 = (o(3, bArr) >> 2) & 67108863 & 67108611;
            long o3 = (o(6, bArr) >> 4) & 67108863 & 67092735;
            long o4 = (o(9, bArr) >> 6) & 67108863 & 66076671;
            long o5 = (o(12, bArr) >> 8) & 67108863 & 1048575;
            long j = o2 * 5;
            long j2 = o3 * 5;
            long j3 = o4 * 5;
            long j4 = o5 * 5;
            int i = 17;
            byte[] bArr3 = new byte[17];
            long j5 = 0;
            int i2 = 0;
            long j6 = 0;
            long j7 = 0;
            long j8 = 0;
            long j9 = 0;
            while (i2 < bArr2.length) {
                int min = Math.min(16, bArr2.length - i2);
                System.arraycopy(bArr2, i2, bArr3, b, min);
                bArr3[min] = 1;
                if (min != 16) {
                    Arrays.fill(bArr3, min + 1, i, b);
                }
                long o6 = j9 + ((o(b, bArr3) >> b) & 67108863);
                long o7 = j5 + ((o(3, bArr3) >> 2) & 67108863);
                long o8 = j6 + ((o(6, bArr3) >> 4) & 67108863);
                long o9 = j7 + ((o(9, bArr3) >> 6) & 67108863);
                long o10 = j8 + (((o(12, bArr3) >> 8) & 67108863) | ((long) (bArr3[16] << 24)));
                long j10 = (o10 * j) + (o9 * j2) + (o8 * j3) + (o7 * j4) + (o6 * o);
                long j11 = (o10 * j2) + (o9 * j3) + (o8 * j4) + (o7 * o) + (o6 * o2);
                long j12 = (o10 * j3) + (o9 * j4) + (o8 * o) + (o7 * o2) + (o6 * o3);
                long j13 = (o9 * o) + (o8 * o2) + (o7 * o3) + (o6 * o4);
                long j14 = o8 * o3;
                long j15 = o9 * o2;
                long j16 = j11 + (j10 >> 26);
                long j17 = j12 + (j16 >> 26);
                j6 = j17 & 67108863;
                long j18 = (o10 * j4) + j13 + (j17 >> 26);
                j7 = j18 & 67108863;
                long j19 = (o10 * o) + j15 + j14 + (o7 * o4) + (o6 * o5) + (j18 >> 26);
                long j20 = j19 >> 26;
                j8 = j19 & 67108863;
                long j21 = (j20 * 5) + (j10 & 67108863);
                j9 = j21 & 67108863;
                j5 = (j16 & 67108863) + (j21 >> 26);
                i2 += 16;
                b = 0;
                i = 17;
            }
            long j22 = j6 + (j5 >> 26);
            long j23 = j22 & 67108863;
            long j24 = j7 + (j22 >> 26);
            long j25 = j24 & 67108863;
            long j26 = j8 + (j24 >> 26);
            long j27 = j26 & 67108863;
            long j28 = ((j26 >> 26) * 5) + j9;
            long j29 = j28 >> 26;
            long j30 = j28 & 67108863;
            long j31 = (j5 & 67108863) + j29;
            long j32 = j30 + 5;
            long j33 = j32 & 67108863;
            long j34 = j31 + (j32 >> 26);
            long j35 = j23 + (j34 >> 26);
            long j36 = j25 + (j35 >> 26);
            long j37 = (j27 + (j36 >> 26)) - 67108864;
            long j38 = j37 >> 63;
            long j39 = ~j38;
            long j40 = (j31 & j38) | (j34 & 67108863 & j39);
            long j41 = (j23 & j38) | (j35 & 67108863 & j39);
            long j42 = (j36 & 67108863 & j39) | (j25 & j38);
            long j43 = (j37 & j39) | (j27 & j38);
            long o11 = o(16, bArr) + (((j30 & j38) | (j33 & j39) | (j40 << 26)) & 4294967295L);
            long j44 = o11 & 4294967295L;
            long o12 = o(20, bArr) + (((j40 >> 6) | (j41 << 20)) & 4294967295L) + (o11 >> 32);
            long o13 = o(24, bArr) + (((j41 >> 12) | (j42 << 14)) & 4294967295L) + (o12 >> 32);
            long o14 = o(28, bArr);
            byte[] bArr4 = new byte[16];
            I(0, j44, bArr4);
            I(4, o12 & 4294967295L, bArr4);
            I(8, o13 & 4294967295L, bArr4);
            I(12, (o14 + (((j42 >> 18) | (j43 << 8)) & 4294967295L) + (o13 >> 32)) & 4294967295L, bArr4);
            return bArr4;
        }
        throw new IllegalArgumentException("The key length in bytes must be 32.");
    }

    public static final o7V y(nWQ nwq, jy_ jy_, h2V h2v) {
        return l6.z(jy_, null, 0, new aGx(null, nwq, h2v), 3);
    }

    public static int z(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }
}
