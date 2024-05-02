package defpackage;

import android.os.Process;

/* renamed from: eQb  reason: default package */
/* loaded from: classes.dex */
public final class eQb extends Thread {
    public final int e;

    public eQb(Runnable runnable, String str, int i) {
        super(runnable, str);
        this.e = i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.e);
        super.run();
    }
}
