package defpackage;

/* renamed from: kA9  reason: default package */
/* loaded from: classes.dex */
public final class kA9 {
    public final Vg R;

    public kA9(Vg vg) {
        this.R = vg;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof kA9)) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        return n3x.v(this.R.R.toLanguageTag(), ((kA9) obj).R.R.toLanguageTag());
    }

    public final int hashCode() {
        return this.R.R.toLanguageTag().hashCode();
    }

    public final String toString() {
        return this.R.R.toLanguageTag();
    }
}
