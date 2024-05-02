package defpackage;

import android.view.KeyEvent;
import android.view.View;
import dev.kdrag0n.virtcontainer.R;
import java.util.Objects;

/* renamed from: fKW  reason: default package */
/* loaded from: classes.dex */
public abstract class fKW {
    public static void L(View view, boolean z) {
        view.setAccessibilityHeading(z);
    }

    public static <T> T O(View view, int i) {
        return (T) view.requireViewById(i);
    }

    public static void R(View view, gK6 gk6) {
        cE0 ce0 = (cE0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (ce0 == null) {
            ce0 = new cE0();
            view.setTag(R.id.tag_unhandled_key_listeners, ce0);
        }
        Objects.requireNonNull(gk6);
        View.OnUnhandledKeyEventListener piy = new View.OnUnhandledKeyEventListener(gk6) { // from class: piy
            @Override // android.view.View.OnUnhandledKeyEventListener
            public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                throw null;
            }
        };
        ce0.put(gk6, piy);
        view.addOnUnhandledKeyEventListener(piy);
    }

    public static void X(View view, gK6 gk6) {
        View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
        cE0 ce0 = (cE0) view.getTag(R.id.tag_unhandled_key_listeners);
        if (ce0 != null && (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) ce0.getOrDefault(gk6, null)) != null) {
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }
    }

    public static void Z(View view, CharSequence charSequence) {
        view.setAccessibilityPaneTitle(charSequence);
    }

    public static boolean c(View view) {
        return view.isAccessibilityHeading();
    }

    public static boolean e(View view) {
        return view.isScreenReaderFocusable();
    }

    public static void m(View view, boolean z) {
        view.setScreenReaderFocusable(z);
    }

    public static CharSequence v(View view) {
        return view.getAccessibilityPaneTitle();
    }
}
