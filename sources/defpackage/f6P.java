package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;

/* renamed from: f6P  reason: default package */
/* loaded from: classes.dex */
public final class f6P extends Zz {
    public final /* synthetic */ dMS R;

    public f6P(dMS dms) {
        this.R = dms;
    }

    @Override // defpackage.Zz
    public final jG O(int i) {
        int i2 = i == 2 ? this.R.f2572R : this.R.v;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return X(i2);
    }

    @Override // defpackage.Zz
    public final boolean U(int i, int i2, Bundle bundle) {
        int i3;
        dMS dms = this.R;
        if (i != -1) {
            boolean z = true;
            if (i2 == 1) {
                return dms.K(i);
            }
            if (i2 == 2) {
                return dms.x(i);
            }
            z = false;
            if (i2 == 64) {
                if (dms.f2575R.isEnabled() && dms.f2575R.isTouchExplorationEnabled() && (i3 = dms.f2572R) != i) {
                    if (i3 != Integer.MIN_VALUE) {
                        dms.f2572R = Integer.MIN_VALUE;
                        dms.f2574R.invalidate();
                        dms.J(i3, 65536);
                    }
                    dms.f2572R = i;
                    dms.f2574R.invalidate();
                    dms.J(i, 32768);
                    return z;
                }
                return z;
            } else if (i2 != 128) {
                return dms.t(i, i2, bundle);
            } else {
                if (dms.f2572R == i) {
                    dms.f2572R = Integer.MIN_VALUE;
                    dms.f2574R.invalidate();
                    dms.J(i, 65536);
                    return z;
                }
                return z;
            }
        } else {
            View view = dms.f2574R;
            WeakHashMap weakHashMap = of5.f6887R;
            return mHC.x(view, i2, bundle);
        }
    }

    @Override // defpackage.Zz
    public final jG X(int i) {
        return new jG(AccessibilityNodeInfo.obtain(this.R.y(i).f4895R));
    }
}
