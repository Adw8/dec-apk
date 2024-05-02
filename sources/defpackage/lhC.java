package defpackage;

/* renamed from: lhC  reason: default package */
/* loaded from: classes.dex */
public final class lhC extends plU {
    public final /* synthetic */ bMl R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5805R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lhC(bMl bml, aOO aoo) {
        super(aoo);
        this.R = bml;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f5805R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.R(null, this);
    }
}
