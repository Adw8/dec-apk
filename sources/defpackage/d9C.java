package defpackage;

import android.view.WindowInsets;

/* renamed from: d9C  reason: default package */
/* loaded from: classes.dex */
public abstract class d9C extends fhi {
    public ojk v = null;

    public d9C(gWM gwm, WindowInsets windowInsets) {
        super(gwm, windowInsets);
    }

    @Override // defpackage.ibz
    public boolean H() {
        return ((fhi) this).R.isConsumed();
    }

    @Override // defpackage.ibz
    public final ojk Z() {
        if (this.v == null) {
            this.v = ojk.v(((fhi) this).R.getStableInsetLeft(), ((fhi) this).R.getStableInsetTop(), ((fhi) this).R.getStableInsetRight(), ((fhi) this).R.getStableInsetBottom());
        }
        return this.v;
    }

    @Override // defpackage.ibz
    public gWM c() {
        return gWM.Z(null, ((fhi) this).R.consumeSystemWindowInsets());
    }

    @Override // defpackage.ibz
    public gWM v() {
        return gWM.Z(null, ((fhi) this).R.consumeStableInsets());
    }
}
