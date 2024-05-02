package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;

/* renamed from: ai_  reason: default package */
/* loaded from: classes.dex */
public final class ai_ extends BroadcastReceiver {
    public final gZn R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h5 f982R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f983R;

    public /* synthetic */ ai_(h5 h5Var, gZn gzn) {
        this.f982R = h5Var;
        this.R = gzn;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ArrayList arrayList;
        L2 c = fgm.c(intent, "BillingBroadcastManager");
        String action = intent.getAction();
        int i = 0;
        if (action.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                arrayList = new ArrayList();
                if (stringArrayList == null || stringArrayList2 == null) {
                    Purchase Z = fgm.Z(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"));
                    if (Z == null) {
                        fgm.X("BillingHelper", "Couldn't find single purchase data as well.");
                    } else {
                        arrayList.add(Z);
                    }
                } else {
                    int size = stringArrayList.size();
                    fgm.X("BillingHelper", "Found purchase list of " + size + " items");
                    while (i < stringArrayList.size() && i < stringArrayList2.size()) {
                        Purchase Z2 = fgm.Z(stringArrayList.get(i), stringArrayList2.get(i));
                        if (Z2 != null) {
                            arrayList.add(Z2);
                        }
                        i++;
                    }
                }
                ((eJw) this.R).X(c, arrayList);
            }
            arrayList = null;
            ((eJw) this.R).X(c, arrayList);
        } else if (action.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
            intent.getExtras();
            if (c.v != 0) {
                gZn gzn = this.R;
                m3m m3m = aOn.R;
                ((eJw) gzn).X(c, mzR.R);
                return;
            }
            fgm.O("BillingBroadcastManager", "AlternativeBillingListener is null.");
            gZn gzn2 = this.R;
            L2 l2 = lPe.X;
            m3m m3m2 = aOn.R;
            ((eJw) gzn2).X(l2, mzR.R);
        }
    }
}
