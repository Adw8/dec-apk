package androidx.work.impl.diagnostics;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.workers.DiagnosticsWorker;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class DiagnosticsReceiver extends BroadcastReceiver {
    public static final String R = kfk.P("DiagnosticsRcvr");

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent != null) {
            kfk.U().x(R, "Requesting diagnostics", new Throwable[0]);
            try {
                jFe R2 = jFe.R(context);
                R2.getClass();
                List singletonList = Collections.singletonList((i7a) new mxl(DiagnosticsWorker.class).R());
                if (!singletonList.isEmpty()) {
                    new eRT(R2, null, 2, singletonList, 0).K();
                    return;
                }
                throw new IllegalArgumentException("enqueue needs at least one WorkRequest.");
            } catch (IllegalStateException e) {
                kfk.U().H(R, "WorkManager is not initialized", e);
            }
        }
    }
}
