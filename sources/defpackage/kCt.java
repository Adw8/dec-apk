package defpackage;

/* renamed from: kCt  reason: default package */
/* loaded from: classes.dex */
public final class kCt extends aFk implements lR3 {
    public /* synthetic */ int O;
    public final /* synthetic */ ern R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ h2V f5208R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public kCt(ern ern, aOO aoo) {
        super(3, aoo);
        this.R = ern;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x008b A[RETURN] */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r10) {
        /*
            r9 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r9.X
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0034
            if (r1 == r6) goto L_0x0030
            if (r1 == r5) goto L_0x002a
            if (r1 == r4) goto L_0x0024
            if (r1 == r3) goto L_0x001e
            if (r1 != r2) goto L_0x0016
            goto L_0x0030
        L_0x0016:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x001e:
            h2V r1 = r9.f5208R
            defpackage.jjU.o(r10)
            goto L_0x007e
        L_0x0024:
            h2V r1 = r9.f5208R
            defpackage.jjU.o(r10)
            goto L_0x006f
        L_0x002a:
            h2V r1 = r9.f5208R
            defpackage.jjU.o(r10)
            goto L_0x0058
        L_0x0030:
            defpackage.jjU.o(r10)
            goto L_0x008c
        L_0x0034:
            defpackage.jjU.o(r10)
            h2V r10 = r9.f5208R
            int r1 = r9.O
            if (r1 <= 0) goto L_0x0048
            mAC r1 = defpackage.mAC.START
            r9.X = r6
            java.lang.Object r9 = r10.R(r1, r9)
            if (r9 != r0) goto L_0x008c
            return r0
        L_0x0048:
            ern r1 = r9.R
            long r6 = r1.R
            r9.f5208R = r10
            r9.X = r5
            java.lang.Object r1 = defpackage.n3x.Z(r6, r9)
            if (r1 != r0) goto L_0x0057
            return r0
        L_0x0057:
            r1 = r10
        L_0x0058:
            ern r10 = r9.R
            long r5 = r10.v
            r7 = 0
            int r10 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r10 <= 0) goto L_0x007e
            mAC r10 = defpackage.mAC.STOP
            r9.f5208R = r1
            r9.X = r4
            java.lang.Object r10 = r1.R(r10, r9)
            if (r10 != r0) goto L_0x006f
            return r0
        L_0x006f:
            ern r10 = r9.R
            long r4 = r10.v
            r9.f5208R = r1
            r9.X = r3
            java.lang.Object r10 = defpackage.n3x.Z(r4, r9)
            if (r10 != r0) goto L_0x007e
            return r0
        L_0x007e:
            mAC r10 = defpackage.mAC.STOP_AND_RESET_REPLAY_CACHE
            r3 = 0
            r9.f5208R = r3
            r9.X = r2
            java.lang.Object r9 = r1.R(r10, r9)
            if (r9 != r0) goto L_0x008c
            return r0
        L_0x008c:
            o8s r9 = defpackage.o8s.R
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kCt.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.lR3
    public final Object y(Object obj, Object obj2, Object obj3) {
        int intValue = ((Number) obj2).intValue();
        kCt kct = new kCt(this.R, (aOO) obj3);
        kct.f5208R = (h2V) obj;
        kct.O = intValue;
        return kct.O(o8s.R);
    }
}
