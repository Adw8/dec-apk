package defpackage;

/* renamed from: i2w  reason: default package */
/* loaded from: classes.dex */
public final class i2w extends pp5 implements iv7 {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4446R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ phU f4447R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public i2w(phU phu, aOO aoo) {
        super(aoo);
        this.f4447R = phu;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((i2w) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0046 A[RETURN] */
    @Override // defpackage.C2
    public final java.lang.Object O(java.lang.Object r8) {
        /*
            r7 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r7.X
            r2 = 1
            if (r1 == 0) goto L_0x001b
            if (r1 != r2) goto L_0x0013
            long r3 = r7.R
            java.lang.Object r1 = r7.f4446R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r8)
            goto L_0x003e
        L_0x0013:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x001b:
            defpackage.jjU.o(r8)
            java.lang.Object r8 = r7.f4446R
            lAs r8 = (defpackage.lAs) r8
            phU r1 = r7.f4447R
            long r3 = r1.v
            iTB r1 = r8.v
            bUo r1 = r1.f4594R
            long r5 = r1.v()
            long r5 = r5 + r3
            r1 = r8
            r3 = r5
        L_0x0031:
            r7.f4446R = r1
            r7.R = r3
            r7.X = r2
            java.lang.Object r8 = defpackage.pjd.v(r1, r2, r7)
            if (r8 != r0) goto L_0x003e
            return r0
        L_0x003e:
            phU r8 = (defpackage.phU) r8
            long r5 = r8.v
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0031
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i2w.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        i2w i2w = new i2w(this.f4447R, aoo);
        i2w.f4446R = obj;
        return i2w;
    }
}
