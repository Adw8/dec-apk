package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: nue  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class nue implements IBinder.DeathRecipient {
    public final /* synthetic */ dUW R;

    public /* synthetic */ nue(dUW duw) {
        this.R = duw;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        dUW duw = this.R;
        duw.f2652R.m("reportBinderDeath", new Object[0]);
        eeF eef = (eeF) duw.f2647R.get();
        if (eef != null) {
            duw.f2652R.m("calling onBinderDied", new Object[0]);
            eef.R();
        } else {
            duw.f2652R.m("%s : Binder has died.", duw.f2646R);
            Iterator it = duw.f2648R.iterator();
            while (it.hasNext()) {
                RemoteException remoteException = new RemoteException(String.valueOf(duw.f2646R).concat(" : Binder has died."));
                cqI cqi = ((cho) it.next()).R;
                if (cqi != null) {
                    cqi.R(remoteException);
                }
            }
            duw.f2648R.clear();
        }
        duw.e();
    }
}
