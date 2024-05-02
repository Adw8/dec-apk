package defpackage;

/* renamed from: jT_  reason: default package */
/* loaded from: classes.dex */
public final class jT_ extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kUC f4937R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jT_(kUC kuc, aOO aoo) {
        super(aoo);
        this.f4937R = kuc;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f4937R.R(0, null, this);
    }
}
