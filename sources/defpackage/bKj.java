package defpackage;

/* renamed from: bKj  reason: default package */
/* loaded from: classes.dex */
public final class bKj extends k8G implements iv7 {
    public final /* synthetic */ int L;
    public final /* synthetic */ int O;
    public final /* synthetic */ iv7 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nhg f1589R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f1590R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bKj(iv7 iv7, nhg nhg, int i, boolean z, int i2, int i3) {
        super(2);
        this.R = iv7;
        this.f1589R = nhg;
        this.X = i;
        this.f1590R = z;
        this.O = i2;
        this.L = i3;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        iqx.c(this.R, this.f1589R, this.X, this.f1590R, (m88) obj, this.O | 1, this.L);
        return o8s.R;
    }
}
