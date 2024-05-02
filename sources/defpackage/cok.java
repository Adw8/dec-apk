package defpackage;

/* renamed from: cok  reason: default package */
/* loaded from: classes.dex */
public final class cok extends plU {
    public final /* synthetic */ cyZ R;

    /* renamed from: R  reason: collision with other field name */
    public eLb f2209R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2210R;
    public int e;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cok(cyZ cyz, aOO aoo) {
        super(aoo);
        this.R = cyz;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f2210R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.R.R(null, 0.0f, this);
    }
}
