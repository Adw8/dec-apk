package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: fIC  reason: default package */
/* loaded from: classes.dex */
public final class fIC {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3373R;
    public final String c;
    public final String v;

    /* renamed from: v  reason: collision with other field name */
    public final List f3374v;

    public fIC(String str, String str2, String str3, List list, List list2) {
        this.R = str;
        this.v = str2;
        this.c = str3;
        this.f3373R = Collections.unmodifiableList(list);
        this.f3374v = Collections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || fIC.class != obj.getClass()) {
            return false;
        }
        fIC fic = (fIC) obj;
        if (this.R.equals(fic.R) && this.v.equals(fic.v) && this.c.equals(fic.c) && this.f3373R.equals(fic.f3373R)) {
            return this.f3374v.equals(fic.f3374v);
        }
        return false;
    }

    public final int hashCode() {
        int O = opT.O(this.c, opT.O(this.v, this.R.hashCode() * 31, 31), 31);
        return this.f3374v.hashCode() + ((this.f3373R.hashCode() + O) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("ForeignKey{referenceTable='");
        U.append(this.R);
        U.append('\'');
        U.append(", onDelete='");
        U.append(this.v);
        U.append('\'');
        U.append(", onUpdate='");
        U.append(this.c);
        U.append('\'');
        U.append(", columnNames=");
        U.append(this.f3373R);
        U.append(", referenceColumnNames=");
        U.append(this.f3374v);
        U.append('}');
        return U.toString();
    }
}
