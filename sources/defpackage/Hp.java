package defpackage;

import java.util.RandomAccess;

/* renamed from: Hp  reason: default package */
/* loaded from: classes.dex */
public final class Hp extends Uk implements RandomAccess {
    public final Uk R;
    public int X;
    public final int e;

    public Hp(Uk uk, int i, int i2) {
        this.R = uk;
        this.e = i;
        hw1.N(i, i2, uk.R());
        this.X = i2 - i;
    }

    @Override // defpackage.U1
    public final int R() {
        return this.X;
    }

    @Override // defpackage.Uk, java.util.List
    public final Object get(int i) {
        hw1.U(i, this.X);
        return this.R.get(this.e + i);
    }
}
