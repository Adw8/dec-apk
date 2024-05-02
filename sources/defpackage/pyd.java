package defpackage;

import android.view.View;

/* renamed from: pyd  reason: default package */
/* loaded from: classes.dex */
public final class pyd implements View.OnAttachStateChangeListener {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f7329R;
    public final /* synthetic */ int e;

    public /* synthetic */ pyd(View view, Object obj, int i) {
        this.e = i;
        this.R = view;
        this.f7329R = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
                nu_ s = aH9.s((LG) this.R);
                LG lg = (LG) this.R;
                if (s != null) {
                    ((nWW) this.f7329R).R = hDC.e(lg, s.O());
                    ((LG) this.R).removeOnAttachStateChangeListener(this);
                    return;
                }
                throw new IllegalStateException(("View tree for " + lg + " has no ViewTreeLifecycleOwner").toString());
            default:
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.e) {
            case 0:
                return;
            default:
                this.R.removeOnAttachStateChangeListener(this);
                ((fLL) this.f7329R).y();
                return;
        }
    }
}
