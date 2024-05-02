package defpackage;

/* renamed from: nlH  reason: default package */
/* loaded from: classes.dex */
public final class nlH {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6572R;

    public nlH(String str, int i) {
        this.f6572R = str;
        this.R = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlH)) {
            return false;
        }
        nlH nlh = (nlH) obj;
        if (this.R != nlh.R) {
            return false;
        }
        return this.f6572R.equals(nlh.f6572R);
    }

    public final int hashCode() {
        return (this.f6572R.hashCode() * 31) + this.R;
    }
}
