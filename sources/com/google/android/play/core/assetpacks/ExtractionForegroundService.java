package com.google.android.play.core.assetpacks;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* loaded from: classes.dex */
public class ExtractionForegroundService extends Service {
    public final ihb R = new ihb(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.R;
    }
}
