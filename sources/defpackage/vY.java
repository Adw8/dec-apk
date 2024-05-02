package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairFragment;

/* renamed from: vY  reason: default package */
/* loaded from: classes.dex */
public final class vY extends k8G implements f_c {
    public final /* synthetic */ AdbPairFragment R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vY(AdbPairFragment adbPairFragment, int i) {
        super(0);
        this.X = i;
        this.R = adbPairFragment;
    }

    public final void R() {
        boolean z;
        switch (this.X) {
            case 0:
                AdbPairFragment adbPairFragment = this.R;
                Ks ks = adbPairFragment.f2755R;
                eAj eaj = ((pm2) adbPairFragment).f7232R;
                if (eaj != null) {
                    hm9 hm9 = eaj.f3007R;
                    Object obj = C1.R;
                    z = LJ.c(hm9, "android.permission.POST_NOTIFICATIONS");
                } else {
                    z = false;
                }
                if (!z) {
                    vd.I(adbPairFragment.k(), "android.settings.APPLICATION_DETAILS_SETTINGS", "permission_settings");
                } else {
                    ks.R();
                }
                this.R.w().v.R(Boolean.FALSE);
                return;
            case 1:
                AdbPairFragment adbPairFragment2 = this.R;
                int i = AdbPairFragment.U;
                adbPairFragment2.w().v.R(Boolean.FALSE);
                return;
            default:
                AdbPairFragment adbPairFragment3 = this.R;
                int i2 = AdbPairFragment.U;
                adbPairFragment3.q();
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
