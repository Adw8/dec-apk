package defpackage;

import java.io.Serializable;

/* renamed from: bvw  reason: default package */
/* loaded from: classes.dex */
public final class bvw implements Serializable {
    public final Throwable R;

    public bvw(Throwable th) {
        this.R = th;
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        return (obj instanceof bvw) && n3x.v(this.R, ((bvw) obj).R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("Failure(");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
