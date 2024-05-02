package defpackage;

import android.view.Window;

/* renamed from: uD  reason: default package */
/* loaded from: classes.dex */
public final class uD implements kHr, ovy {
    public final /* synthetic */ Q8 R;

    public /* synthetic */ uD(Q8 q8) {
        this.R = q8;
    }

    @Override // defpackage.ovy
    public final void R(lRG lrg, boolean z) {
        rD rDVar;
        lRG H = lrg.H();
        int i = 0;
        boolean z2 = H != lrg;
        Q8 q8 = this.R;
        if (z2) {
            lrg = H;
        }
        rD[] rDVarArr = q8.f419R;
        int length = rDVarArr != null ? rDVarArr.length : 0;
        while (true) {
            if (i < length) {
                rDVar = rDVarArr[i];
                if (rDVar != null && rDVar.f7388R == lrg) {
                    break;
                }
                i++;
            } else {
                rDVar = null;
                break;
            }
        }
        if (rDVar == null) {
            return;
        }
        if (z2) {
            this.R.P(rDVar.R, rDVar, H);
            this.R.g(rDVar, true);
            return;
        }
        this.R.g(rDVar, z);
    }

    @Override // defpackage.ovy
    public final boolean e(lRG lrg) {
        Window.Callback Y;
        if (lrg != lrg.H()) {
            return true;
        }
        Q8 q8 = this.R;
        if (!q8.f421e || (Y = q8.Y()) == null || this.R.C) {
            return true;
        }
        Y.onMenuOpened(108, lrg);
        return true;
    }
}
