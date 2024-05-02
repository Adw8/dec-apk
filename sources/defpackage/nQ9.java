package defpackage;

/* renamed from: nQ9  reason: default package */
/* loaded from: classes.dex */
public final class nQ9 extends aOn {
    public final transient int X;
    public final transient int e;
    public final transient Object[] v;

    public nQ9(int i, int i2, Object[] objArr) {
        this.v = objArr;
        this.e = i;
        this.X = i2;
    }

    @Override // defpackage.dNA
    public final boolean C() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hDC.F(i, this.X);
        Object obj = this.v[i + i + this.e];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X;
    }
}
