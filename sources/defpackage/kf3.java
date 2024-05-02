package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;

/* renamed from: kf3  reason: default package */
/* loaded from: classes.dex */
public final class kf3 extends k8G implements f_c {
    public final /* synthetic */ RootSettingsViewModel R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf3(RootSettingsViewModel rootSettingsViewModel, int i) {
        super(0);
        this.X = i;
        this.R = rootSettingsViewModel;
    }

    public final void R() {
        switch (this.X) {
            case 0:
                RootSettingsViewModel rootSettingsViewModel = this.R;
                rootSettingsViewModel.getClass();
                l6.z(gvP.o(rootSettingsViewModel), null, 0, new kB1(rootSettingsViewModel, null), 3);
                return;
            case 1:
                this.R.e();
                return;
            default:
                RootSettingsViewModel rootSettingsViewModel2 = this.R;
                rootSettingsViewModel2.getClass();
                l6.z(gvP.o(rootSettingsViewModel2), null, 0, new iD0(rootSettingsViewModel2, null), 3);
                return;
        }
    }

    @Override // defpackage.f_c
    public final /* bridge */ /* synthetic */ Object g() {
        switch (this.X) {
            case 0:
                R();
                break;
            case 1:
                R();
                break;
            default:
                R();
                break;
        }
        return o8s.R;
    }
}
