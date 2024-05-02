package defpackage;

/* renamed from: c_k  reason: default package */
/* loaded from: classes.dex */
public final class c_k extends aFk implements iv7 {
    public final /* synthetic */ h0T R;

    /* renamed from: R  reason: collision with other field name */
    public Object f2143R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ p2E f2144R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public c_k(p2E p2e, h0T h0t, aOO aoo) {
        super(2, aoo);
        this.R = h0t;
        this.f2144R = p2e;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((c_k) X((jy_) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0056  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r7) {
        /*
            r6 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r6.X
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x0024
            if (r1 == r3) goto L_0x001c
            if (r1 != r2) goto L_0x0014
            java.lang.Object r0 = r6.f2143R
            k4G r0 = (defpackage.k4G) r0
            defpackage.jjU.o(r7)
            goto L_0x0062
        L_0x0014:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001c:
            java.lang.Object r1 = r6.f2143R
            h0T r1 = (defpackage.h0T) r1
            defpackage.jjU.o(r7)
            goto L_0x0048
        L_0x0024:
            defpackage.jjU.o(r7)
            h0T r7 = r6.R
            java.lang.Object r7 = r7.getValue()
            k4G r7 = (defpackage.k4G) r7
            if (r7 == 0) goto L_0x004d
            p2E r1 = r6.f2144R
            h0T r4 = r6.R
            ktE r5 = new ktE
            r5.<init>(r7)
            if (r1 == 0) goto L_0x0049
            r6.f2143R = r4
            r6.X = r3
            java.lang.Object r7 = r1.R(r5, r6)
            if (r7 != r0) goto L_0x0047
            return r0
        L_0x0047:
            r1 = r4
        L_0x0048:
            r4 = r1
        L_0x0049:
            r7 = 0
            r4.R(r7)
        L_0x004d:
            k4G r7 = new k4G
            r7.<init>()
            p2E r1 = r6.f2144R
            if (r1 == 0) goto L_0x0063
            r6.f2143R = r7
            r6.X = r2
            java.lang.Object r1 = r1.R(r7, r6)
            if (r1 != r0) goto L_0x0061
            return r0
        L_0x0061:
            r0 = r7
        L_0x0062:
            r7 = r0
        L_0x0063:
            h0T r6 = r6.R
            r6.R(r7)
            o8s r6 = defpackage.o8s.R
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c_k.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        return new c_k(this.f2144R, this.R, aoo);
    }
}
