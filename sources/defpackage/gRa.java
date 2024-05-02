package defpackage;

/* renamed from: gRa  reason: default package */
/* loaded from: classes.dex */
public final class gRa {
    public final axi R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3762R = true;
    public final boolean v = true;

    public gRa() {
        axi axi = axi.Inherit;
        this.R = axi;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gRa)) {
            return false;
        }
        gRa gra = (gRa) obj;
        return this.f3762R == gra.f3762R && this.v == gra.v && this.R == gra.R;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.v);
        int hashCode2 = this.R.hashCode();
        int hashCode3 = Boolean.hashCode(true);
        return Boolean.hashCode(true) + ((hashCode3 + ((hashCode2 + ((hashCode + (Boolean.hashCode(this.f3762R) * 31)) * 31)) * 31)) * 31);
    }
}
