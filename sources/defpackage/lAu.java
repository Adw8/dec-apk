package defpackage;

/* renamed from: lAu  reason: default package */
/* loaded from: classes.dex */
public final class lAu extends aFk implements iv7 {
    public final /* synthetic */ aJj R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nJ6 f5608R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ oDO f5609R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lAu(aJj ajj, nJ6 nj6, oDO odo, aOO aoo) {
        super(2, aoo);
        this.R = ajj;
        this.f5608R = nj6;
        this.f5609R = odo;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((lAu) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX INFO: finally extract failed */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:17:0x0005 */
    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: lAu */
    /* JADX DEBUG: Multi-variable search result rejected for r3v1, resolved type: lAu */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, o8s] */
    @Override // defpackage.C2
    public final Object O(Object obj) {
        bGR bgr = bGR.COROUTINE_SUSPENDED;
        int i = this.X;
        try {
            if (i == 0) {
                jjU.o(obj);
                aJj ajj = this.R;
                this.X = 1;
                if (ajj.R(this) == bgr) {
                    return bgr;
                }
            } else if (i == 1) {
                jjU.o(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            this.f5608R.f6358R.remove(this.f5609R);
            this = o8s.R;
            return this;
        } catch (Throwable th) {
            this.f5608R.f6358R.remove(this.f5609R);
            throw th;
        }
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new lAu(this.R, this.f5608R, this.f5609R, aoo);
    }
}
