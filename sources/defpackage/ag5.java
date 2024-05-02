package defpackage;

import dev.kdrag0n.virtcontainer.ui.overview.OverviewViewModel;

/* renamed from: ag5  reason: default package */
/* loaded from: classes.dex */
public final class ag5 implements h2V {
    public final /* synthetic */ OverviewViewModel R;
    public final /* synthetic */ int e;

    public /* synthetic */ ag5(OverviewViewModel overviewViewModel, int i) {
        this.e = i;
        this.R = overviewViewModel;
    }

    @Override // defpackage.h2V
    public final Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                this.R.f2770R.H((String) obj);
                break;
            case 1:
                o8s o8s = (o8s) obj;
                this.R.O.H(Boolean.TRUE);
                break;
            default:
                if (!((Boolean) obj).booleanValue()) {
                    this.R.v.H(null);
                }
                return o8s.R;
        }
        return o8s.R;
    }
}
