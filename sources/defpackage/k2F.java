package defpackage;

/* renamed from: k2F  reason: default package */
/* loaded from: classes.dex */
public final class k2F extends Z {
    public final /* synthetic */ int X;

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public k2F(W w) {
        this(k2D.R(w), 1);
        this.X = 1;
    }

    @Override // defpackage.Z
    public final q n() {
        boolean z = false;
        switch (this.X) {
            case 0:
                W w = new W(4);
                u uVar = ((Z) this).f656R;
                if (uVar != null) {
                    w.R(uVar);
                }
                X x = ((Z) this).f655R;
                if (x != null) {
                    w.R(x);
                }
                O o = ((Z) this).R;
                if (o != null) {
                    w.R(o.u());
                }
                int i = this.e;
                if (i == 0) {
                    z = true;
                }
                w.R(new oU(i, 1, this.v, z));
                return new iuV(w);
            default:
                W w2 = new W(4);
                u uVar2 = ((Z) this).f656R;
                if (uVar2 != null) {
                    w2.R(uVar2);
                }
                X x2 = ((Z) this).f655R;
                if (x2 != null) {
                    w2.R(x2);
                }
                O o2 = ((Z) this).R;
                if (o2 != null) {
                    w2.R(o2.z());
                }
                int i2 = this.e;
                if (i2 == 0) {
                    z = true;
                }
                w2.R(new oU(i2, 2, this.v, z));
                return new fSU(w2);
        }
    }

    @Override // defpackage.O
    public final O u() {
        switch (this.X) {
            case 0:
                return this;
            default:
                return new k2F(((Z) this).f656R, ((Z) this).f655R, ((Z) this).R, this.e, this.v);
        }
    }

    @Override // defpackage.O
    public final O z() {
        return this;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public k2F(u uVar, X x, O o, int i, O o2) {
        super(uVar, x, o, i, o2);
        this.X = 0;
    }

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2F(q qVar, int i) {
        super(qVar);
        this.X = i;
    }
}
