package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: fz0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fz0 implements ThreadFactory {
    public final /* synthetic */ String R;

    public /* synthetic */ fz0(String str) {
        this.R = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, this.R);
        thread.setPriority(10);
        return thread;
    }
}
