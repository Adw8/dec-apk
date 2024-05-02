package defpackage;

/* renamed from: eWa  reason: default package */
/* loaded from: classes.dex */
public final class eWa extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lAs f3130R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public eWa(lAs las, aOO aoo) {
        super(aoo);
        this.f3130R = las;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.f3130R.L(0, null, this);
    }
}
