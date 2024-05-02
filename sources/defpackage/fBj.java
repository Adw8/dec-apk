package defpackage;

/* renamed from: fBj  reason: default package */
/* loaded from: classes.dex */
public final class fBj extends k8G implements f_c {
    public final /* synthetic */ dH9 R;
    public final /* synthetic */ int X;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fBj(dH9 dh9, int i) {
        super(0);
        this.X = i;
        this.R = dh9;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (r2 != false) goto L_0x0044;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Boolean R() {
        /*
            r2 = this;
            int r0 = r2.X
            switch(r0) {
                case 1: goto L_0x0006;
                default: goto L_0x0005;
            }
        L_0x0005:
            goto L_0x0019
        L_0x0006:
            dH9 r2 = r2.R
            java.lang.Object r2 = r2.getValue()
            aWo r2 = (defpackage.aWo) r2
            long r0 = r2.f906R
            boolean r2 = defpackage.aH9.f(r0)
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            return r2
        L_0x0019:
            dH9 r2 = r2.R
            java.lang.Object r2 = r2.getValue()
            bs4 r2 = (defpackage.bs4) r2
            dmk r0 = r2.f1827R
            boolean r0 = r0.c()
            r1 = 0
            if (r0 != 0) goto L_0x0044
            oST r0 = r2.f1830R
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0044
            acA r2 = r2.R
            if (r2 == 0) goto L_0x0041
            boolean r2 = r2.c()
            goto L_0x0042
        L_0x0041:
            r2 = r1
        L_0x0042:
            if (r2 == 0) goto L_0x0045
        L_0x0044:
            r1 = 1
        L_0x0045:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r1)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fBj.R():java.lang.Boolean");
    }

    @Override // defpackage.f_c
    public final Object g() {
        switch (this.X) {
            case 0:
                return new aWo(v());
            case 1:
                return R();
            case 2:
                return R();
            case 3:
                return (cRR) this.R.getValue();
            case 4:
                return new aWo(v());
            default:
                return new aWo(v());
        }
    }

    public final long v() {
        switch (this.X) {
            case 0:
                return ((aWo) this.R.getValue()).f906R;
            case 4:
                return ((aWo) this.R.getValue()).f906R;
            default:
                dH9 dh9 = this.R;
                ct ctVar = eDJ.f3033R;
                return ((aWo) dh9.getValue()).f906R;
        }
    }
}
