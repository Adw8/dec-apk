package defpackage;

import android.view.View;
import android.view.WindowInsets;
import java.util.WeakHashMap;

/* renamed from: gWM  reason: default package */
/* loaded from: classes.dex */
public final class gWM {
    public static final gWM R = k_O.c;

    /* renamed from: R  reason: collision with other field name */
    public final ibz f3779R;

    public gWM(WindowInsets windowInsets) {
        this.f3779R = new k_O(this, windowInsets);
    }

    public static gWM Z(View view, WindowInsets windowInsets) {
        windowInsets.getClass();
        gWM gwm = new gWM(windowInsets);
        if (view != null) {
            WeakHashMap weakHashMap = of5.f6887R;
            if (d6y.v(view)) {
                gwm.f3779R.P(jUJ.R(view));
                gwm.f3779R.e(view.getRootView());
            }
        }
        return gwm;
    }

    public final WindowInsets L() {
        ibz ibz = this.f3779R;
        if (ibz instanceof fhi) {
            return ((fhi) ibz).R;
        }
        return null;
    }

    public final int O() {
        return this.f3779R.m().v;
    }

    public final ojk R(int i) {
        return this.f3779R.O(i);
    }

    public final int X() {
        return this.f3779R.m().c;
    }

    public final int c() {
        return this.f3779R.m().e;
    }

    public final int e() {
        return this.f3779R.m().f6899R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gWM)) {
            return false;
        }
        return cTo.R(this.f3779R, ((gWM) obj).f3779R);
    }

    public final int hashCode() {
        ibz ibz = this.f3779R;
        if (ibz == null) {
            return 0;
        }
        return ibz.hashCode();
    }

    public final ojk v(int i) {
        return this.f3779R.L(i);
    }

    public gWM() {
        this.f3779R = new ibz(this);
    }
}
