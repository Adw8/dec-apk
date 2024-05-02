package defpackage;

/* renamed from: dh_  reason: default package */
/* loaded from: classes.dex */
public final class dh_ {
    public final int R;

    public /* synthetic */ dh_(int i) {
        this.R = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof dh_) && this.R == ((dh_) obj).R;
    }

    public final int hashCode() {
        return Integer.hashCode(this.R);
    }

    public final String toString() {
        int i = this.R;
        return "PointerKeyboardModifiers(packedValue=" + i + ')';
    }
}
