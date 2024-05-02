package defpackage;

/* renamed from: Th  reason: default package */
/* loaded from: classes.dex */
public final class Th extends t2 {
    public final /* synthetic */ b0 R;
    public final int X;
    public int e = 0;

    public Th(b0 b0Var) {
        this.R = b0Var;
        this.X = b0Var.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.X;
    }
}
