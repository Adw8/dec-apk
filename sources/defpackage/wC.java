package defpackage;

/* renamed from: wC  reason: default package */
/* loaded from: classes.dex */
public final class wC {
    public static final u5 R = new u5();

    /* renamed from: R  reason: collision with other field name */
    public final Object f7452R;

    public /* synthetic */ wC(Object obj) {
        this.f7452R = obj;
    }

    public static final void R(Object obj) {
        Throwable th;
        if (obj instanceof u5) {
            if (!(obj instanceof a4) || (th = ((a4) obj).R) == null) {
                throw new IllegalStateException(("Trying to call 'getOrThrow' on a failed channel result: " + obj).toString());
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof wC) && n3x.v(this.f7452R, ((wC) obj).f7452R);
    }

    public final int hashCode() {
        Object obj = this.f7452R;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.f7452R;
        if (obj instanceof a4) {
            return ((a4) obj).toString();
        }
        return "Value(" + obj + ')';
    }
}
