package defpackage;

/* renamed from: lNH  reason: default package */
/* loaded from: classes.dex */
public final class lNH extends pp5 implements iv7 {
    public /* synthetic */ Object R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jy_ f5678R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ kg9 f5679R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ l3X f5680R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ lR3 f5681R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public lNH(lR3 lr3, jy_ jy_, l3X l3x, kg9 kg9, aOO aoo) {
        super(aoo);
        this.f5681R = lr3;
        this.f5678R = jy_;
        this.f5680R = l3x;
        this.f5679R = kg9;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((lNH) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0066  */
    @Override // defpackage.C2
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(java.lang.Object r10) {
        /*
            r9 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r9.X
            r2 = 1
            r3 = 2
            if (r1 == 0) goto L_0x0020
            if (r1 == r2) goto L_0x0018
            if (r1 != r3) goto L_0x0010
            defpackage.jjU.o(r10)
            goto L_0x0058
        L_0x0010:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0018:
            java.lang.Object r1 = r9.R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r10)
            goto L_0x0033
        L_0x0020:
            defpackage.jjU.o(r10)
            java.lang.Object r10 = r9.R
            r1 = r10
            lAs r1 = (defpackage.lAs) r1
            r9.R = r1
            r9.X = r2
            java.lang.Object r10 = defpackage.pjd.v(r1, r2, r9)
            if (r10 != r0) goto L_0x0033
            return r0
        L_0x0033:
            phU r10 = (defpackage.phU) r10
            r10.R()
            lR3 r4 = r9.f5681R
            b3f r5 = defpackage.pjd.R
            r6 = 0
            if (r4 == r5) goto L_0x004d
            jy_ r5 = r9.f5678R
            hL3 r7 = new hL3
            l3X r8 = r9.f5680R
            r7.<init>(r4, r8, r10, r6)
            r10 = 3
            r4 = 0
            defpackage.l6.z(r5, r6, r4, r7, r10)
        L_0x004d:
            r9.R = r6
            r9.X = r3
            java.lang.Object r10 = defpackage.pjd.X(r1, r9)
            if (r10 != r0) goto L_0x0058
            return r0
        L_0x0058:
            phU r10 = (defpackage.phU) r10
            if (r10 != 0) goto L_0x0066
            l3X r9 = r9.f5680R
            r9.v = r2
            hgO r9 = r9.R
            defpackage.gvP.W(r9)
            goto L_0x0080
        L_0x0066:
            r10.R()
            l3X r0 = r9.f5680R
            r0.f5573R = r2
            hgO r0 = r0.R
            defpackage.gvP.W(r0)
            kg9 r9 = r9.f5679R
            if (r9 == 0) goto L_0x0080
            long r0 = r10.c
            aWo r10 = new aWo
            r10.<init>(r0)
            r9.x(r10)
        L_0x0080:
            o8s r9 = defpackage.o8s.R
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lNH.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        lNH lnh = new lNH(this.f5681R, this.f5678R, this.f5680R, this.f5679R, aoo);
        lnh.R = obj;
        return lnh;
    }
}
