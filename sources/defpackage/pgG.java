package defpackage;

import java.util.ArrayList;

/* renamed from: pgG  reason: default package */
/* loaded from: classes.dex */
public final class pgG extends aFk implements iv7 {
    public final /* synthetic */ cre R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f7158R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pgG(cre cre, aOO aoo) {
        super(2, aoo);
        this.R = cre;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((pgG) X((cG) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            cG cGVar = (cG) this.f7158R;
            cre cre = this.R;
            this.X = 1;
            c3E c3e = new c3E(null);
            ab abVar = new ab(c3e);
            if (!cGVar.R()) {
                abVar.R(lPe.L, new ArrayList());
            } else if (!cGVar.f2045v) {
                fgm.O("BillingClient", "Querying product details is not supported.");
                abVar.R(lPe.m, new ArrayList());
            } else if (cGVar.c(new e1R(cGVar, cre, abVar, 1), new ggY(1, abVar), cGVar.v()) == null) {
                abVar.R((cGVar.R == 0 || cGVar.R == 3) ? lPe.L : lPe.X, new ArrayList());
            }
            obj = c3e.V(this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException(afN.R(-74242831537036L));
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        pgG pgg = new pgG(this.R, aoo);
        pgg.f7158R = obj;
        return pgg;
    }
}
