package defpackage;

/* renamed from: mzR  reason: default package */
/* loaded from: classes.dex */
public final class mzR extends aOn {
    public static final mzR R = new mzR(0, new Object[0]);
    public final transient int e;
    public final transient Object[] v;

    public mzR(int i, Object[] objArr) {
        this.v = objArr;
        this.e = i;
    }

    @Override // defpackage.dNA
    public final boolean C() {
        return false;
    }

    @Override // defpackage.dNA
    public final Object[] P() {
        return this.v;
    }

    @Override // defpackage.aOn, defpackage.dNA
    public final int R(Object[] objArr) {
        System.arraycopy(this.v, 0, objArr, 0, this.e);
        return this.e;
    }

    @Override // defpackage.dNA
    public final int c() {
        return 0;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hDC.F(i, this.e);
        Object obj = this.v[i];
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.e;
    }

    @Override // defpackage.dNA
    public final int v() {
        return this.e;
    }
}
