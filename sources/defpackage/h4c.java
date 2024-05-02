package defpackage;

/* renamed from: h4c  reason: default package */
/* loaded from: classes.dex */
public final class h4c {
    public static final h4c R = new h4c();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h4c)) {
            return false;
        }
        ((h4c) obj).getClass();
        return true;
    }

    public final int hashCode() {
        return Integer.hashCode(1) + opT.e(3, Integer.hashCode(1) * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("LineBreak(strategy=");
        U.append((Object) nxv.R(1));
        U.append(", strictness=");
        U.append((Object) kFG.R(3));
        U.append(", wordBreak=");
        U.append((Object) "WordBreak.None");
        U.append(')');
        return U.toString();
    }
}
