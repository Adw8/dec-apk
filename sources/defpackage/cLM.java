package defpackage;

/* renamed from: cLM  reason: default package */
/* loaded from: classes.dex */
public final class cLM extends aFk implements iv7 {
    public final /* synthetic */ long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lAs f2073R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cLM(long j, lAs las, aOO aoo) {
        super(2, aoo);
        this.R = j;
        this.f2073R = las;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cLM) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r9) {
        /*
            r8 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 1
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x001e
            if (r1 == r5) goto L_0x001a
            if (r1 != r4) goto L_0x0012
            defpackage.jjU.o(r9)
            goto L_0x0036
        L_0x0012:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001a:
            defpackage.jjU.o(r9)
            goto L_0x002d
        L_0x001e:
            defpackage.jjU.o(r9)
            long r6 = r8.R
            long r6 = r6 - r2
            r8.X = r5
            java.lang.Object r9 = defpackage.n3x.Z(r6, r8)
            if (r9 != r0) goto L_0x002d
            return r0
        L_0x002d:
            r8.X = r4
            java.lang.Object r9 = defpackage.n3x.Z(r2, r8)
            if (r9 != r0) goto L_0x0036
            return r0
        L_0x0036:
            lAs r9 = r8.f2073R
            k0 r9 = r9.f5607R
            if (r9 == 0) goto L_0x004b
            dnC r0 = new dnC
            long r1 = r8.R
            r0.<init>(r1)
            bvw r8 = new bvw
            r8.<init>(r0)
            r9.Y(r8)
        L_0x004b:
            o8s r8 = defpackage.o8s.R
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cLM.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new cLM(this.R, this.f2073R, aoo);
    }
}
