package defpackage;

import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: nX6  reason: default package */
/* loaded from: classes.dex */
public class nX6 {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final LinkedHashMap f6425R;
    public int c;
    public int e;
    public int v;

    public nX6(int i) {
        if (i > 0) {
            this.v = i;
            this.f6425R = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public final Object R(Object obj) {
        if (obj != null) {
            synchronized (this) {
                Object obj2 = this.f6425R.get(obj);
                if (obj2 != null) {
                    this.c++;
                    return obj2;
                }
                this.e++;
                return null;
            }
        }
        throw new NullPointerException("key == null");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.c;
        i2 = this.e + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.v), Integer.valueOf(this.c), Integer.valueOf(this.e), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x005d, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(java.lang.Object r3, java.lang.Object r4) {
        /*
            r2 = this;
            if (r3 == 0) goto L_0x0083
            monitor-enter(r2)
            int r0 = r2.R     // Catch: all -> 0x0080
            int r0 = r0 + 1
            r2.R = r0     // Catch: all -> 0x0080
            java.util.LinkedHashMap r0 = r2.f6425R     // Catch: all -> 0x0080
            java.lang.Object r3 = r0.put(r3, r4)     // Catch: all -> 0x0080
            if (r3 == 0) goto L_0x0017
            int r4 = r2.R     // Catch: all -> 0x0080
            int r4 = r4 + -1
            r2.R = r4     // Catch: all -> 0x0080
        L_0x0017:
            monitor-exit(r2)     // Catch: all -> 0x0080
            int r4 = r2.v
        L_0x001a:
            monitor-enter(r2)
            int r0 = r2.R     // Catch: all -> 0x007d
            if (r0 < 0) goto L_0x005e
            java.util.LinkedHashMap r0 = r2.f6425R     // Catch: all -> 0x007d
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x007d
            if (r0 == 0) goto L_0x002b
            int r0 = r2.R     // Catch: all -> 0x007d
            if (r0 != 0) goto L_0x005e
        L_0x002b:
            int r0 = r2.R     // Catch: all -> 0x007d
            if (r0 <= r4) goto L_0x005c
            java.util.LinkedHashMap r0 = r2.f6425R     // Catch: all -> 0x007d
            boolean r0 = r0.isEmpty()     // Catch: all -> 0x007d
            if (r0 == 0) goto L_0x0038
            goto L_0x005c
        L_0x0038:
            java.util.LinkedHashMap r0 = r2.f6425R     // Catch: all -> 0x007d
            java.util.Set r0 = r0.entrySet()     // Catch: all -> 0x007d
            java.util.Iterator r0 = r0.iterator()     // Catch: all -> 0x007d
            java.lang.Object r0 = r0.next()     // Catch: all -> 0x007d
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: all -> 0x007d
            java.lang.Object r1 = r0.getKey()     // Catch: all -> 0x007d
            r0.getValue()     // Catch: all -> 0x007d
            java.util.LinkedHashMap r0 = r2.f6425R     // Catch: all -> 0x007d
            r0.remove(r1)     // Catch: all -> 0x007d
            int r0 = r2.R     // Catch: all -> 0x007d
            int r0 = r0 + -1
            r2.R = r0     // Catch: all -> 0x007d
            monitor-exit(r2)     // Catch: all -> 0x007d
            goto L_0x001a
        L_0x005c:
            monitor-exit(r2)     // Catch: all -> 0x007d
            return r3
        L_0x005e:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: all -> 0x007d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: all -> 0x007d
            r4.<init>()     // Catch: all -> 0x007d
            java.lang.Class r0 = r2.getClass()     // Catch: all -> 0x007d
            java.lang.String r0 = r0.getName()     // Catch: all -> 0x007d
            r4.append(r0)     // Catch: all -> 0x007d
            java.lang.String r0 = ".sizeOf() is reporting inconsistent results!"
            r4.append(r0)     // Catch: all -> 0x007d
            java.lang.String r4 = r4.toString()     // Catch: all -> 0x007d
            r3.<init>(r4)     // Catch: all -> 0x007d
            throw r3     // Catch: all -> 0x007d
        L_0x007d:
            r3 = move-exception
            monitor-exit(r2)     // Catch: all -> 0x007d
            throw r3
        L_0x0080:
            r3 = move-exception
            monitor-exit(r2)     // Catch: all -> 0x0080
            throw r3
        L_0x0083:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "key == null || value == null"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nX6.v(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
