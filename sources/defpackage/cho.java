package defpackage;

/* renamed from: cho  reason: default package */
/* loaded from: classes.dex */
public abstract class cho implements Runnable {
    public final cqI R;

    public cho() {
        this.R = null;
    }

    public cho(cqI cqi) {
        this.R = cqi;
    }

    public abstract void R();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            R();
        } catch (Exception e) {
            cqI cqi = this.R;
            if (cqi != null) {
                cqi.R(e);
            }
        }
    }
}
