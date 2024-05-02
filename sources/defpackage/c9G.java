package defpackage;

import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: c9G  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class c9G implements Runnable {
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object v;

    public /* synthetic */ c9G(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.e) {
            case 0:
                n1w n1w = (n1w) this.R;
                cUF cuf = (cUF) this.v;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.c;
                n1w.getClass();
                try {
                    hYY v = me6.v(n1w.R);
                    if (v != null) {
                        mB1 mb1 = (mB1) ((k3T) v).f5187R;
                        synchronized (mb1.f5967R) {
                            mb1.f5968R = threadPoolExecutor;
                        }
                        ((k3T) v).f5187R.R(new bEh(cuf, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    cuf.H(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                cU5 cu5 = (cU5) this.R;
                Runnable runnable = (Runnable) this.v;
                String str = (String) this.c;
                cu5.getClass();
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        cu5.getClass();
                        throw null;
                    }
                    return;
                }
            case 2:
                f67 f67 = (f67) this.R;
                Xf xf = (Xf) this.v;
                o3I o3i = (o3I) this.c;
                if (((lxm) f67.v).R.c()) {
                    xf.v(new IOException("Canceled"));
                    return;
                } else {
                    xf.R((lxm) f67.v, o3i);
                    return;
                }
            default:
                Object obj = ((f67) this.R).v;
                ((Xf) this.v).v((Throwable) this.c);
                return;
        }
    }
}
