package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;

/* renamed from: fjb  reason: default package */
/* loaded from: classes.dex */
public final class fjb extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ VmNativeCallback R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fjb(VmNativeCallback vmNativeCallback, int i, aOO aoo) {
        super(2, aoo);
        this.R = vmNativeCallback;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fjb) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            iHI ihi = this.R.vmClient;
            int i2 = this.O;
            this.X = 1;
            ihi.getClass();
            obj = ihi.O(new dt7(i2, null), this);
            if (obj == bgr) {
                return bgr;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new fjb(this.R, this.O, aoo);
    }
}
