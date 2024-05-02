package defpackage;

/* renamed from: auH  reason: default package */
/* loaded from: classes.dex */
public abstract class auH extends rB implements iLf {
    public volatile in R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f1488R = new Object();
    public boolean L = false;

    public auH() {
        C(new hL(this, 4));
    }

    @Override // androidx.activity.d, defpackage.jIY
    public final hv5 L() {
        return vd.g(this, super.L());
    }

    @Override // defpackage.iLf
    public final Object R() {
        if (this.R == null) {
            synchronized (this.f1488R) {
                if (this.R == null) {
                    this.R = new in(this);
                }
            }
        }
        return this.R.R();
    }
}
