package defpackage;

import java.util.List;

/* renamed from: gOJ  reason: default package */
/* loaded from: classes.dex */
public final class gOJ extends Uk implements bh7 {
    public final bh7 R;
    public int X;
    public final int e;

    public gOJ(bh7 bh7, int i, int i2) {
        this.R = bh7;
        this.e = i;
        ooA.j(i, i2, ((U1) bh7).R());
        this.X = i2 - i;
    }

    @Override // defpackage.U1
    public final int R() {
        return this.X;
    }

    @Override // defpackage.Uk, java.util.List
    public final Object get(int i) {
        ooA.N(i, this.X);
        return this.R.get(this.e + i);
    }

    @Override // defpackage.Uk, java.util.List
    public final List subList(int i, int i2) {
        ooA.j(i, i2, this.X);
        bh7 bh7 = this.R;
        int i3 = this.e;
        return new gOJ(bh7, i + i3, i3 + i2);
    }
}
