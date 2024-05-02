package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;

/* renamed from: lM2  reason: default package */
/* loaded from: classes.dex */
public abstract class lM2 {
    public static final ThreadLocal R = new ThreadLocal();

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f5664R = {-16842910};
    public static final int[] v = {16842908};
    public static final int[] c = {16842919};
    public static final int[] e = {16842912};
    public static final int[] X = new int[0];
    public static final int[] O = new int[1];

    public static void R(View view, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iTI.x);
        try {
            if (!obtainStyledAttributes.hasValue(117)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static int c(Context context, int i) {
        int[] iArr = O;
        iArr[0] = i;
        CV Y = CV.Y(context, null, iArr);
        try {
            return ((TypedArray) Y.v).getColor(0, 0);
        } finally {
            Y.z();
        }
    }

    public static ColorStateList e(Context context, int i) {
        int[] iArr = O;
        iArr[0] = i;
        CV Y = CV.Y(context, null, iArr);
        try {
            return Y.m(0);
        } finally {
            Y.z();
        }
    }

    public static int v(Context context, int i) {
        ColorStateList e2 = e(context, i);
        if (e2 != null && e2.isStateful()) {
            return e2.getColorForState(f5664R, e2.getDefaultColor());
        }
        ThreadLocal threadLocal = R;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            threadLocal.set(typedValue);
        }
        context.getTheme().resolveAttribute(16842803, typedValue, true);
        float f = typedValue.getFloat();
        int c2 = c(context, i);
        return B7.c(c2, Math.round(((float) Color.alpha(c2)) * f));
    }
}
