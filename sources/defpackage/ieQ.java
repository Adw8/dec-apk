package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Map;

/* renamed from: ieQ  reason: default package */
/* loaded from: classes.dex */
public final class ieQ implements Sw {
    public final /* synthetic */ hAW R;
    public final /* synthetic */ int e;

    public /* synthetic */ ieQ(hAW haw, int i) {
        this.e = i;
        this.R = haw;
    }

    @Override // defpackage.Sw
    public final void R(Object obj) {
        switch (this.e) {
            case 0:
                Map map = (Map) obj;
                String[] strArr = (String[]) map.keySet().toArray(new String[0]);
                ArrayList arrayList = new ArrayList(map.values());
                int[] iArr = new int[arrayList.size()];
                for (int i = 0; i < arrayList.size(); i++) {
                    iArr[i] = ((Boolean) arrayList.get(i)).booleanValue() ? 0 : -1;
                }
                bxH bxh = (bxH) this.R.f4117R.pollFirst();
                if (bxh == null) {
                    Log.w("FragmentManager", "No permissions were requested for " + this);
                    return;
                }
                String str = bxh.R;
                if (this.R.f4127R.U(str) == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
                    return;
                }
                return;
            case 1:
            default:
                v((wt) obj);
                return;
            case 2:
                v((wt) obj);
                return;
        }
    }

    public final void v(wt wtVar) {
        switch (this.e) {
            case 2:
                bxH bxh = (bxH) this.R.f4117R.pollFirst();
                if (bxh == null) {
                    Log.w("FragmentManager", "No Activities were started for result for " + this);
                    return;
                }
                String str = bxh.R;
                int i = bxh.e;
                pm2 U = this.R.f4127R.U(str);
                if (U == null) {
                    Log.w("FragmentManager", "Activity result delivered for unknown Fragment " + str);
                    return;
                }
                U.i(i, wtVar.e, wtVar.R);
                return;
            default:
                bxH bxh2 = (bxH) this.R.f4117R.pollFirst();
                if (bxh2 == null) {
                    Log.w("FragmentManager", "No IntentSenders were started for " + this);
                    return;
                }
                String str2 = bxh2.R;
                int i2 = bxh2.e;
                pm2 U2 = this.R.f4127R.U(str2);
                if (U2 == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment " + str2);
                    return;
                }
                U2.i(i2, wtVar.e, wtVar.R);
                return;
        }
    }
}
