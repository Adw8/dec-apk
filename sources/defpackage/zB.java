package defpackage;

/* renamed from: zB  reason: default package */
/* loaded from: classes.dex */
public final class zB extends Thread {
    public zB() {
        super("Okio Watchdog");
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        kU v;
        while (true) {
            try {
                synchronized (kU.class) {
                    kU kUVar = kU.v;
                    v = atb.v();
                    if (v == kU.v) {
                        kU.v = null;
                        return;
                    }
                }
                if (v != null) {
                    v.H();
                }
            } catch (InterruptedException unused) {
            }
        }
    }
}
