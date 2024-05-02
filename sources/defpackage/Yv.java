package defpackage;

import dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService;

/* renamed from: Yv  reason: default package */
/* loaded from: classes.dex */
public final class Yv extends plU {
    public AdbPairingService R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f648R;
    public int X;
    public int e;
    public final /* synthetic */ AdbPairingService v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Yv(AdbPairingService adbPairingService, aOO aoo) {
        super(aoo);
        this.v = adbPairingService;
    }

    @Override // defpackage.C2
    public final Object O(Object obj) {
        this.f648R = obj;
        this.X |= Integer.MIN_VALUE;
        return AdbPairingService.X(this.v, this);
    }
}
