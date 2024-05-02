package defpackage;

import dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService;
import dev.kdrag0n.virtcontainer.service.VirtService;

/* renamed from: kak  reason: default package */
/* loaded from: classes.dex */
public abstract class kak extends gCv implements iLf {
    public final Object R;

    /* renamed from: R  reason: collision with other field name */
    public volatile mk6 f5364R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f5365R;
    public final /* synthetic */ int e;

    public kak(int i) {
        this.e = i;
        if (i != 1) {
            this.R = new Object();
            this.f5365R = false;
            return;
        }
        this.R = new Object();
        this.f5365R = false;
    }

    @Override // defpackage.iLf
    public final Object R() {
        switch (this.e) {
            case 0:
                return v().R();
            default:
                return v().R();
        }
    }

    public final void e() {
        switch (this.e) {
            case 0:
                if (!this.f5365R) {
                    this.f5365R = true;
                    AdbPairingService adbPairingService = (AdbPairingService) this;
                    gV1 gv1 = (gV1) ((dU) R());
                    adbPairingService.f2735R = (gh) gv1.f3768R.z.get();
                    adbPairingService.f2737R = (sk) gv1.v.get();
                    iKP ikp = (iKP) gv1.f3768R.K.get();
                    adbPairingService.f2738R = (yd) gv1.f3768R.u.get();
                    adbPairingService.R = new IO();
                    return;
                }
                return;
            default:
                if (!this.f5365R) {
                    this.f5365R = true;
                    VirtService virtService = (VirtService) this;
                    gV1 gv12 = (gV1) ((j4h) R());
                    virtService.f2744R = (nbF) gv12.c.get();
                    virtService.f2742R = (iKP) gv12.f3768R.K.get();
                    virtService.f2741R = (iHI) gv12.f3768R.A.get();
                    virtService.f2740R = (dkr) gv12.f3768R.p.get();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.gCv, android.app.Service
    public void onCreate() {
        switch (this.e) {
            case 0:
                e();
                super.onCreate();
                return;
            default:
                e();
                super.onCreate();
                return;
        }
    }

    public final mk6 v() {
        mk6 mk6;
        mk6 mk62;
        switch (this.e) {
            case 0:
                if (this.f5364R == null) {
                    synchronized (this.R) {
                        if (this.f5364R == null) {
                            switch (this.e) {
                                case 0:
                                    mk62 = new mk6(this);
                                    break;
                                default:
                                    mk62 = new mk6(this);
                                    break;
                            }
                            this.f5364R = mk62;
                        }
                    }
                }
                return this.f5364R;
            default:
                if (this.f5364R == null) {
                    synchronized (this.R) {
                        if (this.f5364R == null) {
                            switch (this.e) {
                                case 0:
                                    mk6 = new mk6(this);
                                    break;
                                default:
                                    mk6 = new mk6(this);
                                    break;
                            }
                            this.f5364R = mk6;
                        }
                    }
                }
                return this.f5364R;
        }
    }
}
