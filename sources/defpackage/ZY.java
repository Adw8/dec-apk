package defpackage;

import dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService;

/* renamed from: ZY  reason: default package */
/* loaded from: classes.dex */
public final class ZY extends plU {
    public AdbPairingService R;

    /* renamed from: R  reason: collision with other field name */
    public Object f665R;
    public int e;
    public final /* synthetic */ AdbPairingService v;

    /* renamed from: v  reason: collision with other field name */
    public /* synthetic */ Object f666v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public ZY(AdbPairingService adbPairingService, aOO aoo) {
        super(aoo);
        this.v = adbPairingService;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f666v = obj;
        this.e |= Integer.MIN_VALUE;
        Object L = AdbPairingService.L(this.v, this);
        return L == bGR.COROUTINE_SUSPENDED ? L : new mwl(L);
    }
}
