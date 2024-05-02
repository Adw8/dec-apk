package defpackage;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: iV4  reason: default package */
/* loaded from: classes.dex */
public final class iV4 implements Runnable {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f4621R;
    public final /* synthetic */ int e;
    public final Object v;

    public iV4(m4i m4i, alX alx) {
        this.e = 0;
        this.f4621R = false;
        this.R = m4i;
        this.v = alx;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                if (!this.f4621R) {
                    ((m4i) this.R).X((alX) this.v);
                    this.f4621R = true;
                    return;
                }
                return;
            default:
                fen fen = ((SwipeDismissBehavior) this.v).f2253R;
                if (fen != null && fen.L()) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    mHC.C((View) this.R, this);
                    return;
                } else if (this.f4621R) {
                    ((SwipeDismissBehavior) this.v).getClass();
                    return;
                } else {
                    return;
                }
        }
    }

    public iV4(SwipeDismissBehavior swipeDismissBehavior, View view, boolean z) {
        this.e = 1;
        this.v = swipeDismissBehavior;
        this.R = view;
        this.f4621R = z;
    }
}
