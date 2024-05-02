package defpackage;

/* renamed from: cyg  reason: default package */
/* loaded from: classes.dex */
public final class cyg {
    public final Object R;
    public final Object v;

    public cyg(Object obj, Object obj2) {
        this.R = obj;
        this.v = obj2;
    }

    public final boolean R(Object obj, Object obj2) {
        return n3x.v(obj, this.R) && n3x.v(obj2, this.v);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cyg) {
            cyg cyg = (cyg) obj;
            if (n3x.v(this.R, cyg.R) && n3x.v(this.v, cyg.v)) {
                return true;
            }
        }
        return false;
    }

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
}
