package defpackage;

/* renamed from: Xq  reason: default package */
/* loaded from: classes.dex */
public final class Xq extends aFk implements iv7 {
    public final /* synthetic */ bkb R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f622R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public Xq(bkb bkb, aOO aoo) {
        super(2, aoo);
        this.R = bkb;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((Xq) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0061  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r9) {
        /*
            r8 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r1 = r8.f622R
            jy_ r1 = (defpackage.jy_) r1
            defpackage.jjU.o(r9)
            goto L_0x0045
        L_0x0011:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0019:
            defpackage.jjU.o(r9)
            java.lang.Object r9 = r8.f622R
            jy_ r9 = (defpackage.jy_) r9
            r1 = r9
        L_0x0021:
            boolean r9 = defpackage.jjU.P(r1)
            if (r9 == 0) goto L_0x0061
            r6 r9 = defpackage.r6.R
            r8.f622R = r1
            r8.X = r2
            nbD r3 = r8.R
            dq r4 = defpackage.dq.f2882X
            hdJ r3 = r3.O(r4)
            mOr r3 = (defpackage.mOr) r3
            if (r3 != 0) goto L_0x003e
            java.lang.Object r9 = defpackage.l6.F(r9, r8)
            goto L_0x0042
        L_0x003e:
            java.lang.Object r9 = r3.G()
        L_0x0042:
            if (r9 != r0) goto L_0x0045
            return r0
        L_0x0045:
            bkb r9 = r8.R
            int[] r3 = r9.f1800R
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.f1789R
            r7.getLocationOnScreen(r3)
            int[] r3 = r9.f1800R
            r4 = r3[r4]
            if (r5 != r4) goto L_0x005d
            r3 = r3[r2]
            if (r6 == r3) goto L_0x0021
        L_0x005d:
            r9.U()
            goto L_0x0021
        L_0x0061:
            o8s r8 = defpackage.o8s.R
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Xq.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        Xq xq = new Xq(this.R, aoo);
        xq.f622R = obj;
        return xq;
    }
}
