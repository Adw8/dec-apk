package defpackage;

/* renamed from: mTz  reason: default package */
/* loaded from: classes.dex */
public final class mTz extends pp5 implements iv7 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f6046R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f6047R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f6048R;
    public int X;
    public final /* synthetic */ f_c v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public mTz(aOO aoo, f_c f_c, f_c f_c2, kg9 kg9, iv7 iv7) {
        super(aoo);
        this.f6048R = kg9;
        this.R = f_c;
        this.v = f_c2;
        this.f6046R = iv7;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((mTz) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a3  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r10) {
        /*
            r9 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r9.X
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0030
            if (r1 == r5) goto L_0x0028
            if (r1 == r4) goto L_0x0020
            if (r1 != r3) goto L_0x0018
            java.lang.Object r0 = r9.f6047R
            lAs r0 = (defpackage.lAs) r0
            defpackage.jjU.o(r10)
            goto L_0x0077
        L_0x0018:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0020:
            java.lang.Object r1 = r9.f6047R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r10)
            goto L_0x0052
        L_0x0028:
            java.lang.Object r1 = r9.f6047R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r10)
            goto L_0x0043
        L_0x0030:
            defpackage.jjU.o(r10)
            java.lang.Object r10 = r9.f6047R
            r1 = r10
            lAs r1 = (defpackage.lAs) r1
            r9.f6047R = r1
            r9.X = r5
            java.lang.Object r10 = defpackage.pjd.v(r1, r2, r9)
            if (r10 != r0) goto L_0x0043
            return r0
        L_0x0043:
            phU r10 = (defpackage.phU) r10
            long r6 = r10.f7171R
            r9.f6047R = r1
            r9.X = r4
            java.lang.Object r10 = defpackage.iVu.c(r6, r1, r9)
            if (r10 != r0) goto L_0x0052
            return r0
        L_0x0052:
            phU r10 = (defpackage.phU) r10
            if (r10 == 0) goto L_0x00a8
            kg9 r4 = r9.f6048R
            long r6 = r10.c
            aWo r8 = new aWo
            r8.<init>(r6)
            r4.x(r8)
            long r6 = r10.f7171R
            lIx r10 = new lIx
            iv7 r4 = r9.f6046R
            r10.<init>(r5, r4)
            r9.f6047R = r1
            r9.X = r3
            java.lang.Object r10 = defpackage.iVu.e(r1, r6, r10, r9)
            if (r10 != r0) goto L_0x0076
            return r0
        L_0x0076:
            r0 = r1
        L_0x0077:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L_0x00a3
            iTB r10 = r0.v
            pdm r10 = r10.f4598R
            java.util.List r10 = r10.f7140R
            int r0 = r10.size()
        L_0x0089:
            if (r2 >= r0) goto L_0x009d
            java.lang.Object r1 = r10.get(r2)
            phU r1 = (defpackage.phU) r1
            boolean r3 = defpackage.n1P.x(r1)
            if (r3 == 0) goto L_0x009a
            r1.R()
        L_0x009a:
            int r2 = r2 + 1
            goto L_0x0089
        L_0x009d:
            f_c r9 = r9.R
            r9.g()
            goto L_0x00a8
        L_0x00a3:
            f_c r9 = r9.v
            r9.g()
        L_0x00a8:
            o8s r9 = defpackage.o8s.R
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mTz.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        mTz mtz = new mTz(aoo, this.R, this.v, this.f6048R, this.f6046R);
        mtz.f6047R = obj;
        return mtz;
    }
}
