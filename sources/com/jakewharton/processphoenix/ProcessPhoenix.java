package com.jakewharton.processphoenix;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ProcessPhoenix extends Activity {
    public static final /* synthetic */ int e = 0;

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Process.killProcess(getIntent().getIntExtra("phoenix_main_process_pid", -1));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("phoenix_restart_intents");
        startActivities((Intent[]) parcelableArrayListExtra.toArray(new Intent[parcelableArrayListExtra.size()]));
        finish();
        Runtime.getRuntime().exit(0);
    }
}
