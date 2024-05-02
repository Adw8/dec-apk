package defpackage;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Y;

/* renamed from: l4A  reason: default package */
/* loaded from: classes.dex */
public final class l4A {
    public bww R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f5576R;

    /* renamed from: R  reason: collision with other field name */
    public final pm2 f5577R;

    public l4A(pm2 pm2) {
        qQ qQVar = qQ.R;
        this.f5577R = pm2;
        this.f5576R = qQVar;
        pm2.f7242R.R(new DefaultLifecycleObserver() { // from class: dev.kdrag0n.app.ui.utils.FragmentViewBindingDelegate$1

            /* renamed from: R  reason: collision with other field name */
            public final nxC f2720R;

            {
                this.f2720R = new nxC(3, l4A.this);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onCreate(nu_ nu_) {
                l4A.this.f5577R.f7230R.e(this.f2720R);
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public final void onDestroy(nu_ nu_) {
                Y y = l4A.this.f5577R.f7230R;
                nxC nxc = this.f2720R;
                y.getClass();
                Y.R("removeObserver");
                obI obi = (obI) y.f1335R.v(nxc);
                if (obi != null) {
                    obi.v();
                    obi.R(false);
                }
            }
        });
    }
}
