package defpackage;

/* renamed from: cy4  reason: default package */
/* loaded from: classes.dex */
public abstract class cy4 extends jw implements iLf {
    public volatile in R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f2464R = new Object();
    public boolean O = false;

    public cy4() {
        C(new hL(this, 3));
    }

    @Override // androidx.activity.d, defpackage.jIY
    public final hv5 L() {
        return vd.g(this, super.L());
    }

    @Override // defpackage.iLf
    public final Object R() {
        if (this.R == null) {
            synchronized (this.f2464R) {
                if (this.R == null) {
                    this.R = new in(this);
                }
            }
        }
        return this.R.R();
    }
}
