package defpackage;

import android.content.Intent;
import androidx.activity.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* renamed from: GU  reason: default package */
/* loaded from: classes.dex */
public final class GU extends mjG {
    @Override // defpackage.mjG
    public final Intent c() {
        return new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", "android.permission.POST_NOTIFICATIONS");
    }

    @Override // defpackage.mjG
    public final Zz m(d dVar) {
        boolean z = true;
        if (r5.length == 0) {
            return new Zz(iia.R);
        }
        int length = r5.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (!(C1.R(dVar, r5[i]) == 0)) {
                z = false;
                break;
            }
            i++;
        }
        if (!z) {
            return null;
        }
        int y = jjU.y(r5.length);
        if (y < 16) {
            y = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(y);
        for (String str : r5) {
            linkedHashMap.put(str, Boolean.TRUE);
        }
        return new Zz(linkedHashMap);
    }

    @Override // defpackage.mjG
    public final Object x(Intent intent, int i) {
        if (i == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return iia.R;
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i2 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i2 == 0));
            }
            ArrayList B = P7.B(stringArrayExtra);
            Iterator it = B.iterator();
            Iterator it2 = arrayList.iterator();
            ArrayList arrayList2 = new ArrayList(Math.min(a6.B(B, 10), a6.B(arrayList, 10)));
            while (it.hasNext() && it2.hasNext()) {
                arrayList2.add(new kSh(it.next(), it2.next()));
            }
            return mHQ.Y(arrayList2);
        }
        return iia.R;
    }
}
