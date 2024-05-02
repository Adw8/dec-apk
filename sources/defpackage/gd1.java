package defpackage;

/* renamed from: gd1  reason: default package */
/* loaded from: classes.dex */
public final class gd1 {
    public final h0T R;

    /* renamed from: R  reason: collision with other field name */
    public final lR3 f3829R;

    /* renamed from: R  reason: collision with other field name */
    public final p2E f3830R;
    public final lR3 v;

    public gd1(lR3 lr3, lR3 lr32, h0T h0t, p2E p2e) {
        this.f3829R = lr3;
        this.v = lr32;
        this.R = h0t;
        this.f3830R = p2e;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object R(defpackage.jy_ r10, defpackage.aOO r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.jMD
            if (r0 == 0) goto L_0x0013
            r0 = r11
            jMD r0 = (defpackage.jMD) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            jMD r0 = new jMD
            r0.<init>(r9, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f4907R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003e
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            defpackage.jjU.o(r11)
            goto L_0x007c
        L_0x002b:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0033:
            jy_ r9 = r0.f4908R
            gd1 r10 = r0.R
            defpackage.jjU.o(r11)
            r8 = r10
            r10 = r9
            r9 = r8
            goto L_0x0061
        L_0x003e:
            defpackage.jjU.o(r11)
            h0T r11 = r9.R
            java.lang.Object r11 = r11.getValue()
            c03 r11 = (defpackage.c03) r11
            if (r11 == 0) goto L_0x0066
            p2E r2 = r9.f3830R
            if (r2 == 0) goto L_0x0061
            p1v r6 = new p1v
            r6.<init>(r11)
            r0.R = r9
            r0.f4908R = r10
            r0.e = r4
            java.lang.Object r11 = r2.R(r6, r0)
            if (r11 != r1) goto L_0x0061
            return r1
        L_0x0061:
            h0T r11 = r9.R
            r11.R(r5)
        L_0x0066:
            lR3 r9 = r9.v
            long r6 = defpackage.d_E.v
            d_E r11 = new d_E
            r11.<init>(r6)
            r0.R = r5
            r0.f4908R = r5
            r0.e = r3
            java.lang.Object r9 = r9.y(r10, r11, r0)
            if (r9 != r1) goto L_0x007c
            return r1
        L_0x007c:
            o8s r9 = defpackage.o8s.R
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd1.R(jy_, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0081 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.jy_ r9, defpackage.m8l r10, defpackage.aOO r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.ata
            if (r0 == 0) goto L_0x0013
            r0 = r11
            ata r0 = (defpackage.ata) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            ata r0 = new ata
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f1483R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x0040
            if (r2 == r4) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            defpackage.jjU.o(r11)
            goto L_0x0082
        L_0x002b:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0033:
            m8l r8 = r0.f1485R
            jy_ r9 = r0.f1484R
            gd1 r10 = r0.R
            defpackage.jjU.o(r11)
            r7 = r10
            r10 = r8
            r8 = r7
            goto L_0x0065
        L_0x0040:
            defpackage.jjU.o(r11)
            h0T r11 = r8.R
            java.lang.Object r11 = r11.getValue()
            c03 r11 = (defpackage.c03) r11
            if (r11 == 0) goto L_0x006a
            p2E r2 = r8.f3830R
            if (r2 == 0) goto L_0x0065
            cny r6 = new cny
            r6.<init>(r11)
            r0.R = r8
            r0.f1484R = r9
            r0.f1485R = r10
            r0.e = r4
            java.lang.Object r11 = r2.R(r6, r0)
            if (r11 != r1) goto L_0x0065
            return r1
        L_0x0065:
            h0T r11 = r8.R
            r11.R(r5)
        L_0x006a:
            lR3 r8 = r8.v
            long r10 = r10.R
            d_E r2 = new d_E
            r2.<init>(r10)
            r0.R = r5
            r0.f1484R = r5
            r0.f1485R = r5
            r0.e = r3
            java.lang.Object r8 = r8.y(r9, r2, r0)
            if (r8 != r1) goto L_0x0082
            return r1
        L_0x0082:
            o8s r8 = defpackage.o8s.R
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd1.c(jy_, m8l, aOO):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b4 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object v(defpackage.jy_ r9, defpackage.jvU r10, defpackage.aOO r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof defpackage.nUM
            if (r0 == 0) goto L_0x0013
            r0 = r11
            nUM r0 = (defpackage.nUM) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            nUM r0 = new nUM
            r0.<init>(r8, r11)
        L_0x0018:
            java.lang.Object r11 = r0.f6409R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x004c
            if (r2 == r5) goto L_0x0042
            if (r2 == r4) goto L_0x0036
            if (r2 != r3) goto L_0x002e
            defpackage.jjU.o(r11)
            goto L_0x00b5
        L_0x002e:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0036:
            c03 r8 = r0.R
            jvU r9 = r0.f6410R
            jy_ r10 = r0.f6411R
            gd1 r2 = r0.f6408R
            defpackage.jjU.o(r11)
            goto L_0x0090
        L_0x0042:
            jvU r10 = r0.f6410R
            jy_ r9 = r0.f6411R
            gd1 r8 = r0.f6408R
            defpackage.jjU.o(r11)
            goto L_0x0071
        L_0x004c:
            defpackage.jjU.o(r11)
            h0T r11 = r8.R
            java.lang.Object r11 = r11.getValue()
            c03 r11 = (defpackage.c03) r11
            if (r11 == 0) goto L_0x0071
            p2E r2 = r8.f3830R
            if (r2 == 0) goto L_0x0071
            p1v r6 = new p1v
            r6.<init>(r11)
            r0.f6408R = r8
            r0.f6411R = r9
            r0.f6410R = r10
            r0.e = r5
            java.lang.Object r11 = r2.R(r6, r0)
            if (r11 != r1) goto L_0x0071
            return r1
        L_0x0071:
            c03 r11 = new c03
            r11.<init>()
            p2E r2 = r8.f3830R
            if (r2 == 0) goto L_0x0095
            r0.f6408R = r8
            r0.f6411R = r9
            r0.f6410R = r10
            r0.R = r11
            r0.e = r4
            java.lang.Object r2 = r2.R(r11, r0)
            if (r2 != r1) goto L_0x008b
            return r1
        L_0x008b:
            r2 = r8
            r8 = r11
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0090:
            r11 = r8
            r8 = r2
            r7 = r10
            r10 = r9
            r9 = r7
        L_0x0095:
            h0T r2 = r8.R
            r2.R(r11)
            lR3 r8 = r8.f3829R
            long r10 = r10.R
            aWo r2 = new aWo
            r2.<init>(r10)
            r10 = 0
            r0.f6408R = r10
            r0.f6411R = r10
            r0.f6410R = r10
            r0.R = r10
            r0.e = r3
            java.lang.Object r8 = r8.y(r9, r2, r0)
            if (r8 != r1) goto L_0x00b5
            return r1
        L_0x00b5:
            o8s r8 = defpackage.o8s.R
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gd1.v(jy_, jvU, aOO):java.lang.Object");
    }
}
