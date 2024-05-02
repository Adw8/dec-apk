package defpackage;

/* renamed from: Rf  reason: default package */
/* loaded from: classes.dex */
public final class Rf {
    public static final Rf R;
    public static final Rf v;

    /* renamed from: R  reason: collision with other field name */
    public final Throwable f496R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f497R;

    static {
        if (az.f1495R) {
            v = null;
            R = null;
            return;
        }
        v = new Rf(null, false);
        R = new Rf(null, true);
    }

    public Rf(Throwable th, boolean z) {
        this.f497R = z;
        this.f496R = th;
    }
}
