package defpackage;

/* renamed from: hJz  reason: default package */
/* loaded from: classes.dex */
public final class hJz extends pp5 implements iv7 {
    public final /* synthetic */ f_c R;

    /* renamed from: R  reason: collision with other field name */
    public /* synthetic */ Object f4208R;
    public int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public hJz(f_c f_c, aOO aoo) {
        super(aoo);
        this.R = f_c;
    }

    @Override // defpackage.iv7
    public final Object J(Object obj, Object obj2) {
        return ((hJz) X((lAs) obj, (aOO) obj2)).O(o8s.R);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:57)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:15)
        */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x003a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x004a A[SYNTHETIC] */
    @Override // defpackage.C2
    public final java.lang.Object O(java.lang.Object r8) {
        /*
            r7 = this;
            bGR r0 = defpackage.bGR.COROUTINE_SUSPENDED
            int r1 = r7.X
            r2 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r2) goto L_0x0011
            java.lang.Object r1 = r7.f4208R
            lAs r1 = (defpackage.lAs) r1
            defpackage.jjU.o(r8)
            goto L_0x002e
        L_0x0011:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0019:
            defpackage.jjU.o(r8)
            java.lang.Object r8 = r7.f4208R
            lAs r8 = (defpackage.lAs) r8
            r1 = r8
        L_0x0021:
            gKj r8 = defpackage.gKj.Initial
            r7.f4208R = r1
            r7.X = r2
            java.lang.Object r8 = r1.R(r8, r7)
            if (r8 != r0) goto L_0x002e
            return r0
        L_0x002e:
            pdm r8 = (defpackage.pdm) r8
            java.util.List r8 = r8.f7140R
            int r3 = r8.size()
            r4 = 0
            r5 = r4
        L_0x0038:
            if (r5 >= r3) goto L_0x004a
            java.lang.Object r6 = r8.get(r5)
            phU r6 = (defpackage.phU) r6
            boolean r6 = defpackage.n1P.x(r6)
            if (r6 != 0) goto L_0x0047
            goto L_0x004b
        L_0x0047:
            int r5 = r5 + 1
            goto L_0x0038
        L_0x004a:
            r4 = r2
        L_0x004b:
            if (r4 == 0) goto L_0x0021
            f_c r7 = r7.R
            r7.g()
            o8s r7 = defpackage.o8s.R
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hJz.O(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.C2
    public final aOO X(Object obj, aOO aoo) {
        hJz hjz = new hJz(this.R, aoo);
        hjz.f4208R = obj;
        return hjz;
    }
}
