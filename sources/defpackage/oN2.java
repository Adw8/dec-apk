package defpackage;

/* renamed from: oN2  reason: default package */
/* loaded from: classes.dex */
public final class oN2 extends aFk implements iv7 {
    public f21 R;

    /* renamed from: R  reason: collision with other field name */
    public iv7 f6808R;
    public int X;
    public final /* synthetic */ f21 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ iv7 f6809v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public oN2(f21 f21, iv7 iv7, aOO aoo) {
        super(2, aoo);
        this.v = f21;
        this.f6809v = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((oN2) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        hgO hgo;
        iv7 iv7;
        f21 f21;
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                f21 f212 = this.v;
                iv7 = this.f6809v;
                this.R = f212;
                this.f6808R = iv7;
                this.X = 1;
                hgO hgo2 = (hgO) f212;
                Object R = hgo2.R(null, this);
                hgo = hgo2;
                if (R == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                iv7 = this.f6808R;
                f21 f213 = this.R;
                jjU.o(obj);
                hgo = f213;
            } else if (i == 2) {
                f21 = this.R;
                try {
                    jjU.o(obj);
                    ((hgO) f21).c(null);
                    return o8s.R;
                } catch (Throwable th) {
                    th = th;
                    ((hgO) f21).c(null);
                    throw th;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eln eln = new eln(iv7, null);
            this.R = hgo;
            this.f6808R = null;
            this.X = 2;
            if (jjU.L(eln, this) == bgr) {
                return bgr;
            }
            f21 = hgo;
            ((hgO) f21).c(null);
            return o8s.R;
        } catch (Throwable th2) {
            th = th2;
            f21 = hgo;
            ((hgO) f21).c(null);
            throw th;
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new oN2(this.v, this.f6809v, aoo);
    }
}
