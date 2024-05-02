package defpackage;

/* renamed from: ieR  reason: default package */
/* loaded from: classes.dex */
public final class ieR extends plU {
    public dig R;

    /* renamed from: R  reason: collision with other field name */
    public Object f4681R;
    public int e;
    public final /* synthetic */ dig v;

    /* renamed from: v  reason: collision with other field name */
    public /* synthetic */ Object f4682v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ieR(dig dig, aOO aoo) {
        super(aoo);
        this.v = dig;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4682v = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.R(null, this);
    }
}
