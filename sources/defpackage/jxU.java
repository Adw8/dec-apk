package defpackage;

import android.text.TextUtils;

/* renamed from: jxU  reason: default package */
/* loaded from: classes.dex */
public final class jxU extends aFk implements iv7 {
    public final /* synthetic */ dNt R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5165R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jxU(dNt dnt, aOO aoo) {
        super(2, aoo);
        this.R = dnt;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((jxU) X((cG) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            cG cGVar = (cG) this.f5165R;
            dNt dnt = this.R;
            this.X = 1;
            c3E c3e = new c3E(null);
            ab abVar = new ab(c3e);
            cGVar.getClass();
            String str = dnt.R;
            if (!cGVar.R()) {
                L2 l2 = lPe.L;
                m3m m3m = aOn.R;
                abVar.v(l2, mzR.R);
            } else if (TextUtils.isEmpty(str)) {
                fgm.O("BillingClient", "Please provide a valid product type.");
                L2 l22 = lPe.e;
                m3m m3m2 = aOn.R;
                abVar.v(l22, mzR.R);
            } else if (cGVar.c(new e1R(cGVar, str, abVar, 0), new ggY(0, abVar), cGVar.v()) == null) {
                L2 l23 = (cGVar.R == 0 || cGVar.R == 3) ? lPe.L : lPe.X;
                m3m m3m3 = aOn.R;
                abVar.v(l23, mzR.R);
            }
            obj = c3e.V(this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-59429489333132L));
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        jxU jxu = new jxU(this.R, aoo);
        jxu.f5165R = obj;
        return jxu;
    }
}
