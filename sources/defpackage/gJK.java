package defpackage;

/* renamed from: gJK  reason: default package */
/* loaded from: classes.dex */
public final class gJK extends plU {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public l3X f3728R;
    public int e;
    public final /* synthetic */ l3X v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gJK(l3X l3x, aOO aoo) {
        super(aoo);
        this.v = l3x;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.v(this);
    }
}
