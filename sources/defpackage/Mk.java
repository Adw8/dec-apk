package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* renamed from: Mk  reason: default package */
/* loaded from: classes.dex */
public final class Mk {
    public final h9q R;

    /* renamed from: R  reason: collision with other field name */
    public final v_ f296R = new v_();

    /* renamed from: R  reason: collision with other field name */
    public final ArrayList f295R = new ArrayList();

    public Mk(h9q h9q) {
        this.R = h9q;
    }

    public final void H(View view) {
        if (this.f295R.remove(view)) {
            h9q h9q = this.R;
            h9q.getClass();
            h9X W = RecyclerView.W(view);
            if (W != null) {
                RecyclerView recyclerView = h9q.R;
                int i = W.L;
                if (recyclerView.T()) {
                    W.Z = i;
                    recyclerView.f1409X.add(W);
                } else {
                    View view2 = W.f4097R;
                    WeakHashMap weakHashMap = of5.f6887R;
                    mHC.t(view2, i);
                }
                W.L = 0;
            }
        }
    }

    public final View L(int i) {
        return this.R.R.getChildAt(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4.f296R.e(r2) == false) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0024, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int O(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L_0x0004
            return r0
        L_0x0004:
            h9q r1 = r4.R
            int r1 = r1.c()
            r2 = r5
        L_0x000b:
            if (r2 >= r1) goto L_0x0027
            v_ r3 = r4.f296R
            int r3 = r3.v(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L_0x0025
        L_0x0019:
            v_ r5 = r4.f296R
            boolean r5 = r5.e(r2)
            if (r5 == 0) goto L_0x0024
            int r2 = r2 + 1
            goto L_0x0019
        L_0x0024:
            return r2
        L_0x0025:
            int r2 = r2 + r3
            goto L_0x000b
        L_0x0027:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Mk.O(int):int");
    }

    public final void R(View view, int i, boolean z) {
        int c = i < 0 ? this.R.c() : O(i);
        this.f296R.X(c, z);
        if (z) {
            m(view);
        }
        h9q h9q = this.R;
        h9q.R.addView(view, c);
        h9q.R.getClass();
        RecyclerView.W(view);
    }

    public final int X() {
        return this.R.c() - this.f295R.size();
    }

    public final int Z() {
        return this.R.c();
    }

    public final void c(int i) {
        h9X W;
        int O = O(i);
        this.f296R.O(O);
        h9q h9q = this.R;
        View childAt = h9q.R.getChildAt(O);
        if (!(childAt == null || (W = RecyclerView.W(childAt)) == null)) {
            if (!W.H() || W.P()) {
                W.v(256);
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("called detach on an already detached child ");
                sb.append(W);
                throw new IllegalArgumentException(jQ.H(h9q.R, sb));
            }
        }
        h9q.R.detachViewFromParent(O);
    }

    public final View e(int i) {
        return this.R.R.getChildAt(O(i));
    }

    public final void m(View view) {
        this.f295R.add(view);
        h9q h9q = this.R;
        h9q.getClass();
        h9X W = RecyclerView.W(view);
        if (W != null) {
            RecyclerView recyclerView = h9q.R;
            int i = W.Z;
            if (i != -1) {
                W.L = i;
            } else {
                View view2 = W.f4097R;
                WeakHashMap weakHashMap = of5.f6887R;
                W.L = mHC.c(view2);
            }
            if (recyclerView.T()) {
                W.Z = 4;
                recyclerView.f1409X.add(W);
                return;
            }
            View view3 = W.f4097R;
            WeakHashMap weakHashMap2 = of5.f6887R;
            mHC.t(view3, 4);
        }
    }

    public final String toString() {
        return this.f296R.toString() + ", hidden list:" + this.f295R.size();
    }

    public final void v(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int c = i < 0 ? this.R.c() : O(i);
        this.f296R.X(c, z);
        if (z) {
            m(view);
        }
        h9q h9q = this.R;
        h9q.getClass();
        h9X W = RecyclerView.W(view);
        if (W != null) {
            if (W.H() || W.P()) {
                W.X &= -257;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Called attach on a child which is not detached: ");
                sb.append(W);
                throw new IllegalArgumentException(jQ.H(h9q.R, sb));
            }
        }
        h9q.R.attachViewToParent(view, c, layoutParams);
    }

    public final boolean x(View view) {
        return this.f295R.contains(view);
    }
}
