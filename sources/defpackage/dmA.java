package defpackage;

/* renamed from: dmA  reason: default package */
/* loaded from: classes.dex */
public final class dmA extends plU {
    public jR2 R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2860R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f2861R;
    public int e;
    public final /* synthetic */ jR2 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dmA(jR2 jr2, aOO aoo) {
        super(aoo);
        this.v = jr2;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f2860R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.v(this);
    }
}
