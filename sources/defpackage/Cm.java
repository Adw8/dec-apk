package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;

/* renamed from: Cm  reason: default package */
/* loaded from: classes.dex */
public final class Cm extends ViewGroup {
    public final HashMap R = new HashMap();
    public final HashMap v = new HashMap();

    public Cm(Context context) {
        super(context);
        setClipChildren(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<qc, fue> getHolderToLayoutNode() {
        return this.R;
    }

    public final HashMap<fue, qc> getLayoutNodeToHolder() {
        return this.v;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (qc qcVar : this.R.keySet()) {
            qcVar.layout(qcVar.getLeft(), qcVar.getTop(), qcVar.getRight(), qcVar.getBottom());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        boolean z = true;
        if (View.MeasureSpec.getMode(i) == 1073741824) {
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                z = false;
            }
            if (z) {
                setMeasuredDimension(View.MeasureSpec.getSize(i), View.MeasureSpec.getSize(i2));
                for (qc qcVar : this.R.keySet()) {
                    int i4 = qcVar.e;
                    if (!(i4 == Integer.MIN_VALUE || (i3 = qcVar.X) == Integer.MIN_VALUE)) {
                        qcVar.measure(i4, i3);
                    }
                }
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // android.view.ViewParent, android.view.View
    public final void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = getChildAt(i);
            fue fue = (fue) this.R.get(childAt);
            if (childAt.isLayoutRequested() && fue != null) {
                jxi jxi = fue.f3587R;
                fue.r(false);
            }
        }
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
