package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: _r  reason: default package */
/* loaded from: classes.dex */
public abstract class _r {
    public static final Map R;

    /* renamed from: R  reason: collision with other field name */
    public static final CopyOnWriteArraySet f708R = new CopyOnWriteArraySet();

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r2 = nZz.class.getPackage();
        String name = r2 != null ? r2.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        linkedHashMap.put(nZz.class.getName(), "okhttp.OkHttpClient");
        linkedHashMap.put(dDc.class.getName(), "okhttp.Http2");
        linkedHashMap.put(i97.class.getName(), "okhttp.TaskRunner");
        linkedHashMap.put("okhttp3.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        R = mHQ.h(linkedHashMap);
    }
}
