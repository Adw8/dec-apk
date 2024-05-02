package defpackage;

/* renamed from: ozT  reason: default package */
/* loaded from: classes.dex */
public final class ozT extends mRM {
    public final Object R = new Object();

    public ozT() {
        super(12, 1);
    }

    @Override // defpackage.mRM
    public final Object R() {
        Object R;
        synchronized (this.R) {
            R = super.R();
        }
        return R;
    }

    @Override // defpackage.mRM
    public final boolean v(Object obj) {
        boolean v;
        synchronized (this.R) {
            v = super.v(obj);
        }
        return v;
    }
}
