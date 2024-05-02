package defpackage;

import java.util.List;

/* renamed from: phU  reason: default package */
/* loaded from: classes.dex */
public final class phU {
    public final long O;
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f7171R;

    /* renamed from: R  reason: collision with other field name */
    public Float f7172R;

    /* renamed from: R  reason: collision with other field name */
    public List f7173R;

    /* renamed from: R  reason: collision with other field name */
    public nmc f7174R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f7175R;
    public final long X;
    public final long c;
    public final long e;
    public final long v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f7176v;

    public phU(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, boolean z3, int i, long j6) {
        this.f7171R = j;
        this.v = j2;
        this.c = j3;
        this.f7175R = z;
        this.e = j4;
        this.X = j5;
        this.f7176v = z2;
        this.R = i;
        this.O = j6;
        this.f7174R = new nmc(z3, z3);
        this.f7172R = Float.valueOf(f);
    }

    public final void R() {
        nmc nmc = this.f7174R;
        nmc.v = true;
        nmc.R = true;
    }

    public final String toString() {
        StringBuilder U = opT.U("PointerInputChange(id=");
        U.append((Object) k8q.v(this.f7171R));
        U.append(", uptimeMillis=");
        U.append(this.v);
        U.append(", position=");
        U.append((Object) aWo.m(this.c));
        U.append(", pressed=");
        U.append(this.f7175R);
        U.append(", pressure=");
        Float f = this.f7172R;
        U.append(f != null ? f.floatValue() : 0.0f);
        U.append(", previousUptimeMillis=");
        U.append(this.e);
        U.append(", previousPosition=");
        U.append((Object) aWo.m(this.X));
        U.append(", previousPressed=");
        U.append(this.f7176v);
        U.append(", isConsumed=");
        U.append(v());
        U.append(", type=");
        int i = this.R;
        U.append((Object) (i != 1 ? i != 2 ? i != 3 ? i != 4 ? "Unknown" : "Eraser" : "Stylus" : "Mouse" : "Touch"));
        U.append(", historical=");
        Object obj = this.f7173R;
        if (obj == null) {
            obj = fcD.R;
        }
        U.append(obj);
        U.append(",scrollDelta=");
        U.append((Object) aWo.m(this.O));
        U.append(')');
        return U.toString();
    }

    public final boolean v() {
        nmc nmc = this.f7174R;
        return nmc.v || nmc.R;
    }

    public phU(long j, long j2, long j3, boolean z, float f, long j4, long j5, boolean z2, int i, List list, long j6) {
        this(j, j2, j3, z, f, j4, j5, z2, false, i, j6);
        this.f7173R = list;
    }
}
