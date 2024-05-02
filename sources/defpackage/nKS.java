package defpackage;

/* renamed from: nKS  reason: default package */
/* loaded from: classes.dex */
public final class nKS extends k8G implements kg9 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p6 f6362R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public nKS(float f, p6 p6Var, int i) {
        super(1);
        this.R = f;
        this.f6362R = p6Var;
        this.X = i;
    }

    @Override // defpackage.kg9
    public final Object x(Object obj) {
        j07 j07 = new j07(((Number) caw.U(Float.valueOf(this.R), this.f6362R)).floatValue(), this.f6362R, this.X);
        b_t b_t = onS.v;
        icv icv = onS.f6950R[1];
        b_t.R((bNL) obj, j07);
        return o8s.R;
    }
}
