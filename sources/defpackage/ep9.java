package defpackage;

import java.util.List;

/* renamed from: ep9  reason: default package */
/* loaded from: classes.dex */
public final class ep9 extends k_M {
    public final float L;
    public final float O;

    /* renamed from: O  reason: collision with other field name */
    public final int f3205O;
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final a1 f3206R;

    /* renamed from: R  reason: collision with other field name */
    public final String f3207R;

    /* renamed from: R  reason: collision with other field name */
    public final List f3208R;
    public final float X;

    /* renamed from: X  reason: collision with other field name */
    public final int f3209X;
    public final float c;
    public final float e;

    /* renamed from: e  reason: collision with other field name */
    public final int f3210e;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final a1 f3211v;

    public ep9(String str, List list, int i, a1 a1Var, float f, a1 a1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.f3207R = str;
        this.f3208R = list;
        this.f3210e = i;
        this.f3206R = a1Var;
        this.R = f;
        this.f3211v = a1Var2;
        this.v = f2;
        this.c = f3;
        this.f3209X = i2;
        this.f3205O = i3;
        this.e = f4;
        this.X = f5;
        this.O = f6;
        this.L = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n3x.v(g8d.R(ep9.class), g8d.R(obj.getClass()))) {
            return false;
        }
        ep9 ep9 = (ep9) obj;
        if (!n3x.v(this.f3207R, ep9.f3207R) || !n3x.v(this.f3206R, ep9.f3206R)) {
            return false;
        }
        if (!(this.R == ep9.R) || !n3x.v(this.f3211v, ep9.f3211v)) {
            return false;
        }
        if (!(this.v == ep9.v)) {
            return false;
        }
        if (!(this.c == ep9.c)) {
            return false;
        }
        if (!(this.f3209X == ep9.f3209X)) {
            return false;
        }
        if (!(this.f3205O == ep9.f3205O)) {
            return false;
        }
        if (!(this.e == ep9.e)) {
            return false;
        }
        if (!(this.X == ep9.X)) {
            return false;
        }
        if (!(this.O == ep9.O)) {
            return false;
        }
        if (!(this.L == ep9.L)) {
            return false;
        }
        return (this.f3210e == ep9.f3210e) && n3x.v(this.f3208R, ep9.f3208R);
    }

    public final int hashCode() {
        int hashCode = (this.f3208R.hashCode() + (this.f3207R.hashCode() * 31)) * 31;
        a1 a1Var = this.f3206R;
        int i = 0;
        int c = jQ.c(this.R, (hashCode + (a1Var != null ? a1Var.hashCode() : 0)) * 31, 31);
        a1 a1Var2 = this.f3211v;
        if (a1Var2 != null) {
            i = a1Var2.hashCode();
        }
        return Integer.hashCode(this.f3210e) + jQ.c(this.L, jQ.c(this.O, jQ.c(this.X, jQ.c(this.e, opT.e(this.f3205O, opT.e(this.f3209X, jQ.c(this.c, jQ.c(this.v, (c + i) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
