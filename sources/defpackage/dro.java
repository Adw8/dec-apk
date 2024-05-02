package defpackage;

/* renamed from: dro  reason: default package */
/* loaded from: classes.dex */
public final class dro {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final c_c f2902R;

    public dro(c_c c_c, long j) {
        this.f2902R = c_c;
        this.R = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dro)) {
            return false;
        }
        dro dro = (dro) obj;
        return this.f2902R == dro.f2902R && aWo.v(this.R, dro.R);
    }

    public final int hashCode() {
        long j = this.R;
        int i = aWo.R;
        return Long.hashCode(j) + (this.f2902R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("SelectionHandleInfo(handle=");
        U.append(this.f2902R);
        U.append(", position=");
        U.append((Object) aWo.m(this.R));
        U.append(')');
        return U.toString();
    }
}
