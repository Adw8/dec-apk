package defpackage;

/* renamed from: mH7  reason: default package */
/* loaded from: classes.dex */
public final class mH7 extends plU {
    public final /* synthetic */ aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6000R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mH7(aME ame, aOO aoo) {
        super(aoo);
        this.R = ame;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f6000R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.c(null, this);
    }
}
