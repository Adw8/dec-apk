package androidx.work;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;

/* loaded from: classes.dex */
public abstract class Worker extends ListenableWorker {
    public gXD R;

    @Keep
    @SuppressLint({"BanKeepAnnotation"})
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public abstract n6o L();

    @Override // androidx.work.ListenableWorker
    public final gXD X() {
        this.R = new gXD();
        ((ListenableWorker) this).f1445R.f1451R.execute(new k0f(12, this));
        return this.R;
    }
}
