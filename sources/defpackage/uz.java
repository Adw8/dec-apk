package defpackage;

/* renamed from: uz  reason: default package */
/* loaded from: classes.dex */
public final class uz {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public Object f7429R;
    public int c;
    public int v;

    public uz(Object obj, int i, int i2, int i3) {
        this.R = i;
        this.v = i2;
        this.c = i3;
        this.f7429R = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uz)) {
            return false;
        }
        uz uzVar = (uz) obj;
        int i = this.R;
        if (i != uzVar.R) {
            return false;
        }
        if (i == 8 && Math.abs(this.c - this.v) == 1 && this.c == uzVar.v && this.v == uzVar.c) {
            return true;
        }
        if (this.c != uzVar.c || this.v != uzVar.v) {
            return false;
        }
        Object obj2 = this.f7429R;
        if (obj2 != null) {
            if (!obj2.equals(uzVar.f7429R)) {
                return false;
            }
        } else if (uzVar.f7429R != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.R * 31) + this.v) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.R;
        sb.append(i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add");
        sb.append(",s:");
        sb.append(this.v);
        sb.append("c:");
        sb.append(this.c);
        sb.append(",p:");
        sb.append(this.f7429R);
        sb.append("]");
        return sb.toString();
    }
}
