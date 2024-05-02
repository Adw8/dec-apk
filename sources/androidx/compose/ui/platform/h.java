package androidx.compose.ui.platform;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class h {
    public static final ViewGroup.LayoutParams R = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.fJK R(defpackage.LG r8, defpackage.hYA r9, defpackage.dNH r10) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = defpackage.bpr.R
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L_0x003d
            r0 = -1
            r4 = 6
            nJ r0 = defpackage.jjU.R(r0, r3, r4)
            bV5 r5 = defpackage.hk.f4359R
            java.lang.Object r5 = r5.getValue()
            nbD r5 = (defpackage.nbD) r5
            m3D r5 = defpackage.jjU.v(r5)
            gAR r6 = new gAR
            r6.<init>(r0, r3)
            r7 = 3
            defpackage.l6.z(r5, r3, r1, r6, r7)
            mox r5 = new mox
            r5.<init>(r4, r0)
            java.lang.Object r0 = defpackage.jwU.f5150R
            monitor-enter(r0)
            java.util.ArrayList r4 = defpackage.jwU.v     // Catch: all -> 0x003a
            r4.add(r5)     // Catch: all -> 0x003a
            monitor-exit(r0)
            nqF r0 = defpackage.nqF.Z
            defpackage.jwU.e(r0)
            goto L_0x003d
        L_0x003a:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        L_0x003d:
            int r0 = r8.getChildCount()
            if (r0 <= 0) goto L_0x004e
            android.view.View r0 = r8.getChildAt(r1)
            boolean r1 = r0 instanceof androidx.compose.ui.platform.AndroidComposeView
            if (r1 == 0) goto L_0x0051
            androidx.compose.ui.platform.AndroidComposeView r0 = (androidx.compose.ui.platform.AndroidComposeView) r0
            goto L_0x0052
        L_0x004e:
            r8.removeAllViews()
        L_0x0051:
            r0 = r3
        L_0x0052:
            if (r0 != 0) goto L_0x0066
            androidx.compose.ui.platform.AndroidComposeView r0 = new androidx.compose.ui.platform.AndroidComposeView
            android.content.Context r1 = r8.getContext()
            r0.<init>(r1)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r4 = androidx.compose.ui.platform.h.R
            r8.addView(r1, r4)
        L_0x0066:
            md9 r8 = defpackage.md9.R
            java.util.Map r8 = r8.R(r0)
            boolean r8 = r8.isEmpty()
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0098
            r8 = 2131296504(0x7f0900f8, float:1.8210927E38)
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            java.util.Set r1 = java.util.Collections.newSetFromMap(r1)
            r0.setTag(r8, r1)
            java.lang.Class<mWb> r8 = defpackage.mWb.class
            java.lang.String r1 = "R"
            java.lang.reflect.Field r8 = r8.getDeclaredField(r1)     // Catch: Exception -> 0x0091
            r8.setAccessible(r2)     // Catch: Exception -> 0x0091
            r8.setBoolean(r3, r2)     // Catch: Exception -> 0x0091
            goto L_0x0098
        L_0x0091:
            java.lang.String r8 = "Wrapper"
            java.lang.String r1 = "Could not access isDebugInspectorInfoEnabled. Please set explicitly."
            android.util.Log.w(r8, r1)
        L_0x0098:
            hdZ r8 = new hdZ
            fue r1 = r0.getRoot()
            r8.<init>(r1)
            java.lang.Object r1 = defpackage.aEl.R
            hAe r1 = new hAe
            r1.<init>(r9, r8)
            android.view.View r8 = r0.getView()
            r9 = 2131296814(0x7f09022e, float:1.8211555E38)
            java.lang.Object r8 = r8.getTag(r9)
            boolean r2 = r8 instanceof androidx.compose.ui.platform.WrappedComposition
            if (r2 == 0) goto L_0x00ba
            r3 = r8
            androidx.compose.ui.platform.WrappedComposition r3 = (androidx.compose.ui.platform.WrappedComposition) r3
        L_0x00ba:
            if (r3 != 0) goto L_0x00c8
            androidx.compose.ui.platform.WrappedComposition r3 = new androidx.compose.ui.platform.WrappedComposition
            r3.<init>(r0, r1)
            android.view.View r8 = r0.getView()
            r8.setTag(r9, r3)
        L_0x00c8:
            r3.v(r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.h.R(LG, hYA, dNH):fJK");
    }
}
