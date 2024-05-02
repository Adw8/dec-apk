package defpackage;

import java.util.List;

/* renamed from: jsz  reason: default package */
/* loaded from: classes.dex */
public final class jsz extends k8G implements iv7 {
    public final /* synthetic */ float L;

    /* renamed from: L  reason: collision with other field name */
    public final /* synthetic */ int f5088L;
    public final /* synthetic */ float O;

    /* renamed from: O  reason: collision with other field name */
    public final /* synthetic */ int f5089O;
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ a1 f5090R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f5091R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ List f5092R;
    public final /* synthetic */ float X;

    /* renamed from: X  reason: collision with other field name */
    public final /* synthetic */ int f5093X;
    public final /* synthetic */ int Z;
    public final /* synthetic */ float c;
    public final /* synthetic */ float e;
    public final /* synthetic */ int m;
    public final /* synthetic */ float v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ a1 f5094v;
    public final /* synthetic */ int x;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jsz(List list, int i, String str, a1 a1Var, float f, a1 a1Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7, int i4, int i5, int i6) {
        super(2);
        this.f5092R = list;
        this.f5093X = i;
        this.f5091R = str;
        this.f5090R = a1Var;
        this.R = f;
        this.f5094v = a1Var2;
        this.v = f2;
        this.c = f3;
        this.f5089O = i2;
        this.f5088L = i3;
        this.e = f4;
        this.X = f5;
        this.O = f6;
        this.L = f7;
        this.Z = i4;
        this.m = i5;
        this.x = i6;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ooA.c(this.f5092R, this.f5093X, this.f5091R, this.f5090R, this.R, this.f5094v, this.v, this.c, this.f5089O, this.f5088L, this.e, this.X, this.O, this.L, (m88) obj, this.Z | 1, this.m, this.x);
        return o8s.R;
    }
}
