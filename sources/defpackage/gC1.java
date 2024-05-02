package defpackage;

import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.View;

/* renamed from: gC1  reason: default package */
/* loaded from: classes.dex */
public final class gC1 extends c5B implements ActionProvider.VisibilityListener {
    public gL6 R;

    public gC1(o5B o5b, ActionProvider actionProvider) {
        super(o5b, actionProvider);
    }

    @Override // defpackage.c5B
    public final boolean R() {
        return ((c5B) this).R.isVisible();
    }

    @Override // defpackage.c5B
    public final boolean c() {
        return ((c5B) this).R.overridesItemVisibility();
    }

    @Override // defpackage.c5B
    public final void e(gL6 gl6) {
        this.R = gl6;
        ((c5B) this).R.setVisibilityListener(this);
    }

    @Override // android.view.ActionProvider.VisibilityListener
    public final void onActionProviderVisibilityChanged(boolean z) {
        gL6 gl6 = this.R;
        if (gl6 != null) {
            lRG lrg = ((pce) gl6.R).f7117R;
            lrg.f5738c = true;
            lrg.j(true);
        }
    }

    @Override // defpackage.c5B
    public final View v(MenuItem menuItem) {
        return ((c5B) this).R.onCreateActionView(menuItem);
    }
}
