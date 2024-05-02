package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.d;
import dev.kdrag0n.app.ui.onboarding.adb.dev.AdbDevOptionsFragment;
import dev.kdrag0n.virtcontainer.ui.onboarding.adb.pair.AdbPairFragment;
import dev.kdrag0n.virtcontainer.ui.onboarding.welcome.WelcomeFragment;

/* renamed from: bqi  reason: default package */
/* loaded from: classes.dex */
public abstract class bqi extends dl implements iLf {
    public final /* synthetic */ int H;
    public volatile DJ R;

    /* renamed from: R  reason: collision with other field name */
    public d f1823R;
    public boolean g;
    public final Object v;
    public boolean y;

    public bqi(int i) {
        this.H = i;
        if (i == 1) {
            this.v = new Object();
            this.y = false;
        } else if (i != 2) {
            this.v = new Object();
            this.y = false;
        } else {
            this.v = new Object();
            this.y = false;
        }
    }

    public final void D() {
        switch (this.H) {
            case 0:
                if (!this.y) {
                    this.y = true;
                    AdbDevOptionsFragment adbDevOptionsFragment = (AdbDevOptionsFragment) this;
                    ((Oj) R()).getClass();
                    return;
                }
                return;
            case 1:
                if (!this.y) {
                    this.y = true;
                    AdbPairFragment adbPairFragment = (AdbPairFragment) this;
                    mGN mgn = (mGN) ((Mi) R());
                    adbPairFragment.R = (F4) mgn.R.f3397R.get();
                    adbPairFragment.f2756R = (doT) mgn.R.c.get();
                    return;
                }
                return;
            default:
                if (!this.y) {
                    this.y = true;
                    WelcomeFragment welcomeFragment = (WelcomeFragment) this;
                    mGN mgn2 = (mGN) ((j9S) R());
                    oSF osf = (oSF) mgn2.R.Y.get();
                    welcomeFragment.f2765R = (oLT) mgn2.R.o.get();
                    welcomeFragment.R = (iKP) mgn2.R.K.get();
                    return;
                }
                return;
        }
    }

    public final void F() {
        switch (this.H) {
            case 0:
                if (this.f1823R == null) {
                    this.f1823R = new d(super.H(), this);
                    this.g = lTs.P(super.H());
                    return;
                }
                return;
            case 1:
                if (this.f1823R == null) {
                    this.f1823R = new d(super.H(), this);
                    this.g = lTs.P(super.H());
                    return;
                }
                return;
            default:
                if (this.f1823R == null) {
                    this.f1823R = new d(super.H(), this);
                    this.g = lTs.P(super.H());
                    return;
                }
                return;
        }
    }

    @Override // defpackage.pm2
    public final Context H() {
        switch (this.H) {
            case 0:
                if (super.H() == null && !this.g) {
                    return null;
                }
                F();
                return this.f1823R;
            case 1:
                if (super.H() == null && !this.g) {
                    return null;
                }
                F();
                return this.f1823R;
            default:
                if (super.H() == null && !this.g) {
                    return null;
                }
                F();
                return this.f1823R;
        }
    }

    @Override // defpackage.pm2, defpackage.jIY
    public final hv5 L() {
        switch (this.H) {
            case 0:
                return vd.o(this, super.L());
            case 1:
                return vd.o(this, super.L());
            default:
                return vd.o(this, super.L());
        }
    }

    @Override // defpackage.iLf
    public final Object R() {
        switch (this.H) {
            case 0:
                return f().R();
            case 1:
                return f().R();
            default:
                return f().R();
        }
    }

    @Override // defpackage.pm2
    public final void V(Activity activity) {
        boolean z = true;
        switch (this.H) {
            case 0:
                this.U = true;
                d dVar = this.f1823R;
                if (!(dVar == null || DJ.c(dVar) == activity)) {
                    z = false;
                }
                hDC.L(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                F();
                D();
                return;
            case 1:
                this.U = true;
                d dVar2 = this.f1823R;
                if (!(dVar2 == null || DJ.c(dVar2) == activity)) {
                    z = false;
                }
                hDC.L(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                F();
                D();
                return;
            default:
                this.U = true;
                d dVar3 = this.f1823R;
                if (!(dVar3 == null || DJ.c(dVar3) == activity)) {
                    z = false;
                }
                hDC.L(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                F();
                D();
                return;
        }
    }

    public final DJ a() {
        switch (this.H) {
            case 0:
                return new DJ(this);
            case 1:
                return new DJ(this);
            default:
                return new DJ(this);
        }
    }

    public final DJ f() {
        switch (this.H) {
            case 0:
                if (this.R == null) {
                    synchronized (this.v) {
                        if (this.R == null) {
                            this.R = a();
                        }
                    }
                }
                return this.R;
            case 1:
                if (this.R == null) {
                    synchronized (this.v) {
                        if (this.R == null) {
                            this.R = a();
                        }
                    }
                }
                return this.R;
            default:
                if (this.R == null) {
                    synchronized (this.v) {
                        if (this.R == null) {
                            this.R = a();
                        }
                    }
                }
                return this.R;
        }
    }

    @Override // defpackage.pm2
    public final void o(Context context) {
        switch (this.H) {
            case 0:
                super.o(context);
                F();
                D();
                return;
            case 1:
                super.o(context);
                F();
                D();
                return;
            default:
                super.o(context);
                F();
                D();
                return;
        }
    }

    @Override // defpackage.pm2
    public final LayoutInflater u(Bundle bundle) {
        switch (this.H) {
            case 0:
                LayoutInflater u = super.u(bundle);
                return u.cloneInContext(new d(u, this));
            case 1:
                LayoutInflater u2 = super.u(bundle);
                return u2.cloneInContext(new d(u2, this));
            default:
                LayoutInflater u3 = super.u(bundle);
                return u3.cloneInContext(new d(u3, this));
        }
    }
}
