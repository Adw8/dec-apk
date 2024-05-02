package defpackage;

import dev.kdrag0n.virt.vm.ForwardedPort;
import java.util.Iterator;

/* renamed from: be1  reason: default package */
/* loaded from: classes.dex */
public final class be1 extends aFk implements kg9 {
    public gkP R;

    /* renamed from: R  reason: collision with other field name */
    public Iterator f1760R;
    public int X;
    public final /* synthetic */ gkP v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public be1(gkP gkp, aOO aoo) {
        super(1, aoo);
        this.v = gkp;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        gkP gkp;
        Iterator it;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            gkp = this.v;
            it = ((Iterable) this.v.f3917R.getValue()).iterator();
        } else if (i == 1) {
            it = this.f1760R;
            gkp = this.R;
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        while (it.hasNext()) {
            this.R = gkp;
            this.f1760R = it;
            this.X = 1;
            if (gkp.c((ForwardedPort) it.next(), this) == bgr) {
                return bgr;
            }
        }
        return o8s.R;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        return new be1(this.v, (aOO) obj).O(o8s.R);
    }
}
