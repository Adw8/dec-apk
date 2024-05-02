package defpackage;

/* renamed from: oG1  reason: default package */
/* loaded from: classes.dex */
public final class oG1 {
    public float R = 0.0f;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6719R = true;

    /* renamed from: R  reason: collision with other field name */
    public aH9 f6718R = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oG1)) {
            return false;
        }
        oG1 og1 = (oG1) obj;
        return n3x.v(Float.valueOf(this.R), Float.valueOf(og1.R)) && this.f6719R == og1.f6719R && n3x.v(this.f6718R, og1.f6718R);
    }

    public final int hashCode() {
        int hashCode = Float.hashCode(this.R) * 31;
        boolean z = this.f6719R;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        int i4 = (hashCode + i) * 31;
        aH9 ah9 = this.f6718R;
        return i4 + (ah9 == null ? 0 : ah9.hashCode());
    }

    public final String toString() {
        StringBuilder U = opT.U("RowColumnParentData(weight=");
        U.append(this.R);
        U.append(", fill=");
        U.append(this.f6719R);
        U.append(", crossAxisAlignment=");
        U.append(this.f6718R);
        U.append(')');
        return U.toString();
    }
}
