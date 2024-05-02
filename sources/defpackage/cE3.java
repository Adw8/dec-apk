package defpackage;

/* renamed from: cE3  reason: default package */
/* loaded from: classes.dex */
public final class cE3 {
    public final a80 R;

    /* renamed from: R  reason: collision with other field name */
    public final jo f2019R;

    public cE3(a80 a80, jo joVar) {
        this.R = a80;
        this.f2019R = joVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cE3)) {
            return false;
        }
        cE3 ce3 = (cE3) obj;
        return n3x.v(this.R, ce3.R) && n3x.v(null, null) && n3x.v(this.f2019R, ce3.f2019R) && n3x.v(null, null);
    }

    public final int hashCode() {
        a80 a80 = this.R;
        int hashCode = (((a80 == null ? 0 : a80.hashCode()) * 31) + 0) * 31;
        jo joVar = this.f2019R;
        return ((hashCode + (joVar == null ? 0 : joVar.hashCode())) * 31) + 0;
    }

    public final String toString() {
        StringBuilder U = opT.U("TransitionData(fade=");
        U.append(this.R);
        U.append(", slide=");
        U.append((Object) null);
        U.append(", changeSize=");
        U.append(this.f2019R);
        U.append(", scale=");
        U.append((Object) null);
        U.append(')');
        return U.toString();
    }

    public /* synthetic */ cE3(a80 a80, jo joVar, int i) {
        this((i & 1) != 0 ? null : a80, (i & 4) != 0 ? null : joVar);
    }
}
