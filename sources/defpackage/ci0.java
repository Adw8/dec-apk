package defpackage;

import java.util.List;

/* renamed from: ci0  reason: default package */
/* loaded from: classes.dex */
public final class ci0 extends plU {
    public f1X R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2179R;

    /* renamed from: R  reason: collision with other field name */
    public List f2180R;

    /* renamed from: R  reason: collision with other field name */
    public mwl f2181R;
    public int e;
    public final /* synthetic */ f1X v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ci0(f1X f1x, aOO aoo) {
        super(aoo);
        this.v = f1x;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f2179R = obj;
        this.e |= Integer.MIN_VALUE;
        Object R = this.v.R(this);
        return R == bGR.COROUTINE_SUSPENDED ? R : new mwl(R);
    }
}
