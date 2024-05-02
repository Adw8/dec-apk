package defpackage;

import android.content.Context;
import androidx.work.ListenableWorker;

/* renamed from: nxl  reason: default package */
/* loaded from: classes.dex */
public final class nxl implements Runnable {
    public final gXD R = new gXD();

    /* renamed from: R  reason: collision with other field name */
    public final l3L f6643R;

    static {
        kfk.P("WorkForegroundRunnable");
    }

    public nxl(Context context, l3L l3l, ListenableWorker listenableWorker, dSg dsg, CV cv) {
        this.f6643R = l3l;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = this.f6643R.f5563R;
        this.R.m(null);
    }
}
