package defpackage;

/* renamed from: fzb  reason: default package */
/* loaded from: classes.dex */
public final class fzb extends aOn {
    public final /* synthetic */ aOn R;
    public final transient int X;
    public final transient int e;

    public fzb(aOn aon, int i, int i2) {
        this.R = aon;
        this.e = i;
        this.X = i2;
    }

    @Override // defpackage.dNA
    public final boolean C() {
        return true;
    }

    @Override // defpackage.dNA
    public final Object[] P() {
        return this.R.P();
    }

    @Override // defpackage.dNA
    public final int c() {
        return this.R.c() + this.e;
    }

    @Override // java.util.List
    public final Object get(int i) {
        hDC.F(i, this.X);
        return this.R.get(i + this.e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.X;
    }

    @Override // defpackage.aOn
    /* renamed from: t */
    public final aOn subList(int i, int i2) {
        hDC.b(i, i2, this.X);
        aOn aon = this.R;
        int i3 = this.e;
        return aon.subList(i + i3, i2 + i3);
    }

    @Override // defpackage.dNA
    public final int v() {
        return this.R.c() + this.e + this.X;
    }
}
