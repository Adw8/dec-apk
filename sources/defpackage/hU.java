package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import dev.kdrag0n.virtcontainer.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: hU  reason: default package */
/* loaded from: classes.dex */
public final class hU {
    public static volatile hU R;

    /* renamed from: R  reason: collision with other field name */
    public static final Object f4273R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final Context f4274R;

    /* renamed from: R  reason: collision with other field name */
    public final HashSet f4276R = new HashSet();

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f4275R = new HashMap();

    public hU(Context context) {
        this.f4274R = context.getApplicationContext();
    }

    public static hU c(Context context) {
        if (R == null) {
            synchronized (f4273R) {
                if (R == null) {
                    R = new hU(context);
                }
            }
        }
        return R;
    }

    public final void R(Bundle bundle) {
        String string = this.f4274R.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (pme.class.isAssignableFrom(cls)) {
                            this.f4276R.add(cls);
                        }
                    }
                }
                Iterator it = this.f4276R.iterator();
                while (it.hasNext()) {
                    v((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e) {
                throw new j8f((Throwable) e);
            }
        }
    }

    public final Object v(Class cls, HashSet hashSet) {
        Object obj;
        if (dtx.i()) {
            try {
                Trace.beginSection(cls.getSimpleName());
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!this.f4275R.containsKey(cls)) {
                hashSet.add(cls);
                pme pme = (pme) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class> R2 = pme.R();
                if (!R2.isEmpty()) {
                    for (Class cls2 : R2) {
                        if (!this.f4275R.containsKey(cls2)) {
                            v(cls2, hashSet);
                        }
                    }
                }
                obj = pme.v(this.f4274R);
                hashSet.remove(cls);
                this.f4275R.put(cls, obj);
            } else {
                obj = this.f4275R.get(cls);
            }
            return obj;
        }
        throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
    }
}
