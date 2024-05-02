package defpackage;

/* renamed from: gyx  reason: default package */
/* loaded from: classes.dex */
public final class gyx extends pp5 implements iv7 {
    public final /* synthetic */ bQf R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4005R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ boolean f4006R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public gyx(boolean z, bQf bqf, oSj osj, aOO aoo) {
        super(aoo);
        this.f4006R = z;
        this.R = bqf;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((gyx) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0034 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0061 A[ADDED_TO_REGION] */
    @Override // defpackage.C2
    public final java.lang.Object O(java.lang.Object r11) {
        /*
            r10 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r10.X
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r1 = r10.f4005R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r11)
            goto L_0x0035
        L_0x0011:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0019:
            defpackage.jjU.o(r11)
            java.lang.Object r11 = r10.f4005R
            lAs r11 = (defpackage.lAs) r11
            r1 = r11
        L_0x0021:
            boolean r11 = r10.f4006R
            if (r11 == 0) goto L_0x0028
            gKj r11 = defpackage.gKj.Main
            goto L_0x002a
        L_0x0028:
            gKj r11 = defpackage.gKj.Initial
        L_0x002a:
            r10.f4005R = r1
            r10.X = r2
            java.lang.Object r11 = r1.R(r11, r10)
            if (r11 != r0) goto L_0x0035
            return r0
        L_0x0035:
            pdm r11 = (defpackage.pdm) r11
            int r3 = r11.R
            r4 = 2
            r5 = 0
            if (r3 != r4) goto L_0x003f
            r3 = r2
            goto L_0x0040
        L_0x003f:
            r3 = r5
        L_0x0040:
            if (r3 == 0) goto L_0x0058
            java.util.List r3 = r11.f7140R
            java.lang.Object r3 = r3.get(r5)
            phU r3 = (defpackage.phU) r3
            iTB r4 = r1.v
            long r6 = r4.R
            long r8 = defpackage.nqW.v
            boolean r3 = defpackage.n1P.j(r3, r6, r8)
            if (r3 == 0) goto L_0x0058
            r3 = r2
            goto L_0x0059
        L_0x0058:
            r3 = r5
        L_0x0059:
            int r11 = r11.R
            r4 = 5
            if (r11 != r4) goto L_0x005f
            r5 = r2
        L_0x005f:
            if (r5 != 0) goto L_0x0021
            if (r3 != 0) goto L_0x0021
            bQf r11 = r10.R
            Gf r11 = (defpackage.Gf) r11
            androidx.compose.ui.platform.AndroidComposeView r11 = r11.R
            r11.getClass()
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyx.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        gyx gyx = new gyx(this.f4006R, this.R, null, aoo);
        gyx.f4005R = obj;
        return gyx;
    }
}
