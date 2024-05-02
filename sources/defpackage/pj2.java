package defpackage;

import dev.kdrag0n.virtcontainer.ui.create.CreateViewModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: pj2  reason: default package */
/* loaded from: classes.dex */
public final class pj2 extends aFk implements iv7 {
    public final /* synthetic */ CreateViewModel R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pj2(CreateViewModel createViewModel, aOO aoo) {
        super(2, aoo);
        this.R = createViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((pj2) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            aME ame = this.R.R;
            this.X = 1;
            obj = ame.X(this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ArrayList arrayList = new ArrayList();
        for (b1n b1n : (Iterable) obj) {
            dM_ dm_ = (dM_) d7V.f2502R.get(b1n.R);
            if (dm_ != null) {
                arrayList.add(dm_);
            }
        }
        ivW ivw = this.R.f2746R;
        ArrayList arrayList2 = d7V.R;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!arrayList.contains((dM_) next)) {
                arrayList3.add(next);
            }
        }
        ivw.H(arrayList3);
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new pj2(this.R, aoo);
    }
}
