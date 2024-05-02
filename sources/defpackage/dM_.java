package defpackage;

/* renamed from: dM_  reason: default package */
/* loaded from: classes.dex */
public final class dM_ {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2580R;
    public final String c;
    public final String e;
    public final String v;

    public dM_(String str, String str2, int i, String str3, String str4) {
        this.f2580R = str;
        this.v = str2;
        this.c = str3;
        this.e = str4;
        this.R = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dM_)) {
            return false;
        }
        dM_ dm_ = (dM_) obj;
        return n3x.v(this.f2580R, dm_.f2580R) && n3x.v(this.v, dm_.v) && n3x.v(this.c, dm_.c) && n3x.v(this.e, dm_.e) && this.R == dm_.R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R) + opT.O(this.e, opT.O(this.c, opT.O(this.v, this.f2580R.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        String str = this.f2580R;
        String str2 = this.v;
        String str3 = this.c;
        String str4 = this.e;
        int i = this.R;
        StringBuilder sb = new StringBuilder();
        sb.append("ContainerImage(id=");
        sb.append(str);
        sb.append(", label=");
        sb.append(str2);
        sb.append(", repo=");
        sb.append(str3);
        sb.append(", containerId=");
        sb.append(str4);
        sb.append(", logo=");
        return jQ.j(sb, i, ")");
    }

    public /* synthetic */ dM_(String str, String str2, String str3, int i, int i2) {
        this(str, str2, (i2 & 16) != 0 ? 0 : i, (i2 & 4) != 0 ? "images" : null, (i2 & 8) != 0 ? (String) iH_.w(str, new String[]{"/"}).get(0) : str3);
    }
}
