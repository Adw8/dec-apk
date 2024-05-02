package defpackage;

import java.util.Objects;

/* renamed from: U9  reason: default package */
/* loaded from: classes.dex */
public final class U9 extends d73 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final o7 f550R;

    public U9(int i, o7 o7Var) {
        this.R = i;
        this.f550R = o7Var;
    }

    public final int K() {
        o7 o7Var = this.f550R;
        if (o7Var == o7.e) {
            return this.R;
        }
        if (!(o7Var == o7.R || o7Var == o7.v || o7Var == o7.c)) {
            throw new IllegalStateException("Unknown variant");
        }
        return this.R + 5;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof U9)) {
            return false;
        }
        U9 u9 = (U9) obj;
        return u9.K() == K() && u9.f550R == this.f550R;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.R), this.f550R);
    }

    public final String toString() {
        StringBuilder U = opT.U("AES-CMAC Parameters (variant: ");
        U.append(this.f550R);
        U.append(", ");
        return jQ.j(U, this.R, "-byte tags)");
    }
}
