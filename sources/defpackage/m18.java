package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: m18  reason: default package */
/* loaded from: classes.dex */
public abstract class m18 {
    public static float C(View view) {
        return view.getZ();
    }

    public static String H(View view) {
        return view.getTransitionName();
    }

    public static void J(View view, float f) {
        view.setZ(f);
    }

    public static void K(View view, float f) {
        view.setTranslationZ(f);
    }

    public static ColorStateList L(View view) {
        return view.getBackgroundTintList();
    }

    public static boolean N(View view) {
        return view.hasNestedScrollingParent();
    }

    public static boolean O(View view, int i, int i2, int i3, int i4, int[] iArr) {
        return view.dispatchNestedScroll(i, i2, i3, i4, iArr);
    }

    public static boolean P(View view) {
        return view.isImportantForAccessibility();
    }

    public static void R(WindowInsets windowInsets, View view) {
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback);
        if (onApplyWindowInsetsListener != null) {
            onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
        }
    }

    public static float U(View view) {
        return view.getTranslationZ();
    }

    public static void V(View view, mpM mpm) {
        if (mpm == null) {
            view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(R.id.tag_window_insets_animation_callback));
        } else {
            view.setOnApplyWindowInsetsListener(new hFd(view, mpm));
        }
    }

    public static boolean X(View view, int i, int i2, int[] iArr, int[] iArr2) {
        return view.dispatchNestedPreScroll(i, i2, iArr, iArr2);
    }

    public static boolean Y(View view, int i) {
        return view.startNestedScroll(i);
    }

    public static PorterDuff.Mode Z(View view) {
        return view.getBackgroundTintMode();
    }

    public static boolean c(View view, float f, float f2, boolean z) {
        return view.dispatchNestedFling(f, f2, z);
    }

    public static boolean e(View view, float f, float f2) {
        return view.dispatchNestedPreFling(f, f2);
    }

    public static void g(View view, ColorStateList colorStateList) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void h(View view) {
        view.stopNestedScroll();
    }

    public static void i(View view, boolean z) {
        view.setNestedScrollingEnabled(z);
    }

    public static boolean j(View view) {
        return view.isNestedScrollingEnabled();
    }

    public static float m(View view) {
        return view.getElevation();
    }

    public static void o(View view, String str) {
        view.setTransitionName(str);
    }

    public static void t(View view, float f) {
        view.setElevation(f);
    }

    public static gWM v(View view, gWM gwm, Rect rect) {
        WindowInsets L = gwm.L();
        if (L != null) {
            return gWM.Z(view, view.computeSystemWindowInsets(L, rect));
        }
        rect.setEmpty();
        return gwm;
    }

    public static gWM x(View view) {
        if (gHr.f3718R && view.isAttachedToWindow()) {
            try {
                Object obj = gHr.R.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) gHr.v.get(obj);
                    Rect rect2 = (Rect) gHr.c.get(obj);
                    if (!(rect == null || rect2 == null)) {
                        h89 h89 = new h89(11);
                        ((isJ) h89.R).e(ojk.v(rect.left, rect.top, rect.right, rect.bottom));
                        ((isJ) h89.R).O(ojk.v(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        gWM O = h89.O();
                        O.f3779R.P(O);
                        O.f3779R.e(view.getRootView());
                        return O;
                    }
                }
            } catch (IllegalAccessException e) {
                StringBuilder U = opT.U("Failed to get insets from AttachInfo. ");
                U.append(e.getMessage());
                Log.w("WindowInsetsCompat", U.toString(), e);
            }
        }
        return null;
    }

    public static void y(View view, PorterDuff.Mode mode) {
        view.setBackgroundTintMode(mode);
    }
}
