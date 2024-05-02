package defpackage;

import android.view.WindowInsets;

/* renamed from: mEa  reason: default package */
/* loaded from: classes.dex */
public abstract class mEa extends hVq {
    public mEa(gWM gwm, WindowInsets windowInsets) {
        super(gwm, windowInsets);
    }

    @Override // defpackage.ibz
    public gWM x(int i, int i2, int i3, int i4) {
        return gWM.Z(null, ((fhi) this).R.inset(i, i2, i3, i4));
    }
}
