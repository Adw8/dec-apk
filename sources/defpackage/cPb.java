package defpackage;

import android.content.Intent;
import android.net.Uri;
import dev.kdrag0n.virtcontainer.ui.drm.paywall.PaywallActivity;
import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsFragment;

/* renamed from: cPb  reason: default package */
/* loaded from: classes.dex */
public final class cPb implements h2V {
    public final /* synthetic */ RootSettingsFragment R;
    public final /* synthetic */ int e;

    public /* synthetic */ cPb(RootSettingsFragment rootSettingsFragment, int i) {
        this.e = i;
        this.R = rootSettingsFragment;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                biy.J(this.R.k(), (Uri) obj, this.R.p());
                break;
            default:
                o8s o8s = (o8s) obj;
                this.R.l(new Intent(this.R.k(), PaywallActivity.class));
                break;
        }
        return o8s.R;
    }
}
