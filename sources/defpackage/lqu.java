package defpackage;

/* renamed from: lqu  reason: default package */
/* loaded from: classes.dex */
public final class lqu extends plU {
    public aJj R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5846R;
    public int e;
    public final /* synthetic */ aJj v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lqu(aJj ajj, aOO aoo) {
        super(aoo);
        this.v = ajj;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f5846R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.R(this);
    }
}
