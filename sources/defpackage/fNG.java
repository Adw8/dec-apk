package defpackage;

import dev.kdrag0n.app.ui.drm.LicenseInvalidActivity;
import dev.kdrag0n.virtcontainer.ui.drm.paywall.PaywallActivity;

/* renamed from: fNG  reason: default package */
/* loaded from: classes.dex */
public abstract class fNG extends Zh implements iLf {
    public boolean O;
    public volatile in R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f3401R;
    public final /* synthetic */ int X;

    public fNG(int i) {
        this.X = i;
        if (i != 1) {
            this.f3401R = new Object();
            this.O = false;
            J();
            return;
        }
        this.f3401R = new Object();
        this.O = false;
        J();
    }

    public final void J() {
        switch (this.X) {
            case 0:
                C(new hL(this, 1));
                return;
            default:
                C(new hL(this, 2));
                return;
        }
    }

    @Override // androidx.activity.d, defpackage.jIY
    public final hv5 L() {
        switch (this.X) {
            case 0:
                return vd.g(this, super.L());
            default:
                return vd.g(this, super.L());
        }
    }

    @Override // defpackage.iLf
    public final Object R() {
        switch (this.X) {
            case 0:
                return Y().R();
            default:
                return Y().R();
        }
    }

    public final in Y() {
        in inVar;
        in inVar2;
        switch (this.X) {
            case 0:
                if (this.R == null) {
                    synchronized (this.f3401R) {
                        if (this.R == null) {
                            switch (this.X) {
                                case 0:
                                    inVar2 = new in(this);
                                    break;
                                default:
                                    inVar2 = new in(this);
                                    break;
                            }
                            this.R = inVar2;
                        }
                    }
                }
                return this.R;
            default:
                if (this.R == null) {
                    synchronized (this.f3401R) {
                        if (this.R == null) {
                            switch (this.X) {
                                case 0:
                                    inVar = new in(this);
                                    break;
                                default:
                                    inVar = new in(this);
                                    break;
                            }
                            this.R = inVar;
                        }
                    }
                }
                return this.R;
        }
    }

    public final void h() {
        switch (this.X) {
            case 0:
                if (!this.O) {
                    this.O = true;
                    LicenseInvalidActivity licenseInvalidActivity = (LicenseInvalidActivity) this;
                    ktS kts = (ktS) ((dHp) R());
                    ((Zh) licenseInvalidActivity).f670R = (oSF) kts.f5456R.Y.get();
                    ((Zh) licenseInvalidActivity).R = (m5f) kts.f5456R.N.get();
                    licenseInvalidActivity.R = (F4) kts.f5456R.f3397R.get();
                    return;
                }
                return;
            default:
                if (!this.O) {
                    this.O = true;
                    PaywallActivity paywallActivity = (PaywallActivity) this;
                    ktS kts2 = (ktS) ((gfw) R());
                    ((Zh) paywallActivity).f670R = (oSF) kts2.f5456R.Y.get();
                    ((Zh) paywallActivity).R = (m5f) kts2.f5456R.N.get();
                    return;
                }
                return;
        }
    }
}
