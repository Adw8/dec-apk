package defpackage;

import java.util.Map;

/* renamed from: lVU  reason: default package */
/* loaded from: classes.dex */
public final class lVU implements Map.Entry {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public lVU f5763R;
    public final Object v;

    /* renamed from: v  reason: collision with other field name */
    public lVU f5764v;

    public lVU(Object obj, Object obj2) {
        this.R = obj;
        this.v = obj2;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof lVU)) {
            return false;
        }
        lVU lvu = (lVU) obj;
        return this.R.equals(lvu.R) && this.v.equals(lvu.v);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.R;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.v;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final int hashCode() {
        return this.v.hashCode() ^ this.R.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.R + "=" + this.v;
    }
}
