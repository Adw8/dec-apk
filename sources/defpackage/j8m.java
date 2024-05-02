package defpackage;

/* renamed from: j8m  reason: default package */
/* loaded from: classes.dex */
public final class j8m extends plU {
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f4839R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public j8m(aOO aoo, nbD nbd, iv7 iv7, Object obj) {
        super(aoo, nbd);
        this.R = iv7;
        this.f4839R = obj;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        int i = this.e;
        if (i == 0) {
            this.e = 1;
            jjU.o(obj);
            iv7 iv7 = this.R;
            gvP.L(2, iv7);
            return iv7.J(this.f4839R, this);
        } else if (i == 1) {
            this.e = 2;
            jjU.o(obj);
            return obj;
        } else {
            throw new IllegalStateException("This coroutine had already completed".toString());
        }
    }
}
