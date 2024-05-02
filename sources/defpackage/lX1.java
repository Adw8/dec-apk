package defpackage;

import java.util.ArrayList;

/* renamed from: lX1  reason: default package */
/* loaded from: classes.dex */
public final class lX1 extends nJ {
    public final /* synthetic */ int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lX1(int i, kg9 kg9) {
        super(kg9);
        this.e = i;
    }

    @Override // defpackage.DW
    public final boolean C() {
        switch (this.e) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.DW
    public final boolean H() {
        switch (this.e) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.nJ
    public final boolean V() {
        return true;
    }

    @Override // defpackage.nJ
    public final void Y(Object obj, i5 i5Var) {
        switch (this.e) {
            case 0:
                cPP cpp = null;
                if (obj != null) {
                    if (!(obj instanceof ArrayList)) {
                        ivC ivc = (ivC) obj;
                        if (ivc instanceof Ec) {
                            kg9 kg9 = ((DW) this).f76R;
                            if (kg9 != null) {
                                cpp = l6.P(kg9, ((Ec) ivc).R, null);
                            }
                        } else {
                            ivc.I(i5Var);
                        }
                    } else {
                        ArrayList arrayList = (ArrayList) obj;
                        cPP cpp2 = null;
                        for (int size = arrayList.size() - 1; -1 < size; size--) {
                            ivC ivc2 = (ivC) arrayList.get(size);
                            if (ivc2 instanceof Ec) {
                                kg9 kg92 = ((DW) this).f76R;
                                cpp2 = kg92 != null ? l6.P(kg92, ((Ec) ivc2).R, cpp2) : null;
                            } else {
                                ivc2.I(i5Var);
                            }
                        }
                        cpp = cpp2;
                    }
                }
                if (cpp != null) {
                    throw cpp;
                }
                return;
            default:
                super.Y(obj, i5Var);
                return;
        }
    }

    @Override // defpackage.DW
    public final Object j(Object obj) {
        obE obe;
        switch (this.e) {
            case 0:
                break;
            default:
                return super.j(obj);
        }
        do {
            Object j = super.j(obj);
            lmI lmi = l6.v;
            if (j == lmi) {
                return lmi;
            }
            if (j == l6.c) {
                abW abw = ((DW) this).f75R;
                Ec ec = new Ec(obj);
                while (true) {
                    oLj j2 = abw.j();
                    if (j2 instanceof obE) {
                        obe = (obE) j2;
                    } else if (j2.H(ec, abw)) {
                        obe = null;
                    }
                }
                if (obe == null) {
                    return l6.v;
                }
            } else if (j instanceof i5) {
                return j;
            } else {
                throw new IllegalStateException(("Invalid offerInternal result " + j).toString());
            }
        } while (!(obe instanceof i5));
        return obe;
    }

    @Override // defpackage.nJ
    public final boolean o() {
        return true;
    }
}
