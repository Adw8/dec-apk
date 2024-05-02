package defpackage;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* renamed from: Py  reason: default package */
/* loaded from: classes.dex */
public final class Py implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ j3 f392R;

    public Py(j3 j3Var, Cx cx) {
        this.f392R = j3Var;
        this.R = cx;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        ViewTreeObserver viewTreeObserver = this.f392R.R.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeGlobalOnLayoutListener(this.R);
        }
    }
}
