package defpackage;

import java.io.Serializable;

/* renamed from: mwl  reason: default package */
/* loaded from: classes.dex */
public final class mwl implements Serializable {
    public final Object R;

    public /* synthetic */ mwl(Object obj) {
        this.R = obj;
    }

    public static final Throwable R(Object obj) {
        if (obj instanceof bvw) {
            return ((bvw) obj).R;
        }
        return null;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof mwl) && n3x.v(this.R, ((mwl) obj).R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        Object obj = this.R;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        Object obj = this.R;
        if (obj instanceof bvw) {
            return ((bvw) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
