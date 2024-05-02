package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: laH  reason: default package */
/* loaded from: classes.dex */
public final class laH {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final List f5789R;

    public laH(ArrayList arrayList, float f) {
        this.f5789R = arrayList;
        this.R = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof laH)) {
            return false;
        }
        laH lah = (laH) obj;
        return n3x.v(this.f5789R, lah.f5789R) && n3x.v(Float.valueOf(this.R), Float.valueOf(lah.R));
    }

    public final int hashCode() {
        return Float.hashCode(this.R) + (this.f5789R.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("PolynomialFit(coefficients=");
        U.append(this.f5789R);
        U.append(", confidence=");
        return jQ.N(U, this.R, ')');
    }
}
