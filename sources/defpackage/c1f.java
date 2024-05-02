package defpackage;

import java.util.Objects;

/* renamed from: c1f  reason: default package */
/* loaded from: classes.dex */
public final class c1f {
    public final Class R;
    public final Class v;

    public c1f(Class cls, Class cls2) {
        this.R = cls;
        this.v = cls2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof c1f)) {
            return false;
        }
        c1f c1f = (c1f) obj;
        return c1f.R.equals(this.R) && c1f.v.equals(this.v);
    }

    public final int hashCode() {
        return Objects.hash(this.R, this.v);
    }

    public final String toString() {
        return this.R.getSimpleName() + " with serialization type: " + this.v.getSimpleName();
    }
}
