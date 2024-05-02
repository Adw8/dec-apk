package defpackage;

/* renamed from: cFz  reason: default package */
/* loaded from: classes.dex */
public final class cFz extends aFk implements iv7 {
    public int O;
    public final /* synthetic */ aME R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2036R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cFz(aME ame, aOO aoo) {
        super(2, aoo);
        this.R = ame;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cFz) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e A[Catch: Exception -> 0x0057, TRY_ENTER, TryCatch #0 {Exception -> 0x0057, blocks: (B:11:0x0027, B:15:0x004e, B:16:0x0056), top: B:24:0x0027 }] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r11) {
        /*
            r10 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r10.O
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            int r1 = r10.X
            java.lang.Object r4 = r10.f2036R
            jy_ r4 = (defpackage.jy_) r4
            defpackage.jjU.o(r11)
        L_0x0013:
            r11 = r1
            goto L_0x0026
        L_0x0015:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001d:
            defpackage.jjU.o(r11)
            java.lang.Object r11 = r10.f2036R
            jy_ r11 = (defpackage.jy_) r11
            r4 = r11
            r11 = r2
        L_0x0026:
            r1 = 0
            pby[] r5 = defpackage.kxm.R     // Catch: Exception -> 0x0057
            aME r5 = r10.R     // Catch: Exception -> 0x0057
            iHI r5 = r5.f850R     // Catch: Exception -> 0x0057
            iGi r6 = defpackage.iGi.WaitLxd     // Catch: Exception -> 0x0057
            r5.c(r6, r2)     // Catch: Exception -> 0x0057
            java.io.File r5 = new java.io.File     // Catch: Exception -> 0x0057
            aME r6 = r10.R     // Catch: Exception -> 0x0057
            android.content.Context r6 = r6.R     // Catch: Exception -> 0x0057
            java.io.File r6 = r6.getFilesDir()     // Catch: Exception -> 0x0057
            java.lang.String r7 = "lxd.sock"
            r5.<init>(r6, r7)     // Catch: Exception -> 0x0057
            java.lang.String r5 = r5.getAbsolutePath()     // Catch: Exception -> 0x0057
            int r5 = dev.kdrag0n.virt.NativeLib.e(r5)     // Catch: Exception -> 0x0057
            if (r5 != r3) goto L_0x004e
            o8s r10 = defpackage.o8s.R
            return r10
        L_0x004e:
            android.system.ErrnoException r6 = new android.system.ErrnoException     // Catch: Exception -> 0x0057
            java.lang.String r7 = "lxd"
            int r5 = -r5
            r6.<init>(r7, r5)     // Catch: Exception -> 0x0057
            throw r6     // Catch: Exception -> 0x0057
        L_0x0057:
            r5 = move-exception
            r6 = 4
            java.lang.String r7 = "virtc/lxd"
            java.lang.String r8 = "Waiting for LXD..."
            defpackage.kxm.v(r7, r6, r8, r1)
            int r1 = r11 + 1
            long r6 = (long) r11
            r8 = 450(0x1c2, double:2.223E-321)
            int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r11 > 0) goto L_0x0078
            r5 = 200(0xc8, double:9.9E-322)
            r10.f2036R = r4
            r10.X = r1
            r10.O = r3
            java.lang.Object r11 = defpackage.n3x.Z(r5, r10)
            if (r11 != r0) goto L_0x0013
            return r0
        L_0x0078:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cFz.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        cFz cfz = new cFz(this.R, aoo);
        cfz.f2036R = obj;
        return cfz;
    }
}
