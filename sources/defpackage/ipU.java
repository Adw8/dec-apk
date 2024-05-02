package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: ipU  reason: default package */
/* loaded from: classes.dex */
public final class ipU {
    public final HashMap R = new HashMap();

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", Boolean.class);
        hashMap.put("char", Character.class);
        hashMap.put("byte", Byte.class);
        hashMap.put("short", Short.class);
        hashMap.put("int", Integer.class);
        hashMap.put("long", Long.class);
        hashMap.put("float", Float.class);
        hashMap.put("double", Double.class);
    }

    public ipU() {
        new ArrayList();
    }

    public final void R(Object obj, String str) {
        this.R.put(str, obj);
    }
}
