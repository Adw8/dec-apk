package defpackage;

import java.util.Map;

/* renamed from: hGV  reason: default package */
/* loaded from: classes.dex */
public final class hGV implements Map.Entry {
    public hGV R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f4195R;
    public hGV X;
    public hGV c;
    public int e;

    /* renamed from: e  reason: collision with other field name */
    public hGV f4196e;
    public hGV v;

    /* renamed from: v  reason: collision with other field name */
    public Object f4197v;

    public hGV() {
        this.f4195R = null;
        this.X = this;
        this.f4196e = this;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f4195R;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f4197v;
        if (obj3 == null) {
            if (entry.getValue() != null) {
                return false;
            }
        } else if (!obj3.equals(entry.getValue())) {
            return false;
        }
        return true;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f4195R;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f4197v;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final int hashCode() {
        Object obj = this.f4195R;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f4197v;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f4197v;
        this.f4197v = obj;
        return obj2;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.f4195R + "=" + this.f4197v;
    }

    public hGV(hGV hgv, Object obj, hGV hgv2, hGV hgv3) {
        this.R = hgv;
        this.f4195R = obj;
        this.e = 1;
        this.f4196e = hgv2;
        this.X = hgv3;
        hgv3.f4196e = this;
        hgv2.X = this;
    }
}
