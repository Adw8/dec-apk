package defpackage;

/* renamed from: cRZ  reason: default package */
/* loaded from: classes.dex */
public final class cRZ extends aFk implements iv7 {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ iv7 f2097R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f2098R;
    public int X;
    public final /* synthetic */ iv7 v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public cRZ(iv7 iv7, iv7 iv72, aOO aoo) {
        super(2, aoo);
        this.f2097R = iv7;
        this.v = iv72;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((cRZ) X(obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0078  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x007c  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r9) {
        /*
            r8 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0022
            if (r1 == r3) goto L_0x001a
            if (r1 != r2) goto L_0x0012
            long r0 = r8.R
            defpackage.jjU.o(r9)
            goto L_0x004c
        L_0x0012:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001a:
            java.lang.Object r1 = r8.f2098R
            bYN r1 = (defpackage.bYN) r1
            defpackage.jjU.o(r9)
            goto L_0x0037
        L_0x0022:
            defpackage.jjU.o(r9)
            java.lang.Object r9 = r8.f2098R
            r1 = r9
            bYN r1 = (defpackage.bYN) r1
            iv7 r9 = r8.f2097R
            r8.f2098R = r1
            r8.X = r3
            java.lang.Object r9 = r9.J(r1, r8)
            if (r9 != r0) goto L_0x0037
            return r0
        L_0x0037:
            lmN r9 = (defpackage.lmN) r9
            long r4 = r9.R
            iv7 r9 = r8.v
            r6 = 0
            r8.f2098R = r6
            r8.R = r4
            r8.X = r2
            java.lang.Object r9 = r9.J(r1, r8)
            if (r9 != r0) goto L_0x004b
            return r0
        L_0x004b:
            r0 = r4
        L_0x004c:
            lmN r9 = (defpackage.lmN) r9
            long r8 = r9.R
            r4 = -1
            boolean r2 = defpackage.lmN.R(r0, r4)
            r6 = 0
            if (r2 != 0) goto L_0x008c
            boolean r2 = defpackage.lmN.R(r8, r4)
            if (r2 == 0) goto L_0x0061
            goto L_0x008c
        L_0x0061:
            boolean r2 = defpackage.lmN.R(r0, r6)
            if (r2 == 0) goto L_0x006f
            boolean r2 = defpackage.lmN.R(r8, r6)
            if (r2 == 0) goto L_0x006f
            r4 = r6
            goto L_0x008c
        L_0x006f:
            long r4 = java.lang.Math.max(r0, r8)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 <= 0) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r3 = 0
        L_0x0079:
            if (r3 == 0) goto L_0x007c
            goto L_0x008c
        L_0x007c:
            java.lang.String r8 = "delayMillis must be positive: "
            java.lang.String r8 = defpackage.opT.x(r8, r4)
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.String r8 = r8.toString()
            r9.<init>(r8)
            throw r9
        L_0x008c:
            lmN r8 = new lmN
            r8.<init>(r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cRZ.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        cRZ crz = new cRZ(this.f2097R, this.v, aoo);
        crz.f2098R = obj;
        return crz;
    }
}
