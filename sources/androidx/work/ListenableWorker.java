package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public abstract class ListenableWorker {
    public Context R;

    /* renamed from: R  reason: collision with other field name */
    public WorkerParameters f1445R;

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f1446R;
    public boolean v;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public ListenableWorker(Context context, WorkerParameters workerParameters) {
        if (context == null) {
            throw new IllegalArgumentException("Application Context is null");
        } else if (workerParameters != null) {
            this.R = context;
            this.f1445R = workerParameters;
        } else {
            throw new IllegalArgumentException("WorkerParameters is null");
        }
    }

    public final void O() {
        this.f1446R = true;
        e();
    }

    public abstract gXD X();

    public void e() {
    }

    public boolean v() {
        return false;
    }
}
