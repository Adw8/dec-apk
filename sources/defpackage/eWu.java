package defpackage;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

/* renamed from: eWu  reason: default package */
/* loaded from: classes.dex */
public final class eWu implements Runnable {
    public final /* synthetic */ k_G R;
    public final /* synthetic */ int e;

    public /* synthetic */ eWu(k_G k_g, int i) {
        this.e = i;
        this.R = k_g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                ViewParent parent = this.R.f5351R.getParent();
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                    return;
                }
                return;
            default:
                k_G k_g = this.R;
                k_g.R();
                View view = k_g.f5351R;
                if (view.isEnabled() && !view.isLongClickable() && k_g.c()) {
                    view.getParent().requestDisallowInterceptTouchEvent(true);
                    long uptimeMillis = SystemClock.uptimeMillis();
                    MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                    view.onTouchEvent(obtain);
                    obtain.recycle();
                    k_g.f5353R = true;
                    return;
                }
                return;
        }
    }
}
