package defpackage;

import java.io.Serializable;

/* renamed from: hGF  reason: default package */
/* loaded from: classes.dex */
public final class hGF implements Serializable {
    public final Object R;
    public final Object c;
    public final Object v;

    public hGF(Integer num, Integer num2, Object obj) {
        this.R = num;
        this.v = num2;
        this.c = obj;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hGF)) {
            return false;
        }
        hGF hgf = (hGF) obj;
        return n3x.v(this.R, hgf.R) && n3x.v(this.v, hgf.v) && n3x.v(this.c, hgf.c);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Object obj = this.R;
        int i = 0;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.v;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.c;
        if (obj3 != null) {
            i = obj3.hashCode();
        }
        return hashCode2 + i;
    }

    @Override // java.lang.Object
    public final String toString() {
        return '(' + this.R + ", " + this.v + ", " + this.c + ')';
    }
}
