package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: kuM  reason: default package */
/* loaded from: classes.dex */
public final class kuM extends G5 {
    public final RecyclerView R;

    /* renamed from: R  reason: collision with other field name */
    public final i73 f5476R;

    public kuM(RecyclerView recyclerView) {
        this.R = recyclerView;
        i73 i73 = this.f5476R;
        if (i73 != null) {
            this.f5476R = i73;
        } else {
            this.f5476R = new i73(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0096 A[ADDED_TO_REGION] */
    @Override // defpackage.G5
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean L(android.view.View r3, int r4, android.os.Bundle r5) {
        /*
            r2 = this;
            boolean r3 = super.L(r3, r4, r5)
            r5 = 1
            if (r3 == 0) goto L_0x0008
            return r5
        L_0x0008:
            androidx.recyclerview.widget.RecyclerView r3 = r2.R
            boolean r0 = r3.f1417e
            r1 = 0
            if (r0 == 0) goto L_0x001e
            boolean r0 = r3.f1419m
            if (r0 != 0) goto L_0x001e
            jP r3 = r3.f1398R
            boolean r3 = r3.L()
            if (r3 == 0) goto L_0x001c
            goto L_0x001e
        L_0x001c:
            r3 = r1
            goto L_0x001f
        L_0x001e:
            r3 = r5
        L_0x001f:
            if (r3 != 0) goto L_0x00a0
            androidx.recyclerview.widget.RecyclerView r3 = r2.R
            kds r3 = r3.getLayoutManager()
            if (r3 == 0) goto L_0x00a0
            androidx.recyclerview.widget.RecyclerView r2 = r2.R
            kds r2 = r2.getLayoutManager()
            androidx.recyclerview.widget.RecyclerView r3 = r2.f5374R
            fgh r0 = r3.f1391R
            r0 = 4096(0x1000, float:5.74E-42)
            if (r4 == r0) goto L_0x006a
            r0 = 8192(0x2000, float:1.14794E-41)
            if (r4 == r0) goto L_0x003e
            r3 = r1
            r4 = r3
            goto L_0x0094
        L_0x003e:
            r4 = -1
            boolean r3 = r3.canScrollVertically(r4)
            if (r3 == 0) goto L_0x0053
            int r3 = r2.X
            int r0 = r2.z()
            int r3 = r3 - r0
            int r0 = r2.h()
            int r3 = r3 - r0
            int r3 = -r3
            goto L_0x0054
        L_0x0053:
            r3 = r1
        L_0x0054:
            androidx.recyclerview.widget.RecyclerView r0 = r2.f5374R
            boolean r4 = r0.canScrollHorizontally(r4)
            if (r4 == 0) goto L_0x0093
            int r4 = r2.e
            int r0 = r2.I()
            int r4 = r4 - r0
            int r0 = r2.u()
            int r4 = r4 - r0
            int r4 = -r4
            goto L_0x0094
        L_0x006a:
            boolean r3 = r3.canScrollVertically(r5)
            if (r3 == 0) goto L_0x007d
            int r3 = r2.X
            int r4 = r2.z()
            int r3 = r3 - r4
            int r4 = r2.h()
            int r3 = r3 - r4
            goto L_0x007e
        L_0x007d:
            r3 = r1
        L_0x007e:
            androidx.recyclerview.widget.RecyclerView r4 = r2.f5374R
            boolean r4 = r4.canScrollHorizontally(r5)
            if (r4 == 0) goto L_0x0093
            int r4 = r2.e
            int r0 = r2.I()
            int r4 = r4 - r0
            int r0 = r2.u()
            int r4 = r4 - r0
            goto L_0x0094
        L_0x0093:
            r4 = r1
        L_0x0094:
            if (r3 != 0) goto L_0x009a
            if (r4 != 0) goto L_0x009a
            r5 = r1
            goto L_0x009f
        L_0x009a:
            androidx.recyclerview.widget.RecyclerView r2 = r2.f5374R
            r2.mL(r4, r3, r5)
        L_0x009f:
            return r5
        L_0x00a0:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kuM.L(android.view.View, int, android.os.Bundle):boolean");
    }

    @Override // defpackage.G5
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (view instanceof RecyclerView) {
            RecyclerView recyclerView = this.R;
            if (!(!recyclerView.f1417e || recyclerView.f1419m || recyclerView.f1398R.L())) {
                RecyclerView recyclerView2 = (RecyclerView) view;
                if (recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().B(accessibilityEvent);
                }
            }
        }
    }

    @Override // defpackage.G5
    public final void e(View view, jG jGVar) {
        ((G5) this).R.onInitializeAccessibilityNodeInfo(view, jGVar.f4895R);
        RecyclerView recyclerView = this.R;
        if (!(!recyclerView.f1417e || recyclerView.f1419m || recyclerView.f1398R.L()) && this.R.getLayoutManager() != null) {
            kds layoutManager = this.R.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.f5374R;
            fgh fgh = recyclerView2.f1391R;
            btj btj = recyclerView2.f1385R;
            if (recyclerView2.canScrollVertically(-1) || layoutManager.f5374R.canScrollHorizontally(-1)) {
                jGVar.R(8192);
                jGVar.m(true);
            }
            if (layoutManager.f5374R.canScrollVertically(1) || layoutManager.f5374R.canScrollHorizontally(1)) {
                jGVar.R(4096);
                jGVar.m(true);
            }
            jGVar.f4895R.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(layoutManager.A(fgh, btj), layoutManager.J(fgh, btj), false, 0));
        }
    }
}
