package defpackage;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

/* renamed from: aDS  reason: default package */
/* loaded from: classes.dex */
public final class aDS extends AbstractMap implements Serializable {
    public static final gvk R = new gvk(6);

    /* renamed from: R  reason: collision with other field name */
    public hGV f798R;

    /* renamed from: R  reason: collision with other field name */
    public Comparator f799R;

    /* renamed from: R  reason: collision with other field name */
    public lhX f800R;

    /* renamed from: v  reason: collision with other field name */
    public lhX f801v;
    public int e = 0;
    public int X = 0;
    public final hGV v = new hGV();

    public aDS() {
        gvk gvk = R;
        this.f799R = gvk;
    }

    public final void L(hGV hgv) {
        hGV hgv2 = hgv.v;
        hGV hgv3 = hgv.c;
        hGV hgv4 = hgv2.v;
        hGV hgv5 = hgv2.c;
        hgv.v = hgv5;
        if (hgv5 != null) {
            hgv5.R = hgv;
        }
        X(hgv, hgv2);
        hgv2.c = hgv;
        hgv.R = hgv2;
        int i = 0;
        int max = Math.max(hgv3 != null ? hgv3.e : 0, hgv5 != null ? hgv5.e : 0) + 1;
        hgv.e = max;
        if (hgv4 != null) {
            i = hgv4.e;
        }
        hgv2.e = Math.max(max, i) + 1;
    }

    public final void O(hGV hgv) {
        hGV hgv2 = hgv.v;
        hGV hgv3 = hgv.c;
        hGV hgv4 = hgv3.v;
        hGV hgv5 = hgv3.c;
        hgv.c = hgv4;
        if (hgv4 != null) {
            hgv4.R = hgv;
        }
        X(hgv, hgv3);
        hgv3.v = hgv;
        hgv.R = hgv3;
        int i = 0;
        int max = Math.max(hgv2 != null ? hgv2.e : 0, hgv4 != null ? hgv4.e : 0) + 1;
        hgv.e = max;
        if (hgv5 != null) {
            i = hgv5.e;
        }
        hgv3.e = Math.max(max, i) + 1;
    }

    public final hGV R(Object obj, boolean z) {
        int i;
        hGV hgv;
        Comparator comparator = this.f799R;
        hGV hgv2 = this.f798R;
        if (hgv2 != null) {
            Comparable comparable = comparator == R ? (Comparable) obj : null;
            while (true) {
                i = comparable != null ? comparable.compareTo(hgv2.f4195R) : comparator.compare(obj, hgv2.f4195R);
                if (i == 0) {
                    return hgv2;
                }
                hGV hgv3 = i < 0 ? hgv2.v : hgv2.c;
                if (hgv3 == null) {
                    break;
                }
                hgv2 = hgv3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        hGV hgv4 = this.v;
        if (hgv2 != null) {
            hgv = new hGV(hgv2, obj, hgv4, hgv4.X);
            if (i < 0) {
                hgv2.v = hgv;
            } else {
                hgv2.c = hgv;
            }
            c(hgv2, true);
        } else if (comparator != R || (obj instanceof Comparable)) {
            hgv = new hGV(hgv2, obj, hgv4, hgv4.X);
            this.f798R = hgv;
        } else {
            throw new ClassCastException(obj.getClass().getName() + " is not Comparable");
        }
        this.e++;
        this.X++;
        return hgv;
    }

    public final void X(hGV hgv, hGV hgv2) {
        hGV hgv3 = hgv.R;
        hgv.R = null;
        if (hgv2 != null) {
            hgv2.R = hgv3;
        }
        if (hgv3 == null) {
            this.f798R = hgv2;
        } else if (hgv3.v == hgv) {
            hgv3.v = hgv2;
        } else {
            hgv3.c = hgv2;
        }
    }

    public final void c(hGV hgv, boolean z) {
        while (hgv != null) {
            hGV hgv2 = hgv.v;
            hGV hgv3 = hgv.c;
            int i = 0;
            int i2 = hgv2 != null ? hgv2.e : 0;
            int i3 = hgv3 != null ? hgv3.e : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                hGV hgv4 = hgv3.v;
                hGV hgv5 = hgv3.c;
                int i5 = hgv5 != null ? hgv5.e : 0;
                if (hgv4 != null) {
                    i = hgv4.e;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    O(hgv);
                } else {
                    L(hgv3);
                    O(hgv);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                hGV hgv6 = hgv2.v;
                hGV hgv7 = hgv2.c;
                int i7 = hgv7 != null ? hgv7.e : 0;
                if (hgv6 != null) {
                    i = hgv6.e;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    L(hgv);
                } else {
                    O(hgv2);
                    L(hgv);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                hgv.e = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                hgv.e = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            hgv = hgv.R;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.f798R = null;
        this.e = 0;
        this.X++;
        hGV hgv = this.v;
        hgv.X = hgv;
        hgv.f4196e = hgv;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        hGV hgv = null;
        if (obj != null) {
            try {
                hgv = R(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return hgv != null;
    }

    public final void e(hGV hgv, boolean z) {
        int i;
        if (z) {
            hGV hgv2 = hgv.X;
            hgv2.f4196e = hgv.f4196e;
            hgv.f4196e.X = hgv2;
        }
        hGV hgv3 = hgv.v;
        hgv3 = hgv.c;
        hGV hgv4 = hgv.R;
        int i2 = 0;
        if (hgv3 == null || hgv3 == null) {
            if (hgv3 != null) {
                X(hgv, hgv3);
                hgv.v = null;
            } else if (hgv3 != null) {
                X(hgv, hgv3);
                hgv.c = null;
            } else {
                X(hgv, null);
            }
            c(hgv4, false);
            this.e--;
            this.X++;
            return;
        }
        if (hgv3.e > hgv3.e) {
            hgv3 = hgv3.c;
            while (hgv3 != null) {
                hgv3 = hgv3.c;
            }
        } else {
            hgv3 = hgv3.v;
            while (hgv3 != null) {
                hgv3 = hgv3.v;
            }
        }
        e(hgv3, false);
        hGV hgv5 = hgv.v;
        if (hgv5 != null) {
            i = hgv5.e;
            hgv3.v = hgv5;
            hgv5.R = hgv3;
            hgv.v = null;
        } else {
            i = 0;
        }
        hGV hgv6 = hgv.c;
        if (hgv6 != null) {
            i2 = hgv6.e;
            hgv3.c = hgv6;
            hgv6.R = hgv3;
            hgv.c = null;
        }
        hgv3.e = Math.max(i, i2) + 1;
        X(hgv, hgv3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        lhX lhx = this.f800R;
        if (lhx != null) {
            return lhx;
        }
        lhX lhx2 = new lhX(this, 0);
        this.f800R = lhx2;
        return lhx2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object get(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            hGV r2 = r2.R(r3, r1)     // Catch: ClassCastException -> 0x0009
            goto L_0x000a
        L_0x0009:
            r2 = r0
        L_0x000a:
            if (r2 == 0) goto L_0x000e
            java.lang.Object r0 = r2.f4197v
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aDS.get(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        lhX lhx = this.f801v;
        if (lhx != null) {
            return lhx;
        }
        lhX lhx2 = new lhX(this, 1);
        this.f801v = lhx2;
        return lhx2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            hGV R2 = R(obj, true);
            Object obj3 = R2.f4197v;
            R2.f4197v = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0012  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object remove(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L_0x0009
            r1 = 0
            hGV r3 = r2.R(r3, r1)     // Catch: ClassCastException -> 0x0009
            goto L_0x000a
        L_0x0009:
            r3 = r0
        L_0x000a:
            if (r3 == 0) goto L_0x0010
            r1 = 1
            r2.e(r3, r1)
        L_0x0010:
            if (r3 == 0) goto L_0x0014
            java.lang.Object r0 = r3.f4197v
        L_0x0014:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aDS.remove(java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0011  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.hGV v(java.util.Map.Entry r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r5.getKey()
            r1 = 0
            r2 = 0
            if (r0 == 0) goto L_0x000d
            hGV r4 = r4.R(r0, r1)     // Catch: ClassCastException -> 0x000d
            goto L_0x000e
        L_0x000d:
            r4 = r2
        L_0x000e:
            r0 = 1
            if (r4 == 0) goto L_0x0028
            java.lang.Object r3 = r4.f4197v
            java.lang.Object r5 = r5.getValue()
            if (r3 == r5) goto L_0x0024
            if (r3 == 0) goto L_0x0022
            boolean r5 = r3.equals(r5)
            if (r5 == 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r5 = r1
            goto L_0x0025
        L_0x0024:
            r5 = r0
        L_0x0025:
            if (r5 == 0) goto L_0x0028
            r1 = r0
        L_0x0028:
            if (r1 == 0) goto L_0x002b
            r2 = r4
        L_0x002b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aDS.v(java.util.Map$Entry):hGV");
    }
}
