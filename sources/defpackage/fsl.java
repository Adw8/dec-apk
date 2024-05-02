package defpackage;

/* renamed from: fsl  reason: default package */
/* loaded from: classes.dex */
public final class fsl extends aFk implements iv7 {
    public final /* synthetic */ ck3 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f3570R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gn f3571R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3572R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nLK f3573R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f3574R;
    public int X;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public fsl(ck3 ck3, dH9 dh9, dH9 dh92, nLK nlk, gn gnVar, boolean z, aOO aoo) {
        super(2, aoo);
        this.R = ck3;
        this.f3570R = dh9;
        this.v = dh92;
        this.f3573R = nlk;
        this.f3571R = gnVar;
        this.f3574R = z;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((fsl) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0050  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r14) {
        /*
            r13 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r13.X
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            java.lang.Object r13 = r13.f3572R
            jy_ r13 = (defpackage.jy_) r13
            defpackage.jjU.o(r14)     // Catch: CancellationException -> 0x0011
            goto L_0x004d
        L_0x0011:
            r14 = move-exception
            goto L_0x0047
        L_0x0013:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x001b:
            defpackage.jjU.o(r14)
            java.lang.Object r14 = r13.f3572R
            jy_ r14 = (defpackage.jy_) r14
            ck3 r1 = r13.R     // Catch: CancellationException -> 0x0043
            lxL r11 = new lxL     // Catch: CancellationException -> 0x0043
            dH9 r5 = r13.f3570R     // Catch: CancellationException -> 0x0043
            dH9 r6 = r13.v     // Catch: CancellationException -> 0x0043
            nLK r7 = r13.f3573R     // Catch: CancellationException -> 0x0043
            gn r8 = r13.f3571R     // Catch: CancellationException -> 0x0043
            boolean r9 = r13.f3574R     // Catch: CancellationException -> 0x0043
            r10 = 0
            r3 = r11
            r4 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch: CancellationException -> 0x0043
            r13.f3572R = r14     // Catch: CancellationException -> 0x0043
            r13.X = r2     // Catch: CancellationException -> 0x0043
            iTB r1 = (defpackage.iTB) r1     // Catch: CancellationException -> 0x0043
            java.lang.Object r13 = r1.g(r11, r13)     // Catch: CancellationException -> 0x0043
            if (r13 != r0) goto L_0x004d
            return r0
        L_0x0043:
            r13 = move-exception
            r12 = r14
            r14 = r13
            r13 = r12
        L_0x0047:
            boolean r13 = defpackage.jjU.P(r13)
            if (r13 == 0) goto L_0x0050
        L_0x004d:
            o8s r13 = defpackage.o8s.R
            return r13
        L_0x0050:
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsl.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        fsl fsl = new fsl(this.R, this.f3570R, this.v, this.f3573R, this.f3571R, this.f3574R, aoo);
        fsl.f3572R = obj;
        return fsl;
    }
}
