package defpackage;

import android.view.ViewTreeObserver;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: ay4  reason: default package */
/* loaded from: classes.dex */
public final class ay4 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ CoordinatorLayout R;

    public ay4(CoordinatorLayout coordinatorLayout) {
        this.R = coordinatorLayout;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.R.j(0);
        return true;
    }
}
