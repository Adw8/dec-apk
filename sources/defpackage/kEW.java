package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: kEW  reason: default package */
/* loaded from: classes.dex */
public final class kEW implements bNL, Iterable, dsi {
    public final LinkedHashMap R = new LinkedHashMap();

    /* renamed from: R  reason: collision with other field name */
    public boolean f5221R;
    public boolean v;

    public final boolean R(b_t b_t) {
        return this.R.containsKey(b_t);
    }

    public final void c(b_t b_t, Object obj) {
        this.R.put(b_t, obj);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kEW)) {
            return false;
        }
        kEW kew = (kEW) obj;
        return n3x.v(this.R, kew.R) && this.f5221R == kew.f5221R && this.v == kew.v;
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f5221R);
        return Boolean.hashCode(this.v) + ((hashCode + (this.R.hashCode() * 31)) * 31);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.R.entrySet().iterator();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        String str = "";
        if (this.f5221R) {
            sb.append(str);
            sb.append("mergeDescendants=true");
            str = ", ";
        }
        if (this.v) {
            sb.append(str);
            sb.append("isClearingSemantics=true");
            str = ", ";
        }
        for (Map.Entry entry : this.R.entrySet()) {
            Object value = entry.getValue();
            sb.append(str);
            sb.append(((b_t) entry.getKey()).f1750R);
            sb.append(" : ");
            sb.append(value);
            str = ", ";
        }
        return iTI.o(this) + "{ " + ((Object) sb) + " }";
    }

    public final Object v(b_t b_t) {
        Object obj = this.R.get(b_t);
        if (obj != null) {
            return obj;
        }
        throw new IllegalStateException("Key not present: " + b_t + " - consider getOrElse or getOrNull");
    }
}
