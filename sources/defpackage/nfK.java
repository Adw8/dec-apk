package defpackage;

import android.view.View;
import android.view.ViewParent;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* renamed from: nfK  reason: default package */
/* loaded from: classes.dex */
public final class nfK extends dxh {
    public final /* synthetic */ SwipeDismissBehavior R;
    public int X = -1;
    public int e;

    public nfK(SwipeDismissBehavior swipeDismissBehavior) {
        this.R = swipeDismissBehavior;
    }

    @Override // defpackage.dxh
    public final void L(View view, int i) {
        this.X = i;
        this.e = view.getLeft();
        ViewParent parent = view.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // defpackage.dxh
    public final int R(View view, int i) {
        int i2;
        int i3;
        int width;
        WeakHashMap weakHashMap = of5.f6887R;
        boolean z = eHQ.e(view) == 1;
        int i4 = this.R.f2252R;
        if (i4 == 0) {
            if (z) {
                i3 = this.e - view.getWidth();
                i2 = this.e;
            } else {
                i3 = this.e;
                width = view.getWidth();
                i2 = width + i3;
            }
        } else if (i4 != 1) {
            i3 = this.e - view.getWidth();
            i2 = this.e + view.getWidth();
        } else if (z) {
            i3 = this.e;
            width = view.getWidth();
            i2 = width + i3;
        } else {
            i3 = this.e - view.getWidth();
            i2 = this.e;
        }
        return Math.min(Math.max(i3, i), i2);
    }

    @Override // defpackage.dxh
    public final boolean U(View view, int i) {
        int i2 = this.X;
        return (i2 == -1 || i2 == i) && this.R.t(view);
    }

    @Override // defpackage.dxh
    public final void Z(int i) {
        this.R.getClass();
    }

    @Override // defpackage.dxh
    public final int e(View view) {
        return view.getWidth();
    }

    @Override // defpackage.dxh
    public final void m(View view, int i, int i2) {
        float width = (((float) view.getWidth()) * this.R.v) + ((float) this.e);
        float width2 = (((float) view.getWidth()) * this.R.c) + ((float) this.e);
        float f = (float) i;
        if (f <= width) {
            view.setAlpha(1.0f);
        } else if (f >= width2) {
            view.setAlpha(0.0f);
        } else {
            view.setAlpha(Math.min(Math.max(0.0f, 1.0f - ((f - width) / (width2 - width))), 1.0f));
        }
    }

    @Override // defpackage.dxh
    public final int v(View view, int i) {
        return view.getTop();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0052, code lost:
        if (java.lang.Math.abs(r8.getLeft() - r7.e) >= java.lang.Math.round(((float) r8.getWidth()) * r7.R.R)) goto L_0x0054;
     */
    @Override // defpackage.dxh
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(android.view.View r8, float r9, float r10) {
        /*
            r7 = this;
            r10 = -1
            r7.X = r10
            int r10 = r8.getWidth()
            r0 = 0
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0039
            java.util.WeakHashMap r4 = defpackage.of5.f6887R
            int r4 = defpackage.eHQ.e(r8)
            if (r4 != r2) goto L_0x0018
            r4 = r2
            goto L_0x0019
        L_0x0018:
            r4 = r3
        L_0x0019:
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r7.R
            int r5 = r5.f2252R
            r6 = 2
            if (r5 != r6) goto L_0x0021
            goto L_0x0054
        L_0x0021:
            if (r5 != 0) goto L_0x002d
            if (r4 == 0) goto L_0x002a
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            goto L_0x0054
        L_0x002a:
            if (r1 <= 0) goto L_0x0056
            goto L_0x0054
        L_0x002d:
            if (r5 != r2) goto L_0x0056
            if (r4 == 0) goto L_0x0034
            if (r1 <= 0) goto L_0x0056
            goto L_0x0054
        L_0x0034:
            int r1 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            goto L_0x0054
        L_0x0039:
            int r1 = r8.getLeft()
            int r4 = r7.e
            int r1 = r1 - r4
            int r4 = r8.getWidth()
            float r4 = (float) r4
            com.google.android.material.behavior.SwipeDismissBehavior r5 = r7.R
            float r5 = r5.R
            float r4 = r4 * r5
            int r4 = java.lang.Math.round(r4)
            int r1 = java.lang.Math.abs(r1)
            if (r1 < r4) goto L_0x0056
        L_0x0054:
            r1 = r2
            goto L_0x0057
        L_0x0056:
            r1 = r3
        L_0x0057:
            if (r1 == 0) goto L_0x006d
            int r9 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r9 < 0) goto L_0x0068
            int r9 = r8.getLeft()
            int r0 = r7.e
            if (r9 >= r0) goto L_0x0066
            goto L_0x0068
        L_0x0066:
            int r0 = r0 + r10
            goto L_0x0070
        L_0x0068:
            int r9 = r7.e
            int r0 = r9 - r10
            goto L_0x0070
        L_0x006d:
            int r0 = r7.e
            r2 = r3
        L_0x0070:
            com.google.android.material.behavior.SwipeDismissBehavior r9 = r7.R
            fen r9 = r9.f2253R
            int r10 = r8.getTop()
            boolean r9 = r9.g(r0, r10)
            if (r9 == 0) goto L_0x008b
            iV4 r9 = new iV4
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r7.R
            r9.<init>(r7, r8, r2)
            java.util.WeakHashMap r7 = defpackage.of5.f6887R
            defpackage.mHC.C(r8, r9)
            goto L_0x0092
        L_0x008b:
            if (r2 == 0) goto L_0x0092
            com.google.android.material.behavior.SwipeDismissBehavior r7 = r7.R
            r7.getClass()
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nfK.x(android.view.View, float, float):void");
    }
}
