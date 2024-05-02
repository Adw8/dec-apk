package defpackage;

import androidx.work.impl.WorkDatabase;

/* renamed from: nTd  reason: default package */
/* loaded from: classes.dex */
public final class nTd implements Runnable {
    public static final String v = kfk.P("StopWorkRunnable");
    public final jFe R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6395R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f6396R;

    public nTd(jFe jfe, String str, boolean z) {
        this.R = jfe;
        this.f6395R = str;
        this.f6396R = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean containsKey;
        boolean z;
        jFe jfe = this.R;
        WorkDatabase workDatabase = jfe.f4887R;
        gH5 gh5 = jfe.f4888R;
        ptn N = workDatabase.N();
        workDatabase.c();
        try {
            String str = this.f6395R;
            synchronized (gh5.f3708R) {
                containsKey = gh5.f3710R.containsKey(str);
            }
            if (this.f6396R) {
                z = this.R.f4888R.L(this.f6395R);
            } else {
                if (!containsKey && N.L(this.f6395R) == gDn.RUNNING) {
                    N.g(gDn.ENQUEUED, this.f6395R);
                }
                z = this.R.f4888R.Z(this.f6395R);
            }
            kfk.U().x(v, String.format("StopWorkRunnable for %s; Processor.stopWork = %s", this.f6395R, Boolean.valueOf(z)), new Throwable[0]);
            workDatabase.Z();
        } finally {
            workDatabase.O();
        }
    }
}
