package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import dev.kdrag0n.virtcontainer.R;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ma  reason: default package */
/* loaded from: classes.dex */
public final class ma extends View.AccessibilityDelegate {
    public final G5 R;

    public ma(G5 g5) {
        this.R = g5;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.R.R(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        Zz v = this.R.v(view);
        if (v != null) {
            return (AccessibilityNodeProvider) v.R;
        }
        return null;
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.R.c(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        jG jGVar = new jG(accessibilityNodeInfo);
        WeakHashMap weakHashMap = of5.f6887R;
        Boolean bool = (Boolean) new g59(R.id.tag_screen_reader_focusable, 0).v(view);
        boolean z = true;
        accessibilityNodeInfo.setScreenReaderFocusable(bool != null && bool.booleanValue());
        Boolean bool2 = (Boolean) new g59(R.id.tag_accessibility_heading, 3).v(view);
        if (bool2 == null || !bool2.booleanValue()) {
            z = false;
        }
        accessibilityNodeInfo.setHeading(z);
        accessibilityNodeInfo.setPaneTitle((CharSequence) new g59(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).v(view));
        jGVar.x((CharSequence) new g59(R.id.tag_state_description, CharSequence.class, 64, 30, 2).v(view));
        this.R.e(view, jGVar);
        accessibilityNodeInfo.getText();
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        for (int i = 0; i < list.size(); i++) {
            jGVar.v((Ex) list.get(i));
        }
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.R.X(view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.R.O(viewGroup, view, accessibilityEvent);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.R.L(view, i, bundle);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEvent(View view, int i) {
        this.R.Z(view, i);
    }

    @Override // android.view.View.AccessibilityDelegate
    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.R.m(view, accessibilityEvent);
    }
}
