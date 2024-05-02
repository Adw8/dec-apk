package defpackage;

/* renamed from: p17  reason: default package */
/* loaded from: classes.dex */
public final class p17 extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f7057R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kMk f7058R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public p17(long j, kMk kmk, iv7 iv7, int i, int i2) {
        super(2);
        this.R = j;
        this.f7058R = kmk;
        this.f7057R = iv7;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        c5p.v(this.R, this.f7058R, this.f7057R, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
