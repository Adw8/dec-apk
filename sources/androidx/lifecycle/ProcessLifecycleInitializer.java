package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements pme {
    @Override // defpackage.pme
    public final List R() {
        return Collections.emptyList();
    }

    @Override // defpackage.pme
    public final Object v(Context context) {
        if (hU.c(context).f4276R.contains(ProcessLifecycleInitializer.class)) {
            if (!eMs.R.getAndSet(true)) {
                ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new iew());
            }
            ProcessLifecycleOwner processLifecycleOwner = ProcessLifecycleOwner.R;
            processLifecycleOwner.getClass();
            processLifecycleOwner.f1323R = new Handler();
            processLifecycleOwner.f1325R.X(alX.ON_CREATE);
            ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new nmQ(processLifecycleOwner));
            return processLifecycleOwner;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily. \nPlease ensure that you have: \n<meta-data\n    android:name='androidx.lifecycle.ProcessLifecycleInitializer' \n    android:value='androidx.startup' /> \nunder InitializationProvider in your AndroidManifest.xml");
    }
}
