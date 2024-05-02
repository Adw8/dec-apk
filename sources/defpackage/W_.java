package defpackage;

/* renamed from: W_  reason: default package */
/* loaded from: classes.dex */
public class W_ extends YX {
    public final Object R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W_(Object obj, nbD nbd, int i, h9 h9Var, int i2) {
        super(nbd, i, h9Var);
        this.X = i2;
        this.R = obj;
    }

    @Override // defpackage.YX
    public YX L(nbD nbd, int i, h9 h9Var) {
        switch (this.X) {
            case 0:
                return new W_((iv7) this.R, nbd, i, h9Var, 0);
            default:
                return new W_((Iterable) this.R, nbd, i, h9Var, 1);
        }
    }

    @Override // defpackage.YX
    public Object O(k6z k6z, aOO aoo) {
        switch (this.X) {
            case 0:
                Object J = ((iv7) this.R).J(k6z, aoo);
                return J == bGR.COROUTINE_SUSPENDED ? J : o8s.R;
            default:
                hsk hsk = new hsk(k6z);
                for (nWQ nwq : (Iterable) this.R) {
                    l6.z(k6z, null, 0, new lU(nwq, hsk, null), 3);
                }
                return o8s.R;
        }
    }

    @Override // defpackage.YX
    public final hP3 m(jy_ jy_) {
        switch (this.X) {
            case 1:
                nbD nbd = ((YX) this).f634R;
                int i = this.e;
                iv7 dg = new DG(this, null);
                hP3 hp3 = new hP3(l6.Q(jy_, nbd), jjU.R(i, h9.SUSPEND, 4));
                hp3.mZ(1, hp3, dg);
                return hp3;
            default:
                return super.m(jy_);
        }
    }

    @Override // defpackage.YX
    public final String toString() {
        switch (this.X) {
            case 0:
                StringBuilder U = opT.U("block[");
                U.append((iv7) this.R);
                U.append("] -> ");
                U.append(super.toString());
                return U.toString();
            default:
                return super.toString();
        }
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W_(Iterable iterable) {
        this(iterable, aIH.R, -2, h9.SUSPEND, 1);
        this.X = 1;
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ W_(gJB gjb) {
        this(gjb, aIH.R, -2, h9.SUSPEND, 0);
        this.X = 0;
    }
}
