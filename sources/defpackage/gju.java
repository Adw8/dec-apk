package defpackage;

import android.util.Log;

/* renamed from: gju  reason: default package */
/* loaded from: classes.dex */
public abstract class gju {
    public static kSM R = kSM.R;

    public static kSM R(pm2 pm2) {
        while (pm2 != null) {
            if (pm2.j()) {
                pm2.C();
            }
            pm2 = pm2.f7254v;
        }
        return R;
    }

    public static void v(n_R n_r) {
        if (hAW.W(3)) {
            StringBuilder U = opT.U("StrictMode violation in ");
            U.append(n_r.R.getClass().getName());
            Log.d("FragmentManager", U.toString(), n_r);
        }
    }
}
