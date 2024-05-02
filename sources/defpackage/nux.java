package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: nux  reason: default package */
/* loaded from: classes.dex */
public final class nux implements pvc {
    public final AtomicReference R;

    public nux(pn pnVar) {
        this.R = new AtomicReference(pnVar);
    }

    @Override // defpackage.pvc
    public final Iterator iterator() {
        pvc pvc = (pvc) this.R.getAndSet(null);
        if (pvc != null) {
            return pvc.iterator();
        }
        throw new IllegalStateException("This sequence can be consumed only once.");
    }
}
