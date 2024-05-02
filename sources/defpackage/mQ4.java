package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import androidx.lifecycle.ProcessLifecycleOwner;

/* renamed from: mQ4  reason: default package */
/* loaded from: classes.dex */
public final class mQ4 extends Fragment {
    public h89 R;

    public static void R(Activity activity, alX alx) {
        if (activity instanceof nu_) {
            m4i O = ((nu_) activity).O();
            if (O instanceof m4i) {
                O.X(alx);
            }
        }
    }

    public static void v(Activity activity) {
        oVL.registerIn(activity);
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new mQ4(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.R = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        h89 h89 = this.R;
        if (h89 != null) {
            ((ProcessLifecycleOwner) h89.R).R();
        }
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        h89 h89 = this.R;
        if (h89 != null) {
            ProcessLifecycleOwner processLifecycleOwner = (ProcessLifecycleOwner) h89.R;
            int i = processLifecycleOwner.e + 1;
            processLifecycleOwner.e = i;
            if (i == 1 && processLifecycleOwner.v) {
                processLifecycleOwner.f1325R.X(alX.ON_START);
                processLifecycleOwner.v = false;
            }
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
    }
}
