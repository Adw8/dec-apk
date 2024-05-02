package defpackage;

import java.util.concurrent.Executor;

/* renamed from: kVh  reason: default package */
/* loaded from: classes.dex */
public final class kVh implements drd {
    public final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5316R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final Executor f5317R;
    public final Object v;

    public kVh(Executor executor, jeO jeo) {
        this.f5317R = executor;
        this.v = jeo;
    }

    public final void R(b1t b1t) {
        switch (this.R) {
            case 0:
                synchronized (this.f5316R) {
                    if (((h5) this.v) != null) {
                        this.f5317R.execute(new bx(this, 16, b1t));
                        return;
                    }
                    return;
                }
            case 1:
                if (!b1t.X()) {
                    synchronized (this.f5316R) {
                        if (((jeO) this.v) != null) {
                            this.f5317R.execute(new bx(this, 17, b1t));
                            return;
                        }
                        return;
                    }
                }
                return;
            default:
                if (b1t.X()) {
                    synchronized (this.f5316R) {
                        if (((iXM) this.v) != null) {
                            this.f5317R.execute(new bx(this, 18, b1t));
                            return;
                        }
                        return;
                    }
                }
                return;
        }
    }

    public kVh(Executor executor, iXM ixm) {
        this.f5317R = executor;
        this.v = ixm;
    }

    public kVh(hye hye, h5 h5Var) {
        this.f5317R = hye;
        this.v = h5Var;
    }
}
