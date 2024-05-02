package defpackage;

import android.system.Os;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: hVj  reason: default package */
/* loaded from: classes.dex */
public final class hVj implements pby {
    public final int R = Os.getpid();

    /* renamed from: R  reason: collision with other field name */
    public final ConcurrentLinkedQueue f4289R = new ConcurrentLinkedQueue();
    public int v;

    @Override // defpackage.pby
    public final void R(String str, int i, String str2, Throwable th) {
        int i2 = this.v;
        this.v = i2 + 1;
        if (i2 >= 500) {
            this.f4289R.remove();
        }
        if (th != null) {
            str2 = opT.H(str2, kxm.R(th));
        }
        this.f4289R.add(new hUp(this.R, i, System.currentTimeMillis(), str, str2));
    }
}
