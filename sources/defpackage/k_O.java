package defpackage;

import android.view.View;
import android.view.WindowInsets;

/* renamed from: k_O  reason: default package */
/* loaded from: classes.dex */
public final class k_O extends mEa {
    public static final gWM c = gWM.Z(null, WindowInsets.CONSUMED);

    public k_O(gWM gwm, WindowInsets windowInsets) {
        super(gwm, windowInsets);
    }

    @Override // defpackage.ibz
    public boolean C(int i) {
        return ((fhi) this).R.isVisible(b3d.R(i));
    }

    @Override // defpackage.ibz
    public ojk L(int i) {
        return ojk.c(((fhi) this).R.getInsetsIgnoringVisibility(b3d.R(i)));
    }

    @Override // defpackage.ibz
    public ojk O(int i) {
        return ojk.c(((fhi) this).R.getInsets(b3d.R(i)));
    }

    @Override // defpackage.ibz
    public final void e(View view) {
    }
}
