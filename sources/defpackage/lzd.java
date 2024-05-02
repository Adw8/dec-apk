package defpackage;

/* renamed from: lzd  reason: default package */
/* loaded from: classes.dex */
public final class lzd {
    public final String R;
    public final String v;

    public lzd(String str, String str2) {
        this.R = str;
        this.v = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lzd)) {
            return false;
        }
        lzd lzd = (lzd) obj;
        return n3x.v(this.R, lzd.R) && n3x.v(this.v, lzd.v);
    }

    public final int hashCode() {
        return this.v.hashCode() + (this.R.hashCode() * 31);
    }

    public final String toString() {
        String str = this.R;
        String str2 = this.v;
        return "LibraryInfo(id=" + str + ", licenseUrl=" + str2 + ")";
    }
}
