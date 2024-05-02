package defpackage;

/* renamed from: iOB  reason: default package */
/* loaded from: classes.dex */
public final class iOB extends plU {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public gyU f4552R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4553R;
    public int e;
    public final /* synthetic */ gyU v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iOB(gyU gyu, aOO aoo) {
        super(aoo);
        this.v = gyu;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4553R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.x(0, this);
    }
}
