package defpackage;

/* renamed from: gjl  reason: default package */
/* loaded from: classes.dex */
public final class gjl extends plU {
    public h2V R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3913R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lIh f3914R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gjl(lIh lih, aOO aoo) {
        super(aoo);
        this.f3914R = lih;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f3913R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f3914R.v(null, this);
    }
}
