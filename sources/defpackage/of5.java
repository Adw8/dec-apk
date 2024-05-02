package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import dev.kdrag0n.virtcontainer.R;
import java.util.ArrayList;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: of5  reason: default package */
/* loaded from: classes.dex */
public abstract class of5 {

    /* renamed from: R  reason: collision with other field name */
    public static WeakHashMap f6887R = null;

    /* renamed from: R  reason: collision with other field name */
    public static final int[] f6888R = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final hUM R = new hUM();

    static {
        new AtomicInteger(1);
        new gkL();
    }

    public static void L(View view, CharSequence charSequence) {
        new g59(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).c(view, charSequence);
        if (charSequence != null) {
            hUM hum = R;
            hum.R.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(hum);
            if (d6y.v(view)) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(hum);
                return;
            }
            return;
        }
        hUM hum2 = R;
        hum2.R.remove(view);
        view.removeOnAttachStateChangeListener(hum2);
        mHC.P(view.getViewTreeObserver(), hum2);
    }

    public static void O(View view, G5 g5) {
        if (g5 == null && (hpL.R(view) instanceof ma)) {
            g5 = new G5();
        }
        view.setAccessibilityDelegate(g5 == null ? null : g5.f156R);
    }

    public static ozg R(View view) {
        if (f6887R == null) {
            f6887R = new WeakHashMap();
        }
        ozg ozg = (ozg) f6887R.get(view);
        if (ozg != null) {
            return ozg;
        }
        ozg ozg2 = new ozg(view);
        f6887R.put(view, ozg2);
        return ozg2;
    }

    public static void X(View view, Ex ex, RL rl) {
        Ex ex2 = new Ex(null, ex.f108R, null, rl, ex.f110R);
        View.AccessibilityDelegate R2 = hpL.R(view);
        G5 g5 = R2 == null ? null : R2 instanceof ma ? ((ma) R2).R : new G5(R2);
        if (g5 == null) {
            g5 = new G5();
        }
        O(view, g5);
        e(view, ex2.R());
        v(view).add(ex2);
        c(view, 0);
    }

    public static void c(View view, int i) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z = ((CharSequence) new g59(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).v(view)) != null && view.isShown() && view.getWindowVisibility() == 0;
            int i2 = 32;
            if (d6y.R(view) != 0 || z) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                if (!z) {
                    i2 = 2048;
                }
                obtain.setEventType(i2);
                d6y.L(obtain, i);
                if (z) {
                    obtain.getText().add((CharSequence) new g59(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).v(view));
                    if (mHC.c(view) == 0) {
                        mHC.t(view, 1);
                    }
                    ViewParent parent = view.getParent();
                    while (true) {
                        if (!(parent instanceof View)) {
                            break;
                        } else if (mHC.c((View) parent) == 4) {
                            mHC.t(view, 2);
                            break;
                        } else {
                            parent = parent.getParent();
                        }
                    }
                }
                view.sendAccessibilityEventUnchecked(obtain);
            } else if (i == 32) {
                AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain2);
                obtain2.setEventType(32);
                d6y.L(obtain2, i);
                obtain2.setSource(view);
                view.onPopulateAccessibilityEvent(obtain2);
                obtain2.getText().add((CharSequence) new g59(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).v(view));
                accessibilityManager.sendAccessibilityEvent(obtain2);
            } else if (view.getParent() != null) {
                try {
                    d6y.X(view.getParent(), view, view, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e);
                }
            }
        }
    }

    public static void e(View view, int i) {
        ArrayList v = v(view);
        for (int i2 = 0; i2 < v.size(); i2++) {
            if (((Ex) v.get(i2)).R() == i) {
                v.remove(i2);
                return;
            }
        }
    }

    public static ArrayList v(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(R.id.tag_accessibility_actions, arrayList2);
        return arrayList2;
    }
}
