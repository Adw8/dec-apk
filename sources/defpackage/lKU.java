package defpackage;

/* renamed from: lKU  reason: default package */
/* loaded from: classes.dex */
public final class lKU {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5653R;

    public lKU(int i, Object obj) {
        this.R = i;
        this.f5653R = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lKU)) {
            return false;
        }
        lKU lku = (lKU) obj;
        return this.R == lku.R && n3x.v(this.f5653R, lku.f5653R);
    }

    public final int hashCode() {
        int i = this.R * 31;
        Object obj = this.f5653R;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder U = opT.U("IndexedValue(index=");
        U.append(this.R);
        U.append(", value=");
        U.append(this.f5653R);
        U.append(')');
        return U.toString();
    }
}
