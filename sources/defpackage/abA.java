package defpackage;

/* renamed from: abA  reason: default package */
/* loaded from: classes.dex */
public final class abA {
    public static final abA R = new abA(0, 15);

    /* renamed from: R  reason: collision with other field name */
    public final int f932R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f933R;
    public final int c;
    public final int v;

    public abA(int i, int i2) {
        int i3 = 1;
        boolean z = (i2 & 2) != 0;
        i = (i2 & 4) != 0 ? 1 : i;
        i3 = (i2 & 8) == 0 ? 0 : i3;
        this.f932R = 0;
        this.f933R = z;
        this.v = i;
        this.c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof abA)) {
            return false;
        }
        abA aba = (abA) obj;
        if (!(this.f932R == aba.f932R) || this.f933R != aba.f933R) {
            return false;
        }
        if (!(this.v == aba.v)) {
            return false;
        }
        return this.c == aba.c;
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.f933R);
        return Integer.hashCode(this.c) + opT.e(this.v, (hashCode + (Integer.hashCode(this.f932R) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("KeyboardOptions(capitalization=");
        U.append((Object) hDC.M(this.f932R));
        U.append(", autoCorrect=");
        U.append(this.f933R);
        U.append(", keyboardType=");
        U.append((Object) dxh.H(this.v));
        U.append(", imeAction=");
        U.append((Object) j8k.R(this.c));
        U.append(')');
        return U.toString();
    }
}
