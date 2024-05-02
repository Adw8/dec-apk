package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.Layout;
import android.text.TextPaint;
import android.util.Base64;
import dev.kdrag0n.virt.NativeLib;
import dev.kdrag0n.virt.vm.ForwardedPort;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;
import dev.kdrag0n.virtcontainer.ui.main.MainViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairViewModel;
import dev.kdrag0n.virtcontainer.ui.settings.forward.PortForwardViewModel;
import dev.kdrag0n.virtcontainer.ui.terminal.TerminalViewModel;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.interfaces.RSAPublicKey;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.zip.ZipOutputStream;

/* renamed from: _c  reason: default package */
/* loaded from: classes.dex */
public final class _c extends k8G implements f_c {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int X;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ _c(Object obj, int i, Object obj2) {
        super(0);
        this.X = i;
        this.R = obj;
        this.v = obj2;
    }

    public final Boolean R() {
        switch (this.X) {
            case 0:
                return Boolean.valueOf(((Boolean) ((h0T) this.R).getValue()).booleanValue() || ((Boolean) ((f_c) this.v).g()).booleanValue());
            case 1:
                ((jzQ) this.v).v();
                return Boolean.valueOf(mGH.e((h0T) this.R));
            default:
                return Boolean.valueOf(n3x.v((ihm) this.R, (ihm) this.v));
        }
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Throwable, aOO, xZ, aSK] */
    public final void c() {
        f_c f_c;
        th = 0;
        switch (this.X) {
            case 4:
                if (!odN.R(((d5M) this.v).R, ((d5M) ((h0T) this.R).getValue()).R) || !n3x.v(((d5M) this.v).f2489R, ((d5M) ((h0T) this.R).getValue()).f2489R)) {
                    ((h0T) this.R).R((d5M) this.v);
                    return;
                }
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
            case 12:
            case 13:
            case 14:
            case 24:
            case 26:
            default:
                try {
                    ((jr5) this.R).f5031R.e((dj8) this.v);
                    return;
                } catch (IOException e) {
                    oMv omv = oMv.f6773R;
                    oMv omv2 = oMv.f6773R;
                    StringBuilder U = opT.U("Http2Connection.Listener failure for ");
                    U.append(((jr5) this.R).f5035R);
                    String sb = U.toString();
                    omv2.getClass();
                    oMv.m(4, sb, e);
                    try {
                        ((dj8) this.v).c(gtp.PROTOCOL_ERROR, e);
                        return;
                    } catch (IOException unused) {
                        return;
                    }
                }
            case 6:
                if (!(((Boolean) ((nKt) this.R).f6369R.getValue()).booleanValue() || (f_c = (f_c) this.v) == null)) {
                    f_c.g();
                    return;
                }
                return;
            case 7:
                ((p4d) this.v).getClass();
                p4d p4d = (p4d) this.v;
                p4d.getClass();
                p4d.getClass();
                jr_.v((jr_) this.R, null, null);
                return;
            case VmNativeCallback.$stable /* 8 */:
                kyQ kyq = (kyQ) this.R;
                fzE fze = (fzE) this.v;
                int i = kyq.e;
                for (int i2 = 0; i2 < i; i2++) {
                    ((hAe) fze).K(kyq.R[i2]);
                }
                return;
            case 9:
                ift.m(((jE4) this.R).R, (f_c) this.v);
                return;
            case 10:
                lYY lyy = (lYY) ((eo1) this.R);
                SD sd = lyy.R;
                sd.R = (e7) this.v;
                sd.f505R = th;
                lyy.f5771R.x(sd);
                if (sd.f505R == null) {
                    throw new IllegalStateException("DrawResult not defined, did you forget to call onDraw?".toString());
                }
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                h7_ h7_ = poS.R;
                ((poS) this.R)._m((Gp) this.v);
                return;
            case 15:
                FileInputStream fileInputStream = new FileInputStream((String) this.R);
                try {
                    jjU.O(fileInputStream, (ZipOutputStream) this.v);
                    return;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } finally {
                        dTl.V(fileInputStream, th);
                    }
                }
            case 16:
                jjU.O((InputStream) this.R, (ZipOutputStream) this.v);
                return;
            case 17:
                mxC.J((Context) this.R, ((lzd) this.v).v);
                return;
            case 18:
                l6.z((jy_) this.R, th, 0, new a4c((m5f) this.v, th), 3);
                return;
            case 19:
                iHI ihi = ((gkP) this.R).f3918R;
                ForwardedPort forwardedPort = (ForwardedPort) this.v;
                int i3 = forwardedPort.v;
                NativeLib.d(new VmNativeCallback(ihi, (gkP) ((nak) ihi.f4529R).get()), i3, 100000 + i3, forwardedPort.f2733R);
                return;
            case 20:
                CreateViewModel createViewModel = (CreateViewModel) this.R;
                createViewModel.getClass();
                l6.z(gvP.o(createViewModel), th, 0, new jnE(createViewModel, (dM_) this.v, th), 3);
                return;
            case 21:
                mxC.K((Context) this.R);
                ((MainViewModel) this.v).f2754R.R(Boolean.FALSE);
                return;
            case 22:
                ((AdbPairViewModel) this.R).f2762R.R(Boolean.FALSE);
                ((f_c) this.v).g();
                return;
            case 23:
                PortForwardViewModel portForwardViewModel = (PortForwardViewModel) this.R;
                portForwardViewModel.getClass();
                l6.z(gvP.o(portForwardViewModel), th, 0, new o4Z(portForwardViewModel, (ForwardedPort) this.v, th), 3);
                return;
            case 25:
                l6.z((jy_) this.R, th, 0, new def((TerminalViewModel) this.v, th), 3);
                return;
            case 27:
                ((jr5) this.R).f5031R.v((oWQ) ((nWW) this.v).R);
                return;
        }
    }

    @Override // defpackage.f_c
    public final Object g() {
        long j;
        int i;
        mjp c;
        iRR irr;
        hjM hjm;
        hjM hjm2;
        Integer num = 0;
        switch (this.X) {
            case 0:
                return R();
            case 1:
                return R();
            case 2:
                return v();
            case 3:
                gIA gia = (gIA) this.R;
                if (gia != null) {
                    return gia;
                }
                hjM hjm3 = ((XS) ((sR) this.v)).R;
                if (hjm3 == null || !hjm3.p()) {
                    hjm3 = null;
                }
                if (hjm3 != null) {
                    return msU.e(aWo.v, iTI.J(hjm3.pG()));
                }
                return null;
            case 4:
                c();
                return o8s.R;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                fBS fbs = (fBS) this.v;
                long j2 = ((ltH) ((h0T) this.R).getValue()).R;
                if (fbs.x().f2488R.R.length() == 0) {
                    j = aWo.e;
                } else {
                    c_c c_c = (c_c) fbs.c.getValue();
                    int i2 = c_c == null ? -1 : hle.R[c_c.ordinal()];
                    if (i2 != -1) {
                        if (i2 == 1 || i2 == 2) {
                            long j3 = fbs.x().R;
                            int i3 = odN.R;
                            i = (int) (j3 >> 32);
                        } else if (i2 == 3) {
                            i = odN.c(fbs.x().R);
                        } else {
                            throw new j8f((Object) null);
                        }
                        int Z = fbs.f3338R.Z(i);
                        heu heu = new heu(0, fbs.x().f2488R.R.length() - 1);
                        if (heu instanceof p6) {
                            Z = ((Number) caw.U(Integer.valueOf(Z), (p6) heu)).intValue();
                        } else if (heu.isEmpty()) {
                            throw new IllegalArgumentException("Cannot coerce value to an empty range: " + heu + '.');
                        } else if (Z < num.intValue()) {
                            Z = num.intValue();
                        } else if (Z > Integer.valueOf(heu.X).intValue()) {
                            Z = Integer.valueOf(heu.X).intValue();
                        }
                        kY5 ky5 = fbs.f3345R;
                        if (ky5 == null || (c = ky5.c()) == null || (irr = c.f6140R) == null) {
                            j = aWo.e;
                        } else {
                            long R = irr.v(Z).R();
                            kY5 ky52 = fbs.f3345R;
                            if (ky52 == null || (hjm = ky52.f5338R) == null) {
                                j = aWo.e;
                            } else {
                                mjp c2 = ky52.c();
                                if (c2 == null || (hjm2 = c2.R) == null) {
                                    j = aWo.e;
                                } else {
                                    aWo awo = (aWo) fbs.e.getValue();
                                    if (awo != null) {
                                        float e = aWo.e(hjm2.Y(hjm, awo.f906R));
                                        int O = irr.O(Z);
                                        int x = irr.x(O);
                                        int X = irr.X(O, true);
                                        boolean z = ((int) (fbs.x().R >> 32)) > odN.c(fbs.x().R);
                                        float t = ooA.t(irr, x, true, z);
                                        float t2 = ooA.t(irr, X, false, z);
                                        float m = caw.m(e, Math.min(t, t2), Math.max(t, t2));
                                        j = Math.abs(e - m) > ((float) (((int) (j2 >> 32)) / 2)) ? aWo.e : hjm.Y(hjm2, aH9.N(m, aWo.X(R)));
                                    } else {
                                        j = aWo.e;
                                    }
                                }
                            }
                        }
                    } else {
                        j = aWo.e;
                    }
                }
                return new aWo(j);
            case 6:
                c();
                return o8s.R;
            case 7:
                c();
                return o8s.R;
            case VmNativeCallback.$stable /* 8 */:
                c();
                return o8s.R;
            case 9:
                c();
                return o8s.R;
            case 10:
                c();
                return o8s.R;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                c();
                return o8s.R;
            case 12:
                return v();
            case 13:
                return new jY(new aQM((SharedPreferences) this.v), ((gh) this.R).f3866R.getPackageManager().getApplicationLabel(((gh) this.R).f3866R.getApplicationInfo()).toString());
            case 14:
                InputStream openRawResource = ((Context) this.R).getResources().openRawResource(R.raw.third_party_licenses);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(Math.max(8192, openRawResource.available()));
                jjU.O(openRawResource, byteArrayOutputStream);
                String u = iH_.u(byteArrayOutputStream.toByteArray());
                InputStream openRawResource2 = ((Context) this.R).getResources().openRawResource(R.raw.third_party_license_metadata);
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(Math.max(8192, openRawResource2.available()));
                jjU.O(openRawResource2, byteArrayOutputStream2);
                List<String> b = iH_.b(iH_.vr(iH_.u(byteArrayOutputStream2.toByteArray())).toString(), new char[]{'\n'}, 0, 6);
                ArrayList arrayList = new ArrayList(a6.B(b, 10));
                for (String str : b) {
                    List b2 = iH_.b(str, new char[]{' '}, 2, 2);
                    List b3 = iH_.b((String) b2.get(0), new char[]{':'}, 0, 6);
                    int parseInt = Integer.parseInt((String) b3.get(0));
                    arrayList.add(new lzd((String) b2.get(1), u.substring(parseInt, Integer.parseInt((String) b3.get(1)) + parseInt)));
                }
                return dF.ZW(dF.cE(((g1p) this.v).f3653R, dF.cE(aAM.R, arrayList)), new gvk(8));
            case 15:
                c();
                return o8s.R;
            case 16:
                c();
                return o8s.R;
            case 17:
                c();
                return o8s.R;
            case 18:
                c();
                return o8s.R;
            case 19:
                c();
                return o8s.R;
            case 20:
                c();
                return o8s.R;
            case 21:
                c();
                return o8s.R;
            case 22:
                c();
                return o8s.R;
            case 23:
                c();
                return o8s.R;
            case 24:
                return R();
            case 25:
                c();
                return o8s.R;
            case 26:
                RSAPublicKey rSAPublicKey = ((jY) this.R).f4959R;
                String str2 = (String) this.v;
                BigInteger bigInteger = BigInteger.ZERO;
                BigInteger bit = bigInteger.setBit(32);
                BigInteger negate = rSAPublicKey.getModulus().remainder(bit).modInverse(bit).negate();
                BigInteger modPow = bigInteger.setBit(2048).modPow(BigInteger.valueOf(2), rSAPublicKey.getModulus());
                ByteBuffer order = ByteBuffer.allocate(524).order(ByteOrder.LITTLE_ENDIAN);
                order.putInt(64);
                order.putInt(negate.intValue());
                int[] h = mLz.h(rSAPublicKey.getModulus());
                for (int i4 = 0; i4 < 64; i4++) {
                    order.putInt(h[i4]);
                }
                int[] h2 = mLz.h(modPow);
                for (int i5 = 0; i5 < 64; i5++) {
                    order.putInt(h2[i5]);
                }
                order.putInt(rSAPublicKey.getPublicExponent().intValue());
                byte[] encode = Base64.encode(order.array(), 2);
                byte[] bytes = jQ.C(" ", str2, "\u0000").getBytes(O1.R);
                byte[] bArr = new byte[encode.length + bytes.length];
                P7.s(encode, bArr, 0, 0, 0, 14);
                P7.s(bytes, bArr, encode.length, 0, 0, 12);
                return bArr;
            case 27:
                c();
                return o8s.R;
            default:
                c();
                return o8s.R;
        }
    }

    public final Float v() {
        float f;
        float f2;
        switch (this.X) {
            case 2:
                oey oey = (oey) this.R;
                if (oey.f6885e) {
                    f = (float) ((cRR) this.v).L();
                    f2 = 1.0f;
                } else {
                    f2 = (float) oey.O();
                    f = ((float) ((Number) ((oey) this.R).f6878R.v.getValue()).intValue()) / 100000.0f;
                }
                return Float.valueOf(f + f2);
            default:
                CharSequence charSequence = (CharSequence) this.R;
                TextPaint textPaint = (TextPaint) this.v;
                BreakIterator lineInstance = BreakIterator.getLineInstance(textPaint.getTextLocale());
                int i = 0;
                lineInstance.setText(new _Y(charSequence, charSequence.length()));
                PriorityQueue priorityQueue = new PriorityQueue(10, new e5s(1));
                int next = lineInstance.next();
                while (next != -1) {
                    if (priorityQueue.size() < 10) {
                        priorityQueue.add(new kSh(Integer.valueOf(i), Integer.valueOf(next)));
                    } else {
                        kSh ksh = (kSh) priorityQueue.peek();
                        if (ksh != null && ((Number) ksh.v).intValue() - ((Number) ksh.R).intValue() < next - i) {
                            priorityQueue.poll();
                            priorityQueue.add(new kSh(Integer.valueOf(i), Integer.valueOf(next)));
                        }
                    }
                    next = lineInstance.next();
                    i = next;
                }
                float f3 = 0.0f;
                Iterator it = priorityQueue.iterator();
                while (it.hasNext()) {
                    kSh ksh2 = (kSh) it.next();
                    f3 = Math.max(f3, Layout.getDesiredWidth(charSequence, ((Number) ksh2.R).intValue(), ((Number) ksh2.v).intValue(), textPaint));
                }
                return Float.valueOf(f3);
        }
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ _c(Object obj, h0T h0t, int i) {
        super(0);
        this.X = i;
        this.v = obj;
        this.R = h0t;
    }
}
