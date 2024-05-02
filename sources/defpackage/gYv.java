package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* renamed from: gYv  reason: default package */
/* loaded from: classes.dex */
public abstract class gYv {
    public static final HashMap R = new HashMap();

    static {
        new HashSet(Arrays.asList("app_update", "review"));
        new HashSet(Arrays.asList("native", "unity"));
        new zI("PlayCoreVersion", 0);
    }

    public static Bundle R() {
        Map map;
        Bundle bundle = new Bundle();
        synchronized (gYv.class) {
            HashMap hashMap = R;
            if (!hashMap.containsKey("review")) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("java", 11003);
                hashMap.put("review", hashMap2);
            }
            map = (Map) hashMap.get("review");
        }
        bundle.putInt("playcore_version_code", ((Integer) map.get("java")).intValue());
        if (map.containsKey("native")) {
            bundle.putInt("playcore_native_version", ((Integer) map.get("native")).intValue());
        }
        if (map.containsKey("unity")) {
            bundle.putInt("playcore_unity_version", ((Integer) map.get("unity")).intValue());
        }
        return bundle;
    }
}
