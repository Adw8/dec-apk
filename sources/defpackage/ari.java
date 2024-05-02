package defpackage;

import java.util.ArrayList;

/* renamed from: ari  reason: default package */
/* loaded from: classes.dex */
public final class ari {

    /* renamed from: R  reason: collision with other field name */
    public final int f1478R;
    public static final ari R = new ari(0);
    public static final ari v = new ari(1);
    public static final ari c = new ari(2);

    public ari(int i) {
        this.f1478R = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ari) && this.f1478R == ((ari) obj).f1478R;
    }

    public final int hashCode() {
        return this.f1478R;
    }

    public final String toString() {
        if (this.f1478R == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((this.f1478R & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((this.f1478R & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            StringBuilder U = opT.U("TextDecoration.");
            U.append((String) arrayList.get(0));
            return U.toString();
        }
        StringBuilder U2 = opT.U("TextDecoration[");
        U2.append(gQc.Y(arrayList, ", ", null, 62));
        U2.append(']');
        return U2.toString();
    }
}
