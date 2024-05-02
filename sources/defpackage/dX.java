package defpackage;

import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.OverScroller;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.work.impl.WorkDatabase;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.play.core.assetpacks.zzbn;
import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: dX  reason: default package */
/* loaded from: classes.dex */
public final class dX implements Runnable {
    public Object R;
    public Object c;
    public final /* synthetic */ int e;
    public Object v;

    public /* synthetic */ dX(Object obj, Object obj2, Object obj3, int i) {
        this.e = i;
        this.c = obj;
        this.R = obj2;
        this.v = obj3;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:81:0x0005 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:83:0x00bc */
    /* JADX DEBUG: Multi-variable search result rejected for r8v0, resolved type: dX */
    /* JADX DEBUG: Multi-variable search result rejected for r8v1, resolved type: dX */
    /* JADX DEBUG: Multi-variable search result rejected for r8v4, resolved type: dX */
    /* JADX DEBUG: Multi-variable search result rejected for r8v7, resolved type: dX */
    /* JADX DEBUG: Multi-variable search result rejected for r3v3, resolved type: java.lang.Throwable[] */
    /* JADX DEBUG: Multi-variable search result rejected for r8v8, resolved type: dX */
    /* JADX DEBUG: Multi-variable search result rejected for r3v5, resolved type: java.lang.Throwable[] */
    /* JADX DEBUG: Multi-variable search result rejected for r8v38, resolved type: dX */
    /* JADX DEBUG: Multi-variable search result rejected for r8v39, resolved type: dX */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v6, types: [iwe] */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v41 */
    @Override // java.lang.Runnable
    public final void run() {
        ?? r8;
        Object obj;
        OverScroller overScroller;
        int i = 1;
        boolean z = true;
        i = 1;
        i = 1;
        i = 1;
        try {
            switch (this.e) {
                case 0:
                    Typeface typeface = (Typeface) this.v;
                    n1P n1p = (n1P) ((h89) this.R).R;
                    if (n1p != null) {
                        n1p.i(typeface);
                        return;
                    }
                    return;
                case 1:
                    ((geB) this.R).accept(this.v);
                    return;
                case 2:
                    try {
                        obj = ((Callable) this.R).call();
                    } catch (Exception unused) {
                        obj = null;
                    }
                    ((Handler) this.c).post(new dX(this, (geB) this.v, obj, 1));
                    return;
                case 3:
                    if (((List) this.R).contains((kuA) this.v)) {
                        ((List) this.R).remove((kuA) this.v);
                        kuA kua = (kuA) this.v;
                        ((peT) this.c).getClass();
                        opT.R(kua.R, kua.f5473R.f7228R);
                        return;
                    }
                    return;
                case 4:
                    ((pxy) this.R).c();
                    if (hAW.W(2)) {
                        StringBuilder U = opT.U("Transition for operation ");
                        U.append((kuA) this.v);
                        U.append("has completed");
                        Log.v("FragmentManager", U.toString());
                        return;
                    }
                    return;
                case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    try {
                        z = ((Boolean) ((nA8) this.c).get()).booleanValue();
                    } catch (InterruptedException | ExecutionException unused2) {
                    }
                    ((kYJ) this.R).v((String) this.v, z);
                    return;
                case 6:
                    try {
                        ((nA8) this.R).get();
                        kfk.U().x(iwe.c, String.format("Starting work for %s", ((iwe) this.c).f4770R.f5569v), new Throwable[0]);
                        Object obj2 = this.c;
                        ((iwe) obj2).f4772R = ((iwe) obj2).f4762R.X();
                        ((gXD) this.v).H(((iwe) this.c).f4772R);
                        return;
                    } catch (Throwable th) {
                        ((gXD) this.v).x(th);
                        return;
                    }
                case 7:
                    try {
                        g9z g9z = (g9z) ((gXD) this.R).get();
                        if (g9z == null) {
                            kfk.U().H(iwe.c, String.format("%s returned a null result. Treating it as a failure.", ((iwe) this.c).f4770R.f5569v), new Throwable[0]);
                            this = this;
                        } else {
                            kfk.U().x(iwe.c, String.format("%s returned a %s result.", ((iwe) this.c).f4770R.f5569v, g9z), new Throwable[0]);
                            ((iwe) this.c).f4765R = g9z;
                            this = this;
                        }
                    } catch (InterruptedException | ExecutionException e) {
                        kfk U2 = kfk.U();
                        String str = iwe.c;
                        Object[] objArr = new Object[i];
                        objArr[0] = (String) this.v;
                        String format = String.format("%s failed because it threw an exception/error", objArr);
                        Throwable[] thArr = new Throwable[i];
                        thArr[0] = e;
                        U2.H(str, format, thArr);
                        i = thArr;
                        r8 = this;
                    } catch (CancellationException e2) {
                        kfk U3 = kfk.U();
                        String str2 = iwe.c;
                        Object[] objArr2 = new Object[i];
                        objArr2[0] = (String) this.v;
                        String format2 = String.format("%s was cancelled", objArr2);
                        Throwable[] thArr2 = new Throwable[i];
                        thArr2[0] = e2;
                        U3.C(str2, format2, thArr2);
                        i = thArr2;
                        r8 = this;
                    }
                    return;
                case VmNativeCallback.$stable /* 8 */:
                    l3L m = ((WorkDatabase) this.R).N().m((String) this.v);
                    if (m != null && m.v()) {
                        synchronized (((pe3) this.c).f7144R) {
                            ((pe3) this.c).f7146R.put((String) this.v, m);
                            ((pe3) this.c).f7147R.add(m);
                            Object obj3 = this.c;
                            ((pe3) obj3).f7142R.v(((pe3) obj3).f7147R);
                        }
                        return;
                    }
                    return;
                case 9:
                    ((jFe) this.R).f4888R.X((String) this.v, (CV) this.c);
                    return;
                case 10:
                    if (((View) this.v) != null && (overScroller = ((en5) this.c).f3198R) != null) {
                        if (overScroller.computeScrollOffset()) {
                            en5 en5 = (en5) this.c;
                            en5.K((CoordinatorLayout) this.R, (View) this.v, en5.f3198R.getCurrY());
                            mHC.C((View) this.v, this);
                            return;
                        }
                        CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.R;
                        AppBarLayout.BaseBehavior baseBehavior = (AppBarLayout.BaseBehavior) ((en5) this.c);
                        baseBehavior.getClass();
                        AppBarLayout appBarLayout = (AppBarLayout) ((View) this.v);
                        baseBehavior.u(coordinatorLayout, appBarLayout);
                        if (appBarLayout.f2220X) {
                            appBarLayout.X(appBarLayout.O(AppBarLayout.BaseBehavior.Y(coordinatorLayout)));
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    e4X e4x = (e4X) this.R;
                    zzbn zzbn = (zzbn) this.c;
                    nt4 nt4 = e4x.f2967R;
                    nt4.getClass();
                    if (((Boolean) nt4.c(new jUd(nt4, (Bundle) this.v, 0))).booleanValue()) {
                        e4x.R.post(new bx(e4x, zzbn, 12));
                        ((aUC) ((kIP) e4x.f2965R).R()).c();
                        return;
                    }
                    return;
            }
        } finally {
            ((iwe) this.c).c();
        }
    }

    public /* synthetic */ dX(Object obj, Object obj2, Object obj3, int i, int i2) {
        this.e = i;
        this.R = obj;
        this.v = obj2;
        this.c = obj3;
    }
}
