package defpackage;

/* renamed from: dlK  reason: default package */
/* loaded from: classes.dex */
public final class dlK extends fLN {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f2854R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dlK(Object obj, aOO aoo, iv7 iv7) {
        super(aoo);
        this.R = iv7;
        this.f2854R = obj;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        int i = this.e;
        if (i == 0) {
            this.e = 1;
            jjU.o(obj);
            iv7 iv7 = this.R;
            gvP.L(2, iv7);
            return iv7.J(this.f2854R, this);
        } else if (i == 1) {
            this.e = 2;
            jjU.o(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
