package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.Iterator;

/* renamed from: cGu  reason: default package */
/* loaded from: classes.dex */
public final class cGu extends cho {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cGu(Object obj, cqI cqi, Object obj2, int i) {
        super(cqi);
        this.e = i;
        this.v = obj;
        this.R = obj2;
    }

    @Override // defpackage.cho
    public final void R() {
        switch (this.e) {
            case 0:
                try {
                    Object obj = this.v;
                    String str = ((krG) obj).f5450R;
                    Bundle Z = krG.Z();
                    kSS kss = new kSS((krG) this.v, (cqI) this.R, 1);
                    g_L g_l = (g_L) ((gs_) ((krG) obj).v.f2643R);
                    Parcel O = g_l.O();
                    O.writeString(str);
                    int i = okB.R;
                    O.writeInt(1);
                    Z.writeToParcel(O, 0);
                    O.writeStrongBinder(kss);
                    g_l.L(O, 10);
                    return;
                } catch (RemoteException e) {
                    krG.f5447R.Z(e, "keepAlive", new Object[0]);
                    return;
                }
            case 1:
                dUW duw = (dUW) this.v;
                cho cho = (cho) this.R;
                if (duw.f2643R == null && !duw.f2653R) {
                    duw.f2652R.m("Initiate binding to the service.", new Object[0]);
                    duw.f2648R.add(cho);
                    eG5 eg5 = new eG5(duw);
                    duw.f2644R = eg5;
                    duw.f2653R = true;
                    if (!duw.f2641R.bindService(duw.f2642R, eg5, 1)) {
                        duw.f2652R.m("Failed to bind to the service.", new Object[0]);
                        duw.f2653R = false;
                        Iterator it = duw.f2648R.iterator();
                        while (it.hasNext()) {
                            j8f j8f = new j8f();
                            cqI cqi = ((cho) it.next()).R;
                            if (cqi != null) {
                                cqi.R(j8f);
                            }
                        }
                        duw.f2648R.clear();
                        return;
                    }
                    return;
                } else if (duw.f2653R) {
                    duw.f2652R.m("Waiting to bind to the service.", new Object[0]);
                    duw.f2648R.add(cho);
                    return;
                } else {
                    cho.run();
                    return;
                }
            case 2:
                dUW duw2 = (dUW) ((eG5) this.v).f3042R;
                duw2.f2643R = (IInterface) duw2.f2640R.H((IBinder) this.R);
                dUW duw3 = (dUW) ((eG5) this.v).f3042R;
                duw3.f2652R.m("linkToDeath", new Object[0]);
                try {
                    duw3.f2643R.asBinder().linkToDeath(duw3.f2651R, 0);
                } catch (RemoteException e2) {
                    duw3.f2652R.Z(e2, "linkToDeath failed", new Object[0]);
                }
                dUW duw4 = (dUW) ((eG5) this.v).f3042R;
                duw4.f2653R = false;
                Iterator it2 = duw4.f2648R.iterator();
                while (it2.hasNext()) {
                    ((Runnable) it2.next()).run();
                }
                ((dUW) ((eG5) this.v).f3042R).f2648R.clear();
                return;
            default:
                try {
                    Object obj2 = this.v;
                    String str2 = ((gWQ) obj2).f3781R;
                    Bundle R = gYv.R();
                    gWQ gwq = (gWQ) this.v;
                    String str3 = gwq.f3781R;
                    nKl nkl = new nKl(gwq, (cqI) this.R);
                    let let = (let) ((mVQ) ((gWQ) obj2).f3780R.f2643R);
                    Parcel O2 = let.O();
                    O2.writeString(str2);
                    int i2 = okB.R;
                    O2.writeInt(1);
                    R.writeToParcel(O2, 0);
                    O2.writeStrongBinder(nkl);
                    let.L(O2, 2);
                    return;
                } catch (RemoteException e3) {
                    gWQ.R.Z(e3, "error requesting in-app review for %s", ((gWQ) this.v).f3781R);
                    ((cqI) this.R).R(new RuntimeException(e3));
                    return;
                }
        }
    }

    public cGu(eG5 eg5, IBinder iBinder) {
        this.e = 2;
        this.v = eg5;
        this.R = iBinder;
    }
}
