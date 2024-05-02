package dev.kdrag0n.virtcontainer.ui.onboarding;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class OnboardingActivity extends auH {
    public final pr9 v = new pr9(g8d.R(OnboardingViewModel.class), new j4w(this, 9), new j4w(this, 8), new ket(this, 4));

    @Override // defpackage.rB, defpackage.Zh, defpackage.hm9, androidx.activity.d, defpackage.cMB, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((OnboardingViewModel) this.v.getValue()).getClass();
    }
}
