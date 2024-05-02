package defpackage;

import android.view.View;
import java.lang.ref.WeakReference;

/* renamed from: ozg  reason: default package */
/* loaded from: classes.dex */
public final class ozg {
    public final WeakReference R;

    public ozg(View view) {
        this.R = new WeakReference(view);
    }

    public final void R(float f) {
        View view = (View) this.R.get();
        if (view != null) {
            view.animate().alpha(f);
        }
    }

    public final void X(float f) {
        View view = (View) this.R.get();
        if (view != null) {
            view.animate().translationY(f);
        }
    }

    public final void c(long j) {
        View view = (View) this.R.get();
        if (view != null) {
            view.animate().setDuration(j);
        }
    }

    public final void e(eIH eih) {
        View view = (View) this.R.get();
        if (view == null) {
            return;
        }
        if (eih != null) {
            view.animate().setListener(new nyU(this, eih, view, 0));
        } else {
            view.animate().setListener(null);
        }
    }

    public final void v() {
        View view = (View) this.R.get();
        if (view != null) {
            view.animate().cancel();
        }
    }
}
