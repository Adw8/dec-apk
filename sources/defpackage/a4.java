package defpackage;

/* renamed from: a4  reason: default package */
/* loaded from: classes.dex */
public final class a4 extends u5 {
    public final Throwable R;

    public a4(Throwable th) {
        this.R = th;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a4) && n3x.v(this.R, ((a4) obj).R);
    }

    public final int hashCode() {
        Throwable th = this.R;
        if (th != null) {
            return th.hashCode();
        }
        return 0;
    }

    @Override // defpackage.u5
    public final String toString() {
        StringBuilder U = opT.U("Closed(");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
