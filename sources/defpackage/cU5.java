package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import android.util.Xml;
import android.view.View;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;
import org.xmlpull.v1.XmlPullParserException;

/* renamed from: cU5  reason: default package */
/* loaded from: classes.dex */
public abstract class cU5 {

    /* renamed from: R  reason: collision with other field name */
    public static final byte[] f2103R = new byte[0];
    public static final lmI R = new lmI("NO_THREAD_ELEMENTS");

    public static final void C(nbD nbd, Object obj) {
        if (obj != R) {
            if (obj instanceof gFT) {
                gFT gft = (gFT) obj;
                oHm[] ohmArr = gft.f3696R;
                int length = ohmArr.length - 1;
                if (length >= 0) {
                    oHm ohm = ohmArr[length];
                    Object obj2 = gft.R[length];
                    jQ.Y(ohm);
                    throw null;
                }
                return;
            }
            Object o = nbd.o(null, go2.V);
            if (o != null) {
                jQ.Y((oHm) o);
                throw null;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        }
    }

    public static b3w H(XmlResourceParser xmlResourceParser, Resources resources) {
        int next;
        do {
            next = xmlResourceParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            xmlResourceParser.require(2, null, "font-family");
            if (xmlResourceParser.getName().equals("font-family")) {
                TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), ooA.f6958v);
                String string = obtainAttributes.getString(0);
                String string2 = obtainAttributes.getString(4);
                String string3 = obtainAttributes.getString(5);
                int resourceId = obtainAttributes.getResourceId(1, 0);
                int integer = obtainAttributes.getInteger(2, 1);
                int integer2 = obtainAttributes.getInteger(3, 500);
                String string4 = obtainAttributes.getString(6);
                obtainAttributes.recycle();
                if (string == null || string2 == null || string3 == null) {
                    ArrayList arrayList = new ArrayList();
                    while (xmlResourceParser.next() != 3) {
                        if (xmlResourceParser.getEventType() == 2) {
                            if (xmlResourceParser.getName().equals("font")) {
                                TypedArray obtainAttributes2 = resources.obtainAttributes(Xml.asAttributeSet(xmlResourceParser), ooA.c);
                                int i = 8;
                                if (!obtainAttributes2.hasValue(8)) {
                                    i = 1;
                                }
                                int i2 = obtainAttributes2.getInt(i, 400);
                                boolean z = 1 == obtainAttributes2.getInt(obtainAttributes2.hasValue(6) ? 6 : 2, 0);
                                int i3 = 9;
                                if (!obtainAttributes2.hasValue(9)) {
                                    i3 = 3;
                                }
                                int i4 = 7;
                                if (!obtainAttributes2.hasValue(7)) {
                                    i4 = 4;
                                }
                                String string5 = obtainAttributes2.getString(i4);
                                int i5 = obtainAttributes2.getInt(i3, 0);
                                int i6 = obtainAttributes2.hasValue(5) ? 5 : 0;
                                int resourceId2 = obtainAttributes2.getResourceId(i6, 0);
                                String string6 = obtainAttributes2.getString(i6);
                                obtainAttributes2.recycle();
                                while (xmlResourceParser.next() != 3) {
                                    j(xmlResourceParser);
                                }
                                arrayList.add(new aud(i2, i5, resourceId2, string6, string5, z));
                            } else {
                                j(xmlResourceParser);
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        return new iBa((aud[]) arrayList.toArray(new aud[0]));
                    }
                } else {
                    while (xmlResourceParser.next() != 3) {
                        j(xmlResourceParser);
                    }
                    return new h6r(new Jd(string, string2, string3, U(resources, resourceId)), integer, integer2, string4);
                }
            } else {
                j(xmlResourceParser);
            }
            return null;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final int L(ArrayList arrayList, float f) {
        int size = arrayList.size() - 1;
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            pps pps = (pps) arrayList.get(i2);
            char c = pps.R > f ? 1 : pps.v <= f ? (char) 65535 : 0;
            if (c < 0) {
                i = i2 + 1;
            } else if (c <= 0) {
                return i2;
            } else {
                size = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final ncu N(ncu ncu, boolean z, kg9 kg9) {
        boolean z2 = mWb.R;
        return ncu.I(new b2X(z, false, kg9, lBz.Y));
    }

    public static final int O(int i, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            pps pps = (pps) arrayList.get(i3);
            char c = pps.c > i ? 1 : pps.e <= i ? (char) 65535 : 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static final void R(f_c f_c, gRa gra, iv7 iv7, m88 m88, int i, int i2) {
        int i3;
        gRa gra2;
        gRa gra3;
        gRa gra4;
        hfa hfa;
        boolean z;
        int i4;
        jr_ jr_ = (jr_) m88;
        jr_.q(-2032877254);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (jr_.O(f_c) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 112) == 0) {
            if ((i2 & 2) == 0) {
                gra2 = gra;
                if (jr_.O(gra2)) {
                    i4 = 32;
                    i3 |= i4;
                }
            } else {
                gra2 = gra;
            }
            i4 = 16;
            i3 |= i4;
        } else {
            gra2 = gra;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 896) == 0) {
            i3 |= jr_.O(iv7) ? 256 : 128;
        }
        if ((i3 & 731) != 146 || !jr_.J()) {
            jr_.a();
            if ((i & 1) == 0 || jr_.K()) {
                if ((i2 & 2) != 0) {
                    gra4 = new gRa();
                }
                gra4 = gra2;
            } else {
                jr_.E();
                if ((i2 & 2) != 0) {
                    gra4 = gra2;
                }
                gra4 = gra2;
            }
            jr_.y();
            View view = (View) jr_.x(ur.X);
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            ngM W = l6.W(jr_);
            h0T s = l6.s(iv7, jr_);
            UUID uuid = (UUID) cpc.T(new Object[0], null, X6.R, jr_, 6);
            jr_.w(511388516);
            boolean O = jr_.O(view) | jr_.O(jjj);
            Object I = jr_.I();
            if (O || I == ppN.R) {
                hfa hfa2 = new hfa(f_c, gra4, view, mdz, jjj, uuid);
                dNH u = aH9.u(new efc(s, 2), true, 488261145);
                nk3 nk3 = hfa2.f4342R;
                nk3.setParentCompositionContext(W);
                nk3.f6534R.R(u);
                nk3.e = true;
                nk3.c();
                jr_.ZW(hfa2);
                z = false;
                hfa = hfa2;
            } else {
                z = false;
                hfa = I;
            }
            jr_.g(z);
            hfa hfa3 = hfa;
            int i5 = z ? 1 : 0;
            int i6 = z ? 1 : 0;
            int i7 = z ? 1 : 0;
            caw.v(hfa3, new tt(hfa3, i5), jr_);
            caw.L(new nHl(hfa3, f_c, gra4, mdz, 3), jr_);
            gra3 = gra4;
        } else {
            jr_.E();
            gra3 = gra2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new iW6(f_c, gra3, iv7, i, i2, 3);
        }
    }

    public static List U(Resources resources, int i) {
        if (i == 0) {
            return Collections.emptyList();
        }
        TypedArray obtainTypedArray = resources.obtainTypedArray(i);
        try {
            if (obtainTypedArray.length() == 0) {
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            if (cR2.R(obtainTypedArray, 0) == 1) {
                for (int i2 = 0; i2 < obtainTypedArray.length(); i2++) {
                    int resourceId = obtainTypedArray.getResourceId(i2, 0);
                    if (resourceId != 0) {
                        String[] stringArray = resources.getStringArray(resourceId);
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArray) {
                            arrayList2.add(Base64.decode(str, 0));
                        }
                        arrayList.add(arrayList2);
                    }
                }
            } else {
                String[] stringArray2 = resources.getStringArray(i);
                ArrayList arrayList3 = new ArrayList();
                for (String str2 : stringArray2) {
                    arrayList3.add(Base64.decode(str2, 0));
                }
                arrayList.add(arrayList3);
            }
            return arrayList;
        } finally {
            obtainTypedArray.recycle();
        }
    }

    public static final int X(int i, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) >>> 1;
            pps pps = (pps) arrayList.get(i3);
            char c = pps.f7287R > i ? 1 : pps.f7289v <= i ? (char) 65535 : 0;
            if (c < 0) {
                i2 = i3 + 1;
            } else if (c <= 0) {
                return i3;
            } else {
                size = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static MappedByteBuffer Z(Context context, Uri uri) {
        try {
            ParcelFileDescriptor R2 = fc_.R(context.getContentResolver(), uri, "r", null);
            if (R2 == null) {
                if (R2 != null) {
                    R2.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(R2.getFileDescriptor());
            try {
                FileChannel channel = fileInputStream.getChannel();
                MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0, channel.size());
                fileInputStream.close();
                R2.close();
                return map;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException unused) {
            return null;
        }
    }

    public static final void c(ncu ncu, iv7 iv7, m88 m88, int i, int i2) {
        int i3;
        ncu ncu2;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1177876616);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (jr_.O(ncu) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 112) == 0) {
            i3 |= jr_.O(iv7) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !jr_.J()) {
            ncu2 = i4 != 0 ? aff.R : ncu;
            hB hBVar = hB.R;
            jr_.w(-1323940314);
            jJj jjj = (jJj) jr_.x(lnF.X);
            mdz mdz = (mdz) jr_.x(lnF.H);
            bUo buo = (bUo) jr_.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(ncu2);
            int i5 = (((((i3 << 3) & 112) | ((i3 >> 3) & 14)) << 9) & 7168) | 6;
            if (jr_.f5052R instanceof Su) {
                jr_.mL();
                if (jr_.f5050L) {
                    jr_.H(fme);
                } else {
                    jr_.BF();
                }
                jr_.f5078e = false;
                l6.p(jr_, hBVar, igT.c);
                l6.p(jr_, jjj, igT.v);
                l6.p(jr_, mdz, igT.e);
                b.y(jQ.m(jr_, buo, igT.X, jr_), jr_, Integer.valueOf((i5 >> 3) & 112));
                jr_.w(2058660585);
                iv7.J(jr_, Integer.valueOf((i5 >> 9) & 14));
                jr_.g(false);
                jr_.g(true);
                jr_.g(false);
            } else {
                l6.u();
                throw null;
            }
        } else {
            jr_.E();
            ncu2 = ncu;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new mX1(ncu2, iv7, i, i2, 2);
        }
    }

    public static final long e(int i, m88 m88) {
        jr_ jr_ = (jr_) m88;
        return ay.R.R((Context) jr_.x(ur.f7428R), i);
    }

    public static final Object g(nbD nbd) {
        return nbd.o(0, go2.i);
    }

    public static final Object i(nbD nbd, Object obj) {
        if (obj == null) {
            obj = g(nbd);
        }
        if (obj == 0) {
            return R;
        }
        if (obj instanceof Integer) {
            return nbd.o(new gFT(nbd, ((Number) obj).intValue()), go2.o);
        }
        jQ.Y((oHm) obj);
        throw null;
    }

    public static void j(XmlResourceParser xmlResourceParser) {
        int i = 1;
        while (i > 0) {
            int next = xmlResourceParser.next();
            if (next == 2) {
                i++;
            } else if (next == 3) {
                i--;
            }
        }
    }

    public static final long m(float f, long j) {
        return (Float.isNaN(f) || f >= 1.0f) ? j : n3.v(j, n3.e(j) * f);
    }

    public static final long t(long j, long j2) {
        int i;
        int e;
        int X;
        int X2 = odN.X(j);
        int e2 = odN.e(j);
        boolean z = false;
        if (odN.X(j2) < odN.e(j) && odN.X(j) < odN.e(j2)) {
            if (odN.X(j2) <= odN.X(j) && odN.e(j) <= odN.e(j2)) {
                X2 = odN.X(j2);
                e2 = X2;
            } else {
                if (odN.X(j) <= odN.X(j2) && odN.e(j2) <= odN.e(j)) {
                    e = odN.e(j2);
                    X = odN.X(j2);
                    i = e - X;
                } else {
                    int X3 = odN.X(j2);
                    if (X2 < odN.e(j2) && X3 <= X2) {
                        z = true;
                    }
                    if (z) {
                        X2 = odN.X(j2);
                        i = odN.e(j2) - odN.X(j2);
                    } else {
                        e2 = odN.X(j2);
                    }
                }
            }
            return dtx.e(X2, e2);
        }
        if (e2 > odN.X(j2)) {
            X2 -= odN.e(j2) - odN.X(j2);
            e = odN.e(j2);
            X = odN.X(j2);
            i = e - X;
        }
        return dtx.e(X2, e2);
        e2 -= i;
        return dtx.e(X2, e2);
    }

    public static final long v(int i, int i2) {
        long j = (((long) i2) & 4294967295L) | (((long) i) << 32);
        int i3 = dU5.R;
        return j;
    }

    public static final ixU x(kg9 kg9) {
        pwv pwv = new pwv();
        kg9.x(pwv);
        lN9 ln9 = pwv.f7324R;
        boolean z = pwv.f7325R;
        ln9.getClass();
        ln9.getClass();
        int i = pwv.R;
        boolean z2 = pwv.v;
        ln9.getClass();
        ln9.getClass();
        ln9.getClass();
        ln9.getClass();
        return new ixU(z, false, i, false, z2, ln9.R, ln9.v, ln9.c, ln9.e);
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0106 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x01b8 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00fa  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.text.SpannableString y(defpackage.bz r21, defpackage.jJj r22) {
        /*
        // Method dump skipped, instructions count: 481
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cU5.y(bz, jJj):android.text.SpannableString");
    }

    public abstract void P(View view, int i, int i2);
}
