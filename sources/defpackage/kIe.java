package defpackage;

/* renamed from: kIe  reason: default package */
/* loaded from: classes.dex */
public final class kIe {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f5250R;

    public kIe(Object obj, kg9 kg9) {
        this.R = obj;
        this.f5250R = kg9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kIe)) {
            return false;
        }
        kIe kie = (kIe) obj;
        return n3x.v(this.R, kie.R) && n3x.v(this.f5250R, kie.f5250R);
    }

    public final int hashCode() {
        Object obj = this.R;
        return this.f5250R.hashCode() + ((obj == null ? 0 : obj.hashCode()) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("CompletedWithCancellation(result=");
        U.append(this.R);
        U.append(", onCancellation=");
        U.append(this.f5250R);
        U.append(')');
        return U.toString();
    }
}
