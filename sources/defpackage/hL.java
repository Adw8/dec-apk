package defpackage;

import androidx.activity.d;
import dev.kdrag0n.virtcontainer.ui.main.MainActivity;
import dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingActivity;

/* renamed from: hL  reason: default package */
/* loaded from: classes.dex */
public final class hL implements oOW {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ pJ f4209R;

    public /* synthetic */ hL(pJ pJVar, int i) {
        this.R = i;
        this.f4209R = pJVar;
    }

    @Override // defpackage.oOW
    public final void R() {
        switch (this.R) {
            case 0:
                j7 i = this.f4209R.i();
                i.e();
                ((d) this.f4209R).f1015R.f4264R.R("androidx:appcompat");
                i.X();
                return;
            case 1:
                ((fNG) this.f4209R).h();
                return;
            case 2:
                ((fNG) this.f4209R).h();
                return;
            case 3:
                cy4 cy4 = (cy4) this.f4209R;
                if (!cy4.O) {
                    cy4.O = true;
                    MainActivity mainActivity = (MainActivity) cy4;
                    ktS kts = (ktS) ((kdF) cy4.R());
                    ((Zh) mainActivity).f670R = (oSF) kts.f5456R.Y.get();
                    ((Zh) mainActivity).R = (m5f) kts.f5456R.N.get();
                    mainActivity.R = (doT) kts.f5456R.c.get();
                    mainActivity.f2749R = (iKP) kts.f5456R.K.get();
                    mainActivity.f2751R = nak.R(kts.f5458R);
                    return;
                }
                return;
            default:
                auH auh = (auH) this.f4209R;
                if (!auh.L) {
                    auh.L = true;
                    OnboardingActivity onboardingActivity = (OnboardingActivity) auh;
                    ktS kts2 = (ktS) ((fJm) auh.R());
                    ((Zh) onboardingActivity).f670R = (oSF) kts2.f5456R.Y.get();
                    ((Zh) onboardingActivity).R = (m5f) kts2.f5456R.N.get();
                    ((rB) onboardingActivity).f7380R = (Tq) kts2.f5456R.c.get();
                    ((rB) onboardingActivity).f7381R = (kxx) kts2.f5456R.h.get();
                    ((rB) onboardingActivity).R = (F4) kts2.f5456R.f3397R.get();
                    return;
                }
                return;
        }
    }
}
