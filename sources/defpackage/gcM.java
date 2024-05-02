package defpackage;

/* renamed from: gcM  reason: default package */
/* loaded from: classes.dex */
public final class gcM extends pp5 implements iv7 {
    public final /* synthetic */ aqk R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f3803R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3804R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gcM(aqk aqk, dH9 dh9, aOO aoo) {
        super(aoo);
        this.R = aqk;
        this.f3803R = dh9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gcM) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x004a A[SYNTHETIC] */
    @Override // defpackage.C2
    public final java.lang.Object O(java.lang.Object r13) {
        /*
            r12 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r12.X
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r1 = r12.f3804R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r13)
            goto L_0x002c
        L_0x0011:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0019:
            defpackage.jjU.o(r13)
            java.lang.Object r13 = r12.f3804R
            lAs r13 = (defpackage.lAs) r13
            r1 = r13
        L_0x0021:
            r12.f3804R = r1
            r12.X = r2
            java.lang.Object r13 = defpackage.jzg.R(r1, r12)
            if (r13 != r0) goto L_0x002c
            return r0
        L_0x002c:
            pdm r13 = (defpackage.pdm) r13
            java.util.List r3 = r13.f7140R
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L_0x0036:
            if (r6 >= r4) goto L_0x004a
            java.lang.Object r7 = r3.get(r6)
            phU r7 = (defpackage.phU) r7
            boolean r7 = r7.v()
            r7 = r7 ^ r2
            if (r7 != 0) goto L_0x0047
            r3 = r5
            goto L_0x004b
        L_0x0047:
            int r6 = r6 + 1
            goto L_0x0036
        L_0x004a:
            r3 = r2
        L_0x004b:
            if (r3 == 0) goto L_0x0021
            aqk r3 = r12.R
            dH9 r4 = r12.f3803R
            iTB r6 = r1.v
            long r6 = r6.R
            hw1 r3 = (defpackage.hw1) r3
            r3.getClass()
            java.util.List r3 = r13.f7140R
            long r6 = defpackage.aWo.v
            aWo r8 = new aWo
            r8.<init>(r6)
            int r6 = r3.size()
            r7 = r5
        L_0x0068:
            if (r7 >= r6) goto L_0x0081
            java.lang.Object r9 = r3.get(r7)
            phU r9 = (defpackage.phU) r9
            long r10 = r8.f906R
            long r8 = r9.O
            long r8 = defpackage.aWo.L(r10, r8)
            aWo r10 = new aWo
            r10.<init>(r8)
            int r7 = r7 + 1
            r8 = r10
            goto L_0x0068
        L_0x0081:
            long r6 = r8.f906R
            r3 = 64
            float r3 = (float) r3
            float r3 = r1.mZ(r3)
            float r3 = -r3
            long r6 = defpackage.aWo.Z(r3, r6)
            java.lang.Object r3 = r4.getValue()
            bs4 r3 = (defpackage.bs4) r3
            float r4 = r3.e(r6)
            boolean r6 = r3.f1831R
            if (r6 == 0) goto L_0x00a0
            r6 = -1
            float r6 = (float) r6
            float r4 = r4 * r6
        L_0x00a0:
            dmk r3 = r3.f1827R
            float r3 = r3.e(r4)
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x00ad
            r3 = r2
            goto L_0x00ae
        L_0x00ad:
            r3 = r5
        L_0x00ae:
            if (r3 != 0) goto L_0x0021
            java.util.List r13 = r13.f7140R
            int r3 = r13.size()
        L_0x00b6:
            if (r5 >= r3) goto L_0x0021
            java.lang.Object r4 = r13.get(r5)
            phU r4 = (defpackage.phU) r4
            r4.R()
            int r5 = r5 + 1
            goto L_0x00b6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcM.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        gcM gcm = new gcM(this.R, this.f3803R, aoo);
        gcm.f3804R = obj;
        return gcm;
    }
}
