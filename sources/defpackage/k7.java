package defpackage;

import java.util.AbstractList;

/* renamed from: k7  reason: default package */
/* loaded from: classes.dex */
public abstract class k7 extends AbstractList implements oOL {
    public abstract int R();

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return v(i);
    }

    @Override // java.util.AbstractCollection, java.util.List, java.util.Collection
    public final /* bridge */ int size() {
        return R();
    }

    public abstract Object v(int i);
}
