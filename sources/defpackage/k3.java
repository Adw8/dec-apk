package defpackage;

/* renamed from: k3  reason: default package */
/* loaded from: classes.dex */
public final class k3 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5184R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5185R;
    public int v;

    public /* synthetic */ k3(Object obj, int i, int i2) {
        this(obj, i, i2, "");
    }

    public final m3 R(int i) {
        int i2 = this.v;
        if (i2 != Integer.MIN_VALUE) {
            i = i2;
        }
        if (i != Integer.MIN_VALUE) {
            return new m3(this.f5184R, this.R, i, this.f5185R);
        }
        throw new IllegalStateException("Item.end should be set first".toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k3)) {
            return false;
        }
        k3 k3Var = (k3) obj;
        return n3x.v(this.f5184R, k3Var.f5184R) && this.R == k3Var.R && this.v == k3Var.v && n3x.v(this.f5185R, k3Var.f5185R);
    }

    public final int hashCode() {
        Object obj = this.f5184R;
        return this.f5185R.hashCode() + opT.e(this.v, opT.e(this.R, (obj == null ? 0 : obj.hashCode()) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("MutableRange(item=");
        U.append(this.f5184R);
        U.append(", start=");
        U.append(this.R);
        U.append(", end=");
        U.append(this.v);
        U.append(", tag=");
        U.append(this.f5185R);
        U.append(')');
        return U.toString();
    }

    public k3(Object obj, int i, int i2, String str) {
        this.f5184R = obj;
        this.R = i;
        this.v = i2;
        this.f5185R = str;
    }
}
