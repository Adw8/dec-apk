package defpackage;

/* renamed from: c_P  reason: default package */
/* loaded from: classes.dex */
public final class c_P {
    public final kMk C;
    public final kMk H;
    public final kMk L;
    public final kMk N;
    public final kMk O;
    public final kMk P;
    public final kMk R;
    public final kMk U;
    public final kMk X;
    public final kMk Z;
    public final kMk c;
    public final kMk e;
    public final kMk m;
    public final kMk v;
    public final kMk x;

    public c_P() {
        this(aHM.e, aHM.X, aHM.O, aHM.L, aHM.Z, aHM.m, aHM.C, aHM.N, aHM.P, aHM.R, aHM.v, aHM.c, aHM.x, aHM.H, aHM.U);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c_P)) {
            return false;
        }
        c_P c_p = (c_P) obj;
        return n3x.v(this.R, c_p.R) && n3x.v(this.v, c_p.v) && n3x.v(this.c, c_p.c) && n3x.v(this.e, c_p.e) && n3x.v(this.X, c_p.X) && n3x.v(this.O, c_p.O) && n3x.v(this.L, c_p.L) && n3x.v(this.Z, c_p.Z) && n3x.v(this.m, c_p.m) && n3x.v(this.x, c_p.x) && n3x.v(this.H, c_p.H) && n3x.v(this.U, c_p.U) && n3x.v(this.C, c_p.C) && n3x.v(this.N, c_p.N) && n3x.v(this.P, c_p.P);
    }

    public final int hashCode() {
        int hashCode = this.v.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.e.hashCode();
        int hashCode4 = this.X.hashCode();
        int hashCode5 = this.O.hashCode();
        int hashCode6 = this.L.hashCode();
        int hashCode7 = this.Z.hashCode();
        int hashCode8 = this.m.hashCode();
        int hashCode9 = this.x.hashCode();
        int hashCode10 = this.H.hashCode();
        int hashCode11 = this.U.hashCode();
        int hashCode12 = this.C.hashCode();
        int hashCode13 = this.N.hashCode();
        return this.P.hashCode() + ((hashCode13 + ((hashCode12 + ((hashCode11 + ((hashCode10 + ((hashCode9 + ((hashCode8 + ((hashCode7 + ((hashCode6 + ((hashCode5 + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.R.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("Typography(displayLarge=");
        U.append(this.R);
        U.append(", displayMedium=");
        U.append(this.v);
        U.append(",displaySmall=");
        U.append(this.c);
        U.append(", headlineLarge=");
        U.append(this.e);
        U.append(", headlineMedium=");
        U.append(this.X);
        U.append(", headlineSmall=");
        U.append(this.O);
        U.append(", titleLarge=");
        U.append(this.L);
        U.append(", titleMedium=");
        U.append(this.Z);
        U.append(", titleSmall=");
        U.append(this.m);
        U.append(", bodyLarge=");
        U.append(this.x);
        U.append(", bodyMedium=");
        U.append(this.H);
        U.append(", bodySmall=");
        U.append(this.U);
        U.append(", labelLarge=");
        U.append(this.C);
        U.append(", labelMedium=");
        U.append(this.N);
        U.append(", labelSmall=");
        U.append(this.P);
        U.append(')');
        return U.toString();
    }

    public c_P(kMk kmk, kMk kmk2, kMk kmk3, kMk kmk4, kMk kmk5, kMk kmk6, kMk kmk7, kMk kmk8, kMk kmk9, kMk kmk10, kMk kmk11, kMk kmk12, kMk kmk13, kMk kmk14, kMk kmk15) {
        this.R = kmk;
        this.v = kmk2;
        this.c = kmk3;
        this.e = kmk4;
        this.X = kmk5;
        this.O = kmk6;
        this.L = kmk7;
        this.Z = kmk8;
        this.m = kmk9;
        this.x = kmk10;
        this.H = kmk11;
        this.U = kmk12;
        this.C = kmk13;
        this.N = kmk14;
        this.P = kmk15;
    }
}
