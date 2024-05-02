package defpackage;

import dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel;

/* renamed from: kB1  reason: default package */
/* loaded from: classes.dex */
public final class kB1 extends aFk implements iv7 {
    public final /* synthetic */ RootSettingsViewModel R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f5204R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kB1(RootSettingsViewModel rootSettingsViewModel, aOO aoo) {
        super(2, aoo);
        this.R = rootSettingsViewModel;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((kB1) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x009b  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r7) {
        /*
            r6 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r6.X
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r0 = r6.f5204R
            jy_ r0 = (defpackage.jy_) r0
            defpackage.jjU.o(r7)     // Catch: Exception -> 0x0011
            goto L_0x0053
        L_0x0011:
            r7 = move-exception
            goto L_0x0049
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001b:
            defpackage.jjU.o(r7)
            java.lang.Object r7 = r6.f5204R
            jy_ r7 = (defpackage.jy_) r7
            dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel r1 = r6.R     // Catch: Exception -> 0x0045
            iHI r1 = r1.f2782R     // Catch: Exception -> 0x0045
            r6.f5204R = r7     // Catch: Exception -> 0x0045
            r6.X = r2     // Catch: Exception -> 0x0045
            r1.e()     // Catch: Exception -> 0x0045
            i4m r1 = r1.f4523R     // Catch: Exception -> 0x0045
            cMC r3 = new cMC     // Catch: Exception -> 0x0045
            r4 = 2
            r3.<init>(r4, r1)     // Catch: Exception -> 0x0045
            lIh r1 = defpackage.l6.E(r3)     // Catch: Exception -> 0x0045
            java.lang.Object r1 = defpackage.l6.B(r1, r6)     // Catch: Exception -> 0x0045
            if (r1 != r0) goto L_0x0040
            goto L_0x0042
        L_0x0040:
            o8s r1 = defpackage.o8s.R     // Catch: Exception -> 0x0045
        L_0x0042:
            if (r1 != r0) goto L_0x0053
            return r0
        L_0x0045:
            r0 = move-exception
            r5 = r0
            r0 = r7
            r7 = r5
        L_0x0049:
            r1 = 6
            java.lang.String r0 = defpackage.cUF.v(r0)
            java.lang.String r3 = "Failed to shut down before apply rebirth "
            defpackage.kxm.v(r0, r1, r3, r7)
        L_0x0053:
            dev.kdrag0n.virtcontainer.ui.settings.root.RootSettingsViewModel r6 = r6.R
            android.content.Context r6 = r6.f2779R
            int r7 = com.jakewharton.processphoenix.ProcessPhoenix.e
            android.content.Intent[] r7 = new android.content.Intent[r2]
            java.lang.String r0 = r6.getPackageName()
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            android.content.Intent r1 = r1.getLaunchIntentForPackage(r0)
            if (r1 == 0) goto L_0x009b
            r0 = 0
            r7[r0] = r1
            r0 = 268468224(0x10008000, float:2.5342157E-29)
            r1.addFlags(r0)
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<com.jakewharton.processphoenix.ProcessPhoenix> r1 = com.jakewharton.processphoenix.ProcessPhoenix.class
            r0.<init>(r6, r1)
            r1 = 268435456(0x10000000, float:2.5243549E-29)
            r0.addFlags(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.List r7 = java.util.Arrays.asList(r7)
            r1.<init>(r7)
            java.lang.String r7 = "phoenix_restart_intents"
            r0.putParcelableArrayListExtra(r7, r1)
            int r7 = android.os.Process.myPid()
            java.lang.String r1 = "phoenix_main_process_pid"
            r0.putExtra(r1, r7)
            r6.startActivity(r0)
            o8s r6 = defpackage.o8s.R
            return r6
        L_0x009b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Unable to determine default activity for "
            java.lang.String r1 = ". Does an activity specify the DEFAULT category in its intent filter?"
            java.lang.String r7 = defpackage.jQ.C(r7, r0, r1)
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kB1.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        kB1 kb1 = new kB1(this.R, aoo);
        kb1.f5204R = obj;
        return kb1;
    }
}
