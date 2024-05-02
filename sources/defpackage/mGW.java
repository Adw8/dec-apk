package defpackage;

/* renamed from: mGW  reason: default package */
/* loaded from: classes.dex */
public final class mGW extends k8G implements iv7 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ bBk f5993R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ idZ f5994R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f5995R;
    public final /* synthetic */ int X;
    public final /* synthetic */ float v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mGW(idZ idz, String str, float f, float f2, bBk bbk, int i) {
        super(2);
        this.f5994R = idz;
        this.f5995R = str;
        this.R = f;
        this.v = f2;
        this.f5993R = bbk;
        this.X = i;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.f5994R.X(this.f5995R, this.R, this.v, this.f5993R, (m88) obj, this.X | 1);
        return o8s.R;
    }
}
