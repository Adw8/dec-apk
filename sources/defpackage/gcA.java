package defpackage;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import de.Maxr1998.modernpreferences.PreferencesAdapter;

/* renamed from: gcA  reason: default package */
/* loaded from: classes.dex */
public final class gcA extends cp2 {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ Object f3800R;

    public /* synthetic */ gcA(int i, Object obj) {
        this.R = i;
        this.f3800R = obj;
    }

    @Override // defpackage.cp2
    public final void R(RecyclerView recyclerView, int i) {
        switch (this.R) {
            case 1:
                if (i == 0) {
                    mkC Z = ((PreferencesAdapter) this.f3800R).Z();
                    kds layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int i2 = 0;
                        View k8 = linearLayoutManager.k8(0, linearLayoutManager.o(), true, false);
                        int n = k8 == null ? -1 : kds.n(k8);
                        Z.x = n;
                        h9X Q = recyclerView.Q(n);
                        if (Q != null) {
                            i2 = Q.f4097R.getTop();
                        }
                        Z.H = i2;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.cp2
    public final void v(RecyclerView recyclerView, int i, int i2) {
        switch (this.R) {
            case 0:
                f6m f6m = (f6m) this.f3800R;
                int computeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
                int computeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
                int computeVerticalScrollRange = f6m.f3313R.computeVerticalScrollRange();
                int i3 = f6m.U;
                f6m.f3315R = computeVerticalScrollRange - i3 > 0 && i3 >= f6m.f3309R;
                int computeHorizontalScrollRange = f6m.f3313R.computeHorizontalScrollRange();
                int i4 = f6m.H;
                boolean z = computeHorizontalScrollRange - i4 > 0 && i4 >= f6m.f3309R;
                f6m.f3322v = z;
                boolean z2 = f6m.f3315R;
                if (z2 || z) {
                    if (z2) {
                        float f = (float) i3;
                        f6m.Z = (int) ((((f / 2.0f) + ((float) computeVerticalScrollOffset)) * f) / ((float) computeVerticalScrollRange));
                        f6m.L = Math.min(i3, (i3 * i3) / computeVerticalScrollRange);
                    }
                    if (f6m.f3322v) {
                        float f2 = (float) computeHorizontalScrollOffset;
                        float f3 = (float) i4;
                        f6m.x = (int) ((((f3 / 2.0f) + f2) * f3) / ((float) computeHorizontalScrollRange));
                        f6m.m = Math.min(i4, (i4 * i4) / computeHorizontalScrollRange);
                    }
                    int i5 = f6m.C;
                    if (i5 == 0 || i5 == 1) {
                        f6m.X(1);
                        return;
                    }
                    return;
                } else if (f6m.C != 0) {
                    f6m.X(0);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }
}
