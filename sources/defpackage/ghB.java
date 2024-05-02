package defpackage;

import dev.kdrag0n.virt.vm.ForwardedPort;

/* renamed from: ghB  reason: default package */
/* loaded from: classes.dex */
public final class ghB extends plU {
    public ForwardedPort R;

    /* renamed from: R  reason: collision with other field name */
    public gkP f3872R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3873R;
    public int e;
    public final /* synthetic */ gkP v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ghB(gkP gkp, aOO aoo) {
        super(aoo);
        this.v = gkp;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f3873R = obj;
        this.e |= Integer.MIN_VALUE;
        return this.v.c(null, this);
    }
}
