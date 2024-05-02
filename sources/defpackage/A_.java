package defpackage;

/* renamed from: A_  reason: default package */
/* loaded from: classes.dex */
public final class A_ extends plU {
    public final /* synthetic */ N0 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1R;

    /* renamed from: R  reason: collision with other field name */
    public pa3 f2R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public A_(N0 n0, aOO aoo) {
        super(aoo);
        this.R = n0;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f1R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.c(null, this);
    }
}
