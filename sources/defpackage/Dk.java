package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.d;

/* renamed from: Dk  reason: default package */
/* loaded from: classes.dex */
public final class Dk extends mjG {
    public final /* synthetic */ int O;

    public /* synthetic */ Dk(int i) {
        this.O = i;
    }

    @Override // defpackage.mjG
    public final Intent c() {
        Bundle bundleExtra;
        switch (this.O) {
            case 0:
                return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{"android.permission.POST_NOTIFICATIONS"});
            default:
                Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent2 = r0.R;
                if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
                    intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        r0 = new c28(r0.f1933R, null, r0.e, r0.X);
                    }
                }
                intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", r0);
                if (hAW.W(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + intent);
                }
                return intent;
        }
    }

    @Override // defpackage.mjG
    public final Zz m(d dVar) {
        switch (this.O) {
            case 0:
                if (C1.R(dVar, "android.permission.POST_NOTIFICATIONS") == 0) {
                    return new Zz(Boolean.TRUE);
                }
                return null;
            default:
                return null;
        }
    }

    @Override // defpackage.mjG
    public final Object x(Intent intent, int i) {
        boolean z;
        switch (this.O) {
            case 0:
                if (intent == null || i != -1) {
                    return Boolean.FALSE;
                }
                int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                boolean z2 = false;
                if (intArrayExtra != null) {
                    int length = intArrayExtra.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 < length) {
                            if (intArrayExtra[i2] == 0) {
                                z = true;
                            } else {
                                i2++;
                            }
                        } else {
                            z = false;
                        }
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                return Boolean.valueOf(z2);
            default:
                return new wt(intent, i);
        }
    }
}
