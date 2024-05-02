package defpackage;

/* renamed from: iNm  reason: default package */
/* loaded from: classes.dex */
public final class iNm extends aFk implements iv7 {
    public final /* synthetic */ gIA R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ h6T f4549R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4550R;
    public int X;
    public final /* synthetic */ gIA v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public iNm(h6T h6t, gIA gia, gIA gia2, aOO aoo) {
        super(2, aoo);
        this.f4549R = h6t;
        this.R = gia;
        this.v = gia2;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((iNm) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r9) {
        /*
            r8 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r8.X
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x001c
            if (r1 != r3) goto L_0x0014
            java.lang.Object r0 = r8.f4550R
            pd2 r0 = (defpackage.pd2) r0
            defpackage.jjU.o(r9)     // Catch: all -> 0x0012
            goto L_0x0044
        L_0x0012:
            r9 = move-exception
            goto L_0x005c
        L_0x0014:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x001c:
            defpackage.jjU.o(r9)
            java.lang.Object r9 = r8.f4550R
            jy_ r9 = (defpackage.jy_) r9
            d58 r1 = new d58
            h6T r4 = r8.f4549R
            gIA r5 = r8.R
            gIA r6 = r8.v
            r1.<init>(r4, r5, r6, r2)
            r4 = 3
            r5 = 0
            o7V r9 = defpackage.l6.z(r9, r2, r5, r1, r4)
            h6T r1 = r8.f4549R
            r1.f4056R = r9
            r8.f4550R = r9     // Catch: all -> 0x0058
            r8.X = r3     // Catch: all -> 0x0058
            java.lang.Object r1 = r9.d(r8)     // Catch: all -> 0x0058
            if (r1 != r0) goto L_0x0043
            return r0
        L_0x0043:
            r0 = r9
        L_0x0044:
            h6T r9 = r8.f4549R
            pd2 r1 = r9.f4056R
            if (r1 != r0) goto L_0x0055
            r9.c = r2
            oST r9 = r9.f4055R
            r9.R(r2)
            h6T r8 = r8.f4549R
            r8.f4056R = r2
        L_0x0055:
            o8s r8 = defpackage.o8s.R
            return r8
        L_0x0058:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L_0x005c:
            h6T r1 = r8.f4549R
            pd2 r3 = r1.f4056R
            if (r3 != r0) goto L_0x006d
            r1.c = r2
            oST r0 = r1.f4055R
            r0.R(r2)
            h6T r8 = r8.f4549R
            r8.f4056R = r2
        L_0x006d:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iNm.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        iNm inm = new iNm(this.f4549R, this.R, this.v, aoo);
        inm.f4550R = obj;
        return inm;
    }
}
