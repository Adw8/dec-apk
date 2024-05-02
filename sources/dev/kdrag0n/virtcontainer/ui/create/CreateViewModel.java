package dev.kdrag0n.virtcontainer.ui.create;

/* loaded from: classes.dex */
public final class CreateViewModel extends kvj {
    public final aME R;

    /* renamed from: R  reason: collision with other field name */
    public final j2f f2747R;

    /* renamed from: R  reason: collision with other field name */
    public final ivW f2746R = g4x.O(null);

    /* renamed from: v  reason: collision with other field name */
    public final ivW f2748v = g4x.O(Boolean.FALSE);
    public final ivW c = g4x.O(null);

    /* renamed from: R  reason: collision with other field name */
    public final bLS f2745R = pip.R(0, 0, null, 7);
    public final ivW e = g4x.O(fcD.R);
    public final bLS v = pip.R(0, 0, null, 7);

    public CreateViewModel(aME ame, j2f j2f) {
        this.R = ame;
        this.f2747R = j2f;
        l6.z(gvP.o(this), null, 0, new pj2(this, null), 3);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object e(dev.kdrag0n.virtcontainer.ui.create.CreateViewModel r6, defpackage.aOO r7) {
        /*
            r6.getClass()
            boolean r0 = r7 instanceof defpackage.nA0
            if (r0 == 0) goto L_0x0016
            r0 = r7
            nA0 r0 = (defpackage.nA0) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x001b
        L_0x0016:
            nA0 r0 = new nA0
            r0.<init>(r6, r7)
        L_0x001b:
            java.lang.Object r7 = r0.f6333R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0034
            if (r2 != r3) goto L_0x002c
            dev.kdrag0n.virtcontainer.ui.create.CreateViewModel r6 = r0.R
            defpackage.jjU.o(r7)
            goto L_0x004d
        L_0x002c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0034:
            defpackage.jjU.o(r7)
            j2f r7 = r6.f2747R
            dev.kdrag0n.virt.control.SysRunCommand r2 = new dev.kdrag0n.virt.control.SysRunCommand
            fcD r4 = defpackage.fcD.R
            java.lang.String r5 = "/opt/vc/prep-nixos.sh"
            r2.<init>(r5, r4)
            r0.R = r6
            r0.e = r3
            java.lang.Object r7 = r7.c(r2, r0)
            if (r7 != r1) goto L_0x004d
            goto L_0x006f
        L_0x004d:
            dev.kdrag0n.virt.control.SysRunCommandResponse r7 = (dev.kdrag0n.virt.control.SysRunCommandResponse) r7
            r0 = 0
            r1 = 4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Prep NixOS: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.lang.String r6 = defpackage.cUF.v(r6)
            defpackage.kxm.v(r6, r1, r2, r0)
            int r6 = r7.R
            if (r6 != 0) goto L_0x0070
            o8s r1 = defpackage.o8s.R
        L_0x006f:
            return r1
        L_0x0070:
            java.lang.Exception r6 = new java.lang.Exception
            java.lang.String r7 = r7.v
            r6.<init>(r7)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: dev.kdrag0n.virtcontainer.ui.create.CreateViewModel.e(dev.kdrag0n.virtcontainer.ui.create.CreateViewModel, aOO):java.lang.Object");
    }
}
