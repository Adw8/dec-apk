package defpackage;

import android.os.Looper;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: cTl  reason: default package */
/* loaded from: classes.dex */
public final class cTl {
    public final HashSet R = new HashSet();

    public final void R() {
        if (mxC.f6246R == null) {
            mxC.f6246R = Looper.getMainLooper().getThread();
        }
        if (Thread.currentThread() == mxC.f6246R) {
            Iterator it = this.R.iterator();
            while (it.hasNext()) {
                ((hib) it.next()).R();
            }
            return;
        }
        throw new IllegalStateException("Must be called on the Main thread.");
    }
}
