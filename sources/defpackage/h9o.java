package defpackage;

/* renamed from: h9o  reason: default package */
/* loaded from: classes.dex */
public final class h9o implements f2 {
    public final Class R;

    public h9o(Class cls) {
        this.R = cls;
    }

    @Override // defpackage.f2
    public final Class R() {
        return this.R;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof h9o) && n3x.v(this.R, ((h9o) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        return this.R.toString() + " (Kotlin reflection is not available)";
    }
}
