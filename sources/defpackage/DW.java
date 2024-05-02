package defpackage;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: DW  reason: default package */
/* loaded from: classes.dex */
public abstract class DW implements nDS {
    public static final /* synthetic */ AtomicReferenceFieldUpdater R = AtomicReferenceFieldUpdater.newUpdater(DW.class, Object.class, "onCloseHandler");

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f76R;

    /* renamed from: R  reason: collision with other field name */
    public final abW f75R = new abW();
    private volatile /* synthetic */ Object onCloseHandler = null;

    public DW(kg9 kg9) {
        this.f76R = kg9;
    }

    public static final void R(DW dw, xx xxVar, Object obj, i5 i5Var) {
        cPP P;
        dw.getClass();
        Z(i5Var);
        Throwable th = i5Var.R;
        if (th == null) {
            th = new Z2();
        }
        kg9 kg9 = dw.f76R;
        if (kg9 == null || (P = l6.P(kg9, obj, null)) == null) {
            xxVar.Y(new bvw(th));
            return;
        }
        l6.U(P, th);
        xxVar.Y(new bvw(P));
    }

    public static void Z(i5 i5Var) {
        Object obj = null;
        while (true) {
            oLj j = i5Var.j();
            cLA cla = j instanceof cLA ? (cLA) j : null;
            if (cla == null) {
                break;
            } else if (!cla.V()) {
                ((joD) cla.N()).R.t();
            } else {
                obj = n3x.g(obj, cla);
            }
        }
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            ((cLA) obj).h(i5Var);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        for (int size = arrayList.size() - 1; -1 < size; size--) {
            ((cLA) arrayList.get(size)).h(i5Var);
        }
    }

    public abstract boolean C();

    public abstract boolean H();

    @Override // defpackage.nDS
    public final Object N(Object obj, aOO aoo) {
        if (j(obj) == l6.v) {
            return o8s.R;
        }
        xx x = n3x.x(n3x.U(aoo));
        while (true) {
            if (!(this.f75R.P() instanceof obE) && C()) {
                ko1 ko1 = this.f76R == null ? new ko1(obj, x) : new bNY(obj, x, this.f76R);
                Object v = v(ko1);
                if (v == null) {
                    x.y(new aYe(ko1));
                    break;
                } else if (v instanceof i5) {
                    R(this, x, obj, (i5) v);
                    break;
                } else if (v != l6.X && !(v instanceof cLA)) {
                    throw new IllegalStateException(("enqueueSend returned " + v).toString());
                }
            }
            Object j = j(obj);
            if (j == l6.v) {
                x.Y(o8s.R);
                break;
            } else if (j != l6.c) {
                if (j instanceof i5) {
                    R(this, x, obj, (i5) j);
                } else {
                    throw new IllegalStateException(("offerInternal returned " + j).toString());
                }
            }
        }
        Object P = x.P();
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        if (P != bgr) {
            P = o8s.R;
        }
        return P == bgr ? P : o8s.R;
    }

    public final i5 O() {
        oLj j = this.f75R.j();
        i5 i5Var = j instanceof i5 ? (i5) j : null;
        if (i5Var == null) {
            return null;
        }
        Z(i5Var);
        return i5Var;
    }

    @Override // defpackage.nDS
    public final boolean U() {
        return O() != null;
    }

    public String X() {
        return "";
    }

    @Override // defpackage.nDS
    public final Object e(Object obj) {
        a4 a4Var;
        Object j = j(obj);
        if (j == l6.v) {
            return o8s.R;
        }
        if (j == l6.c) {
            i5 O = O();
            if (O == null) {
                return wC.R;
            }
            Z(O);
            Throwable th = O.R;
            if (th == null) {
                th = new Z2();
            }
            a4Var = new a4(th);
        } else if (j instanceof i5) {
            i5 i5Var = (i5) j;
            Z(i5Var);
            Throwable th2 = i5Var.R;
            if (th2 == null) {
                th2 = new Z2();
            }
            a4Var = new a4(th2);
        } else {
            throw new IllegalStateException(("trySend returned " + j).toString());
        }
        return a4Var;
    }

    public Object j(Object obj) {
        obE y;
        do {
            y = y();
            if (y == null) {
                return l6.c;
            }
        } while (y.e(obj) == null);
        y.c(obj);
        return y.O();
    }

    @Override // defpackage.nDS
    public final boolean m(Throwable th) {
        boolean z;
        Object obj;
        lmI lmi;
        i5 i5Var = new i5(th);
        abW abw = this.f75R;
        while (true) {
            oLj j = abw.j();
            if (!(j instanceof i5)) {
                if (j.H(i5Var, abw)) {
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (!z) {
            i5Var = (i5) this.f75R.j();
        }
        Z(i5Var);
        if (z && (obj = this.onCloseHandler) != null && obj != (lmi = l6.O) && R.compareAndSet(this, obj, lmi)) {
            gvP.L(1, obj);
            ((kg9) obj).x(th);
        }
        return z;
    }

    public final ivC t() {
        oLj olj;
        oLj o;
        abW abw = this.f75R;
        while (true) {
            olj = (oLj) abw.N();
            olj = null;
            if (olj != abw && (olj instanceof ivC)) {
                if (((((ivC) olj) instanceof i5) && !olj.i()) || (o = olj.o()) == null) {
                    break;
                }
                o.t();
            }
        }
        return (ivC) olj;
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(aH9.G(this));
        sb.append('{');
        oLj P = this.f75R.P();
        if (P == this.f75R) {
            str = "EmptyQueue";
        } else {
            if (P instanceof i5) {
                str2 = P.toString();
            } else if (P instanceof cLA) {
                str2 = "ReceiveQueued";
            } else if (P instanceof ivC) {
                str2 = "SendQueued";
            } else {
                str2 = "UNEXPECTED:" + P;
            }
            oLj j = this.f75R.j();
            if (j != P) {
                StringBuilder t = jQ.t(str2, ",queueSize=");
                abW abw = this.f75R;
                int i = 0;
                for (oLj olj = (oLj) abw.N(); !n3x.v(olj, abw); olj = olj.P()) {
                    if (olj instanceof oLj) {
                        i++;
                    }
                }
                t.append(i);
                str = t.toString();
                if (j instanceof i5) {
                    str = str + ",closedForSend=" + j;
                }
            } else {
                str = str2;
            }
        }
        sb.append(str);
        sb.append('}');
        sb.append(X());
        return sb.toString();
    }

    public Object v(ko1 ko1) {
        oLj j;
        if (H()) {
            abW abw = this.f75R;
            do {
                j = abw.j();
                if (j instanceof obE) {
                    return j;
                }
            } while (!j.H(ko1, abw));
            return null;
        }
        oLj olj = this.f75R;
        boolean z = true;
        tg tgVar = new tg(ko1, this, 1);
        while (true) {
            oLj j2 = olj.j();
            if (!(j2 instanceof obE)) {
                int K = j2.K(ko1, olj, tgVar);
                if (K != 1) {
                    if (K == 2) {
                        z = false;
                        break;
                    }
                } else {
                    break;
                }
            } else {
                return j2;
            }
        }
        if (!z) {
            return l6.X;
        }
        return null;
    }

    public obE y() {
        oLj olj;
        oLj o;
        abW abw = this.f75R;
        while (true) {
            olj = (oLj) abw.N();
            olj = null;
            if (olj != abw && (olj instanceof obE)) {
                if (((((obE) olj) instanceof i5) && !olj.i()) || (o = olj.o()) == null) {
                    break;
                }
                o.t();
            }
        }
        return (obE) olj;
    }
}
