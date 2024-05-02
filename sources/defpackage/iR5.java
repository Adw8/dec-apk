package defpackage;

import java.util.List;

/* renamed from: iR5  reason: default package */
/* loaded from: classes.dex */
public final class iR5 {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final List f4587R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4588R;

    public iR5(String str, boolean z, List list) {
        this.R = str;
        this.f4588R = z;
        this.f4587R = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || iR5.class != obj.getClass()) {
            return false;
        }
        iR5 ir5 = (iR5) obj;
        if (this.f4588R == ir5.f4588R && this.f4587R.equals(ir5.f4587R)) {
            return this.R.startsWith("index_") ? ir5.R.startsWith("index_") : this.R.equals(ir5.R);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4587R.hashCode() + ((((this.R.startsWith("index_") ? -1184239155 : this.R.hashCode()) * 31) + (this.f4588R ? 1 : 0)) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Index{name='");
        U.append(this.R);
        U.append('\'');
        U.append(", unique=");
        U.append(this.f4588R);
        U.append(", columns=");
        U.append(this.f4587R);
        U.append('}');
        return U.toString();
    }
}
