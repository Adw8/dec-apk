package defpackage;

import java.util.concurrent.ExecutorService;

/* renamed from: iRS  reason: default package */
/* loaded from: classes.dex */
public final class iRS extends aFk implements iv7 {
    public final /* synthetic */ htf R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ExecutorService f4593R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iRS(htf htf, ExecutorService executorService, aOO aoo) {
        super(2, aoo);
        this.R = htf;
        this.f4593R = executorService;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iRS) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:23:0x0005 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: iRS */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: iRS */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.concurrent.ExecutorService] */
    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                htf htf = this.R;
                this.X = 1;
                obj = htf.k(this);
                if (obj == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                this = this.f4593R;
                this.shutdownNow();
            } catch (Exception unused) {
            }
            return obj;
        } catch (Throwable th) {
            try {
                this.f4593R.shutdownNow();
            } catch (Exception unused2) {
            }
            throw th;
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new iRS(this.R, this.f4593R, aoo);
    }
}
