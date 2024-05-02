package defpackage;

import java.util.Objects;

/* renamed from: q6  reason: default package */
/* loaded from: classes.dex */
public final class q6 {
    public final String R;
    public final String v;

    public q6(String str, String str2) {
        this.R = str;
        this.v = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj;
        return Objects.equals(this.R, q6Var.R) && Objects.equals(this.v, q6Var.v);
    }

    public final int hashCode() {
        return Objects.hash(this.R, this.v);
    }
}
