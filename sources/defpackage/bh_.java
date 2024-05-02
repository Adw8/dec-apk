package defpackage;

/* renamed from: bh_  reason: default package */
/* loaded from: classes.dex */
public final class bh_ extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public oo3 f1771R;
    public int e;
    public final /* synthetic */ oo3 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bh_(oo3 oo3, aOO aoo) {
        super(aoo);
        this.v = oo3;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return oo3.R(this.v, this);
    }
}
