package defpackage;

/* renamed from: ep4  reason: default package */
/* loaded from: classes.dex */
public final class ep4 extends mjG implements cNa {
    public final float R = 1.0f;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3204R;

    public ep4(boolean z) {
        this.f3204R = z;
    }

    @Override // defpackage.cNa
    public final Object b(Object obj) {
        oG1 og1 = obj instanceof oG1 ? (oG1) obj : null;
        if (og1 == null) {
            og1 = new oG1();
        }
        og1.R = this.R;
        og1.f6719R = this.f3204R;
        return og1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        ep4 ep4 = obj instanceof ep4 ? (ep4) obj : null;
        if (ep4 == null) {
            return false;
        }
        return ((this.R > ep4.R ? 1 : (this.R == ep4.R ? 0 : -1)) == 0) && this.f3204R == ep4.f3204R;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f3204R) + (Float.hashCode(this.R) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("LayoutWeightImpl(weight=");
        U.append(this.R);
        U.append(", fill=");
        U.append(this.f3204R);
        U.append(')');
        return U.toString();
    }
}
