package defpackage;

/* renamed from: kW2  reason: default package */
/* loaded from: classes.dex */
public final class kW2 extends vC {
    public final gIA R;

    public kW2(gIA gia) {
        this.R = gia;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kW2) && n3x.v(this.R, ((kW2) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
