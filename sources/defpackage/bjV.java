package defpackage;

/* renamed from: bjV  reason: default package */
/* loaded from: classes.dex */
public final class bjV extends lZe implements Runnable {
    public final long R;

    public bjV(long j, aOO aoo) {
        super(aoo, aoo.v());
        this.R = j;
    }

    @Override // defpackage.mO, defpackage.nfJ
    public final String mL() {
        return super.mL() + "(timeMillis=" + this.R + ')';
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j = this.R;
        K(new maT("Timed out waiting for " + j + " ms", this));
    }
}
