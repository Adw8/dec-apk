package defpackage;

import java.util.AbstractMap;

/* renamed from: g0q  reason: default package */
/* loaded from: classes.dex */
public final class g0q extends aOn {
    public final /* synthetic */ dHX R;

    public g0q(dHX dhx) {
        this.R = dhx;
    }

    @Override // defpackage.dNA
    public final boolean C() {
        return true;
    }

    @Override // java.util.List
    public final /* synthetic */ Object get(int i) {
        hDC.F(i, this.R.e);
        dHX dhx = this.R;
        int i2 = i + i;
        Object obj = dhx.v[i2];
        obj.getClass();
        Object obj2 = dhx.v[i2 + 1];
        obj2.getClass();
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.R.e;
    }
}
