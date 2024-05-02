package defpackage;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: Vz  reason: default package */
/* loaded from: classes.dex */
public abstract class Vz extends O implements fXm {
    public final int O;
    public final b R;
    public final int X;
    public final int e;

    public Vz(int i, int i2, int i3, b bVar) {
        if (bVar == null) {
            throw new NullPointerException("'obj' cannot be null");
        } else if (i2 == 0 || (i2 & 192) != i2) {
            throw new IllegalArgumentException(opT.Z("invalid tag class: ", i2));
        } else {
            this.e = bVar instanceof J ? 1 : i;
            this.X = i2;
            this.O = i3;
            this.R = bVar;
        }
    }

    public static Vz n(int i, int i2, W w) {
        boolean z = true;
        if (w.R != 1) {
            z = false;
        }
        oU oUVar = z ? new oU(3, i, i2, w.c(0), 2) : new oU(4, i, i2, k2D.R(w), 2);
        return i != 64 ? oUVar : new k61(oUVar);
    }

    public abstract q A(O o);

    @Override // defpackage.fXm
    public final O P() {
        return this;
    }

    public final boolean Q() {
        int i = this.e;
        return i == 1 || i == 3;
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return this.R.v().hashCode() ^ (((this.X * 7919) ^ this.O) ^ (Q() ? 15 : 240));
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof Vz)) {
            return false;
        }
        Vz vz = (Vz) o;
        if (this.O != vz.O || this.X != vz.X) {
            return false;
        }
        if (this.e != vz.e && Q() != vz.Q()) {
            return false;
        }
        O v = this.R.v();
        O v2 = vz.R.v();
        if (v == v2) {
            return true;
        }
        if (Q()) {
            return v.o(v2);
        }
        try {
            return Arrays.equals(i(), vz.i());
        } catch (IOException unused) {
            return false;
        }
    }

    public final String toString() {
        return n3x.H(this.X, this.O) + this.R;
    }

    @Override // defpackage.O
    public abstract O u();

    @Override // defpackage.O
    public abstract O z();
}
