package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: j9a  reason: default package */
/* loaded from: classes.dex */
public final class j9a implements ViewGroup.OnHierarchyChangeListener {
    public final /* synthetic */ CoordinatorLayout R;

    public j9a(CoordinatorLayout coordinatorLayout) {
        this.R = coordinatorLayout;
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewAdded(View view, View view2) {
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.R.f1264R;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewAdded(view, view2);
        }
    }

    @Override // android.view.ViewGroup.OnHierarchyChangeListener
    public final void onChildViewRemoved(View view, View view2) {
        this.R.j(2);
        ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.R.f1264R;
        if (onHierarchyChangeListener != null) {
            onHierarchyChangeListener.onChildViewRemoved(view, view2);
        }
    }
}
