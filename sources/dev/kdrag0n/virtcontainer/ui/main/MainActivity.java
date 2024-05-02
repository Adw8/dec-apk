package dev.kdrag0n.virtcontainer.ui.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import dev.kdrag0n.virtcontainer.R;
import dev.kdrag0n.virtcontainer.ui.onboarding.OnboardingActivity;

/* loaded from: classes.dex */
public final class MainActivity extends cy4 {
    public static final /* synthetic */ int X = 0;
    public doT R;

    /* renamed from: R  reason: collision with other field name */
    public iKP f2749R;

    /* renamed from: R  reason: collision with other field name */
    public ntZ f2750R;

    /* renamed from: R  reason: collision with other field name */
    public pir f2751R;

    /* renamed from: R  reason: collision with other field name */
    public final pr9 f2752R = new pr9(g8d.R(MainViewModel.class), new j4w(this, 5), new j4w(this, 4), new ket(this, 2));

    public MainActivity() {
        g8d.R(bB5.class);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x009a A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0124  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0146  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object Y(java.time.Instant r9, long r10, defpackage.aOO r12) {
        /*
        // Method dump skipped, instructions count: 338
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.kdrag0n.virtcontainer.ui.main.MainActivity.Y(java.time.Instant, long, aOO):java.lang.Object");
    }

    @Override // defpackage.Zh, defpackage.hm9, androidx.activity.d, defpackage.cMB, android.app.Activity
    public final void onCreate(Bundle bundle) {
        FrameLayout frameLayout;
        super.onCreate(bundle);
        doT dot = this.R;
        doT dot2 = null;
        ntZ ntz = null;
        if (dot == null) {
            dot = null;
        }
        if (dot.v()) {
            iKP ikp = this.f2749R;
            if (ikp == null) {
                ikp = null;
            }
            oLT olt = ikp.R;
            if ((C1.R(olt.f6770R, olt.R.R) == 0 ? 1 : null) != null) {
                View inflate = getLayoutInflater().inflate(R.layout.activity_main, (ViewGroup) null, false);
                int i = R.id.compose_view;
                ComposeView composeView = (ComposeView) iTI.O(inflate, R.id.compose_view);
                if (composeView != null) {
                    i = R.id.nav_host_fragment;
                    FragmentContainerView fragmentContainerView = (FragmentContainerView) iTI.O(inflate, R.id.nav_host_fragment);
                    if (fragmentContainerView != null) {
                        this.f2750R = new ntZ((FrameLayout) inflate, composeView, fragmentContainerView, 2);
                        J();
                        ntZ ntz2 = this.f2750R;
                        if (ntz2 == null) {
                            ntz2 = null;
                        }
                        switch (ntz2.R) {
                            case 0:
                                frameLayout = (FrameLayout) ntz2.f6625R;
                                break;
                            default:
                                frameLayout = (FrameLayout) ntz2.f6625R;
                                break;
                        }
                        setContentView(frameLayout);
                        LifecycleCoroutineScopeImpl Q = gQc.Q(this);
                        l6.z(Q, null, 0, new fh0(Q, new ahR(this, null), null), 3);
                        LifecycleCoroutineScopeImpl Q2 = gQc.Q(this);
                        l6.z(Q2, null, 0, new fh0(Q2, new dFW(this, null), null), 3);
                        Intent intent = getIntent();
                        if (((intent == null || intent.getIntExtra("requestCode", -1) != 100) ? null : 1) != null) {
                            LifecycleCoroutineScopeImpl Q3 = gQc.Q(this);
                            l6.z(Q3, null, 0, new fh0(Q3, new fiu(this, null), null), 3);
                        }
                        ntZ ntz3 = this.f2750R;
                        if (ntz3 != null) {
                            ntz = ntz3;
                        }
                        oer.v((ComposeView) ntz.v, aH9.u(new bkx(11, this), true, -14000985));
                        return;
                    }
                }
                throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
            }
        }
        doT dot3 = this.R;
        if (dot3 != null) {
            dot2 = dot3;
        }
        dot2.c(false);
        startActivity(new Intent(this, OnboardingActivity.class));
        finish();
    }

    @Override // defpackage.pJ, defpackage.hm9, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
    }

    @Override // defpackage.Zh, defpackage.hm9, android.app.Activity
    public final void onResume() {
        super.onResume();
        MainViewModel mainViewModel = (MainViewModel) this.f2752R.getValue();
        mainViewModel.getClass();
        l6.z(gvP.o(mainViewModel), null, 0, new mRn(mainViewModel, null), 3);
    }
}
