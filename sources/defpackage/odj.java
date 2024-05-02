package defpackage;

import java.util.List;

/* renamed from: odj  reason: default package */
/* loaded from: classes.dex */
public final class odj extends k8G implements iv7 {
    public final /* synthetic */ float L;
    public final /* synthetic */ float O;

    /* renamed from: O  reason: collision with other field name */
    public final /* synthetic */ int f6860O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f6861R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f6862R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ List f6863R;
    public final /* synthetic */ float X;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f6864X;
    public final /* synthetic */ float c;
    public final /* synthetic */ float e;
    public final /* synthetic */ float v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public odj(String str, float f, float f2, float f3, float f4, float f5, float f6, float f7, List list, iv7 iv7, int i, int i2) {
        super(2);
        this.f6862R = str;
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.X = f5;
        this.O = f6;
        this.L = f7;
        this.f6863R = list;
        this.f6861R = iv7;
        this.f6864X = i;
        this.f6860O = i2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ooA.v(this.f6862R, this.R, this.v, this.c, this.e, this.X, this.O, this.L, this.f6863R, this.f6861R, (m88) obj, this.f6864X | 1, this.f6860O);
        return o8s.R;
    }
}
