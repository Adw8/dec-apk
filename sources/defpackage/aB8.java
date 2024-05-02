package defpackage;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aB8  reason: default package */
/* loaded from: classes.dex */
public final class aB8 implements ThreadFactory {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f781R;

    /* renamed from: R  reason: collision with other field name */
    public final AtomicInteger f782R;

    public aB8() {
        this.R = 1;
        this.f781R = Executors.defaultThreadFactory();
        this.f782R = new AtomicInteger(1);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.R) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName(String.format("arch_disk_io_%d", Integer.valueOf(this.f782R.getAndIncrement())));
                return thread;
            default:
                Thread newThread = ((ThreadFactory) this.f781R).newThread(runnable);
                int andIncrement = this.f782R.getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
        }
    }

    public aB8(ble ble) {
        this.R = 0;
        this.f781R = ble;
        this.f782R = new AtomicInteger(0);
    }
}
