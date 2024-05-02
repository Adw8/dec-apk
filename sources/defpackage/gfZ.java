package defpackage;

/* renamed from: gfZ  reason: default package */
/* loaded from: classes.dex */
public final class gfZ extends pp5 implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ ojR f3843R;

    /* renamed from: R  reason: collision with other field name */
    public phU f3844R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gfZ(ojR ojr, aOO aoo) {
        super(aoo);
        this.f3843R = ojr;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gfZ) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0050 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x007b A[EDGE_INSN: B:32:0x007b->B:28:0x007b ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.C2
    public final java.lang.Object O(java.lang.Object r14) {
        /*
            r13 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r13.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0026
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            phU r1 = r13.f3844R
            java.lang.Object r4 = r13.R
            lAs r4 = (defpackage.lAs) r4
            defpackage.jjU.o(r14)
            goto L_0x0051
        L_0x0016:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x001e:
            java.lang.Object r1 = r13.R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r14)
            goto L_0x0039
        L_0x0026:
            defpackage.jjU.o(r14)
            java.lang.Object r14 = r13.R
            r1 = r14
            lAs r1 = (defpackage.lAs) r1
            r13.R = r1
            r13.X = r3
            java.lang.Object r14 = defpackage.pjd.v(r1, r3, r13)
            if (r14 != r0) goto L_0x0039
            return r0
        L_0x0039:
            phU r14 = (defpackage.phU) r14
            ojR r4 = r13.f3843R
            long r5 = r14.c
            r4.c()
            r4 = r1
            r1 = r14
        L_0x0044:
            r13.R = r4
            r13.f3844R = r1
            r13.X = r2
            java.lang.Object r14 = defpackage.lAs.e(r4, r13)
            if (r14 != r0) goto L_0x0051
            return r0
        L_0x0051:
            r5 = 0
            pdm r14 = (defpackage.pdm) r14
            java.util.List r14 = r14.f7140R
            int r6 = r14.size()
            r7 = r5
        L_0x005b:
            if (r7 >= r6) goto L_0x007b
            java.lang.Object r8 = r14.get(r7)
            phU r8 = (defpackage.phU) r8
            long r9 = r8.f7171R
            long r11 = r1.f7171R
            boolean r9 = defpackage.k8q.R(r9, r11)
            if (r9 == 0) goto L_0x0073
            boolean r8 = r8.f7175R
            if (r8 == 0) goto L_0x0073
            r8 = r3
            goto L_0x0074
        L_0x0073:
            r8 = r5
        L_0x0074:
            if (r8 == 0) goto L_0x0078
            r5 = r3
            goto L_0x007b
        L_0x0078:
            int r7 = r7 + 1
            goto L_0x005b
        L_0x007b:
            if (r5 != 0) goto L_0x0044
            ojR r13 = r13.f3843R
            r13.R()
            o8s r13 = defpackage.o8s.R
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gfZ.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        gfZ gfz = new gfZ(this.f3843R, aoo);
        gfz.R = obj;
        return gfz;
    }
}
