package defpackage;

/* renamed from: iC8  reason: default package */
/* loaded from: classes.dex */
public final class iC8 implements Runnable {
    public final icq R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4487R;

    public iC8(icq icq, String str) {
        this.R = icq;
        this.f4487R = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.R.f4670R) {
            if (((iC8) this.R.f4671R.remove(this.f4487R)) != null) {
                gAS gas = (gAS) this.R.v.remove(this.f4487R);
                if (gas != null) {
                    kfk.U().x(puc.v, String.format("Exceeded time limits on execution for %s", this.f4487R), new Throwable[0]);
                    ((puc) gas).O();
                }
            } else {
                kfk.U().x("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f4487R), new Throwable[0]);
            }
        }
    }
}
