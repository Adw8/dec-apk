package defpackage;

import java.util.HashSet;

/* renamed from: b0y  reason: default package */
/* loaded from: classes.dex */
public final class b0y {
    public final HashSet R = new HashSet();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0y.class != obj.getClass()) {
            return false;
        }
        return this.R.equals(((b0y) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }
}
