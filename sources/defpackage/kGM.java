package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import androidx.lifecycle.h;

/* renamed from: kGM  reason: default package */
/* loaded from: classes.dex */
public final class kGM implements jIY, adL, ly1 {

    /* renamed from: R  reason: collision with other field name */
    public hv5 f5228R;

    /* renamed from: R  reason: collision with other field name */
    public final ns8 f5230R;

    /* renamed from: R  reason: collision with other field name */
    public final pm2 f5231R;

    /* renamed from: R  reason: collision with other field name */
    public m4i f5229R = null;
    public hSL R = null;

    public kGM(pm2 pm2, ns8 ns8) {
        this.f5231R = pm2;
        this.f5230R = ns8;
    }

    @Override // defpackage.jIY
    public final hv5 L() {
        hv5 L = this.f5231R.L();
        if (!L.equals(this.f5231R.f7231R)) {
            this.f5228R = L;
            return L;
        }
        if (this.f5228R == null) {
            Application application = null;
            Context applicationContext = this.f5231R.k().getApplicationContext();
            while (true) {
                if (!(applicationContext instanceof ContextWrapper)) {
                    break;
                } else if (applicationContext instanceof Application) {
                    application = (Application) applicationContext;
                    break;
                } else {
                    applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
                }
            }
            this.f5228R = new h(application, this, this.f5231R.c);
        }
        return this.f5228R;
    }

    @Override // defpackage.nu_
    public final m4i O() {
        v();
        return this.f5229R;
    }

    public final void R(alX alx) {
        this.f5229R.X(alx);
    }

    @Override // defpackage.jIY
    public final o0y Z() {
        Application application;
        Context applicationContext = this.f5231R.k().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            } else if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            } else {
                applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
            }
        }
        o0y o0y = new o0y(0);
        if (application != null) {
            o0y.v(ppN.U, application);
        }
        o0y.v(mxC.f6248R, this);
        o0y.v(mxC.f6251v, this);
        Bundle bundle = this.f5231R.c;
        if (bundle != null) {
            o0y.v(mxC.f6249c, bundle);
        }
        return o0y;
    }

    @Override // defpackage.adL
    public final bhK c() {
        v();
        return this.R.f4264R;
    }

    @Override // defpackage.ly1
    public final ns8 e() {
        v();
        return this.f5230R;
    }

    public final void v() {
        if (this.f5229R == null) {
            this.f5229R = new m4i(this);
            hSL hsl = new hSL(this);
            this.R = hsl;
            hsl.R();
            mxC.C(this);
        }
    }
}
