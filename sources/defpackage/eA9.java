package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.d;
import dev.kdrag0n.app.ui.about.AboutFragment;
import dev.kdrag0n.app.ui.about.LicensesFragment;

/* renamed from: eA9  reason: default package */
/* loaded from: classes.dex */
public abstract class eA9 extends gE implements iLf {
    public final /* synthetic */ int H;
    public volatile DJ R;

    /* renamed from: R  reason: collision with other field name */
    public d f3002R;
    public boolean g;
    public final Object v;
    public boolean y;

    public eA9(int i) {
        this.H = i;
        if (i != 1) {
            this.v = new Object();
            this.y = false;
            return;
        }
        this.v = new Object();
        this.y = false;
    }

    public final void F() {
        switch (this.H) {
            case 0:
                if (!this.y) {
                    this.y = true;
                    mGN mgn = (mGN) ((VF) R());
                    kxx kxx = (kxx) mgn.R.h.get();
                    ((AboutFragment) this).R = (F4) mgn.R.f3397R.get();
                    return;
                }
                return;
            default:
                if (!this.y) {
                    this.y = true;
                    mGN mgn2 = (mGN) ((dle) R());
                    kxx kxx2 = (kxx) mgn2.R.h.get();
                    ((LicensesFragment) this).R = (g1p) mgn2.v.get();
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
                a();
                return this.f3002R;
            default:
                if (super.H() == null && !this.g) {
                    return null;
                }
                a();
                return this.f3002R;
        }
    }

    @Override // defpackage.pm2, defpackage.jIY
    public final hv5 L() {
        switch (this.H) {
            case 0:
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
                d dVar = this.f3002R;
                if (!(dVar == null || DJ.c(dVar) == activity)) {
                    z = false;
                }
                hDC.L(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                a();
                F();
                return;
            default:
                this.U = true;
                d dVar2 = this.f3002R;
                if (!(dVar2 == null || DJ.c(dVar2) == activity)) {
                    z = false;
                }
                hDC.L(z, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
                a();
                F();
                return;
        }
    }

    public final void a() {
        switch (this.H) {
            case 0:
                if (this.f3002R == null) {
                    this.f3002R = new d(super.H(), this);
                    this.g = lTs.P(super.H());
                    return;
                }
                return;
            default:
                if (this.f3002R == null) {
                    this.f3002R = new d(super.H(), this);
                    this.g = lTs.P(super.H());
                    return;
                }
                return;
        }
    }

    public final DJ f() {
        DJ dj;
        DJ dj2;
        switch (this.H) {
            case 0:
                if (this.R == null) {
                    synchronized (this.v) {
                        if (this.R == null) {
                            switch (this.H) {
                                case 0:
                                    dj2 = new DJ(this);
                                    break;
                                default:
                                    dj2 = new DJ(this);
                                    break;
                            }
                            this.R = dj2;
                        }
                    }
                }
                return this.R;
            default:
                if (this.R == null) {
                    synchronized (this.v) {
                        if (this.R == null) {
                            switch (this.H) {
                                case 0:
                                    dj = new DJ(this);
                                    break;
                                default:
                                    dj = new DJ(this);
                                    break;
                            }
                            this.R = dj;
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
                a();
                F();
                return;
            default:
                super.o(context);
                a();
                F();
                return;
        }
    }

    @Override // defpackage.pm2
    public final LayoutInflater u(Bundle bundle) {
        switch (this.H) {
            case 0:
                LayoutInflater u = super.u(bundle);
                return u.cloneInContext(new d(u, this));
            default:
                LayoutInflater u2 = super.u(bundle);
                return u2.cloneInContext(new d(u2, this));
        }
    }
}
