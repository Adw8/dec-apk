package defpackage;

/* renamed from: a3  reason: default package */
/* loaded from: classes.dex */
public final class a3 {
    public IC R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f724R;
    public boolean v;

    public final void R(IC ic) {
        synchronized (this) {
            while (this.v) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                }
            }
            if (this.R != ic) {
                this.R = ic;
                if (this.f724R) {
                    ic.onCancel();
                }
            }
        }
    }
}
