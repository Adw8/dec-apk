package defpackage;

import dev.kdrag0n.app.adb.MdnsCallback;

/* renamed from: jiM  reason: default package */
/* loaded from: classes.dex */
public final class jiM implements MdnsCallback {
    public final /* synthetic */ bf5 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ k6z f5008R;

    public jiM(bf5 bf5, k6z k6z) {
        this.R = bf5;
        this.f5008R = k6z;
    }

    @Override // dev.kdrag0n.app.adb.MdnsCallback
    public final void onPortDiscovered(int i, int i2) {
        pby[] pbyArr = kxm.R;
        if (bf5.R(this.R, i)) {
            k6z k6z = this.f5008R;
            l6.z(k6z, null, 0, new i1Z(k6z, i2, null), 3);
        }
    }

    @Override // dev.kdrag0n.app.adb.MdnsCallback
    public final void onServiceLost(int i) {
        pby[] pbyArr = kxm.R;
        if (bf5.R(this.R, i)) {
            k6z k6z = this.f5008R;
            l6.z(k6z, null, 0, new abg(k6z, null), 3);
        }
    }
}
