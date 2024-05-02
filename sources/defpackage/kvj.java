package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: kvj  reason: default package */
/* loaded from: classes.dex */
public abstract class kvj {
    public final HashMap R = new HashMap();

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f5480R = new LinkedHashSet();

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f5481R = false;

    public static void R(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public final Object c(Object obj, String str) {
        Object obj2;
        synchronized (this.R) {
            obj2 = this.R.get(str);
            if (obj2 == null) {
                this.R.put(str, obj);
            }
        }
        if (obj2 != null) {
            obj = obj2;
        }
        if (this.f5481R) {
            R(obj);
        }
        return obj;
    }

    public void v() {
    }
}
