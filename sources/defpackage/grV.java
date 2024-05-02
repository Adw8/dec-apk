package defpackage;

import java.util.Map;

/* renamed from: grV  reason: default package */
/* loaded from: classes.dex */
public final class grV implements Map.Entry {
    public grV R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f3961R;
    public int X;

    /* renamed from: X  reason: collision with other field name */
    public grV f3962X;
    public grV c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public grV f3963e;
    public grV v;

    /* renamed from: v  reason: collision with other field name */
    public Object f3964v;

    public grV() {
        this.f3961R = null;
        this.e = -1;
        this.f3962X = this;
        this.f3963e = this;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f3961R;
        if (obj2 == null) {
            if (entry.getKey() != null) {
                return false;
            }
        } else if (!obj2.equals(entry.getKey())) {
            return false;
        }
        Object obj3 = this.f3964v;
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
        return this.f3961R;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f3964v;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final int hashCode() {
        Object obj = this.f3961R;
        int i = 0;
        int hashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f3964v;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object obj2 = this.f3964v;
        this.f3964v = obj;
        return obj2;
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.f3961R + "=" + this.f3964v;
    }

    public grV(grV grv, Object obj, int i, grV grv2, grV grv3) {
        this.R = grv;
        this.f3961R = obj;
        this.e = i;
        this.X = 1;
        this.f3963e = grv2;
        this.f3962X = grv3;
        grv3.f3963e = this;
        grv2.f3962X = this;
    }
}
