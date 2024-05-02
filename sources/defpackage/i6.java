package defpackage;

import android.view.Window;

/* renamed from: i6  reason: default package */
/* loaded from: classes.dex */
public final class i6 implements db7, ovy {
    public final /* synthetic */ Q8 R;

    public /* synthetic */ i6(Q8 q8) {
        this.R = q8;
    }

    @Override // defpackage.ovy
    public final void R(lRG lrg, boolean z) {
        this.R.j(lrg);
    }

    @Override // defpackage.ovy
    public final boolean e(lRG lrg) {
        Window.Callback Y = this.R.Y();
        if (Y == null) {
            return true;
        }
        Y.onMenuOpened(108, lrg);
        return true;
    }
}
