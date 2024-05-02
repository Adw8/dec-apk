package defpackage;

import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import dev.kdrag0n.virtcontainer.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: G5  reason: default package */
/* loaded from: classes.dex */
public class G5 {
    public static final View.AccessibilityDelegate v = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate R;

    /* renamed from: R  reason: collision with other field name */
    public final ma f156R;

    public G5() {
        this(v);
    }

    public boolean L(View view, int i, Bundle bundle) {
        ClickableSpan[] clickableSpanArr;
        boolean z;
        WeakReference weakReference;
        boolean z2;
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        boolean z3 = false;
        int i2 = 0;
        while (true) {
            clickableSpanArr = null;
            if (i2 >= list.size()) {
                break;
            }
            Ex ex = (Ex) list.get(i2);
            if (ex.R() != i) {
                i2++;
            } else if (ex.f109R != null) {
                Class cls = ex.f110R;
                if (cls != null) {
                    try {
                        jQ.Y(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                        throw null;
                    } catch (Exception e) {
                        Class cls2 = ex.f110R;
                        Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + (cls2 == null ? "null" : cls2.getName()), e);
                    }
                }
                z = ex.f109R.c(view);
            }
        }
        z = false;
        if (!z) {
            z = hy.v(this.R, view, i, bundle);
        }
        if (z || i != R.id.accessibility_action_clickable_span || bundle == null) {
            return z;
        }
        int i3 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (!(sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i3)) == null)) {
            ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
            if (clickableSpan != null) {
                CharSequence text = view.createAccessibilityNodeInfo().getText();
                if (text instanceof Spanned) {
                    clickableSpanArr = (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class);
                }
                int i4 = 0;
                while (clickableSpanArr != null && i4 < clickableSpanArr.length) {
                    if (clickableSpan.equals(clickableSpanArr[i4])) {
                        z2 = true;
                        break;
                    }
                    i4++;
                }
            }
            z2 = false;
            if (z2) {
                clickableSpan.onClick(view);
                z3 = true;
            }
        }
        return z3;
    }

    public boolean O(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.R.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean R(View view, AccessibilityEvent accessibilityEvent) {
        return this.R.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void X(View view, AccessibilityEvent accessibilityEvent) {
        this.R.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void Z(View view, int i) {
        this.R.sendAccessibilityEvent(view, i);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.R.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void e(View view, jG jGVar) {
        this.R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
    }

    public void m(View view, AccessibilityEvent accessibilityEvent) {
        this.R.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public Zz v(View view) {
        AccessibilityNodeProvider R = hy.R(this.R, view);
        if (R != null) {
            return new Zz(R);
        }
        return null;
    }

    public G5(View.AccessibilityDelegate accessibilityDelegate) {
        this.R = accessibilityDelegate;
        this.f156R = new ma(this);
    }
}
