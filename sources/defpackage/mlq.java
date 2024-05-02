package defpackage;

import java.util.concurrent.ThreadFactory;

/* renamed from: mlq  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class mlq implements ThreadFactory {
    public final /* synthetic */ String R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f6153R;

    public /* synthetic */ mlq(String str, boolean z) {
        this.R = str;
        this.f6153R = z;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        String str = this.R;
        boolean z = this.f6153R;
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(z);
        return thread;
    }
}
