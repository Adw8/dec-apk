package defpackage;

import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairFragment;

/* renamed from: xA  reason: default package */
/* loaded from: classes.dex */
public final class xA implements h2V {
    public final /* synthetic */ AdbPairFragment R;
    public final /* synthetic */ int e;

    public /* synthetic */ xA(AdbPairFragment adbPairFragment, int i) {
        this.e = i;
        this.R = adbPairFragment;
    }

    @Override // defpackage.h2V
    public final /* bridge */ /* synthetic */ Object R(Object obj, aOO aoo) {
        switch (this.e) {
            case 0:
                o8s o8s = (o8s) obj;
                return v(aoo);
            default:
                o8s o8s2 = (o8s) obj;
                return v(aoo);
        }
    }

    public final Object v(aOO aoo) {
        switch (this.e) {
            case 0:
                AdbPairFragment adbPairFragment = this.R;
                int i = AdbPairFragment.U;
                if (adbPairFragment.w().e()) {
                    this.R.b();
                } else {
                    this.R.q();
                }
                return o8s.R;
            default:
                AdbPairFragment adbPairFragment2 = this.R;
                int i2 = AdbPairFragment.U;
                adbPairFragment2.b();
                return o8s.R;
        }
    }
}
