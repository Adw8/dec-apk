package defpackage;

/* renamed from: h8g  reason: default package */
/* loaded from: classes.dex */
public final class h8g extends plU {
    public egg R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4089R;

    /* renamed from: R  reason: collision with other field name */
    public zM f4090R;
    public int e;
    public final /* synthetic */ egg v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h8g(egg egg, aOO aoo) {
        super(aoo);
        this.v = egg;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4089R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.R(this);
    }
}
