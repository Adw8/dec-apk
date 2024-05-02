package defpackage;

/* renamed from: iy  reason: default package */
/* loaded from: classes.dex */
public final class iy extends W_ {
    public final iv7 R;

    public iy(iv7 iv7, nbD nbd, int i, h9 h9Var) {
        super(iv7, nbd, i, h9Var, 0);
        this.R = iv7;
    }

    @Override // defpackage.W_, defpackage.YX
    public final YX L(nbD nbd, int i, h9 h9Var) {
        return new iy(this.R, nbd, i, h9Var);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004a  */
    @Override // defpackage.W_, defpackage.YX
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object O(defpackage.k6z r5, defpackage.aOO r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof defpackage.YF
            if (r0 == 0) goto L_0x0013
            r0 = r6
            YF r0 = (defpackage.YF) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            YF r0 = new YF
            r0.<init>(r4, r6)
        L_0x0018:
            java.lang.Object r6 = r0.f632R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            k6z r5 = r0.f633R
            defpackage.jjU.o(r6)
            goto L_0x003f
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.jjU.o(r6)
            r0.f633R = r5
            r0.e = r3
            java.lang.Object r4 = super.O(r5, r0)
            if (r4 != r1) goto L_0x003f
            return r1
        L_0x003f:
            hP3 r5 = (defpackage.hP3) r5
            boolean r4 = r5.U()
            if (r4 == 0) goto L_0x004a
            o8s r4 = defpackage.o8s.R
            return r4
        L_0x004a:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "'awaitClose { yourCallbackOrListener.cancel() }' should be used in the end of callbackFlow block.\nOtherwise, a callback/listener may leak in case of external cancellation.\nSee callbackFlow API documentation for the details."
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.iy.O(k6z, aOO):java.lang.Object");
    }
}
