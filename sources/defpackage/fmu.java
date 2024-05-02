package defpackage;

/* renamed from: fmu  reason: default package */
/* loaded from: classes.dex */
public final class fmu extends pp5 implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3561R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f3562R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nbD f3563R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f3564R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fmu(nbD nbd, jy_ jy_, p2E p2e, h0T h0t, aOO aoo) {
        super(aoo);
        this.f3563R = nbd;
        this.f3562R = jy_;
        this.f3564R = p2e;
        this.R = h0t;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fmu) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0043  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0069  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r10) {
        /*
            r9 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r9.X
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r1 = r9.f3561R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r10)
            goto L_0x0034
        L_0x0011:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0019:
            defpackage.jjU.o(r10)
            java.lang.Object r10 = r9.f3561R
            lAs r10 = (defpackage.lAs) r10
            r1 = r10
        L_0x0021:
            nbD r10 = r9.f3563R
            boolean r10 = defpackage.dTl.A(r10)
            if (r10 == 0) goto L_0x0069
            r9.f3561R = r1
            r9.X = r2
            java.lang.Object r10 = defpackage.lAs.e(r1, r9)
            if (r10 != r0) goto L_0x0034
            return r0
        L_0x0034:
            pdm r10 = (defpackage.pdm) r10
            int r10 = r10.R
            r3 = 4
            r4 = 0
            if (r10 != r3) goto L_0x003e
            r3 = r2
            goto L_0x003f
        L_0x003e:
            r3 = r4
        L_0x003f:
            r5 = 3
            r6 = 0
            if (r3 == 0) goto L_0x0052
            jy_ r10 = r9.f3562R
            iIO r3 = new iIO
            p2E r7 = r9.f3564R
            h0T r8 = r9.R
            r3.<init>(r7, r8, r6)
            defpackage.l6.z(r10, r6, r4, r3, r5)
            goto L_0x0021
        L_0x0052:
            r3 = 5
            if (r10 != r3) goto L_0x0057
            r10 = r2
            goto L_0x0058
        L_0x0057:
            r10 = r4
        L_0x0058:
            if (r10 == 0) goto L_0x0021
            jy_ r10 = r9.f3562R
            ir2 r3 = new ir2
            h0T r7 = r9.R
            p2E r8 = r9.f3564R
            r3.<init>(r8, r7, r6)
            defpackage.l6.z(r10, r6, r4, r3, r5)
            goto L_0x0021
        L_0x0069:
            o8s r9 = defpackage.o8s.R
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fmu.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        fmu fmu = new fmu(this.f3563R, this.f3562R, this.f3564R, this.R, aoo);
        fmu.f3561R = obj;
        return fmu;
    }
}
