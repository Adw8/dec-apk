package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: lQE  reason: default package */
/* loaded from: classes.dex */
public final class lQE extends _i {
    public final mWd R;
    public final /* synthetic */ int e;

    public lQE(int i, mWd mwd) {
        this.e = i;
        if (i != 1) {
            this.R = mwd;
        } else {
            this.R = mwd;
        }
    }

    public final boolean R(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.R.get(entry.getKey());
        return obj2 != null ? n3x.v(obj2, entry.getValue()) : entry.getValue() == null && this.R.containsKey(entry.getKey());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.e) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.e) {
            case 0:
                this.R.clear();
                return;
            default:
                this.R.clear();
                return;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.e) {
            case 0:
                return R(obj);
            default:
                return this.R.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.e) {
            case 0:
                return new dZs(this.R);
            default:
                return new j0O(0, this.R);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.e) {
            case 0:
                return v(obj);
            default:
                if (!this.R.containsKey(obj)) {
                    return false;
                }
                this.R.remove(obj);
                return true;
        }
    }

    public final boolean v(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return this.R.remove(entry.getKey(), entry.getValue());
    }
}
