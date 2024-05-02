package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;
import androidx.core.widget.NestedScrollView;

/* renamed from: pxk  reason: default package */
/* loaded from: classes.dex */
public final class pxk extends G5 {
    @Override // defpackage.G5
    public final boolean L(View view, int i, Bundle bundle) {
        if (super.L(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        int height = nestedScrollView.getHeight();
        Rect rect = new Rect();
        if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
            height = rect.height();
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int max = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.i(0 - nestedScrollView.getScrollX(), max - nestedScrollView.getScrollY(), true);
                return true;
            } else if (i != 16908346) {
                return false;
            }
        }
        int min = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.i(0 - nestedScrollView.getScrollX(), min - nestedScrollView.getScrollY(), true);
        return true;
    }

    @Override // defpackage.G5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        KR.c(accessibilityEvent, nestedScrollView.getScrollX());
        KR.e(accessibilityEvent, nestedScrollView.getScrollRange());
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        int scrollRange;
        ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        jGVar.L(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
            jGVar.m(true);
            if (nestedScrollView.getScrollY() > 0) {
                jGVar.v(Ex.X);
                jGVar.v(Ex.m);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                jGVar.v(Ex.e);
                jGVar.v(Ex.H);
            }
        }
    }
}
