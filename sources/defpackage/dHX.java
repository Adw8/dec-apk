package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dHX  reason: default package */
/* loaded from: classes.dex */
public final class dHX extends oYW {
    public final transient gMq R;
    public final transient int e;
    public final transient Object[] v;

    public dHX(gMq gmq, Object[] objArr, int i) {
        this.R = gmq;
        this.v = objArr;
        this.e = i;
    }

    @Override // defpackage.dNA
    public final int R(Object[] objArr) {
        return H().R(objArr);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.R.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final /* synthetic */ Iterator iterator() {
        return H().listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.e;
    }

    @Override // defpackage.oYW
    public final aOn t() {
        return new g0q(this);
    }
}
