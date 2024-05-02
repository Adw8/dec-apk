package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: gMq  reason: default package */
/* loaded from: classes.dex */
public abstract class gMq implements Map, Serializable {
    public transient dHX R;

    /* renamed from: R  reason: collision with other field name */
    public transient nKc f3742R;

    /* renamed from: R  reason: collision with other field name */
    public transient nQ9 f3743R;

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        nQ9 nq9 = this.f3743R;
        if (nq9 == null) {
            fjX fjx = (fjX) this;
            nQ9 nq92 = new nQ9(1, fjx.e, fjx.f3534R);
            this.f3743R = nq92;
            nq9 = nq92;
        }
        return nq9.contains(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        dHX dhx = this.R;
        if (dhx != null) {
            return dhx;
        }
        fjX fjx = (fjX) this;
        dHX dhx2 = new dHX(fjx, fjx.f3534R, fjx.e);
        this.R = dhx2;
        return dhx2;
    }

    @Override // java.util.Map, java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return ((oYW) entrySet()).equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map, java.lang.Object
    public final int hashCode() {
        dHX dhx = this.R;
        if (dhx == null) {
            fjX fjx = (fjX) this;
            dHX dhx2 = new dHX(fjx, fjx.f3534R, fjx.e);
            this.R = dhx2;
            dhx = dhx2;
        }
        Iterator it = dhx.iterator();
        int i = 0;
        while (true) {
            m3m m3m = (m3m) it;
            if (!m3m.hasNext()) {
                return i;
            }
            E next = m3m.next();
            i += next != 0 ? next.hashCode() : 0;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((fjX) this).e == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        nKc nkc = this.f3742R;
        if (nkc != null) {
            return nkc;
        }
        fjX fjx = (fjX) this;
        nKc nkc2 = new nKc(fjx, new nQ9(0, fjx.e, fjx.f3534R));
        this.f3742R = nkc2;
        return nkc2;
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.lang.Object
    public final String toString() {
        int i = ((fjX) this).e;
        if (i >= 0) {
            StringBuilder sb = new StringBuilder((int) Math.min(((long) i) * 8, 1073741824L));
            sb.append('{');
            Iterator it = ((dHX) entrySet()).iterator();
            boolean z = true;
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (!z) {
                    sb.append(", ");
                }
                sb.append(entry.getKey());
                sb.append('=');
                sb.append(entry.getValue());
                z = false;
            }
            sb.append('}');
            return sb.toString();
        }
        throw new IllegalArgumentException(opT.Z("size cannot be negative but was: ", i));
    }

    @Override // java.util.Map
    public final Collection values() {
        nQ9 nq9 = this.f3743R;
        if (nq9 != null) {
            return nq9;
        }
        fjX fjx = (fjX) this;
        nQ9 nq92 = new nQ9(1, fjx.e, fjx.f3534R);
        this.f3743R = nq92;
        return nq92;
    }
}
