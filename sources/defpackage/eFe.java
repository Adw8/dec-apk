package defpackage;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: eFe  reason: default package */
/* loaded from: classes.dex */
public final class eFe extends eEi {
    public a40 R;

    /* renamed from: R  reason: collision with other field name */
    public RecyclerView f3040R;

    /* renamed from: R  reason: collision with other field name */
    public final nQ3 f3041R = new nQ3(this);
    public a40 v;

    public static View c(kds kds, g2N g2n) {
        int o = kds.o();
        View view = null;
        if (o == 0) {
            return null;
        }
        int m = (g2n.m() / 2) + g2n.Z();
        int i = Integer.MAX_VALUE;
        for (int i2 = 0; i2 < o; i2++) {
            View V = kds.V(i2);
            int abs = Math.abs(((g2n.c(V) / 2) + g2n.e(V)) - m);
            if (abs < i) {
                view = V;
                i = abs;
            }
        }
        return view;
    }

    public static int v(View view, g2N g2n) {
        return ((g2n.c(view) / 2) + g2n.e(view)) - ((g2n.m() / 2) + g2n.Z());
    }

    public final void O() {
        kds layoutManager;
        RecyclerView recyclerView = this.f3040R;
        if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            View c = layoutManager.X() ? c(layoutManager, X(layoutManager)) : layoutManager.e() ? c(layoutManager, e(layoutManager)) : null;
            if (c != null) {
                int[] R = R(layoutManager, c);
                int i = R[0];
                if (i != 0 || R[1] != 0) {
                    this.f3040R.mL(i, R[1], false);
                }
            }
        }
    }

    public final int[] R(kds kds, View view) {
        int[] iArr = new int[2];
        if (kds.e()) {
            iArr[0] = v(view, e(kds));
        } else {
            iArr[0] = 0;
        }
        if (kds.X()) {
            iArr[1] = v(view, X(kds));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    public final g2N X(kds kds) {
        a40 a40 = this.R;
        if (a40 == null || ((g2N) a40).f3657R != kds) {
            this.R = new a40(kds, 1);
        }
        return this.R;
    }

    public final g2N e(kds kds) {
        a40 a40 = this.v;
        if (a40 == null || ((g2N) a40).f3657R != kds) {
            this.v = new a40(kds, 0);
        }
        return this.v;
    }
}
