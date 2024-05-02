package defpackage;

/* renamed from: fg2  reason: default package */
/* loaded from: classes.dex */
public final class fg2 implements dH9 {
    public final Object R;

    public fg2(Object obj) {
        this.R = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fg2) && n3x.v(this.R, ((fg2) obj).R);
    }

    @Override // defpackage.dH9
    public final Object getValue() {
        return this.R;
    }

    public final int hashCode() {
        Object obj = this.R;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("StaticValueHolder(value=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
