package defpackage;

import java.util.ArrayList;
import java.util.concurrent.CancellationException;

/* renamed from: nJ  reason: default package */
/* loaded from: classes.dex */
public abstract class nJ extends DW implements gn {
    public nJ(kg9 kg9) {
        super(kg9);
    }

    public final Object I(int i, plU plu) {
        xx x = n3x.x(n3x.U(plu));
        P2 p2 = ((DW) this).f76R == null ? new P2(x, i) : new wm(x, i, ((DW) this).f76R);
        while (true) {
            if (i(p2)) {
                x.y(new fg(this, p2));
                break;
            }
            Object h = h();
            if (h instanceof i5) {
                p2.h((i5) h);
                break;
            } else if (h != l6.e) {
                x.h(p2.e == 1 ? new wC(h) : h, x.e, p2.Y(h));
            }
        }
        return x.P();
    }

    public void J(boolean z) {
        i5 O = O();
        if (O != null) {
            Object obj = null;
            while (true) {
                oLj j = O.j();
                if (j instanceof abW) {
                    Y(obj, O);
                    return;
                } else if (!j.V()) {
                    ((joD) j.N()).R.t();
                } else {
                    obj = n3x.g(obj, (ivC) j);
                }
            }
        } else {
            throw new IllegalStateException("Cannot happen".toString());
        }
    }

    public boolean K() {
        oLj P = ((DW) this).f75R.P();
        i5 i5Var = null;
        i5 i5Var2 = P instanceof i5 ? (i5) P : null;
        if (i5Var2 != null) {
            DW.Z(i5Var2);
            i5Var = i5Var2;
        }
        return i5Var != null && o();
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    @Override // defpackage.aZq
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(defpackage.aOO r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.K2
            if (r0 == 0) goto L_0x0013
            r0 = r5
            K2 r0 = (defpackage.K2) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            K2 r0 = new K2
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.jjU.o(r5)
            goto L_0x0051
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.jjU.o(r5)
            java.lang.Object r5 = r4.h()
            lmI r2 = defpackage.l6.e
            if (r5 == r2) goto L_0x0048
            boolean r4 = r5 instanceof defpackage.i5
            if (r4 == 0) goto L_0x0047
            i5 r5 = (defpackage.i5) r5
            java.lang.Throwable r4 = r5.R
            a4 r5 = new a4
            r5.<init>(r4)
        L_0x0047:
            return r5
        L_0x0048:
            r0.e = r3
            java.lang.Object r5 = r4.I(r3, r0)
            if (r5 != r1) goto L_0x0051
            return r1
        L_0x0051:
            wC r5 = (defpackage.wC) r5
            java.lang.Object r4 = r5.f7452R
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nJ.L(aOO):java.lang.Object");
    }

    @Override // defpackage.aZq
    public final Object P(aFk afk) {
        Object h = h();
        return (h == l6.e || (h instanceof i5)) ? I(0, afk) : h;
    }

    public abstract boolean V();

    public void Y(Object obj, i5 i5Var) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((ivC) obj).I(i5Var);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((ivC) arrayList.get(size)).I(i5Var);
        }
    }

    @Override // defpackage.aZq
    public final void c(CancellationException cancellationException) {
        if (!K()) {
            if (cancellationException == null) {
                cancellationException = new CancellationException(getClass().getSimpleName() + " was cancelled");
            }
            J(m(cancellationException));
        }
    }

    @Override // defpackage.aZq
    public final Object g() {
        Object h = h();
        return h == l6.e ? wC.R : h instanceof i5 ? new a4(((i5) h).R) : h;
    }

    public Object h() {
        while (true) {
            ivC t = t();
            if (t == null) {
                return l6.e;
            }
            if (t.u() != null) {
                t.Y();
                return t.h();
            }
            t.z();
        }
    }

    public boolean i(cLA cla) {
        int K;
        oLj j;
        if (V()) {
            abW abw = ((DW) this).f75R;
            do {
                j = abw.j();
                if (!(!(j instanceof ivC))) {
                    return false;
                }
            } while (!j.H(cla, abw));
        } else {
            oLj olj = ((DW) this).f75R;
            tg tgVar = new tg(cla, this, 0);
            do {
                oLj j2 = olj.j();
                if (!(!(j2 instanceof ivC))) {
                    return false;
                }
                K = j2.K(cla, olj, tgVar);
                if (K != 1) {
                }
            } while (K != 2);
            return false;
        }
        return true;
    }

    public abstract boolean o();

    @Override // defpackage.aZq
    public final zM x() {
        return new zM(this);
    }

    @Override // defpackage.DW
    public final obE y() {
        obE y = super.y();
        if (y != null) {
            boolean z = y instanceof i5;
        }
        return y;
    }
}
