package defpackage;

/* renamed from: oFB  reason: default package */
/* loaded from: classes.dex */
public final class oFB {
    public final String R;
    public final String v;

    public oFB(String str, String str2) {
        this.R = str;
        this.v = str2;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof oFB) && n3x.v(((oFB) obj).R, this.R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        return this.R;
    }
}
