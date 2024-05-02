package defpackage;

import java.io.Serializable;

/* renamed from: kSh  reason: default package */
/* loaded from: classes.dex */
public final class kSh implements Serializable {
    public final Object R;
    public final Object v;

    public kSh(Object obj, Object obj2) {
        this.R = obj;
        this.v = obj2;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kSh)) {
            return false;
        }
        kSh ksh = (kSh) obj;
        return n3x.v(this.R, ksh.R) && n3x.v(this.v, ksh.v);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Object obj = this.R;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.v;
        if (obj2 != null) {
            i = obj2.hashCode();
        }
        return hashCode + i;
    }

    @Override // java.lang.Object
    public final String toString() {
        return '(' + this.R + ", " + this.v + ')';
    }
}
