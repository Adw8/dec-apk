package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* renamed from: hye  reason: default package */
/* loaded from: classes.dex */
public final class hye implements Executor {
    public final Object R;
    public final /* synthetic */ int e;

    public hye(int i) {
        this.e = i;
        if (i != 1) {
            this.R = new Handler(Looper.getMainLooper());
        } else {
            this.R = new Handler(Looper.getMainLooper());
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.e) {
            case 0:
                ((Handler) this.R).post(runnable);
                return;
            case 1:
                ((Handler) this.R).post(runnable);
                return;
            default:
                ((Handler) ((CV) this.R).v).post(runnable);
                return;
        }
    }

    public hye(CV cv) {
        this.e = 2;
        this.R = cv;
    }
}
