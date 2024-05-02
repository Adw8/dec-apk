package defpackage;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: pwG  reason: default package */
/* loaded from: classes.dex */
public final class pwG<S> extends l6q {
    public BD R;
    public int m;

    @Override // defpackage.pm2
    public final void A(Bundle bundle) {
        bundle.putInt("THEME_RES_ID_KEY", this.m);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.R);
    }

    @Override // defpackage.pm2
    public final View J(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.cloneInContext(new ContextThemeWrapper(H(), this.m));
        throw null;
    }

    @Override // defpackage.pm2
    public final void K(Bundle bundle) {
        super.K(bundle);
        if (bundle == null) {
            bundle = ((pm2) this).c;
        }
        this.m = bundle.getInt("THEME_RES_ID_KEY");
        hIm him = (hIm) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.R = (BD) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }
}
