package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.activity.result.d;
import java.util.Arrays;
import java.util.HashSet;

/* renamed from: c31  reason: default package */
/* loaded from: classes.dex */
public final class c31 extends d {
    public final /* synthetic */ androidx.activity.d R;

    public c31(hm9 hm9) {
        this.R = hm9;
    }

    @Override // androidx.activity.result.d
    public final void v(int i, mjG mjg) {
        androidx.activity.d dVar = this.R;
        Zz m = mjg.m(dVar);
        if (m != null) {
            new Handler(Looper.getMainLooper()).post(new kBb(this, i, m, 0));
            return;
        }
        Intent c = mjg.c();
        Bundle bundle = null;
        if (c.getExtras() != null && c.getExtras().getClassLoader() == null) {
            c.setExtrasClassLoader(dVar.getClassLoader());
        }
        if (c.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = c.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            c.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(c.getAction())) {
            String[] stringArrayExtra = c.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            Object obj = C1.R;
            HashSet hashSet = new HashSet();
            for (String str : stringArrayExtra) {
                if (TextUtils.isEmpty(str)) {
                    throw new IllegalArgumentException(jQ.g(opT.U("Permission request for permissions "), Arrays.toString(stringArrayExtra), " must not contain null or empty values"));
                }
            }
            int size = hashSet.size();
            String[] strArr = size > 0 ? new String[stringArrayExtra.length - size] : stringArrayExtra;
            if (size > 0) {
                if (size != stringArrayExtra.length) {
                    int i2 = 0;
                    for (int i3 = 0; i3 < stringArrayExtra.length; i3++) {
                        if (!hashSet.contains(Integer.valueOf(i3))) {
                            i2++;
                            strArr[i2] = stringArrayExtra[i3];
                        }
                    }
                } else {
                    return;
                }
            }
            if (dVar instanceof B1) {
                ((B1) dVar).getClass();
            }
            LJ.v(dVar, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(c.getAction())) {
            c28 c28 = (c28) c.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                IntentSender intentSender = c28.f1933R;
                Intent intent = c28.R;
                int i4 = c28.e;
                int i5 = c28.X;
                Object obj2 = C1.R;
                uO.c(dVar, intentSender, i, intent, i4, i5, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new kBb(this, i, e, 1));
            }
        } else {
            Object obj3 = C1.R;
            uO.v(dVar, c, i, bundle);
        }
    }
}
