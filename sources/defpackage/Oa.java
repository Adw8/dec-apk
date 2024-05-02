package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: Oa  reason: default package */
/* loaded from: classes.dex */
public abstract class Oa implements Map, dsi {
    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        Set<Map.Entry> entrySet = entrySet();
        if (entrySet.isEmpty()) {
            return false;
        }
        for (Map.Entry entry : entrySet) {
            if (n3x.v(entry.getValue(), obj)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map
    public final Set entrySet() {
        return new g0S((e76) this, 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0059 A[SYNTHETIC] */
    @Override // java.util.Map, java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r6 != r5) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r6 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto L_0x000a
            return r2
        L_0x000a:
            e76 r5 = (defpackage.e76) r5
            int r1 = r5.e
            java.util.Map r6 = (java.util.Map) r6
            int r3 = r6.size()
            if (r1 == r3) goto L_0x0017
            return r2
        L_0x0017:
            java.util.Set r6 = r6.entrySet()
            boolean r1 = r6 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0026
            boolean r1 = r6.isEmpty()
            if (r1 == 0) goto L_0x0026
            goto L_0x005a
        L_0x0026:
            java.util.Iterator r6 = r6.iterator()
        L_0x002a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L_0x005a
            java.lang.Object r1 = r6.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            if (r1 != 0) goto L_0x003a
        L_0x0038:
            r1 = r2
            goto L_0x0057
        L_0x003a:
            java.lang.Object r3 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            java.lang.Object r4 = r5.get(r3)
            boolean r1 = defpackage.n3x.v(r1, r4)
            if (r1 != 0) goto L_0x004d
            goto L_0x0038
        L_0x004d:
            if (r4 != 0) goto L_0x0056
            boolean r1 = r5.containsKey(r3)
            if (r1 != 0) goto L_0x0056
            goto L_0x0038
        L_0x0056:
            r1 = r0
        L_0x0057:
            if (r1 != 0) goto L_0x002a
            r0 = r2
        L_0x005a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Oa.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Map, java.lang.Object
    public final int hashCode() {
        return entrySet().hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((e76) this).e == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        return new g0S((e76) this, 1);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return ((e76) this).e;
    }

    @Override // java.lang.Object
    public final String toString() {
        return dF.X4(entrySet(), ", ", "{", "}", new mox(20, this), 24);
    }

    @Override // java.util.Map
    public final Collection values() {
        return new iKS((e76) this);
    }
}
