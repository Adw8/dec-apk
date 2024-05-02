package defpackage;

import java.util.HashMap;
import java.util.LinkedHashSet;

/* renamed from: e2I  reason: default package */
/* loaded from: classes.dex */
public final class e2I {
    public int R;
    public int c;
    public int e;

    /* renamed from: R  reason: collision with other field name */
    public final dq f2943R = new dq((Object) null);
    public int v = 16;

    /* renamed from: R  reason: collision with other field name */
    public final HashMap f2944R = new HashMap(0, 0.75f);

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashSet f2945R = new LinkedHashSet();

    public final Object R(Object obj) {
        synchronized (this.f2943R) {
            Object obj2 = this.f2944R.get(obj);
            if (obj2 != null) {
                this.f2945R.remove(obj);
                this.f2945R.add(obj);
                this.c++;
                return obj2;
            }
            this.e++;
            return null;
        }
    }

    public final Object c(Object obj) {
        Object remove;
        obj.getClass();
        synchronized (this.f2943R) {
            remove = this.f2944R.remove(obj);
            this.f2945R.remove(obj);
            if (remove != null) {
                this.R = e() - 1;
            }
        }
        return remove;
    }

    public final int e() {
        int i;
        synchronized (this.f2943R) {
            i = this.R;
        }
        return i;
    }

    public final String toString() {
        String str;
        synchronized (this.f2943R) {
            int i = this.c;
            int i2 = this.e + i;
            str = "LruCache[maxSize=" + this.v + ",hits=" + this.c + ",misses=" + this.e + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
        }
        return str;
    }

    public final Object v(Object obj, Object obj2) {
        Object put;
        Object obj3;
        Object obj4;
        if (obj == null || obj2 == null) {
            throw null;
        }
        synchronized (this.f2943R) {
            this.R = e() + 1;
            put = this.f2944R.put(obj, obj2);
            if (put != null) {
                this.R = e() - 1;
            }
            if (this.f2945R.contains(obj)) {
                this.f2945R.remove(obj);
            }
            this.f2945R.add(obj);
        }
        int i = this.v;
        while (true) {
            synchronized (this.f2943R) {
                if (e() < 0 || ((this.f2944R.isEmpty() && e() != 0) || this.f2944R.isEmpty() != this.f2945R.isEmpty())) {
                    break;
                } else if (e() <= i || this.f2944R.isEmpty()) {
                    obj4 = null;
                    obj3 = null;
                } else {
                    obj4 = dF.D(this.f2945R);
                    obj3 = this.f2944R.get(obj4);
                    if (obj3 != null) {
                        HashMap hashMap = this.f2944R;
                        gvP.O(hashMap);
                        hashMap.remove(obj4);
                        LinkedHashSet linkedHashSet = this.f2945R;
                        gvP.X(linkedHashSet);
                        linkedHashSet.remove(obj4);
                        this.R = e() - 1;
                    } else {
                        throw new IllegalStateException("inconsistent state");
                    }
                }
            }
            if (obj4 == null && obj3 == null) {
                return put;
            }
        }
        throw new IllegalStateException("map/keySet size inconsistency");
    }
}
