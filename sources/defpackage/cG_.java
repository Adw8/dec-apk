package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import dagger.hilt.android.internal.managers.d;
import dev.kdrag0n.virtcontainer.ui.overview.OverviewFragment;

/* renamed from: cG_  reason: default package */
/* loaded from: classes.dex */
public abstract class cG_ extends E5 implements iLf {
    public volatile DJ R;

    /* renamed from: R  reason: collision with other field name */
    public d f2046R;
    public boolean g;
    public final Object v = new Object();
    public boolean y = false;

    @Override // defpackage.pm2
    public final Context H() {
        if (super.H() == null && !this.g) {
            return null;
        }
        f();
        return this.f2046R;
    }

    @Override // defpackage.pm2, defpackage.jIY
    public final hv5 L() {
        return vd.o(this, super.L());
    }

    @Override // defpackage.iLf
    public final Object R() {
        if (this.R == null) {
            synchronized (this.v) {
                if (this.R == null) {
                    this.R = new DJ(this);
                }
            }
        }
        return this.R.R();
    }

    @Override // defpackage.pm2
    public final void V(Activity activity) {
        this.U = true;
        d dVar = this.f2046R;
        hDC.L(dVar == null || DJ.c(dVar) == activity, "onAttach called multiple times with different Context! Hilt Fragments should not be retained.", new Object[0]);
        f();
        if (!this.y) {
            this.y = true;
            OverviewFragment overviewFragment = (OverviewFragment) this;
            doT dot = (doT) ((mGN) ((cuB) R())).R.c.get();
        }
    }

    public final void f() {
        if (this.f2046R == null) {
            this.f2046R = new d(super.H(), this);
            this.g = lTs.P(super.H());
        }
    }

    @Override // defpackage.pm2
    public final void o(Context context) {
        super.o(context);
        f();
        if (!this.y) {
            this.y = true;
            OverviewFragment overviewFragment = (OverviewFragment) this;
            doT dot = (doT) ((mGN) ((cuB) R())).R.c.get();
        }
    }

    @Override // defpackage.pm2
    public final LayoutInflater u(Bundle bundle) {
        LayoutInflater u = super.u(bundle);
        return u.cloneInContext(new d(u, this));
    }
}