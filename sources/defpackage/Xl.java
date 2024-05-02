package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.util.DisplayMetrics;

/* renamed from: Xl  reason: default package */
/* loaded from: classes.dex */
public abstract class Xl {
    public static final u_ R(Bitmap bitmap) {
        u_ v;
        ColorSpace colorSpace = bitmap.getColorSpace();
        if (colorSpace != null && (v = v(colorSpace)) != null) {
            return v;
        }
        float[] fArr = K6.f230R;
        return K6.R;
    }

    public static final Bitmap c(int i, int i2, int i3, boolean z, u_ u_Var) {
        return Bitmap.createBitmap((DisplayMetrics) null, i, i2, gQc.a(i3), z, e(u_Var));
    }

    public static final ColorSpace e(u_ u_Var) {
        return ColorSpace.get(n3x.v(u_Var, K6.R) ? ColorSpace.Named.SRGB : n3x.v(u_Var, K6.C) ? ColorSpace.Named.ACES : n3x.v(u_Var, K6.N) ? ColorSpace.Named.ACESCG : n3x.v(u_Var, K6.H) ? ColorSpace.Named.ADOBE_RGB : n3x.v(u_Var, K6.O) ? ColorSpace.Named.BT2020 : n3x.v(u_Var, K6.X) ? ColorSpace.Named.BT709 : n3x.v(u_Var, K6.f229R) ? ColorSpace.Named.CIE_LAB : n3x.v(u_Var, K6.f228R) ? ColorSpace.Named.CIE_XYZ : n3x.v(u_Var, K6.L) ? ColorSpace.Named.DCI_P3 : n3x.v(u_Var, K6.Z) ? ColorSpace.Named.DISPLAY_P3 : n3x.v(u_Var, K6.c) ? ColorSpace.Named.EXTENDED_SRGB : n3x.v(u_Var, K6.e) ? ColorSpace.Named.LINEAR_EXTENDED_SRGB : n3x.v(u_Var, K6.v) ? ColorSpace.Named.LINEAR_SRGB : n3x.v(u_Var, K6.m) ? ColorSpace.Named.NTSC_1953 : n3x.v(u_Var, K6.U) ? ColorSpace.Named.PRO_PHOTO_RGB : n3x.v(u_Var, K6.x) ? ColorSpace.Named.SMPTE_C : ColorSpace.Named.SRGB);
    }

    public static final u_ v(ColorSpace colorSpace) {
        return n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.SRGB)) ? K6.R : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.ACES)) ? K6.C : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.ACESCG)) ? K6.N : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.ADOBE_RGB)) ? K6.H : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.BT2020)) ? K6.O : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.BT709)) ? K6.X : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_LAB)) ? K6.f229R : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.CIE_XYZ)) ? K6.f228R : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.DCI_P3)) ? K6.L : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.DISPLAY_P3)) ? K6.Z : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB)) ? K6.c : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB)) ? K6.e : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.LINEAR_SRGB)) ? K6.v : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.NTSC_1953)) ? K6.m : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB)) ? K6.U : n3x.v(colorSpace, ColorSpace.get(ColorSpace.Named.SMPTE_C)) ? K6.x : K6.R;
    }
}
