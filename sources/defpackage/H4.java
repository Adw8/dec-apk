package defpackage;

import java.util.Date;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: H4  reason: default package */
/* loaded from: classes.dex */
public final class H4 {
    public final Date R;

    /* renamed from: R  reason: collision with other field name */
    public Map f165R;

    public H4(Date date) {
        this.f165R = new ConcurrentHashMap();
        this.R = date;
    }

    public final void R(Object obj, String str) {
        this.f165R.put(str, obj);
    }

    public H4() {
        this(dTl.Y());
    }
}
