package defpackage;

/* renamed from: erS  reason: default package */
/* loaded from: classes.dex */
public final class erS {
    public static final erS R = new erS(gjA.v);

    /* renamed from: R  reason: collision with other field name */
    public final float f3218R;

    public erS(float f) {
        this.f3218R = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof erS)) {
            return false;
        }
        float f = this.f3218R;
        float f2 = ((erS) obj).f3218R;
        float f3 = gjA.R;
        return n3x.v(Float.valueOf(f), Float.valueOf(f2));
    }

    public final int hashCode() {
        float f = this.f3218R;
        float f2 = gjA.R;
        return Integer.hashCode(17) + (Float.hashCode(f) * 31);
    }

    public final String toString() {
        String str;
        StringBuilder U = opT.U("LineHeightStyle(alignment=");
        float f = this.f3218R;
        float f2 = gjA.R;
        boolean z = false;
        if (f == 0.0f) {
            str = "LineHeightStyle.Alignment.Top";
        } else {
            if (f == gjA.R) {
                str = "LineHeightStyle.Alignment.Center";
            } else {
                if (f == gjA.v) {
                    str = "LineHeightStyle.Alignment.Proportional";
                } else {
                    if (f == gjA.c) {
                        z = true;
                    }
                    if (z) {
                        str = "LineHeightStyle.Alignment.Bottom";
                    } else {
                        str = "LineHeightStyle.Alignment(topPercentage = " + f + ')';
                    }
                }
            }
        }
        U.append((Object) str);
        U.append(", trim=");
        U.append((Object) "LineHeightStyle.Trim.Both");
        U.append(')');
        return U.toString();
    }
}
