package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.main.MainSharedViewModel;
import dev.kdrag0n.virtcontainer.ui.onboarding.config.ConfigViewModel;
import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

/* renamed from: cpc  reason: default package */
/* loaded from: classes.dex */
public abstract class cpc implements nAq {
    public static nUO R;

    public static float A(int i, String[] strArr) {
        float parseFloat = Float.parseFloat(strArr[i]);
        if (parseFloat >= 0.0f && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    public static boolean B(int i) {
        return i == 2 || i == 7 || i == 3;
    }

    public static final void C(ncu ncu, m88 m88, int i, int i2) {
        int i3;
        jr_ jr_ = (jr_) m88;
        jr_.q(-1676054338);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 14) == 0) {
            i3 = (jr_.O(ncu) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 11) != 2 || !jr_.J()) {
            if (i4 != 0) {
                ncu = aff.R;
            }
            oI9.R(adU.Z(aH9.mL(ncu, (float) 12), (float) 24), 0, (float) 2, jr_, 384, 2);
        } else {
            jr_.E();
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new fbD(ncu, i, i2, 4);
        }
    }

    public static final byte[] G(byte[] bArr, byte[] bArr2) {
        if (bArr.length == bArr2.length) {
            return p(0, 0, bArr.length, bArr, bArr2);
        }
        throw new IllegalArgumentException("The lengths of x and y should match.");
    }

    public static final void H(OverviewViewModel overviewViewModel, m88 m88, int i) {
        jr_ jr_;
        jr_ jr_2 = (jr_) m88;
        jr_2.q(1398576620);
        h0T m = biy.m(overviewViewModel.Z, jr_2);
        if (((b1n) m.getValue()) != null) {
            jr_ = jr_2;
            RJ.R(new dTe(overviewViewModel, 0), aH9.I(jr_2, 562526393, new gbA(overviewViewModel, 0)), null, aH9.I(jr_2, 1961479995, new gbA(overviewViewModel, 1)), gP1.x, aH9.I(jr_2, -934533699, new efc(m, 4)), gP1.H, null, 0, 0, 0, 0, 0.0f, null, jr_, 1797168, 0, 16260);
        } else {
            jr_ = jr_2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new m2w(i, 11, overviewViewModel);
        }
    }

    public static boolean I(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type2 instanceof GenericArrayType ? I(((Class) type).getComponentType(), ((GenericArrayType) type2).getGenericComponentType()) : type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return I(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType instanceof jCU ? ((jCU) parameterizedType).f4856R : parameterizedType.getActualTypeArguments(), parameterizedType2 instanceof jCU ? ((jCU) parameterizedType2).f4856R : parameterizedType2.getActualTypeArguments());
        } else if (type instanceof GenericArrayType) {
            if (type2 instanceof Class) {
                return I(((Class) type2).getComponentType(), ((GenericArrayType) type).getGenericComponentType());
            }
            if (!(type2 instanceof GenericArrayType)) {
                return false;
            }
            return I(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
        } else if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        } else if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        } else {
            TypeVariable typeVariable = (TypeVariable) type;
            TypeVariable typeVariable2 = (TypeVariable) type2;
            return typeVariable.getGenericDeclaration() == typeVariable2.getGenericDeclaration() && typeVariable.getName().equals(typeVariable2.getName());
        }
    }

    public static Drawable J(Drawable drawable, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (drawable == null) {
            return null;
        }
        if (colorStateList != null) {
            drawable = drawable.mutate();
            if (mode != null) {
                cAO.m(drawable, mode);
            }
        }
        return drawable;
    }

    public static byte[] K(byte[]... bArr) {
        int i = 0;
        for (byte[] bArr2 : bArr) {
            if (i <= Integer.MAX_VALUE - bArr2.length) {
                i += bArr2.length;
            } else {
                throw new GeneralSecurityException("exceeded size limit");
            }
        }
        byte[] bArr3 = new byte[i];
        int i2 = 0;
        for (byte[] bArr4 : bArr) {
            System.arraycopy(bArr4, 0, bArr3, i2, bArr4.length);
            i2 += bArr4.length;
        }
        return bArr3;
    }

    public static final void N(int i, String[] strArr, m88 m88, int i2) {
        jr_ jr_;
        jr_ jr_2 = (jr_) m88;
        jr_2.q(1572855006);
        int i3 = (i2 & 14) == 0 ? (jr_2.e(i) ? 4 : 2) | i2 : i2;
        jr_2.f(606463914, Integer.valueOf(strArr.length), null, false);
        for (String str : strArr) {
            i3 |= jr_2.O(str) ? 32 : 0;
        }
        jr_2.g(false);
        if ((i3 & 112) == 0) {
            i3 |= 16;
        }
        if ((i3 & 91) != 18 || !jr_2.J()) {
            float f = (float) 24;
            jr_ = jr_2;
            g1c.v(lTs.h(Q((Context) jr_2.x(ur.f7428R), i, (String[]) Arrays.copyOf(strArr, strArr.length))), aH9.zw(adU.f942R, f, (float) 64, f, 0.0f, 8), 0, 0, null, null, null, 0, null, new pvy(5), 0, 0, false, 0, null, null, null, jr_, 0, 0, 130556);
        } else {
            jr_2.E();
            jr_ = jr_2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new fbD(i, strArr, i2);
        }
    }

    public static final void P(int i, m88 m88, int i2) {
        int i3;
        jr_ jr_;
        jr_ jr_2 = (jr_) m88;
        jr_2.q(1955539779);
        if ((i2 & 14) == 0) {
            i3 = (jr_2.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i3 & 11) != 2 || !jr_2.J()) {
            jr_ = jr_2;
            g1c.c(dtx.h(i, jr_2), adU.X(aH9.X4(aff.R, 0.0f, (float) 64, 1)), 0, 0, null, null, null, 0, null, new pvy(3), 0, 0, false, 0, null, kMk.R(((c_P) jr_2.x(dB8.R)).c, 0, 0, lIe.X, 262139), jr_, 48, 0, 32252);
        } else {
            jr_2.E();
            jr_ = jr_2;
        }
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new mCj(i, i2, 1);
        }
    }

    public static final Spanned Q(Context context, int i, String... strArr) {
        boolean z = Y5.f623R;
        return Y5.f623R ? Html.fromHtml(context.getString(i, Arrays.copyOf(strArr, strArr.length)), 63) : Html.fromHtml(context.getString(i, Arrays.copyOf(strArr, strArr.length)));
    }

    public static final nUO S() {
        nUO nuo = R;
        if (nuo != null) {
            return nuo;
        }
        f0G f0g = new f0G("Outlined.MoreVert");
        int i = jnb.R;
        oSW osw = new oSW(n3.v);
        jGl jgl = new jGl();
        jgl.Z(12.0f, 8.0f);
        jgl.c(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        jgl.m(-0.9f, -2.0f, -2.0f, -2.0f);
        jgl.m(-2.0f, 0.9f, -2.0f, 2.0f);
        jgl.m(0.9f, 2.0f, 2.0f, 2.0f);
        jgl.R();
        jgl.Z(12.0f, 10.0f);
        jgl.c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        jgl.m(0.9f, 2.0f, 2.0f, 2.0f);
        jgl.m(2.0f, -0.9f, 2.0f, -2.0f);
        jgl.m(-0.9f, -2.0f, -2.0f, -2.0f);
        jgl.R();
        jgl.Z(12.0f, 16.0f);
        jgl.c(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        jgl.m(0.9f, 2.0f, 2.0f, 2.0f);
        jgl.m(2.0f, -0.9f, 2.0f, -2.0f);
        jgl.m(-0.9f, -2.0f, -2.0f, -2.0f);
        jgl.R();
        f0G.c(f0g, jgl.R, osw);
        nUO e = f0g.e();
        R = e;
        return e;
    }

    public static final Object T(Object[] objArr, k_s k_s, f_c f_c, m88 m88, int i) {
        Object X;
        jr_ jr_ = (jr_) m88;
        jr_.w(441892779);
        if ((i & 2) != 0) {
            k_s = e29.R;
        }
        Object obj = null;
        jr_.w(1059366469);
        int i2 = jr_.O;
        jjU.X(36);
        String num = Integer.toString(i2, 36);
        jr_.g(false);
        e9w e9w = (e9w) jr_.x(hcN.R);
        Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
        jr_.w(-568225417);
        boolean z = false;
        for (Object obj2 : copyOf) {
            z |= jr_.O(obj2);
        }
        Object I = jr_.I();
        if (z || I == ppN.R) {
            if (!(e9w == null || (X = e9w.X(num)) == null)) {
                obj = k_s.R(X);
            }
            I = obj == null ? f_c.g() : obj;
            jr_.ZW(I);
        }
        jr_.g(false);
        if (e9w != null) {
            caw.R(e9w, num, new ar(e9w, num, l6.s(k_s, jr_), l6.s(I, jr_), 4), jr_);
        }
        jr_.g(false);
        return I;
    }

    public static final void U(mpr mpr, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(352229465);
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
            g1c.c("No containers", null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, ((c_P) jr_.x(dB8.R)).L, jr_, 6, 0, 32766);
            vd.R(null, "Add distro", false, new gVU(mpr, 2), jr_, 48, 5);
            jQ.K(jr_, false, false, true, false);
            jr_.g(false);
            dYh t = jr_.t();
            if (t != null) {
                t.f2666R = new izD(mpr, i, 0);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static Type V(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            Type L = mzK.L(type, cls, mzK.c(type, cls, Collection.class), new LinkedHashSet());
            if (L instanceof WildcardType) {
                L = ((WildcardType) L).getUpperBounds()[0];
            }
            return L instanceof ParameterizedType ? ((ParameterizedType) L).getActualTypeArguments()[0] : Object.class;
        }
        throw new IllegalArgumentException();
    }

    public static boolean W(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("(");
        return str.startsWith(sb.toString()) && str.endsWith(")");
    }

    public static final boolean Y(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length != bArr2.length) {
            return false;
        }
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            i |= bArr[i2] ^ bArr2[i2];
        }
        return i == 0;
    }

    public static Class d(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            return (Class) ((ParameterizedType) type).getRawType();
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(d(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return d(((WildcardType) type).getUpperBounds()[0]);
        }
        String name = type == null ? "null" : type.getClass().getName();
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00b7, code lost:
        if ((r36 & 1) != 0) goto L_0x00c1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void g(int r29, java.lang.String r30, java.lang.String r31, defpackage.f_c r32, defpackage.f_c r33, defpackage.m88 r34, int r35, int r36) {
        /*
        // Method dump skipped, instructions count: 334
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cpc.g(int, java.lang.String, java.lang.String, f_c, f_c, m88, int, int):void");
    }

    public static final tY h() {
        return new tY(900000, 10000, null);
    }

    public static final void i(TextView textView, int i, String... strArr) {
        textView.setLinksClickable(true);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(Q(textView.getContext(), i, (String[]) Arrays.copyOf(strArr, strArr.length)));
    }

    public static final void j(OverviewViewModel overviewViewModel, MainSharedViewModel mainSharedViewModel, mpr mpr, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-496732533);
        h0T m = biy.m(mainSharedViewModel.R, jr_);
        h0T m2 = biy.m(overviewViewModel.f2770R, jr_);
        h0T m3 = biy.m(overviewViewModel.X, jr_);
        h0T m4 = biy.m(overviewViewModel.f2768R, jr_);
        hDC.v("Nestbox", null, null, aH9.I(jr_, 560281518, new jkU(mpr, biy.m(overviewViewModel.L, jr_), overviewViewModel, m3, 4)), aH9.I(jr_, 1110766471, new bkx(16, mpr)), aH9.I(jr_, -469724961, new caB(overviewViewModel, mpr, m2, biy.m(overviewViewModel.O, jr_), m4, m)), jr_, 224262, 6);
        H(overviewViewModel, jr_, 8);
        dYh t = jr_.t();
        if (t != null) {
            t.f2666R = new dR(overviewViewModel, mainSharedViewModel, mpr, i, 10);
        }
    }

    public static final void k(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i) {
        if (i < 0 || byteBuffer2.remaining() < i || byteBuffer3.remaining() < i || byteBuffer.remaining() < i) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        for (int i2 = 0; i2 < i; i2++) {
            byteBuffer.put((byte) (byteBuffer2.get() ^ byteBuffer3.get()));
        }
    }

    public static boolean l(int i, int i2) {
        if (i == 5) {
            if (i2 != 5) {
                return true;
            }
            i = 5;
        }
        if (i == 6) {
            if (i2 != 6 && i2 != 5) {
                return true;
            }
            i = 6;
        }
        if (i == 4 && i2 != 4) {
            return true;
        }
        if (i == 3 && (i2 == 2 || i2 == 7 || i2 == 1 || i2 == 8)) {
            return true;
        }
        if (i == 2) {
            return i2 == 1 || i2 == 8;
        }
        return false;
    }

    public static int[] n(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            if (i2 == 16842912) {
                return iArr;
            }
            if (i2 == 0) {
                int[] iArr2 = (int[]) iArr.clone();
                iArr2[i] = 16842912;
                return iArr2;
            }
        }
        int[] copyOf = Arrays.copyOf(iArr, iArr.length + 1);
        copyOf[iArr.length] = 16842912;
        return copyOf;
    }

    public static Drawable o(Drawable drawable, Drawable drawable2) {
        int i;
        int i2;
        if (drawable == null) {
            return drawable2;
        }
        if (drawable2 == null) {
            return drawable;
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{drawable, drawable2});
        if (drawable2.getIntrinsicWidth() == -1 || drawable2.getIntrinsicHeight() == -1) {
            i2 = drawable.getIntrinsicWidth();
            i = drawable.getIntrinsicHeight();
        } else if (drawable2.getIntrinsicWidth() > drawable.getIntrinsicWidth() || drawable2.getIntrinsicHeight() > drawable.getIntrinsicHeight()) {
            float intrinsicWidth = ((float) drawable2.getIntrinsicWidth()) / ((float) drawable2.getIntrinsicHeight());
            if (intrinsicWidth >= ((float) drawable.getIntrinsicWidth()) / ((float) drawable.getIntrinsicHeight())) {
                i2 = drawable.getIntrinsicWidth();
                i = (int) (((float) i2) / intrinsicWidth);
            } else {
                i = drawable.getIntrinsicHeight();
                i2 = (int) (intrinsicWidth * ((float) i));
            }
        } else {
            i2 = drawable2.getIntrinsicWidth();
            i = drawable2.getIntrinsicHeight();
        }
        layerDrawable.setLayerSize(1, i2, i);
        layerDrawable.setLayerGravity(1, 17);
        return layerDrawable;
    }

    public static final byte[] p(int i, int i2, int i3, byte[] bArr, byte[] bArr2) {
        if (i3 < 0 || bArr.length - i3 < i || bArr2.length - i3 < i2) {
            throw new IllegalArgumentException("That combination of buffers, offsets and length to xor result in out-of-bond accesses.");
        }
        byte[] bArr3 = new byte[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            bArr3[i4] = (byte) (bArr[i4 + i] ^ bArr2[i4 + i2]);
        }
        return bArr3;
    }

    public static Object r(b1t b1t, plU plu) {
        boolean z;
        Exception exc;
        mY_ my_ = mY_.L;
        xx xxVar = new xx(1, n3x.U(plu));
        xxVar.j();
        xxVar.y(new Wn(my_, 2, b1t));
        synchronized (b1t.R) {
            z = b1t.f1511R;
        }
        if (!z) {
            qy qyVar = new qy(1, xxVar);
            hye hye = nk8.R;
            ((aAx) b1t.v).v(new kVh(hye, qyVar));
            b1t.m();
            ((aAx) b1t.v).v(new kVh(hye, new bEP(xxVar)));
            b1t.m();
        } else if (b1t.X()) {
            xxVar.Y(b1t.c());
        } else {
            synchronized (b1t.R) {
                exc = (Exception) b1t.e;
            }
            if (exc != null) {
                xxVar.Y(new bvw(exc));
            } else {
                dE5 de5 = new dE5();
                n3x.y(n3x.class.getName(), de5);
                throw de5;
            }
        }
        return xxVar.P();
    }

    public static jCU s(Class cls, Type... typeArr) {
        if (typeArr.length != 0) {
            return new jCU(null, cls, typeArr);
        }
        throw new IllegalArgumentException("Missing type arguments for " + cls);
    }

    public static final void t(OverviewViewModel overviewViewModel, mpr mpr, m88 m88, int i) {
        jr_ jr_;
        jr_ jr_2 = (jr_) m88;
        jr_2.q(-850895729);
        h0T m = biy.m(overviewViewModel.v, jr_2);
        h0T m2 = biy.m(overviewViewModel.c, jr_2);
        h0T m3 = biy.m(overviewViewModel.e, jr_2);
        h0T m4 = biy.m(overviewViewModel.m, jr_2);
        h0T m5 = biy.m(overviewViewModel.x, jr_2);
        jr_2.w(773894976);
        jr_2.w(-492369756);
        Object I = jr_2.I();
        if (I == ppN.R) {
            hyO hyo = new hyO(caw.N(jr_2));
            jr_2.ZW(hyo);
            I = hyo;
        }
        boolean z = false;
        jr_2.g(false);
        jy_ jy_ = ((hyO) I).R;
        jr_2.g(false);
        jr_2.w(-932266287);
        if (((List) m.getValue()) == null || ((iGi) m3.getValue()) == iGi.DrmPending) {
            xt L = nA.L((float) 16);
            vV vVVar = dq.f2893v;
            jr_2.w(-483455358);
            aff aff = aff.R;
            bF9 R2 = VA.R(L, vVVar, jr_2);
            jr_2.w(-1323940314);
            jJj jjj = (jJj) jr_2.x(lnF.X);
            mdz mdz = (mdz) jr_2.x(lnF.H);
            bUo buo = (bUo) jr_2.x(lnF.P);
            h1U.R.getClass();
            fme fme = igT.R;
            dNH b = aH9.b(aff);
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
                oI9.R(null, 0, 0.0f, jr_2, 0, 7);
                if (((iGi) m3.getValue()) != null) {
                    jr_ = jr_2;
                    g1c.c(((iGi) m3.getValue()).R(), null, 0, 0, null, null, null, 0, null, null, 0, 0, false, 0, null, null, jr_, 0, 0, 65534);
                } else {
                    jr_ = jr_2;
                }
                jQ.K(jr_, false, false, true, false);
                jr_.g(false);
                jr_.g(false);
                dYh t = jr_.t();
                if (t != null) {
                    t.f2666R = new kF0(overviewViewModel, mpr, i, 0);
                    return;
                }
                return;
            }
            l6.u();
            throw null;
        }
        jr_2.g(false);
        xt L2 = nA.L((float) 16);
        jr_2.w(-483455358);
        aff aff2 = aff.R;
        bF9 R3 = VA.R(L2, dq.f2881R, jr_2);
        jr_2.w(-1323940314);
        jJj jjj2 = (jJj) jr_2.x(lnF.X);
        mdz mdz2 = (mdz) jr_2.x(lnF.H);
        bUo buo2 = (bUo) jr_2.x(lnF.P);
        h1U.R.getClass();
        fme fme2 = igT.R;
        dNH b2 = aH9.b(aff2);
        if (jr_2.f5052R instanceof Su) {
            jr_2.mL();
            if (jr_2.f5050L) {
                jr_2.H(fme2);
            } else {
                jr_2.BF();
            }
            jr_2.f5078e = false;
            l6.p(jr_2, R3, igT.c);
            l6.p(jr_2, jjj2, igT.v);
            l6.p(jr_2, mdz2, igT.e);
            jQ.o(0, b2, jQ.m(jr_2, buo2, igT.X, jr_2), jr_2, 2058660585, -1163856341);
            jr_2.w(-845527358);
            if (((List) m.getValue()).isEmpty()) {
                U(mpr, jr_2, 8);
            }
            jr_2.g(false);
            for (b1n b1n : (List) m.getValue()) {
                dM_ dm_ = (dM_) d7V.f2502R.get(b1n.R);
                if (dm_ != null) {
                    boolean v = n3x.v((b1n) m4.getValue(), b1n);
                    boolean v2 = n3x.v((b1n) m5.getValue(), b1n);
                    dTl.e(null, null, n3x.X(((n3) jr_2.x(kft.R)).f6279R, jr_2, 32768, 13), null, null, aH9.I(jr_2, -1311101343, new gq1((v || v2) ? z : true, jy_, overviewViewModel, b1n, mpr, dm_, v2, v, m2)), jr_2, 196608, 27);
                    z = false;
                    jy_ = jy_;
                    m4 = m4;
                }
            }
            jQ.K(jr_2, z, z, true, z);
            jr_2.g(z);
            dYh t2 = jr_2.t();
            if (t2 != null) {
                t2.f2666R = new kF0(overviewViewModel, mpr, i, 1);
                return;
            }
            return;
        }
        l6.u();
        throw null;
    }

    public static final Object u(Context context, Class cls) {
        return hDC.C(cls, cUF.m(context.getApplicationContext()));
    }

    public static final void y(ConfigViewModel configViewModel, m88 m88, int i) {
        jr_ jr_ = (jr_) m88;
        jr_.q(-1581964829);
        if ((i & 1) != 0 || !jr_.J()) {
            jr_.w(-483455358);
            aff aff = aff.R;
            bF9 R2 = VA.R(nA.f6330R, dq.f2881R, jr_);
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
                P(R.string.onboarding_config, jr_, 0);
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
            t.f2666R = new m2w(i, 9, configViewModel);
        }
    }

    public static lV8 z(String str) {
        Map unmodifiableMap;
        Logger logger = kWP.f5319R;
        synchronized (kWP.class) {
            unmodifiableMap = Collections.unmodifiableMap(kWP.e);
        }
        lV8 lv8 = (lV8) unmodifiableMap.get(str);
        if (lv8 != null) {
            return lv8;
        }
        throw new GeneralSecurityException(opT.H("cannot find key template: ", str));
    }
}
