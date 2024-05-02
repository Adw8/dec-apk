package defpackage;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.lang.ref.WeakReference;

/* renamed from: u7  reason: default package */
/* loaded from: classes.dex */
public final class u7 extends dxh {
    public final /* synthetic */ BottomSheetBehavior R;

    public u7(BottomSheetBehavior bottomSheetBehavior) {
        this.R = bottomSheetBehavior;
    }

    @Override // defpackage.dxh
    public final int R(View view, int i) {
        return view.getLeft();
    }

    @Override // defpackage.dxh
    public final boolean U(View view, int i) {
        BottomSheetBehavior bottomSheetBehavior = this.R;
        int i2 = bottomSheetBehavior.N;
        if (i2 == 1 || bottomSheetBehavior.f2282g) {
            return false;
        }
        if (i2 == 3 && bottomSheetBehavior.t == i) {
            WeakReference weakReference = bottomSheetBehavior.f2286v;
            View view2 = weakReference != null ? (View) weakReference.get() : null;
            if (view2 != null && view2.canScrollVertically(-1)) {
                return false;
            }
        }
        System.currentTimeMillis();
        WeakReference weakReference2 = this.R.f2270R;
        return weakReference2 != null && weakReference2.get() == view;
    }

    @Override // defpackage.dxh
    public final int X() {
        BottomSheetBehavior bottomSheetBehavior = this.R;
        return bottomSheetBehavior.f2275U ? bottomSheetBehavior.y : bottomSheetBehavior.C;
    }

    @Override // defpackage.dxh
    public final void Z(int i) {
        if (i == 1) {
            BottomSheetBehavior bottomSheetBehavior = this.R;
            if (bottomSheetBehavior.f2259N) {
                bottomSheetBehavior.u(1);
            }
        }
    }

    @Override // defpackage.dxh
    public final void m(View view, int i, int i2) {
        this.R.V(i2);
    }

    @Override // defpackage.dxh
    public final int v(View view, int i) {
        int J = this.R.J();
        BottomSheetBehavior bottomSheetBehavior = this.R;
        return iTI.X(i, J, bottomSheetBehavior.f2275U ? bottomSheetBehavior.y : bottomSheetBehavior.C);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x007d, code lost:
        if (java.lang.Math.abs(r5.getTop() - r4.R.J()) < java.lang.Math.abs(r5.getTop() - r4.R.U)) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d2, code lost:
        if (java.lang.Math.abs(r6 - r7.H) < java.lang.Math.abs(r6 - r4.R.C)) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001e, code lost:
        if (r6 > r4.R.U) goto L_0x0101;
     */
    @Override // defpackage.dxh
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void x(android.view.View r5, float r6, float r7) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u7.x(android.view.View, float, float):void");
    }
}
