package defpackage;

import androidx.navigation.fragment.NavHostFragment;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: jw  reason: default package */
/* loaded from: classes.dex */
public abstract class jw extends Zh {
    public mpr R;

    public final void J() {
        mpr mpr = ((NavHostFragment) ((eAj) ((hm9) this).R.R).f3006R.z(R.id.nav_host_fragment)).R;
        if (mpr != null) {
            this.R = mpr;
            return;
        }
        throw new IllegalStateException("NavController is not available before onCreate()".toString());
    }

    @Override // defpackage.pJ
    public final boolean o() {
        mpr mpr = this.R;
        if (mpr == null) {
            mpr = null;
        }
        return mpr.C();
    }
}
