package defpackage;

import java.util.Objects;

/* renamed from: jj1  reason: default package */
/* loaded from: classes.dex */
public final class jj1 {
    public final Class R;

    /* renamed from: R  reason: collision with other field name */
    public final nE f5009R;

    public jj1(Class cls, nE nEVar) {
        this.R = cls;
        this.f5009R = nEVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof jj1)) {
            return false;
        }
        jj1 jj1 = (jj1) obj;
        return jj1.R.equals(this.R) && jj1.f5009R.equals(this.f5009R);
    }

    public final int hashCode() {
        return Objects.hash(this.R, this.f5009R);
    }

    public final String toString() {
        return this.R.getSimpleName() + ", object identifier: " + this.f5009R;
    }
}
