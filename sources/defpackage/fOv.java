package defpackage;

/* renamed from: fOv  reason: default package */
/* loaded from: classes.dex */
public final class fOv extends plU {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public gyU f3407R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3408R;
    public int e;
    public long v;

    /* renamed from: v  reason: collision with other field name */
    public final /* synthetic */ gyU f3409v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fOv(gyU gyu, aOO aoo) {
        super(aoo);
        this.f3409v = gyu;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f3408R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f3409v.m(0, 0, this);
    }
}
