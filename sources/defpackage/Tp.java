package defpackage;

/* renamed from: Tp  reason: default package */
/* loaded from: classes.dex */
public final class Tp {
    public final aAC R;

    /* renamed from: R  reason: collision with other field name */
    public final String f537R;

    public Tp(String str, aAC aac) {
        this.f537R = str;
        this.R = aac;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Tp)) {
            return false;
        }
        Tp tp = (Tp) obj;
        return n3x.v(this.f537R, tp.f537R) && n3x.v(this.R, tp.R);
    }

    public final int hashCode() {
        String str = this.f537R;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        aAC aac = this.R;
        if (aac != null) {
            i = aac.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder U = opT.U("AccessibilityAction(label=");
        U.append(this.f537R);
        U.append(", action=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
