package defpackage;

/* renamed from: gAR  reason: default package */
/* loaded from: classes.dex */
public final class gAR extends aFk implements iv7 {
    public aZq R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gn f3688R;

    /* renamed from: R  reason: collision with other field name */
    public zM f3689R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gAR(gn gnVar, aOO aoo) {
        super(2, aoo);
        this.f3688R = gnVar;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gAR) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0039 A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:6:0x000d, B:10:0x001e, B:11:0x0023, B:14:0x0030, B:16:0x0039), top: B:24:0x0005 }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0043  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r6) {
        /*
            r5 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r5.X
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            zM r1 = r5.f3689R
            aZq r3 = r5.R
            defpackage.jjU.o(r6)     // Catch: all -> 0x0049
            goto L_0x0030
        L_0x0011:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L_0x0019:
            defpackage.jjU.o(r6)
            gn r3 = r5.f3688R
            zM r6 = r3.x()     // Catch: all -> 0x0049
            r1 = r6
        L_0x0023:
            r5.R = r3     // Catch: all -> 0x0049
            r5.f3689R = r1     // Catch: all -> 0x0049
            r5.X = r2     // Catch: all -> 0x0049
            java.lang.Object r6 = r1.R(r5)     // Catch: all -> 0x0049
            if (r6 != r0) goto L_0x0030
            return r0
        L_0x0030:
            r4 = 0
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: all -> 0x0049
            boolean r6 = r6.booleanValue()     // Catch: all -> 0x0049
            if (r6 == 0) goto L_0x0043
            java.lang.Object r6 = r1.v()     // Catch: all -> 0x0049
            o8s r6 = (defpackage.o8s) r6     // Catch: all -> 0x0049
            defpackage.ift.H()     // Catch: all -> 0x0049
            goto L_0x0023
        L_0x0043:
            defpackage.dTl.g(r3, r4)
            o8s r5 = defpackage.o8s.R
            return r5
        L_0x0049:
            r5 = move-exception
            throw r5     // Catch: all -> 0x004b
        L_0x004b:
            r6 = move-exception
            defpackage.dTl.g(r3, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gAR.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new gAR(this.f3688R, aoo);
    }
}
