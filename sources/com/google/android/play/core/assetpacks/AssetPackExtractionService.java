package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class AssetPackExtractionService extends Service {
    public bNW R;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.R;
    }

    @Override // android.app.Service
    public final void onCreate() {
        j58 j58;
        super.onCreate();
        Context applicationContext = getApplicationContext();
        synchronized (g4x.class) {
            if (g4x.R == null) {
                h89 h89 = new h89((pon) null);
                Context applicationContext2 = applicationContext.getApplicationContext();
                if (applicationContext2 != null) {
                    applicationContext = applicationContext2;
                }
                n1w n1w = new n1w(applicationContext, 0);
                h89.R = n1w;
                g4x.R = new j58(n1w);
            }
            j58 = g4x.R;
        }
        this.R = (bNW) j58.R.R();
    }
}
