package defpackage;

/* renamed from: jx  reason: default package */
/* loaded from: classes.dex */
public final class jx implements Runnable {
    public final az R;

    /* renamed from: R  reason: collision with other field name */
    public final nA8 f5157R;

    public jx(az azVar, nA8 na8) {
        this.R = azVar;
        this.f5157R = na8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.R.f1497R == this) {
            if (az.f1494R.P(this.R, this, az.O(this.f5157R))) {
                az.c(this.R);
            }
        }
    }
}
