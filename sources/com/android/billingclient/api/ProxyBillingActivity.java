package com.android.billingclient.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.google.android.apps.common.proguard.UsedByReflection;

@UsedByReflection("PlatformActivityProxy")
/* loaded from: classes.dex */
public class ProxyBillingActivity extends Activity {
    public ResultReceiver R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2211R;
    public ResultReceiver v;

    public final Intent R() {
        Intent intent = new Intent("com.android.vending.billing.PURCHASES_UPDATED");
        intent.setPackage(getApplicationContext().getPackageName());
        return intent;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1  */
    @Override // android.app.Activity
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            super.onActivityResult(r6, r7, r8)
            r0 = 0
            r1 = 0
            java.lang.String r2 = "ProxyBillingActivity"
            r3 = 100
            if (r6 != r3) goto L_0x009c
            L2 r6 = defpackage.fgm.c(r8, r2)
            int r6 = r6.v
            r3 = -1
            if (r7 != r3) goto L_0x001a
            if (r6 == 0) goto L_0x0018
            r7 = r3
            goto L_0x001a
        L_0x0018:
            r6 = r1
            goto L_0x0036
        L_0x001a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Activity finished with resultCode "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = " and billing's responseCode: "
            r3.append(r7)
            r3.append(r6)
            java.lang.String r7 = r3.toString()
            defpackage.fgm.O(r2, r7)
        L_0x0036:
            android.os.ResultReceiver r7 = r5.R
            if (r7 == 0) goto L_0x0046
            if (r8 != 0) goto L_0x003d
            goto L_0x0041
        L_0x003d:
            android.os.Bundle r0 = r8.getExtras()
        L_0x0041:
            r7.send(r6, r0)
            goto L_0x00e5
        L_0x0046:
            if (r8 == 0) goto L_0x0094
            android.os.Bundle r6 = r8.getExtras()
            if (r6 == 0) goto L_0x007d
            android.os.Bundle r6 = r8.getExtras()
            java.lang.String r7 = "ALTERNATIVE_BILLING_USER_CHOICE_DATA"
            java.lang.String r6 = r6.getString(r7)
            if (r6 == 0) goto L_0x0070
            android.content.Intent r8 = new android.content.Intent
            java.lang.String r0 = "com.android.vending.billing.ALTERNATIVE_BILLING"
            r8.<init>(r0)
            android.content.Context r0 = r5.getApplicationContext()
            java.lang.String r0 = r0.getPackageName()
            r8.setPackage(r0)
            r8.putExtra(r7, r6)
            goto L_0x0098
        L_0x0070:
            android.content.Intent r6 = r5.R()
            android.os.Bundle r7 = r8.getExtras()
            r6.putExtras(r7)
            r8 = r6
            goto L_0x0098
        L_0x007d:
            android.content.Intent r8 = r5.R()
            java.lang.String r6 = "Got null bundle!"
            defpackage.fgm.O(r2, r6)
            r6 = 6
            java.lang.String r7 = "RESPONSE_CODE"
            r8.putExtra(r7, r6)
            java.lang.String r6 = "DEBUG_MESSAGE"
            java.lang.String r7 = "An internal error occurred."
            r8.putExtra(r6, r7)
            goto L_0x0098
        L_0x0094:
            android.content.Intent r8 = r5.R()
        L_0x0098:
            r5.sendBroadcast(r8)
            goto L_0x00e5
        L_0x009c:
            r7 = 101(0x65, float:1.42E-43)
            if (r6 != r7) goto L_0x00cc
            if (r8 != 0) goto L_0x00a8
            java.lang.String r6 = "Got null intent!"
            defpackage.fgm.O(r2, r6)
            goto L_0x00b5
        L_0x00a8:
            int r6 = defpackage.fgm.R
            android.os.Bundle r6 = r8.getExtras()
            if (r6 != 0) goto L_0x00b7
            java.lang.String r6 = "Unexpected null bundle received!"
            defpackage.fgm.O(r2, r6)
        L_0x00b5:
            r6 = r1
            goto L_0x00bd
        L_0x00b7:
            java.lang.String r7 = "IN_APP_MESSAGE_RESPONSE_CODE"
            int r6 = r6.getInt(r7, r1)
        L_0x00bd:
            android.os.ResultReceiver r7 = r5.v
            if (r7 == 0) goto L_0x00e5
            if (r8 != 0) goto L_0x00c4
            goto L_0x00c8
        L_0x00c4:
            android.os.Bundle r0 = r8.getExtras()
        L_0x00c8:
            r7.send(r6, r0)
            goto L_0x00e5
        L_0x00cc:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "Got onActivityResult with wrong requestCode: "
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = "; skipping..."
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            defpackage.fgm.O(r2, r6)
        L_0x00e5:
            r5.f2211R = r1
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.ProxyBillingActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        PendingIntent pendingIntent;
        super.onCreate(bundle);
        if (bundle == null) {
            fgm.X("ProxyBillingActivity", "Launching Play Store billing flow");
            int i = 100;
            if (getIntent().hasExtra("BUY_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("BUY_INTENT");
            } else if (getIntent().hasExtra("SUBS_MANAGEMENT_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("SUBS_MANAGEMENT_INTENT");
                this.R = (ResultReceiver) getIntent().getParcelableExtra("result_receiver");
            } else if (getIntent().hasExtra("IN_APP_MESSAGE_INTENT")) {
                pendingIntent = (PendingIntent) getIntent().getParcelableExtra("IN_APP_MESSAGE_INTENT");
                this.v = (ResultReceiver) getIntent().getParcelableExtra("in_app_message_result_receiver");
                i = 101;
            } else {
                pendingIntent = null;
            }
            try {
                this.f2211R = true;
                startIntentSenderForResult(pendingIntent.getIntentSender(), i, new Intent(), 0, 0, 0);
            } catch (IntentSender.SendIntentException e) {
                fgm.L("ProxyBillingActivity", "Got exception while trying to start a purchase flow.", e);
                ResultReceiver resultReceiver = this.R;
                if (resultReceiver != null) {
                    resultReceiver.send(6, null);
                } else {
                    ResultReceiver resultReceiver2 = this.v;
                    if (resultReceiver2 != null) {
                        resultReceiver2.send(0, null);
                    } else {
                        Intent R = R();
                        R.putExtra("RESPONSE_CODE", 6);
                        R.putExtra("DEBUG_MESSAGE", "An internal error occurred.");
                        sendBroadcast(R);
                    }
                }
                this.f2211R = false;
                finish();
            }
        } else {
            fgm.X("ProxyBillingActivity", "Launching Play Store billing flow from savedInstanceState");
            this.f2211R = bundle.getBoolean("send_cancelled_broadcast_if_finished", false);
            if (bundle.containsKey("result_receiver")) {
                this.R = (ResultReceiver) bundle.getParcelable("result_receiver");
            } else if (bundle.containsKey("in_app_message_result_receiver")) {
                this.v = (ResultReceiver) bundle.getParcelable("in_app_message_result_receiver");
            }
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        if (isFinishing() && this.f2211R) {
            Intent R = R();
            R.putExtra("RESPONSE_CODE", 1);
            R.putExtra("DEBUG_MESSAGE", "Billing dialog closed.");
            sendBroadcast(R);
        }
    }

    @Override // android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        ResultReceiver resultReceiver = this.R;
        if (resultReceiver != null) {
            bundle.putParcelable("result_receiver", resultReceiver);
        }
        ResultReceiver resultReceiver2 = this.v;
        if (resultReceiver2 != null) {
            bundle.putParcelable("in_app_message_result_receiver", resultReceiver2);
        }
        bundle.putBoolean("send_cancelled_broadcast_if_finished", this.f2211R);
    }
}
