package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cWa  reason: default package */
/* loaded from: classes.dex */
public final class cWa {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f2113R;

    /* renamed from: R  reason: collision with other field name */
    public final long f2114R;

    /* renamed from: R  reason: collision with other field name */
    public final List f2115R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2116R;
    public final long X;
    public final long c;
    public final long e;
    public final long v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f2117v;

    public cWa(long j, long j2, long j3, long j4, boolean z, float f, int i, boolean z2, ArrayList arrayList, long j5) {
        this.f2114R = j;
        this.v = j2;
        this.c = j3;
        this.e = j4;
        this.f2116R = z;
        this.R = f;
        this.f2113R = i;
        this.f2117v = z2;
        this.f2115R = arrayList;
        this.X = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cWa)) {
            return false;
        }
        cWa cwa = (cWa) obj;
        if (!k8q.R(this.f2114R, cwa.f2114R) || this.v != cwa.v || !aWo.v(this.c, cwa.c) || !aWo.v(this.e, cwa.e) || this.f2116R != cwa.f2116R || !n3x.v(Float.valueOf(this.R), Float.valueOf(cwa.R))) {
            return false;
        }
        return (this.f2113R == cwa.f2113R) && this.f2117v == cwa.f2117v && n3x.v(this.f2115R, cwa.f2115R) && aWo.v(this.X, cwa.X);
    }

    public final int hashCode() {
        int X = opT.X(this.v, Long.hashCode(this.f2114R) * 31, 31);
        long j = this.c;
        int i = aWo.R;
        int X2 = opT.X(this.e, opT.X(j, X, 31), 31);
        boolean z = this.f2116R;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int e = opT.e(this.f2113R, jQ.c(this.R, (X2 + i3) * 31, 31), 31);
        boolean z2 = this.f2117v;
        if (!z2) {
            i2 = z2 ? 1 : 0;
        }
        return Long.hashCode(this.X) + ((this.f2115R.hashCode() + ((e + i2) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("PointerInputEventData(id=");
        U.append((Object) k8q.v(this.f2114R));
        U.append(", uptime=");
        U.append(this.v);
        U.append(", positionOnScreen=");
        U.append((Object) aWo.m(this.c));
        U.append(", position=");
        U.append((Object) aWo.m(this.e));
        U.append(", down=");
        U.append(this.f2116R);
        U.append(", pressure=");
        U.append(this.R);
        U.append(", type=");
        int i = this.f2113R;
        U.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        U.append(", issuesEnterExit=");
        U.append(this.f2117v);
        U.append(", historical=");
        U.append(this.f2115R);
        U.append(", scrollDelta=");
        U.append((Object) aWo.m(this.X));
        U.append(')');
        return U.toString();
    }
}
