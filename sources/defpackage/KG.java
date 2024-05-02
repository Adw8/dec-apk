package defpackage;

/* renamed from: KG  reason: default package */
/* loaded from: classes.dex */
public final class KG extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ fQ2 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iUy f239R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f240R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lPv f241R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f242R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f243R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public KG(iv7 iv7, ncu ncu, iv7 iv72, lR3 lr3, iUy iuy, fQ2 fq2, lPv lpv, int i, int i2) {
        super(2);
        this.f240R = iv7;
        this.f243R = ncu;
        this.v = iv72;
        this.f242R = lr3;
        this.f239R = iuy;
        this.R = fq2;
        this.f241R = lpv;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        c3.R(this.f240R, this.f243R, this.v, this.f242R, this.f239R, this.R, this.f241R, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
