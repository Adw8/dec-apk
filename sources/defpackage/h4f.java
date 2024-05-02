package defpackage;

/* renamed from: h4f  reason: default package */
/* loaded from: classes.dex */
public final class h4f {
    public final cE3 R;

    public h4f(cE3 ce3) {
        this.R = ce3;
    }

    /* renamed from: R */
    public final boolean equals(Object obj) {
        return (obj instanceof h4f) && n3x.v(((h4f) obj).R, this.R);
    }

    public final h4f c(h4f h4f) {
        a80 a80 = this.R.R;
        if (a80 == null) {
            a80 = h4f.R.R;
        }
        h4f.R.getClass();
        jo joVar = this.R.f2019R;
        if (joVar == null) {
            joVar = h4f.R.f2019R;
        }
        h4f.R.getClass();
        return new h4f(new cE3(a80, joVar));
    }

    /* renamed from: v */
    public final int hashCode() {
        return this.R.hashCode();
    }
}
