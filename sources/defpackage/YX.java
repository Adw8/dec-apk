package defpackage;

import java.util.ArrayList;

/* renamed from: YX  reason: default package */
/* loaded from: classes.dex */
public abstract class YX implements cjB {
    public final h9 R;

    /* renamed from: R  reason: collision with other field name */
    public final nbD f634R;
    public final int e;

    public YX(nbD nbd, int i, h9 h9Var) {
        this.f634R = nbd;
        this.e = i;
        this.R = h9Var;
    }

    public abstract YX L(nbD nbd, int i, h9 h9Var);

    public abstract Object O(k6z k6z, aOO aoo);

    @Override // defpackage.cjB
    public final nWQ X(nbD nbd, int i, h9 h9Var) {
        nbD M = nbd.M(this.f634R);
        if (h9Var == h9.SUSPEND) {
            i = this.e;
            if (i != -3) {
                if (i != -3) {
                    if (i != -2) {
                        if (i != -2 && (i = i + i) < 0) {
                            i = Integer.MAX_VALUE;
                        }
                    }
                }
            }
            h9Var = this.R;
        }
        return (n3x.v(M, this.f634R) && i == this.e && h9Var == this.R) ? this : L(M, i, h9Var);
    }

    public nWQ Z() {
        return null;
    }

    public hP3 m(jy_ jy_) {
        nbD nbd = this.f634R;
        int i = this.e;
        if (i == -3) {
            i = -2;
        }
        h9 h9Var = this.R;
        iv7 dg = new DG(this, null);
        hP3 hp3 = new hP3(l6.Q(jy_, nbd), jjU.R(i, h9Var, 4));
        hp3.mZ(3, hp3, dg);
        return hp3;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        if (this.f634R != aIH.R) {
            StringBuilder U = opT.U("context=");
            U.append(this.f634R);
            arrayList.add(U.toString());
        }
        if (this.e != -3) {
            StringBuilder U2 = opT.U("capacity=");
            U2.append(this.e);
            arrayList.add(U2.toString());
        }
        if (this.R != h9.SUSPEND) {
            StringBuilder U3 = opT.U("onBufferOverflow=");
            U3.append(this.R);
            arrayList.add(U3.toString());
        }
        return getClass().getSimpleName() + '[' + dF.X4(arrayList, ", ", null, null, null, 62) + ']';
    }

    @Override // defpackage.nWQ
    public Object v(h2V h2v, aOO aoo) {
        Object L = jjU.L(new Qz(null, h2v, this), aoo);
        return L == bGR.COROUTINE_SUSPENDED ? L : o8s.R;
    }
}
