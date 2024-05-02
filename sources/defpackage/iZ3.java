package defpackage;

/* renamed from: iZ3  reason: default package */
/* loaded from: classes.dex */
public final class iZ3 extends bYR {
    public final String R;

    public iZ3(String str) {
        this.R = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iZ3) && n3x.v(this.R, ((iZ3) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        return jQ.C("Error(message=", this.R, ")");
    }
}
