package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: nZr  reason: default package */
/* loaded from: classes.dex */
public final class nZr implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public final View R;

    /* renamed from: R  reason: collision with other field name */
    public ViewTreeObserver f6432R;

    /* renamed from: R  reason: collision with other field name */
    public final Runnable f6433R;

    public nZr(View view, Runnable runnable) {
        this.R = view;
        this.f6432R = view.getViewTreeObserver();
        this.f6433R = runnable;
    }

    public static void R(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        } else if (runnable != null) {
            nZr nzr = new nZr(view, runnable);
            view.getViewTreeObserver().addOnPreDrawListener(nzr);
            view.addOnAttachStateChangeListener(nzr);
        } else {
            throw new NullPointerException("runnable == null");
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        v();
        this.f6433R.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.f6432R = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        v();
    }

    public final void v() {
        if (this.f6432R.isAlive()) {
            this.f6432R.removeOnPreDrawListener(this);
        } else {
            this.R.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.R.removeOnAttachStateChangeListener(this);
    }
}
