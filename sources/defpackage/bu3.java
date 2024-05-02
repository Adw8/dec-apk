package defpackage;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bu3  reason: default package */
/* loaded from: classes.dex */
public final class bu3 {
    public final HashMap R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final AtomicBoolean f1846R = new AtomicBoolean(false);

    public final synchronized boolean R() {
        if (!this.f1846R.get()) {
            synchronized (this) {
                this.R.put("assetOnlyUpdates", Boolean.FALSE);
            }
        }
        Object obj = this.R.get("assetOnlyUpdates");
        if (!(obj instanceof Boolean)) {
            return false;
        }
        return ((Boolean) obj).booleanValue();
    }
}
