package defpackage;

import java.util.Set;

/* renamed from: n4_  reason: default package */
/* loaded from: classes.dex */
public abstract class n4_ implements Set, j7G {
    public final cNN R;

    public n4_(cNN cnn) {
        this.R = cnn;
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.R.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.R.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.R.size();
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        return aJV.v(this);
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return aJV.c(this, objArr);
    }
}
