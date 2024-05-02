package defpackage;

/* renamed from: jdC  reason: default package */
/* loaded from: classes.dex */
public final class jdC extends plU {
    public aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4987R;

    /* renamed from: R  reason: collision with other field name */
    public kg9 f4988R;

    /* renamed from: R  reason: collision with other field name */
    public String[] f4989R;
    public int e;
    public final /* synthetic */ aME v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public jdC(aME ame, aOO aoo) {
        super(aoo);
        this.v = ame;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4987R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.x(null, null, this);
    }
}
