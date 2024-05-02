package defpackage;

import android.view.View;
import androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;

/* renamed from: phY  reason: default package */
/* loaded from: classes.dex */
public final class phY extends aFk implements iv7 {
    public final /* synthetic */ View R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 f7177R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ fLL f7178R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f7179R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nWW f7180R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nu_ f7181R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public phY(nWW nww, fLL fll, nu_ nu_, WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2, View view, aOO aoo) {
        super(2, aoo);
        this.f7180R = nww;
        this.f7178R = fll;
        this.f7181R = nu_;
        this.f7177R = windowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2;
        this.R = view;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((phY) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b6  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r9) {
        /*
            r8 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            java.lang.Object r0 = r8.f7179R
            pd2 r0 = (defpackage.pd2) r0
            defpackage.jjU.o(r9)     // Catch: all -> 0x0013
            goto L_0x008e
        L_0x0013:
            r9 = move-exception
            goto L_0x00b4
        L_0x0016:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001e:
            defpackage.jjU.o(r9)
            java.lang.Object r9 = r8.f7179R
            jy_ r9 = (defpackage.jy_) r9
            nWW r1 = r8.f7180R     // Catch: all -> 0x00b2
            java.lang.Object r1 = r1.R     // Catch: all -> 0x00b2
            fql r1 = (defpackage.fql) r1     // Catch: all -> 0x00b2
            if (r1 == 0) goto L_0x005a
            android.view.View r4 = r8.R     // Catch: all -> 0x00b2
            android.content.Context r4 = r4.getContext()     // Catch: all -> 0x00b2
            android.content.Context r4 = r4.getApplicationContext()     // Catch: all -> 0x00b2
            hUt r4 = defpackage.kNb.R(r4)     // Catch: all -> 0x00b2
            java.lang.Object r5 = r4.getValue()     // Catch: all -> 0x00b2
            java.lang.Number r5 = (java.lang.Number) r5     // Catch: all -> 0x00b2
            float r5 = r5.floatValue()     // Catch: all -> 0x00b2
            oST r6 = r1.R     // Catch: all -> 0x00b2
            java.lang.Float r5 = java.lang.Float.valueOf(r5)     // Catch: all -> 0x00b2
            r6.R(r5)     // Catch: all -> 0x00b2
            ftZ r5 = new ftZ     // Catch: all -> 0x00b2
            r5.<init>(r4, r1, r2)     // Catch: all -> 0x00b2
            r1 = 3
            r4 = 0
            o7V r9 = defpackage.l6.z(r9, r2, r4, r5, r1)     // Catch: all -> 0x00b2
            goto L_0x005b
        L_0x005a:
            r9 = r2
        L_0x005b:
            fLL r1 = r8.f7178R     // Catch: all -> 0x00ad
            r8.f7179R = r9     // Catch: all -> 0x00ad
            r8.X = r3     // Catch: all -> 0x00ad
            r1.getClass()     // Catch: all -> 0x00ad
            bkM r3 = new bkM     // Catch: all -> 0x00ad
            r3.<init>(r1, r2)     // Catch: all -> 0x00ad
            nbD r4 = r8.R     // Catch: all -> 0x00ad
            dq r5 = defpackage.dq.f2877O     // Catch: all -> 0x00ad
            hdJ r4 = r4.O(r5)     // Catch: all -> 0x00ad
            kJx r4 = (defpackage.kJx) r4     // Catch: all -> 0x00ad
            if (r4 == 0) goto L_0x00a1
            yH r5 = r1.f3393R     // Catch: all -> 0x00ad
            eLT r6 = new eLT     // Catch: all -> 0x00ad
            r6.<init>(r1, r3, r4, r2)     // Catch: all -> 0x00ad
            java.lang.Object r1 = defpackage.l6.a(r5, r6, r8)     // Catch: all -> 0x00ad
            if (r1 != r0) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            o8s r1 = defpackage.o8s.R     // Catch: all -> 0x00ad
        L_0x0085:
            if (r1 != r0) goto L_0x0088
            goto L_0x008a
        L_0x0088:
            o8s r1 = defpackage.o8s.R     // Catch: all -> 0x00ad
        L_0x008a:
            if (r1 != r0) goto L_0x008d
            return r0
        L_0x008d:
            r0 = r9
        L_0x008e:
            if (r0 == 0) goto L_0x0093
            r0.c(r2)
        L_0x0093:
            nu_ r9 = r8.f7181R
            m4i r9 = r9.O()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r8 = r8.f7177R
            r9.v(r8)
            o8s r8 = defpackage.o8s.R
            return r8
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: all -> 0x00ad
            java.lang.String r1 = "A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext."
            java.lang.String r1 = r1.toString()     // Catch: all -> 0x00ad
            r0.<init>(r1)     // Catch: all -> 0x00ad
            throw r0     // Catch: all -> 0x00ad
        L_0x00ad:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L_0x00b4
        L_0x00b2:
            r9 = move-exception
            r0 = r2
        L_0x00b4:
            if (r0 == 0) goto L_0x00b9
            r0.c(r2)
        L_0x00b9:
            nu_ r0 = r8.f7181R
            m4i r0 = r0.O()
            androidx.compose.ui.platform.WindowRecomposer_androidKt$createLifecycleAwareWindowRecomposer$2 r8 = r8.f7177R
            r0.v(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.phY.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        phY phy = new phY(this.f7180R, this.f7178R, this.f7181R, this.f7177R, this.R, aoo);
        phy.f7179R = obj;
        return phy;
    }
}
