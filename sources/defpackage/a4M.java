package defpackage;

/* renamed from: a4M  reason: default package */
/* loaded from: classes.dex */
public final class a4M extends aFk implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWQ f725R;
    public int X;
    public final /* synthetic */ nbD v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public a4M(nbD nbd, nWQ nwq, aOO aoo) {
        super(2, aoo);
        this.v = nbd;
        this.f725R = nwq;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((a4M) X((chP) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i == 0) {
            jjU.o(obj);
            chP chp = (chP) this.R;
            if (n3x.v(this.v, aIH.R)) {
                nWQ nwq = this.f725R;
                iV2 iv2 = new iV2(chp, 0);
                this.X = 1;
                if (nwq.v(iv2, this) == bgr) {
                    return bgr;
                }
            } else {
                nbD nbd = this.v;
                bOz boz = new bOz(this.f725R, chp, null);
                this.X = 2;
                if (l6.a(nbd, boz, this) == bgr) {
                    return bgr;
                }
            }
        } else if (i == 1 || i == 2) {
            jjU.o(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return o8s.R;
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        a4M a4m = new a4M(this.v, this.f725R, aoo);
        a4m.R = obj;
        return a4m;
    }
}
