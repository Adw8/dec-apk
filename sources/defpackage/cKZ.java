package defpackage;

/* renamed from: cKZ  reason: default package */
/* loaded from: classes.dex */
public final class cKZ extends k8G implements iv7 {
    public final /* synthetic */ int O;
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f2066R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f2067R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kun f2068R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ncu f2069R;
    public final /* synthetic */ int X;
    public final /* synthetic */ iv7 c;
    public final /* synthetic */ iv7 v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ String f2070v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cKZ(kun kun, String str, ncu ncu, String str2, iv7 iv7, iv7 iv72, iv7 iv73, f_c f_c, int i, int i2) {
        super(2);
        this.f2068R = kun;
        this.f2067R = str;
        this.f2069R = ncu;
        this.f2070v = str2;
        this.f2066R = iv7;
        this.v = iv72;
        this.c = iv73;
        this.R = f_c;
        this.X = i;
        this.O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        biy.v(this.f2068R, this.f2067R, this.f2069R, this.f2070v, this.f2066R, this.v, this.c, this.R, (m88) obj, this.X | 1, this.O);
        return o8s.R;
    }
}
