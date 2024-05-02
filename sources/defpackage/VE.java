package defpackage;

/* renamed from: VE  reason: default package */
/* loaded from: classes.dex */
public final class VE extends plU {
    public final /* synthetic */ Br R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f573R;
    public aOO c;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public VE(Br br, aOO aoo) {
        super(aoo);
        this.R = br;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f573R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.c(this);
    }
}
