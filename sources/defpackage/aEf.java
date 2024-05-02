package defpackage;

/* renamed from: aEf  reason: default package */
/* loaded from: classes.dex */
public final class aEf extends aFk implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ o_d R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aEf(o_d o_d, int i, aOO aoo) {
        super(2, aoo);
        this.R = o_d;
        this.O = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((aEf) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        Object obj2 = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            o_d o_d = this.R;
            int i2 = this.O;
            this.X = 1;
            Object Z = oey.Z(o_d.f6850R, i2, this);
            if (Z != obj2) {
                Z = o8s.R;
            }
            if (Z == obj2) {
                return obj2;
            }
        } else if (i == 1) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new aEf(this.R, this.O, aoo);
    }
}
