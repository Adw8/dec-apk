package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: iP3  reason: default package */
/* loaded from: classes.dex */
public final class iP3 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener {
    public final View R;

    /* renamed from: R  reason: collision with other field name */
    public final f_c f4578R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4579R;

    public iP3(View view, e2z e2z) {
        this.R = view;
        this.f4578R = e2z;
        view.addOnAttachStateChangeListener(this);
        if (!this.f4579R && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f4579R = true;
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        this.f4578R.g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        if (!this.f4579R && this.R.isAttachedToWindow()) {
            this.R.getViewTreeObserver().addOnGlobalLayoutListener(this);
            this.f4579R = true;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (this.f4579R) {
            this.R.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.f4579R = false;
        }
    }
}
