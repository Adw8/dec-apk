package defpackage;

/* renamed from: iDm  reason: default package */
/* loaded from: classes.dex */
public final class iDm extends plU {
    public final /* synthetic */ f1X R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4489R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iDm(f1X f1x, aOO aoo) {
        super(aoo);
        this.R = f1x;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4489R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.v(null, this);
    }
}
