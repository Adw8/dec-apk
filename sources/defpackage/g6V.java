package defpackage;

/* renamed from: g6V  reason: default package */
/* loaded from: classes.dex */
public final class g6V extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lh8 f3676R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public g6V(lh8 lh8, aOO aoo) {
        super(aoo);
        this.f3676R = lh8;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f3676R.c(0, this);
    }
}
