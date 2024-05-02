package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* renamed from: bx  reason: default package */
/* loaded from: classes.dex */
public final class bx implements Runnable {
    public Object R;
    public final /* synthetic */ int e;
    public final Object v;

    public /* synthetic */ bx(Object obj, int i, Object obj2) {
        this.e = i;
        this.v = obj;
        this.R = obj2;
    }

    private final void R() {
        synchronized (((kVh) this.v).f5316R) {
            Object obj = ((kVh) this.v).v;
            if (((h5) obj) != null) {
                h5 h5Var = (h5) obj;
                dUW duw = (dUW) h5Var.R;
                cqI cqi = (cqI) h5Var.v;
                synchronized (duw.f2645R) {
                    duw.f2649R.remove(cqi);
                }
            }
        }
    }

    private final void v() {
        synchronized (((kVh) this.v).f5316R) {
            try {
                Object obj = ((kVh) this.v).v;
                if (((iXM) obj) != null) {
                    ((iXM) obj).R(((b1t) this.R).c());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        foC foc;
        oC1 oc1;
        Exception exc;
        boolean z = true;
        switch (this.e) {
            case 0:
                lRG lrg = ((RR) this.v).f489R;
                if (!(lrg == null || (foc = lrg.f5731R) == null)) {
                    foc.c(lrg);
                }
                View view = (View) ((RR) this.v).f487R;
                if (!(view == null || view.getWindowToken() == null)) {
                    Ni ni = (Ni) this.R;
                    if (!ni.v()) {
                        if (((h6s) ni).f4066R == null) {
                            z = false;
                        } else {
                            ni.e(0, 0, false, false);
                        }
                    }
                    if (z) {
                        ((RR) this.v).f481R = (Ni) this.R;
                    }
                }
                ((RR) this.v).f486R = null;
                return;
            case 1:
            case 2:
            default:
                n3x.U((aOO) this.R).Y(new bvw((Exception) this.v));
                return;
            case 3:
                try {
                    Method method = ZD.f663R;
                    if (method != null) {
                        method.invoke(this.R, this.v, Boolean.FALSE, "AppCompat recreation");
                        return;
                    } else {
                        ZD.v.invoke(this.R, this.v, Boolean.FALSE);
                        return;
                    }
                } catch (RuntimeException e) {
                    if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                        throw e;
                    }
                    return;
                } catch (Throwable th) {
                    Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    return;
                }
            case 4:
                ((laa) this.v).getClass();
                throw null;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                ((Runnable) this.R).run();
                jQ.Y(this.v);
                throw null;
            case 6:
                kfk.U().x(ome.R, String.format("Scheduling work %s", ((l3L) this.R).f5562R), new Throwable[0]);
                ((ome) this.v).f6935R.X((l3L) this.R);
                return;
            case 7:
                for (m9V m9v : (List) this.R) {
                    Object obj = ((d72) this.v).v;
                    m9v.f5951R = obj;
                    m9v.e(m9v.f5950R, obj);
                }
                return;
            case VmNativeCallback.$stable /* 8 */:
                try {
                    ((Runnable) this.v).run();
                    return;
                } finally {
                    ((o9L) this.R).R();
                }
            case 9:
                synchronized (((ConstraintTrackingWorker) this.v).f1467R) {
                    if (((ConstraintTrackingWorker) this.v).c) {
                        ((ConstraintTrackingWorker) this.v).f1466R.m(new oBL());
                    } else {
                        ((ConstraintTrackingWorker) this.v).f1466R.H((nA8) this.R);
                    }
                }
                return;
            case 10:
                Future future = (Future) this.R;
                Runnable runnable = (Runnable) this.v;
                if (!(future.isDone() || future.isCancelled())) {
                    future.cancel(true);
                    fgm.O("BillingClient", "Async task is taking too long, cancel it!");
                    if (runnable != null) {
                        runnable.run();
                        return;
                    }
                    return;
                }
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                e4X e4x = (e4X) this.R;
                nt4 nt4 = e4x.f2967R;
                nt4.getClass();
                if (((Boolean) nt4.c(new jUd(nt4, (Bundle) this.v, 1))).booleanValue()) {
                    bRH brh = e4x.f2962R;
                    brh.getClass();
                    zI zIVar = bRH.R;
                    zIVar.X("Run extractor loop", new Object[0]);
                    if (brh.f1658R.compareAndSet(false, true)) {
                        while (true) {
                            try {
                                oc1 = brh.f1653R.R();
                            } catch (bRU e2) {
                                bRH.R.L("Error while getting next extraction task: %s", e2.getMessage());
                                if (e2.e >= 0) {
                                    ((aUC) ((kIP) brh.f1656R).R()).X(e2.e);
                                    brh.R(e2.e, e2);
                                }
                                oc1 = null;
                            }
                            if (oc1 != null) {
                                try {
                                    if (oc1 instanceof dXK) {
                                        brh.f1655R.R((dXK) oc1);
                                    } else if (oc1 instanceof hrc) {
                                        brh.f1652R.R((hrc) oc1);
                                    } else if (oc1 instanceof aE1) {
                                        brh.f1651R.R((aE1) oc1);
                                    } else if (oc1 instanceof i5M) {
                                        brh.f1650R.R((i5M) oc1);
                                    } else if (oc1 instanceof kDW) {
                                        brh.f1657R.R((kDW) oc1);
                                    } else if (oc1 instanceof fMm) {
                                        brh.f1654R.R((fMm) oc1);
                                    } else {
                                        bRH.R.L("Unknown task type: %s", oc1.getClass().getName());
                                    }
                                } catch (Exception e3) {
                                    bRH.R.L("Error during extraction task: %s", e3.getMessage());
                                    ((aUC) ((kIP) brh.f1656R).R()).X(oc1.R);
                                    brh.R(oc1.R, e3);
                                }
                            } else {
                                brh.f1658R.set(false);
                                return;
                            }
                        }
                    } else {
                        zIVar.x("runLoop already looping; return", new Object[0]);
                        return;
                    }
                } else {
                    return;
                }
            case 12:
                e4X e4x2 = (e4X) this.R;
                synchronized (e4x2) {
                    Iterator it = new HashSet(((hd8) e4x2).f4324R).iterator();
                    while (it.hasNext()) {
                        ((ddO) it.next()).R();
                    }
                }
                return;
            case 13:
                ((aVh) this.R).f897R.R((Intent) this.v);
                return;
            case 14:
                i5M i5m = (i5M) this.v;
                ((cAd) this.R).f1984R.R(i5m.v, i5m.R, (String) ((oC1) i5m).f6699R);
                return;
            case 15:
                fMm fmm = (fMm) this.v;
                ((i5a) this.R).R.R(fmm.c, fmm.R, (String) ((oC1) fmm).f6699R);
                return;
            case 16:
                R();
                return;
            case 17:
                synchronized (((kVh) this.v).f5316R) {
                    Object obj2 = ((kVh) this.v).v;
                    if (((jeO) obj2) != null) {
                        jeO jeo = (jeO) obj2;
                        b1t b1t = (b1t) this.R;
                        synchronized (b1t.R) {
                            exc = (Exception) b1t.e;
                        }
                        jeo.c(exc);
                    }
                }
                return;
            case 18:
                v();
                return;
            case 19:
                int i = nKO.R;
                ozN ozn = (ozN) this.v;
                ozn.getClass();
                ozn.getClass();
                int i2 = f7N.R;
                throw null;
            case 20:
                ((xx) ((k0) this.v)).I((kE9) this.R);
                return;
            case 21:
                ((xx) ((k0) this.R)).I((hBL) this.v);
                return;
        }
    }

    public /* synthetic */ bx(Object obj, Object obj2, int i) {
        this.e = i;
        this.R = obj;
        this.v = obj2;
    }
}
