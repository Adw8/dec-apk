package defpackage;

/* renamed from: jRo  reason: default package */
/* loaded from: classes.dex */
public final class jRo extends lkt {
    public final aDS R = new aDS();

    public final boolean C(String str) {
        return this.R.containsKey(str);
    }

    public final lkt H(String str) {
        return (lkt) this.R.get(str);
    }

    public final boolean equals(Object obj) {
        return obj == this || ((obj instanceof jRo) && ((jRo) obj).R.equals(this.R));
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
