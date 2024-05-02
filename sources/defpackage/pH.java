package defpackage;

/* renamed from: pH  reason: default package */
/* loaded from: classes.dex */
public final class pH extends aFk implements iv7 {
    public final /* synthetic */ _6 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ dH9 f7072R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ gn f7073R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f7074R;

    /* renamed from: R  reason: collision with other field name */
    public zM f7075R;
    public int X;
    public final /* synthetic */ dH9 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public pH(gn gnVar, _6 _6, dH9 dh9, dH9 dh92, aOO aoo) {
        super(2, aoo);
        this.f7073R = gnVar;
        this.R = _6;
        this.f7072R = dh9;
        this.v = dh92;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((pH) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003e  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067  */
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
            zM r1 = r13.f7075R
            java.lang.Object r3 = r13.f7074R
            jy_ r3 = (defpackage.jy_) r3
            defpackage.jjU.o(r14)
            goto L_0x0036
        L_0x0013:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L_0x001b:
            defpackage.jjU.o(r14)
            java.lang.Object r14 = r13.f7074R
            jy_ r14 = (defpackage.jy_) r14
            gn r1 = r13.f7073R
            zM r1 = r1.x()
            r3 = r14
        L_0x0029:
            r13.f7074R = r3
            r13.f7075R = r1
            r13.X = r2
            java.lang.Object r14 = r1.R(r13)
            if (r14 != r0) goto L_0x0036
            return r0
        L_0x0036:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0067
            java.lang.Object r14 = r1.v()
            gn r4 = r13.f7073R
            java.lang.Object r4 = r4.g()
            boolean r5 = r4 instanceof defpackage.u5
            r6 = 0
            if (r5 != 0) goto L_0x004e
            goto L_0x004f
        L_0x004e:
            r4 = r6
        L_0x004f:
            if (r4 != 0) goto L_0x0053
            r8 = r14
            goto L_0x0054
        L_0x0053:
            r8 = r4
        L_0x0054:
            lA r14 = new lA
            _6 r9 = r13.R
            dH9 r10 = r13.f7072R
            dH9 r11 = r13.v
            r12 = 0
            r7 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            r4 = 3
            r5 = 0
            defpackage.l6.z(r3, r6, r5, r14, r4)
            goto L_0x0029
        L_0x0067:
            o8s r13 = defpackage.o8s.R
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pH.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        pH pHVar = new pH(this.f7073R, this.R, this.f7072R, this.v, aoo);
        pHVar.f7074R = obj;
        return pHVar;
    }
}
