package defpackage;

import dev.kdrag0n.virtcontainer.service.VirtService;
import java.lang.Thread;

/* renamed from: ba1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ba1 implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ VirtService R;

    public /* synthetic */ ba1(VirtService virtService) {
        this.R = virtService;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        VirtService virtService = this.R;
        int i = VirtService.X;
        kxm.v(cUF.v(virtService), 6, "Uncaught exception in thread " + thread + " - performing emergency shutdown", null);
        try {
            mLz.Y(false, new bBd(2, virtService), 31).join(3000);
        } catch (Exception e) {
            kxm.v(cUF.v(virtService), 6, "Failed to wait for emergency shutdown", e);
        }
        try {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = virtService.f2743R;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        } catch (Exception e2) {
            kxm.v(cUF.v(virtService), 6, "Exception in old handler", e2);
        }
    }
}
