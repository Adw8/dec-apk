package defpackage;

/* renamed from: bw9  reason: default package */
/* loaded from: classes.dex */
public final class bw9 extends j18 {
    public final dZs R;

    public bw9(dZs dzs) {
        this.R = dzs;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.X + 2;
        this.X = i;
        dZs dzs = this.R;
        Object[] objArr = super.R;
        return new cO8(dzs, objArr[i - 2], objArr[i - 1]);
    }
}
