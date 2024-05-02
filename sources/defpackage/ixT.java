package defpackage;

/* renamed from: ixT  reason: default package */
/* loaded from: classes.dex */
public final class ixT {
    public final heu R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4777R;

    public ixT(String str, heu heu) {
        this.f4777R = str;
        this.R = heu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ixT)) {
            return false;
        }
        ixT ixt = (ixT) obj;
        return n3x.v(this.f4777R, ixt.f4777R) && n3x.v(this.R, ixt.R);
    }

    public final int hashCode() {
        return this.R.hashCode() + (this.f4777R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("MatchGroup(value=");
        U.append(this.f4777R);
        U.append(", range=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
