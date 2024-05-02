package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* renamed from: cG  reason: default package */
/* loaded from: classes.dex */
public final class cG {
    public volatile int R;

    /* renamed from: R  reason: collision with other field name */
    public Context f2037R;

    /* renamed from: R  reason: collision with other field name */
    public final Handler f2038R;

    /* renamed from: R  reason: collision with other field name */
    public volatile h5 f2039R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2040R;

    /* renamed from: R  reason: collision with other field name */
    public ExecutorService f2041R;

    /* renamed from: R  reason: collision with other field name */
    public volatile oZ5 f2042R;

    /* renamed from: R  reason: collision with other field name */
    public volatile p2K f2043R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2044R;
    public boolean c;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f2045v;

    public cG(boolean z, Context context, gZn gzn) {
        String str;
        try {
            str = (String) vd.class.getField("VERSION_NAME").get(null);
        } catch (Exception unused) {
            str = "5.0.0";
        }
        this.R = 0;
        this.f2038R = new Handler(Looper.getMainLooper());
        this.v = 0;
        this.f2040R = str;
        Context applicationContext = context.getApplicationContext();
        this.f2037R = applicationContext;
        this.f2039R = new h5(applicationContext, gzn);
        this.c = z;
    }

    public final boolean R() {
        return (this.R != 2 || this.f2043R == null || this.f2042R == null) ? false : true;
    }

    public final Future c(Callable callable, ggY ggy, Handler handler) {
        long j = (long) (((double) 30000) * 0.95d);
        if (this.f2041R == null) {
            this.f2041R = Executors.newFixedThreadPool(fgm.R, new aB8());
        }
        try {
            Future submit = this.f2041R.submit(callable);
            handler.postDelayed(new bx(submit, ggy, 10), j);
            return submit;
        } catch (Exception e) {
            fgm.L("BillingClient", "Async task throws exception!", e);
            return null;
        }
    }

    public final Handler v() {
        return Looper.myLooper() == null ? this.f2038R : new Handler(Looper.myLooper());
    }
}
