package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: eG5  reason: default package */
/* loaded from: classes.dex */
public final class eG5 implements ServiceConnection {
    public final /* synthetic */ int R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3042R;

    public /* synthetic */ eG5(dUW duw) {
        this.f3042R = duw;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        switch (this.R) {
            case 0:
                brQ brq = (brQ) this.f3042R;
                int i = i1V.R;
                if (iBinder != null) {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("androidx.room.IMultiInstanceInvalidationService");
                    if (queryLocalInterface == null || !(queryLocalInterface instanceof i9A)) {
                        new lFG(iBinder);
                    } else {
                        i9A i9a = (i9A) queryLocalInterface;
                    }
                }
                brq.getClass();
                brQ brq2 = (brQ) this.f3042R;
                brq2.getClass();
                brq2.getClass();
                throw null;
            default:
                ((dUW) this.f3042R).f2652R.m("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
                ((dUW) this.f3042R).R().post(new cGu(this, iBinder));
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.R) {
            case 0:
                brQ brq = (brQ) this.f3042R;
                brq.getClass();
                brq.getClass();
                throw null;
            default:
                ((dUW) this.f3042R).f2652R.m("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
                ((dUW) this.f3042R).R().post(new lrz(1, this));
                return;
        }
    }
}
