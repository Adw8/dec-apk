package defpackage;

/* renamed from: jo  reason: default package */
/* loaded from: classes.dex */
public final class jo {
    public final kg9 R;

    /* renamed from: R  reason: collision with other field name */
    public final mz f5027R;

    /* renamed from: R  reason: collision with other field name */
    public final nKE f5028R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5029R;

    public jo(nKE nke, Y6 y6, kmL kml, boolean z) {
        this.f5027R = y6;
        this.R = kml;
        this.f5028R = nke;
        this.f5029R = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jo)) {
            return false;
        }
        jo joVar = (jo) obj;
        return n3x.v(this.f5027R, joVar.f5027R) && n3x.v(this.R, joVar.R) && n3x.v(this.f5028R, joVar.f5028R) && this.f5029R == joVar.f5029R;
    }

    public final int hashCode() {
        int hashCode = this.R.hashCode();
        int hashCode2 = (this.f5028R.hashCode() + ((hashCode + (this.f5027R.hashCode() * 31)) * 31)) * 31;
        boolean z = this.f5029R;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("ChangeSize(alignment=");
        U.append(this.f5027R);
        U.append(", size=");
        U.append(this.R);
        U.append(", animationSpec=");
        U.append(this.f5028R);
        U.append(", clip=");
        U.append(this.f5029R);
        U.append(')');
        return U.toString();
    }
}
