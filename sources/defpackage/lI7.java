package defpackage;

/* renamed from: lI7  reason: default package */
/* loaded from: classes.dex */
public final class lI7 extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lAs f5645R;

    /* renamed from: R  reason: collision with other field name */
    public o7V f5646R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lI7(lAs las, aOO aoo) {
        super(aoo);
        this.f5645R = las;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f5645R.O(0, null, this);
    }
}
