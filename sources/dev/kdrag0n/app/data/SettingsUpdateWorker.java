package dev.kdrag0n.app.data;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;

/* loaded from: classes.dex */
public final class SettingsUpdateWorker extends CoroutineWorker {
    public final m5f R;

    public SettingsUpdateWorker(Context context, WorkerParameters workerParameters, m5f m5f) {
        super(context, workerParameters);
        this.R = m5f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    @Override // androidx.work.CoroutineWorker
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object L(defpackage.aOO r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.l4l
            if (r0 == 0) goto L_0x0013
            r0 = r5
            l4l r0 = (defpackage.l4l) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            l4l r0 = new l4l
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f5578R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x002f
            if (r2 != r3) goto L_0x0027
            defpackage.jjU.o(r5)
            goto L_0x003d
        L_0x0027:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x002f:
            defpackage.jjU.o(r5)
            m5f r4 = r4.R
            r0.e = r3
            java.lang.Object r4 = r4.O(r0)
            if (r4 != r1) goto L_0x003d
            return r1
        L_0x003d:
            n6o r4 = new n6o
            g2m r5 = defpackage.g2m.R
            r4.<init>(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.kdrag0n.app.data.SettingsUpdateWorker.L(aOO):java.lang.Object");
    }
}
