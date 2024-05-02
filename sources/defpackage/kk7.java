package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: kk7  reason: default package */
/* loaded from: classes.dex */
public final class kk7 implements Iterator, Map.Entry {
    public final /* synthetic */ Dd R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5408R = false;
    public int X = -1;
    public int e;

    public kk7(Dd dd) {
        this.R = dd;
        this.e = dd.Z() - 1;
    }

    @Override // java.lang.Object, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f5408R) {
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        } else if (!(obj instanceof Map.Entry)) {
            return false;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object O = this.R.O(this.X, 0);
            if (!(key == O || (key != null && key.equals(O)))) {
                return false;
            }
            Object value = entry.getValue();
            Object O2 = this.R.O(this.X, 1);
            return value == O2 || (value != null && value.equals(O2));
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f5408R) {
            return this.R.O(this.X, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f5408R) {
            return this.R.O(this.X, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.X < this.e;
    }

    @Override // java.lang.Object, java.util.Map.Entry
    public final int hashCode() {
        if (this.f5408R) {
            int i = 0;
            Object O = this.R.O(this.X, 0);
            Object O2 = this.R.O(this.X, 1);
            int hashCode = O == null ? 0 : O.hashCode();
            if (O2 != null) {
                i = O2.hashCode();
            }
            return hashCode ^ i;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.X++;
            this.f5408R = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f5408R) {
            this.R.U(this.X);
            this.X--;
            this.e--;
            this.f5408R = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f5408R) {
            return this.R.C(this.X, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.lang.Object
    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
