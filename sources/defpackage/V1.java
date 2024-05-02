package defpackage;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import dev.kdrag0n.virtcontainer.R;
import java.util.Iterator;
import java.util.WeakHashMap;

/* renamed from: V1  reason: default package */
/* loaded from: classes.dex */
public final class V1 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ V1(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.e) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                return;
            default:
                iOp iop = (iOp) this.R;
                int i = iOp.X;
                if (iop.R != null && iop.f4565R != null) {
                    WeakHashMap weakHashMap = of5.f6887R;
                    if (d6y.v(iop)) {
                        Rw.R(iop.f4565R, iop.R);
                        return;
                    }
                    return;
                }
                return;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        AccessibilityManager accessibilityManager;
        boolean z;
        switch (this.e) {
            case 0:
                ViewTreeObserver viewTreeObserver = ((f5) this.R).f3292R;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        ((f5) this.R).f3292R = view.getViewTreeObserver();
                    }
                    f5 f5Var = (f5) this.R;
                    f5Var.f3292R.removeGlobalOnLayoutListener(f5Var.R);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 1:
                ViewTreeObserver viewTreeObserver2 = ((bzH) this.R).f1887R;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        ((bzH) this.R).f1887R = view.getViewTreeObserver();
                    }
                    bzH bzh = (bzH) this.R;
                    bzh.f1887R.removeGlobalOnLayoutListener(bzh.R);
                }
                view.removeOnAttachStateChangeListener(this);
                return;
            case 2:
                gd gdVar = (gd) this.R;
                gdVar.f3812R.removeCallbacks(gdVar.f3820R);
                return;
            case 3:
                Iterator it = a6.l(((LG) this.R).getParent(), bEX.R).iterator();
                while (true) {
                    z = false;
                    if (it.hasNext()) {
                        ViewParent viewParent = (ViewParent) it.next();
                        if (viewParent instanceof View) {
                            Object tag = ((View) viewParent).getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null) {
                                z = bool.booleanValue();
                            }
                            if (z) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    ((LG) this.R).e();
                    return;
                }
                return;
            case 4:
                view.removeOnAttachStateChangeListener(this);
                ((pd2) this.R).c(null);
                return;
            default:
                iOp iop = (iOp) this.R;
                int i = iOp.X;
                P_ p_ = iop.R;
                if (p_ != null && (accessibilityManager = iop.f4565R) != null) {
                    Rw.v(accessibilityManager, p_);
                    return;
                }
                return;
        }
    }
}
