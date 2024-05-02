package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import java.io.File;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: qy  reason: default package */
/* loaded from: classes.dex */
public final class qy implements mpM, cmW, cZC, iXM {
    public final Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ qy(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:58:0x010c, code lost:
        if (defpackage.nQJ.R(r7, defpackage.kl8.j) != false) goto L_0x0198;
     */
    /* JADX WARNING: Removed duplicated region for block: B:153:0x0275  */
    /* JADX WARNING: Removed duplicated region for block: B:181:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public defpackage.aaz L(android.view.KeyEvent r8) {
        /*
        // Method dump skipped, instructions count: 646
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy.L(android.view.KeyEvent):aaz");
    }

    public int O() {
        switch (this.e) {
            case 0:
                return ((kds) this.R).I();
            default:
                return ((kds) this.R).z();
        }
    }

    @Override // defpackage.iXM
    public void R(Object obj) {
        switch (this.e) {
            case 0:
                dRx drx = (dRx) this.R;
                List list = (List) obj;
                int R = drx.f2610R.R();
                Iterator it = drx.X().iterator();
                while (it.hasNext()) {
                    File file = (File) it.next();
                    if (!list.contains(file.getName()) && dRx.v(file, true) != ((long) R)) {
                        dRx.L(file);
                    }
                }
                return;
            default:
                ((xx) ((k0) this.R)).Y(obj);
                return;
        }
    }

    public int X() {
        int i;
        int h;
        switch (this.e) {
            case 0:
                kds kds = (kds) this.R;
                i = kds.e;
                h = kds.u();
                break;
            default:
                kds kds2 = (kds) this.R;
                i = kds2.X;
                h = kds2.h();
                break;
        }
        return i - h;
    }

    public int c(View view) {
        int bottom;
        int i;
        switch (this.e) {
            case 0:
                ((kds) this.R).getClass();
                bottom = view.getRight() + ((l88) view.getLayoutParams()).R.right;
                i = ((ViewGroup.MarginLayoutParams) ((l88) view.getLayoutParams())).rightMargin;
                break;
            default:
                ((kds) this.R).getClass();
                bottom = view.getBottom() + ((l88) view.getLayoutParams()).R.bottom;
                i = ((ViewGroup.MarginLayoutParams) ((l88) view.getLayoutParams())).bottomMargin;
                break;
        }
        return bottom + i;
    }

    public int e(View view) {
        int top;
        int i;
        switch (this.e) {
            case 0:
                ((kds) this.R).getClass();
                top = view.getLeft() - ((l88) view.getLayoutParams()).R.left;
                i = ((ViewGroup.MarginLayoutParams) ((l88) view.getLayoutParams())).leftMargin;
                break;
            default:
                ((kds) this.R).getClass();
                top = view.getTop() - ((l88) view.getLayoutParams()).R.top;
                i = ((ViewGroup.MarginLayoutParams) ((l88) view.getLayoutParams())).topMargin;
                break;
        }
        return top - i;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v20, resolved type: boolean */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mpM
    public gWM v(View view, gWM gwm) {
        int i = 0;
        boolean z = true;
        gWM gwm2 = null;
        switch (this.e) {
            case 0:
                int O = gwm.O();
                int A = ((Q8) this.R).A(gwm, null);
                if (O != A) {
                    int e = gwm.e();
                    int X = gwm.X();
                    int c = gwm.c();
                    h89 h89 = new h89(gwm);
                    ((isJ) h89.R).O(ojk.v(e, A, X, c));
                    gwm = h89.O();
                }
                WeakHashMap weakHashMap = of5.f6887R;
                WindowInsets L = gwm.L();
                if (L == null) {
                    return gwm;
                }
                WindowInsets v = fv7.v(view, L);
                return !v.equals(L) ? gWM.Z(view, v) : gwm;
            case 1:
                CoordinatorLayout coordinatorLayout = (CoordinatorLayout) this.R;
                if (!cTo.R(coordinatorLayout.f1267R, gwm)) {
                    coordinatorLayout.f1267R = gwm;
                    boolean z2 = gwm.O() > 0;
                    coordinatorLayout.e = z2;
                    if (z2 || coordinatorLayout.getBackground() != null) {
                        z = false;
                    }
                    coordinatorLayout.setWillNotDraw(z);
                    if (!gwm.f3779R.H()) {
                        int childCount = coordinatorLayout.getChildCount();
                        while (i < childCount) {
                            View childAt = coordinatorLayout.getChildAt(i);
                            WeakHashMap weakHashMap2 = of5.f6887R;
                            if (!mHC.v(childAt) || ((aRL) childAt.getLayoutParams()).f880R == null || !gwm.f3779R.H()) {
                                i++;
                            }
                        }
                    }
                    coordinatorLayout.requestLayout();
                }
                return gwm;
            case 2:
                AppBarLayout appBarLayout = (AppBarLayout) this.R;
                appBarLayout.getClass();
                WeakHashMap weakHashMap3 = of5.f6887R;
                if (mHC.v(appBarLayout)) {
                    gwm2 = gwm;
                }
                if (!cTo.R(appBarLayout.f2215R, gwm2)) {
                    appBarLayout.f2215R = gwm2;
                    if (appBarLayout.f2213R != null && appBarLayout.getTopInset() > 0) {
                        i = 1;
                    }
                    appBarLayout.setWillNotDraw(i ^ 1);
                    appBarLayout.requestLayout();
                }
                return gwm;
            default:
                CollapsingToolbarLayout collapsingToolbarLayout = (CollapsingToolbarLayout) this.R;
                collapsingToolbarLayout.getClass();
                WeakHashMap weakHashMap4 = of5.f6887R;
                if (mHC.v(collapsingToolbarLayout)) {
                    gwm2 = gwm;
                }
                if (!cTo.R(collapsingToolbarLayout.f2233R, gwm2)) {
                    collapsingToolbarLayout.f2233R = gwm2;
                    collapsingToolbarLayout.requestLayout();
                }
                return gwm.f3779R.c();
        }
    }
}
