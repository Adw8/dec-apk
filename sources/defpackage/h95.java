package defpackage;

import dev.kdrag0n.virt.vm.ForwardedPort;

/* renamed from: h95  reason: default package */
/* loaded from: classes.dex */
public final class h95 extends plU {
    public ForwardedPort R;

    /* renamed from: R  reason: collision with other field name */
    public gkP f4093R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4094R;
    public int e;
    public final /* synthetic */ gkP v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public h95(gkP gkp, aOO aoo) {
        super(aoo);
        this.v = gkp;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f4094R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.v(null, this);
    }
}
