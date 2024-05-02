package defpackage;

import java.io.Closeable;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: ns8  reason: default package */
/* loaded from: classes.dex */
public final class ns8 {
    public final HashMap R = new HashMap();

    public final void R() {
        for (kvj kvj : this.R.values()) {
            kvj.f5481R = true;
            HashMap hashMap = kvj.R;
            if (hashMap != null) {
                synchronized (hashMap) {
                    for (Object obj : kvj.R.values()) {
                        kvj.R(obj);
                    }
                }
            }
            LinkedHashSet linkedHashSet = kvj.f5480R;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    for (Closeable closeable : kvj.f5480R) {
                        kvj.R(closeable);
                    }
                }
            }
            kvj.v();
        }
        this.R.clear();
    }
}
