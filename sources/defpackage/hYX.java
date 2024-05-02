package defpackage;

import android.content.Context;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: hYX  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class hYX implements Runnable {
    public final /* synthetic */ Context R;
    public final /* synthetic */ int e;

    public /* synthetic */ hYX(Context context, int i) {
        this.e = i;
        this.R = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                new ThreadPoolExecutor(0, 1, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue()).execute(new hYX(this.R, 1));
                return;
            default:
                dTl.l(this.R, new i2_(3), dTl.R, false);
                return;
        }
    }
}
