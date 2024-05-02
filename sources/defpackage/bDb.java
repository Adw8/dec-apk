package defpackage;

/* renamed from: bDb  reason: default package */
/* loaded from: classes.dex */
public final class bDb extends pp5 implements iv7 {
    public eLb R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ f_c f1573R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f1574R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f1575R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f1576R;
    public int X;
    public final /* synthetic */ f_c v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public bDb(aOO aoo, f_c f_c, f_c f_c2, kg9 kg9, iv7 iv7) {
        super(aoo);
        this.f1576R = kg9;
        this.f1574R = iv7;
        this.f1573R = f_c;
        this.v = f_c2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((bDb) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r14) {
        /*
            r13 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r13.X
            r2 = 0
            r3 = 3
            r4 = 1
            r5 = 2
            if (r1 == 0) goto L_0x002f
            if (r1 == r4) goto L_0x0027
            if (r1 == r5) goto L_0x001d
            if (r1 != r3) goto L_0x0015
            defpackage.jjU.o(r14)
            goto L_0x0098
        L_0x0015:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x001d:
            eLb r1 = r13.R
            java.lang.Object r2 = r13.f1575R
            lAs r2 = (defpackage.lAs) r2
            defpackage.jjU.o(r14)
            goto L_0x0065
        L_0x0027:
            java.lang.Object r1 = r13.f1575R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r14)
            goto L_0x0044
        L_0x002f:
            defpackage.jjU.o(r14)
            java.lang.Object r14 = r13.f1575R
            lAs r14 = (defpackage.lAs) r14
            r13.f1575R = r14
            r13.X = r4
            java.lang.Object r1 = defpackage.pjd.v(r14, r2, r13)
            if (r1 != r0) goto L_0x0041
            return r0
        L_0x0041:
            r12 = r1
            r1 = r14
            r14 = r12
        L_0x0044:
            phU r14 = (defpackage.phU) r14
            eLb r4 = new eLb
            r4.<init>()
            long r7 = r14.f7171R
            int r9 = r14.R
            bkx r10 = new bkx
            r10.<init>(r2, r4)
            r13.f1575R = r1
            r13.R = r4
            r13.X = r5
            r6 = r1
            r11 = r13
            java.lang.Object r14 = defpackage.iVu.v(r6, r7, r9, r10, r11)
            if (r14 != r0) goto L_0x0063
            return r0
        L_0x0063:
            r2 = r1
            r1 = r4
        L_0x0065:
            phU r14 = (defpackage.phU) r14
            if (r14 == 0) goto L_0x00ab
            kg9 r4 = r13.f1576R
            long r6 = r14.c
            aWo r8 = new aWo
            r8.<init>(r6)
            r4.x(r8)
            iv7 r4 = r13.f1574R
            float r1 = r1.R
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r1)
            r4.J(r14, r6)
            long r6 = r14.f7171R
            lIx r14 = new lIx
            iv7 r1 = r13.f1574R
            r14.<init>(r5, r1)
            r1 = 0
            r13.f1575R = r1
            r13.R = r1
            r13.X = r3
            java.lang.Object r14 = defpackage.iVu.X(r2, r6, r14, r13)
            if (r14 != r0) goto L_0x0098
            return r0
        L_0x0098:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x00a6
            f_c r13 = r13.f1573R
            r13.g()
            goto L_0x00ab
        L_0x00a6:
            f_c r13 = r13.v
            r13.g()
        L_0x00ab:
            o8s r13 = defpackage.o8s.R
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bDb.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        bDb bdb = new bDb(aoo, this.f1573R, this.v, this.f1576R, this.f1574R);
        bdb.f1575R = obj;
        return bdb;
    }
}
