package defpackage;

import android.view.View;
import java.util.Collection;

/* renamed from: k56  reason: default package */
/* loaded from: classes.dex */
public abstract class k56 {
    public static void C(View view, boolean z) {
        view.setKeyboardNavigationCluster(z);
    }

    public static void H(View view, boolean z) {
        view.setFocusedByDefault(z);
    }

    public static boolean L(View view) {
        return view.isKeyboardNavigationCluster();
    }

    public static void N(View view, int i) {
        view.setNextClusterForwardId(i);
    }

    public static boolean O(View view) {
        return view.isImportantForAutofill();
    }

    public static void P(View view, CharSequence charSequence) {
        view.setTooltipText(charSequence);
    }

    public static void R(View view, Collection<View> collection, int i) {
        view.addKeyboardNavigationClusters(collection, i);
    }

    public static void U(View view, int i) {
        view.setImportantForAutofill(i);
    }

    public static boolean X(View view) {
        return view.isFocusedByDefault();
    }

    public static View Z(View view, View view2, int i) {
        return view.keyboardNavigationClusterSearch(view2, i);
    }

    public static int c(View view) {
        return view.getNextClusterForwardId();
    }

    public static boolean e(View view) {
        return view.hasExplicitFocusable();
    }

    public static boolean m(View view) {
        return view.restoreDefaultFocus();
    }

    public static int v(View view) {
        return view.getImportantForAutofill();
    }

    public static void x(View view, String... strArr) {
        view.setAutofillHints(strArr);
    }
}
