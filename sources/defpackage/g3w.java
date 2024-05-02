package defpackage;

/* renamed from: g3w  reason: default package */
/* loaded from: classes.dex */
public final class g3w extends aFk implements iv7 {
    public final /* synthetic */ gn R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f3660R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ nLK f3661R;

    /* renamed from: R  reason: collision with other field name */
    public nWW f3662R;
    public int X;
    public final /* synthetic */ nWW v;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public g3w(nWW nww, gn gnVar, nLK nlk, aOO aoo) {
        super(2, aoo);
        this.v = nww;
        this.R = gnVar;
        this.f3661R = nlk;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((g3w) X((iCt) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002b  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r7) {
        /*
            r6 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r6.X
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            nWW r1 = r6.f3662R
            java.lang.Object r3 = r6.f3660R
            iCt r3 = (defpackage.iCt) r3
            defpackage.jjU.o(r7)
            goto L_0x005e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x001b:
            defpackage.jjU.o(r7)
            java.lang.Object r7 = r6.f3660R
            iCt r7 = (defpackage.iCt) r7
            r3 = r7
        L_0x0023:
            nWW r7 = r6.v
            java.lang.Object r7 = r7.R
            boolean r1 = r7 instanceof defpackage.m8l
            if (r1 != 0) goto L_0x0061
            boolean r1 = r7 instanceof defpackage.e9h
            if (r1 != 0) goto L_0x0061
            boolean r1 = r7 instanceof defpackage.hGa
            if (r1 == 0) goto L_0x0036
            hGa r7 = (defpackage.hGa) r7
            goto L_0x0037
        L_0x0036:
            r7 = 0
        L_0x0037:
            if (r7 == 0) goto L_0x004d
            nLK r1 = r6.f3661R
            long r4 = r7.R
            nLK r7 = defpackage.nLK.Vertical
            if (r1 != r7) goto L_0x0046
            float r7 = defpackage.aWo.X(r4)
            goto L_0x004a
        L_0x0046:
            float r7 = defpackage.aWo.e(r4)
        L_0x004a:
            r3.R(r7)
        L_0x004d:
            nWW r1 = r6.v
            gn r7 = r6.R
            r6.f3660R = r3
            r6.f3662R = r1
            r6.X = r2
            java.lang.Object r7 = r7.P(r6)
            if (r7 != r0) goto L_0x005e
            return r0
        L_0x005e:
            r1.R = r7
            goto L_0x0023
        L_0x0061:
            o8s r6 = defpackage.o8s.R
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g3w.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        g3w g3w = new g3w(this.v, this.R, this.f3661R, aoo);
        g3w.f3660R = obj;
        return g3w;
    }
}
