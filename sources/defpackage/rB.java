package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import dev.kdrag0n.virtcontainer.R;

/* renamed from: rB  reason: default package */
/* loaded from: classes.dex */
public abstract class rB extends jw {
    public boolean O;
    public F4 R;

    /* renamed from: R  reason: collision with other field name */
    public Tq f7380R;

    /* renamed from: R  reason: collision with other field name */
    public kxx f7381R;

    /* renamed from: R  reason: collision with other field name */
    public final pr9 f7382R = new pr9(g8d.R(jke.class), new j4w(this, 3), new j4w(this, 2), new ket(this, 1));

    /* renamed from: R  reason: collision with other field name */
    public rt f7383R;

    @Override // androidx.activity.d, android.app.Activity
    public final void onBackPressed() {
        if (!this.O) {
            moveTaskToBack(true);
        } else {
            super.onBackPressed();
        }
    }

    @Override // defpackage.Zh, defpackage.hm9, androidx.activity.d, defpackage.cMB, android.app.Activity
    public void onCreate(Bundle bundle) {
        iG9 ig9;
        boolean z;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_onboarding, (ViewGroup) null, false);
        int i = R.id.back_button;
        Button button = (Button) iTI.O(inflate, R.id.back_button);
        if (button != null) {
            i = R.id.legal_text;
            TextView textView = (TextView) iTI.O(inflate, R.id.legal_text);
            if (textView != null) {
                i = R.id.nav_host_fragment;
                if (((FragmentContainerView) iTI.O(inflate, R.id.nav_host_fragment)) != null) {
                    i = R.id.next_button;
                    Button button2 = (Button) iTI.O(inflate, R.id.next_button);
                    if (button2 != null) {
                        this.f7383R = new rt((ConstraintLayout) inflate, button, textView, button2);
                        String[] strArr = new String[2];
                        F4 f4 = this.R;
                        if (f4 == null) {
                            f4 = null;
                        }
                        strArr[0] = opT.H("https://kdrag0n.dev/terms-of-service?utm_medium=app&utm_source=app-", f4.v);
                        F4 f42 = this.R;
                        if (f42 == null) {
                            f42 = null;
                        }
                        strArr[1] = opT.H("https://kdrag0n.dev/privacy-policy?utm_medium=app&utm_source=app-", f42.v);
                        cpc.i(textView, R.string.onboarding_welcome_legal_text, strArr);
                        J();
                        kxx kxx = this.f7381R;
                        if (kxx == null) {
                            kxx = null;
                        }
                        Intent intent = getIntent();
                        DT dt = (DT) kxx;
                        dt.getClass();
                        Integer valueOf = intent != null ? Integer.valueOf(intent.getIntExtra("requestCode", 0)) : null;
                        if (valueOf != null && valueOf.intValue() == 100) {
                            ig9 = new iG9(false, R.navigation.nav_graph_onboarding_adb_repair, dt.R.R() ? R.id.onboarding_adb_pair : R.id.onboarding_adb_dev_options, g5M.i);
                        } else {
                            ig9 = new iG9(true, R.navigation.nav_graph_onboarding, R.id.onboarding_welcome, g5M.V);
                        }
                        mpr mpr = ((jw) this).R;
                        if (mpr == null) {
                            mpr = null;
                        }
                        try {
                            mpr.Z();
                            z = true;
                        } catch (IllegalStateException unused) {
                            z = false;
                        }
                        if (!z) {
                            mpr mpr2 = ((jw) this).R;
                            if (mpr2 == null) {
                                mpr2 = null;
                            }
                            mpr2.i(((nt9) mpr2.f6181R.getValue()).v(ig9.R), null);
                        }
                        mpr mpr3 = ((jw) this).R;
                        if (mpr3 == null) {
                            mpr3 = null;
                        }
                        WO wo = new WO(ig9, this);
                        mpr3.f6190R.add(wo);
                        if (!mpr3.f6186R.isEmpty()) {
                            wo.R(((j5B) mpr3.f6186R.last()).f4822R);
                        }
                        rt rtVar = this.f7383R;
                        if (rtVar == null) {
                            rtVar = null;
                        }
                        rtVar.R.setOnClickListener(new wV(this, 0));
                        rt rtVar2 = this.f7383R;
                        if (rtVar2 == null) {
                            rtVar2 = null;
                        }
                        setContentView(rtVar2.f7400R);
                        mxC.V(this, new Eu(this, null));
                        return;
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
