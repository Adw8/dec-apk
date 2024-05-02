package defpackage;

import java.util.HashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: icq  reason: default package */
/* loaded from: classes.dex */
public final class icq {
    public static final String R = kfk.P("WorkTimer");

    /* renamed from: R  reason: collision with other field name */
    public final ScheduledExecutorService f4672R;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f4671R = new HashMap();
    public final HashMap v = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final Object f4670R = new Object();

    public icq() {
        nZH nzh = new nZH(this);
        this.f4672R = Executors.newSingleThreadScheduledExecutor(nzh);
    }

    public final void R(String str, gAS gas) {
        synchronized (this.f4670R) {
            kfk.U().x(R, String.format("Starting timer for %s", str), new Throwable[0]);
            v(str);
            iC8 ic8 = new iC8(this, str);
            this.f4671R.put(str, ic8);
            this.v.put(str, gas);
            this.f4672R.schedule(ic8, 600000, TimeUnit.MILLISECONDS);
        }
    }

    public final void v(String str) {
        synchronized (this.f4670R) {
            if (((iC8) this.f4671R.remove(str)) != null) {
                kfk.U().x(R, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.v.remove(str);
            }
        }
    }
}
