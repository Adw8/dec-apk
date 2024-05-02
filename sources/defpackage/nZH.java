package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: nZH  reason: default package */
/* loaded from: classes.dex */
public final class nZH implements ThreadFactory {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public Object f6431R;
    public int v;

    public nZH(icq icq) {
        this.R = 1;
        this.f6431R = icq;
        this.v = 0;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.R) {
            case 0:
                return new eQb(runnable, (String) this.f6431R, this.v);
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(runnable);
                StringBuilder U = opT.U("WorkManager-WorkTimer-thread-");
                U.append(this.v);
                newThread.setName(U.toString());
                this.v++;
                return newThread;
        }
    }

    public nZH() {
        this.R = 0;
        this.f6431R = "fonts-androidx";
        this.v = 10;
    }
}
