package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: Cx  reason: default package */
/* loaded from: classes.dex */
public final class Cx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ Cx(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        boolean z = false;
        switch (this.e) {
            case 0:
                if (((f5) this.R).v() && ((f5) this.R).f3300v.size() > 0 && !((olv) ((g2) ((f5) this.R).f3300v.get(0)).f3655R).f6930e) {
                    View view = ((f5) this.R).v;
                    if (view == null || !view.isShown()) {
                        ((f5) this.R).dismiss();
                        return;
                    }
                    Iterator it = ((f5) this.R).f3300v.iterator();
                    while (it.hasNext()) {
                        ((g2) it.next()).f3655R.Z();
                    }
                    return;
                }
                return;
            case 1:
                if (((bzH) this.R).v()) {
                    bzH bzh = (bzH) this.R;
                    if (!((olv) bzh.f1891R).f6930e) {
                        View view2 = bzh.v;
                        if (view2 == null || !view2.isShown()) {
                            ((bzH) this.R).dismiss();
                            return;
                        } else {
                            ((bzH) this.R).f1891R.Z();
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            case 2:
                if (!((_Q) this.R).getInternalPopup().v()) {
                    _Q _q = (_Q) this.R;
                    _q.f697R.U(M9.v(_q), M9.R(_q));
                }
                ViewTreeObserver viewTreeObserver = ((_Q) this.R).getViewTreeObserver();
                if (viewTreeObserver != null) {
                    HM.R(viewTreeObserver, this);
                    return;
                }
                return;
            default:
                j3 j3Var = (j3) this.R;
                _Q _q2 = j3Var.R;
                WeakHashMap weakHashMap = of5.f6887R;
                if (d6y.v(_q2) && _q2.getGlobalVisibleRect(j3Var.c)) {
                    z = true;
                }
                if (!z) {
                    ((j3) this.R).dismiss();
                    return;
                }
                ((j3) this.R).t();
                ((j3) this.R).Z();
                return;
        }
    }
}
