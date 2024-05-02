package defpackage;

/* renamed from: b1K  reason: default package */
/* loaded from: classes.dex */
public final class b1K extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lh8 f1509R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public b1K(lh8 lh8, aOO aoo) {
        super(aoo);
        this.f1509R = lh8;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f1509R.R(0, 0, this);
    }
}
