package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.WorkerParameters;

/* renamed from: d3x  reason: default package */
/* loaded from: classes.dex */
public abstract class d3x {
    public static final String R = kfk.P("WorkerFactory");

    public abstract ListenableWorker R(Context context, String str, WorkerParameters workerParameters);

    public final ListenableWorker v(Context context, String str, WorkerParameters workerParameters) {
        ListenableWorker R2 = R(context, str, workerParameters);
        if (R2 == null) {
            Class cls = null;
            try {
                cls = Class.forName(str).asSubclass(ListenableWorker.class);
            } catch (Throwable th) {
                kfk.U().H(R, opT.H("Invalid class: ", str), th);
            }
            if (cls != null) {
                try {
                    R2 = (ListenableWorker) cls.getDeclaredConstructor(Context.class, WorkerParameters.class).newInstance(context, workerParameters);
                } catch (Throwable th2) {
                    kfk.U().H(R, opT.H("Could not instantiate ", str), th2);
                }
            }
        }
        if (R2 == null || !R2.v) {
            return R2;
        }
        throw new IllegalStateException(String.format("WorkerFactory (%s) returned an instance of a ListenableWorker (%s) which has already been invoked. createWorker() must always return a new instance of a ListenableWorker.", getClass().getName(), str));
    }
}
