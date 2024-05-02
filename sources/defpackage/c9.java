package defpackage;

import dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService;

/* renamed from: c9  reason: default package */
/* loaded from: classes.dex */
public final class c9 extends aFk implements iv7 {
    public final /* synthetic */ AdbPairingService R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1982R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ String f1983R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public c9(AdbPairingService adbPairingService, String str, aOO aoo) {
        super(2, aoo);
        this.R = adbPairingService;
        this.f1983R = str;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((c9) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007f  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r9) {
        /*
            r8 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 1
            r3 = 6
            r4 = 2
            if (r1 == 0) goto L_0x002d
            if (r1 == r2) goto L_0x0021
            if (r1 != r4) goto L_0x0019
            java.lang.Object r0 = r8.f1982R
            jy_ r0 = (defpackage.jy_) r0
            defpackage.jjU.o(r9)
            mwl r9 = (defpackage.mwl) r9
            java.lang.Object r9 = r9.R
            goto L_0x006b
        L_0x0019:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0021:
            java.lang.Object r1 = r8.f1982R
            jy_ r1 = (defpackage.jy_) r1
            defpackage.jjU.o(r9)
            mwl r9 = (defpackage.mwl) r9
            java.lang.Object r9 = r9.R
            goto L_0x004a
        L_0x002d:
            defpackage.jjU.o(r9)
            java.lang.Object r9 = r8.f1982R
            jy_ r9 = (defpackage.jy_) r9
            dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r1 = r8.R
            gh r1 = r1.Z()
            java.lang.String r5 = r8.f1983R
            r8.f1982R = r9
            r8.X = r2
            java.lang.Object r1 = r1.e(r5, r8)
            if (r1 != r0) goto L_0x0047
            return r0
        L_0x0047:
            r7 = r1
            r1 = r9
            r9 = r7
        L_0x004a:
            pby[] r5 = defpackage.kxm.R
            boolean r5 = r9 instanceof defpackage.bvw
            r6 = r5 ^ 1
            if (r6 == 0) goto L_0x00aa
            if (r5 == 0) goto L_0x0055
            r9 = 0
        L_0x0055:
            java.lang.Boolean r5 = java.lang.Boolean.TRUE
            boolean r9 = defpackage.n3x.v(r9, r5)
            if (r9 == 0) goto L_0x009b
            dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r9 = r8.R
            r8.f1982R = r1
            r8.X = r4
            java.lang.Object r9 = dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService.L(r9, r8)
            if (r9 != r0) goto L_0x006a
            return r0
        L_0x006a:
            r0 = r1
        L_0x006b:
            boolean r1 = r9 instanceof defpackage.bvw
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x007f
            dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r8 = r8.R
            ivW r8 = r8.f2736R
            oMu r9 = new oMu
            cY r0 = defpackage.cY.Success
            r9.<init>(r0)
            r8.H(r9)
            goto L_0x00c5
        L_0x007f:
            java.lang.Throwable r9 = defpackage.mwl.R(r9)
            java.lang.String r0 = defpackage.cUF.v(r0)
            java.lang.String r1 = "Failed to run setup"
            defpackage.kxm.v(r0, r3, r1, r9)
            dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r8 = r8.R
            ivW r8 = r8.f2736R
            oMu r9 = new oMu
            cY r0 = defpackage.cY.CommandError
            r9.<init>(r0)
            r8.H(r9)
            goto L_0x00c5
        L_0x009b:
            dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r8 = r8.R
            ivW r8 = r8.f2736R
            oMu r9 = new oMu
            cY r0 = defpackage.cY.WrongCode
            r9.<init>(r0)
            r8.H(r9)
            goto L_0x00c5
        L_0x00aa:
            java.lang.Throwable r9 = defpackage.mwl.R(r9)
            java.lang.String r0 = defpackage.cUF.v(r1)
            java.lang.String r1 = "Pairing failed"
            defpackage.kxm.v(r0, r3, r1, r9)
            dev.kdrag0n.virtcontainer.adb.pairing.AdbPairingService r8 = r8.R
            ivW r8 = r8.f2736R
            oMu r9 = new oMu
            cY r0 = defpackage.cY.PairingError
            r9.<init>(r0)
            r8.H(r9)
        L_0x00c5:
            o8s r8 = defpackage.o8s.R
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c9.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        c9 c9Var = new c9(this.R, this.f1983R, aoo);
        c9Var.f1982R = obj;
        return c9Var;
    }
}
