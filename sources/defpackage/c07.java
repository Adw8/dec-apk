package defpackage;

import java.util.Map;

/* renamed from: c07  reason: default package */
/* loaded from: classes.dex */
public class c07 implements Map.Entry, dsi {
    public final Object R;
    public final Object v;

    public c07(Object obj, Object obj2) {
        this.R = obj;
        this.v = obj2;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final boolean equals(Object obj) {
        Map.Entry entry = obj instanceof Map.Entry ? (Map.Entry) obj : null;
        return entry != null && n3x.v(entry.getKey(), this.R) && n3x.v(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.R;
    }

    @Override // java.util.Map.Entry
    public Object getValue() {
        return this.v;
    }

    @Override // java.util.Map.Entry, java.lang.Object
    public final int hashCode() {
        Object obj = this.R;
        int i = 0;
        int hashCode = obj != null ? obj.hashCode() : 0;
        Object value = getValue();
        if (value != null) {
            i = value.hashCode();
        }
        return hashCode ^ i;
    }

    @Override // java.util.Map.Entry
    public Object setValue(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* JADX DEBUG: TODO: convert one arg to string using `String.valueOf()`, args: [(wrap: java.lang.Object : 0x0005: IGET  (r1v0 java.lang.Object A[REMOVE]) = (r2v0 'this' c07 A[IMMUTABLE_TYPE, THIS]) c07.R java.lang.Object), ('=' char), (wrap: java.lang.Object : 0x000f: INVOKE  (r2v1 java.lang.Object A[REMOVE]) = (r2v0 'this' c07 A[IMMUTABLE_TYPE, THIS]) type: VIRTUAL call: c07.getValue():java.lang.Object)] */
    @Override // java.lang.Object
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.R);
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
