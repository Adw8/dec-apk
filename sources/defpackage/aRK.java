package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: aRK  reason: default package */
/* loaded from: classes.dex */
public final class aRK extends aFk implements iv7 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f875R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f876R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f877R;
    public int X;
    public final /* synthetic */ f_c v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public aRK(aOO aoo, f_c f_c, f_c f_c2, kg9 kg9, iv7 iv7) {
        super(2, aoo);
        this.R = f_c;
        this.f877R = kg9;
        this.v = f_c2;
        this.f875R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((aRK) X((ck3) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0005 */
    /* JADX DEBUG: Multi-variable search result rejected for r9v0, resolved type: aRK */
    /* JADX DEBUG: Multi-variable search result rejected for r9v1, resolved type: aRK */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, o8s] */
    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                ck3 ck3 = (ck3) this.f876R;
                mTz mtz = new mTz(null, this.v, this.R, this.f877R, this.f875R);
                this.X = 1;
                if (((iTB) ck3).g(mtz, this) == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this = o8s.R;
            return this;
        } catch (CancellationException e) {
            this.R.g();
            throw e;
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        aRK ark = new aRK(aoo, this.R, this.v, this.f877R, this.f875R);
        ark.f876R = obj;
        return ark;
    }
}
