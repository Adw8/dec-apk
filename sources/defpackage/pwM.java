package defpackage;

/* renamed from: pwM  reason: default package */
/* loaded from: classes.dex */
public final class pwM extends plU {
    public eAU R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f7323R;
    public int e;
    public final /* synthetic */ eAU v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pwM(eAU eau, aOO aoo) {
        super(aoo);
        this.v = eau;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f7323R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.R(null, this);
    }
}
