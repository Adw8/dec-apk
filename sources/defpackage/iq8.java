package defpackage;

/* renamed from: iq8  reason: default package */
/* loaded from: classes.dex */
public final class iq8 extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iUy f4741R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f4742R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f4743R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f4744R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 c;
    public final /* synthetic */ iv7 e;
    public final /* synthetic */ long v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ iv7 f4745v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iq8(ncu ncu, iv7 iv7, iv7 iv72, iv7 iv73, iv7 iv74, int i, long j, long j2, iUy iuy, lR3 lr3, int i2, int i3) {
        super(2);
        this.f4744R = ncu;
        this.f4742R = iv7;
        this.f4745v = iv72;
        this.c = iv73;
        this.e = iv74;
        this.X = i;
        this.R = j;
        this.v = j2;
        this.f4741R = iuy;
        this.f4743R = lr3;
        this.O = i2;
        this.L = i3;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fky.R(this.f4744R, this.f4742R, this.f4745v, this.c, this.e, this.X, this.R, this.v, this.f4741R, this.f4743R, (m88) obj, this.O | 1, this.L);
        return o8s.R;
    }
}
