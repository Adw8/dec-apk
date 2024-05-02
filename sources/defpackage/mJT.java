package defpackage;

import android.content.Context;
import android.view.MenuItem;

/* renamed from: mJT  reason: default package */
/* loaded from: classes.dex */
public final class mJT extends olv implements hJT {
    public hJT R;

    public mJT(Context context, int i, int i2) {
        super(context, null, i, i2);
    }

    @Override // defpackage.olv
    public final aYp R(Context context, boolean z) {
        nVL nvl = new nVL(context, z);
        nvl.setHoverListener(this);
        return nvl;
    }

    @Override // defpackage.hJT
    public final void X(lRG lrg, MenuItem menuItem) {
        hJT hjt = this.R;
        if (hjt != null) {
            hjt.X(lrg, menuItem);
        }
    }

    @Override // defpackage.hJT
    public final void g(lRG lrg, pce pce) {
        hJT hjt = this.R;
        if (hjt != null) {
            hjt.g(lrg, pce);
        }
    }
}
