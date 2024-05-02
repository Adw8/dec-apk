package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: l5K  reason: default package */
/* loaded from: classes.dex */
public final class l5K implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {
    public ViewGroup R;

    /* renamed from: R  reason: collision with other field name */
    public hFt f5579R;

    public l5K(ViewGroup viewGroup, hFt hft) {
        this.f5579R = hft;
        this.R = viewGroup;
    }

    /* JADX WARNING: Removed duplicated region for block: B:104:0x0221  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x024d  */
    /* JADX WARNING: Removed duplicated region for block: B:146:0x01fb A[EDGE_INSN: B:146:0x01fb->B:94:0x01fb ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x0200  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onPreDraw() {
        /*
        // Method dump skipped, instructions count: 723
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l5K.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.R.getViewTreeObserver().removeOnPreDrawListener(this);
        this.R.removeOnAttachStateChangeListener(this);
        pnB.f7263R.remove(this.R);
        ArrayList arrayList = (ArrayList) pnB.v().getOrDefault(this.R, null);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((hFt) it.next()).u(this.R);
            }
        }
        this.f5579R.U(true);
    }
}
