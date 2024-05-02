package defpackage;

import java.nio.charset.Charset;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: bCh  reason: default package */
/* loaded from: classes.dex */
public final class bCh extends LinkedHashMap {
    public static final bCh R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1566R = true;

    static {
        bCh bch = new bCh();
        R = bch;
        bch.f1566R = false;
    }

    public bCh() {
    }

    public static int v(Object obj) {
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            Charset charset = ibk.R;
            int length = bArr.length;
            int i = length;
            for (int i2 = 0; i2 < 0 + length; i2++) {
                i = (i * 31) + bArr[i2];
            }
            if (i == 0) {
                return 1;
            }
            return i;
        } else if (!(obj instanceof eNc)) {
            return obj.hashCode();
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (!this.f1566R) {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.LinkedHashMap, java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof java.util.Map
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x005e
            java.util.Map r6 = (java.util.Map) r6
            if (r5 != r6) goto L_0x000c
        L_0x000a:
            r5 = r1
            goto L_0x005b
        L_0x000c:
            int r0 = r5.size()
            int r3 = r6.size()
            if (r0 == r3) goto L_0x0018
        L_0x0016:
            r5 = r2
            goto L_0x005b
        L_0x0018:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        L_0x0020:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000a
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r3 = r0.getKey()
            boolean r3 = r6.containsKey(r3)
            if (r3 != 0) goto L_0x0037
            goto L_0x0016
        L_0x0037:
            java.lang.Object r3 = r0.getValue()
            java.lang.Object r0 = r0.getKey()
            java.lang.Object r0 = r6.get(r0)
            boolean r4 = r3 instanceof byte[]
            if (r4 == 0) goto L_0x0054
            boolean r4 = r0 instanceof byte[]
            if (r4 == 0) goto L_0x0054
            byte[] r3 = (byte[]) r3
            byte[] r0 = (byte[]) r0
            boolean r0 = java.util.Arrays.equals(r3, r0)
            goto L_0x0058
        L_0x0054:
            boolean r0 = r3.equals(r0)
        L_0x0058:
            if (r0 != 0) goto L_0x0020
            goto L_0x0016
        L_0x005b:
            if (r5 == 0) goto L_0x005e
            goto L_0x005f
        L_0x005e:
            r1 = r2
        L_0x005f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bCh.equals(java.lang.Object):boolean");
    }

    @Override // java.util.AbstractMap, java.util.Map, java.lang.Object
    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += v(entry.getValue()) ^ v(entry.getKey());
        }
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Object put(Object obj, Object obj2) {
        e();
        Charset charset = ibk.R;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final void putAll(Map map) {
        e();
        for (Object obj : map.keySet()) {
            Charset charset = ibk.R;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.HashMap
    public final Object remove(Object obj) {
        e();
        return super.remove(obj);
    }

    public bCh(Map map) {
        super(map);
    }
}
