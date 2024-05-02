package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import java.util.concurrent.Callable;

/* renamed from: oZ5  reason: default package */
/* loaded from: classes.dex */
public final class oZ5 implements ServiceConnection {
    public final /* synthetic */ cG R;

    /* renamed from: R  reason: collision with other field name */
    public gGm f6847R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f6848R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public boolean f6849R = false;

    public /* synthetic */ oZ5(cG cGVar, gGm ggm) {
        this.R = cGVar;
        this.f6847R = ggm;
    }

    public final void R(L2 l2) {
        synchronized (this.f6848R) {
            gGm ggm = this.f6847R;
            if (ggm != null) {
                ggm.R(l2);
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        p2K p2k;
        fgm.X("BillingClient", "Billing service connected.");
        cG cGVar = this.R;
        int i = n9U.R;
        if (iBinder == null) {
            p2k = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
            p2k = queryLocalInterface instanceof p2K ? (p2K) queryLocalInterface : new aEu(iBinder);
        }
        cGVar.f2043R = p2k;
        cG cGVar2 = this.R;
        if (cGVar2.c(new Callable() { // from class: csL
            /* JADX WARNING: Removed duplicated region for block: B:55:0x010b  */
            /* JADX WARNING: Removed duplicated region for block: B:56:0x0111  */
            @Override // java.util.concurrent.Callable
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final java.lang.Object call() {
                /*
                // Method dump skipped, instructions count: 282
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.csL.call():java.lang.Object");
            }
        }, new ggY(2, this), cGVar2.v()) == null) {
            cG cGVar3 = this.R;
            R((cGVar3.R == 0 || cGVar3.R == 3) ? lPe.L : lPe.X);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        fgm.O("BillingClient", "Billing service disconnected.");
        this.R.f2043R = null;
        this.R.R = 0;
        synchronized (this.f6848R) {
            try {
                gGm ggm = this.f6847R;
                if (ggm != null) {
                    pby[] pbyArr = kxm.R;
                    ggm.R.f3057R.H(Boolean.FALSE);
                    if (n3x.v(ggm.R.f3054R, ggm.f3701R.R)) {
                        ggm.R.f3054R = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
