package defpackage;

/* renamed from: Br  reason: default package */
/* loaded from: classes.dex */
public final class Br implements cIc {
    public hf6 R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f44R;

    @Override // defpackage.cIc
    public final void F(hjM hjm) {
        if (!this.f44R) {
            this.f44R = true;
            hf6 hf6 = this.R;
            if (hf6 != null) {
                hf6.Y(o8s.R);
            }
            this.R = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object c(defpackage.aOO r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.VE
            if (r0 == 0) goto L_0x0013
            r0 = r5
            VE r0 = (defpackage.VE) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.e = r1
            goto L_0x0018
        L_0x0013:
            VE r0 = new VE
            r0.<init>(r4, r5)
        L_0x0018:
            java.lang.Object r5 = r0.f573R
            bGR r1 = defpackage.bGR.COROUTINE_SUSPENDED
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L_0x0031
            if (r2 != r3) goto L_0x0029
            aOO r4 = r0.c
            defpackage.jjU.o(r5)
            goto L_0x0056
        L_0x0029:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L_0x0031:
            defpackage.jjU.o(r5)
            boolean r5 = r4.f44R
            if (r5 != 0) goto L_0x005d
            hf6 r5 = r4.R
            r0.getClass()
            r0.c = r5
            r0.e = r3
            hf6 r2 = new hf6
            aOO r0 = defpackage.n3x.U(r0)
            bGR r3 = defpackage.bGR.UNDECIDED
            r2.<init>(r3, r0)
            r4.R = r2
            java.lang.Object r4 = r2.R()
            if (r4 != r1) goto L_0x0055
            return r1
        L_0x0055:
            r4 = r5
        L_0x0056:
            if (r4 == 0) goto L_0x005d
            o8s r5 = defpackage.o8s.R
            r4.Y(r5)
        L_0x005d:
            o8s r4 = defpackage.o8s.R
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Br.c(aOO):java.lang.Object");
    }
}
