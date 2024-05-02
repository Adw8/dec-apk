package defpackage;

/* renamed from: dz0  reason: default package */
/* loaded from: classes.dex */
public final class dz0 extends fpB {
    public final Runnable R;

    public dz0(Runnable runnable, long j) {
        super(j);
        this.R = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.R.run();
    }

    @Override // defpackage.fpB, java.lang.Object
    public final String toString() {
        return super.toString() + this.R;
    }
}
