package defpackage;

/* renamed from: k6S  reason: default package */
/* loaded from: classes.dex */
public final class k6S extends gmj {
    public final Runnable R;

    public k6S(Runnable runnable, long j, ift ift) {
        super(j, ift);
        this.R = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.R.run();
        } finally {
            ((gmj) this).f3929R.getClass();
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("Task[");
        U.append(this.R.getClass().getSimpleName());
        U.append('@');
        U.append(aH9.G(this.R));
        U.append(", ");
        U.append(((gmj) this).R);
        U.append(", ");
        U.append(((gmj) this).f3929R);
        U.append(']');
        return U.toString();
    }
}
