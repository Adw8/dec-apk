package defpackage;

/* renamed from: c  reason: default package */
/* loaded from: classes.dex */
public abstract class c extends Vz {
    public final Vz R;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c(defpackage.Vz r5) {
        /*
            r4 = this;
            int r0 = r5.e
            int r1 = r5.X
            r2 = 64
            if (r2 != r1) goto L_0x0012
            int r2 = r5.O
            b r3 = r5.R
            r4.<init>(r0, r1, r2, r3)
            r4.R = r5
            return
        L_0x0012:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c.<init>(Vz):void");
    }

    @Override // defpackage.Vz
    public final q A(O o) {
        return this.R.A(o);
    }

    @Override // defpackage.O
    public final boolean J() {
        return this.R.J();
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        this.R.K(zz, z);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return this.R.Y(z);
    }

    @Override // defpackage.Vz, defpackage.O
    public O u() {
        return new W9((Vz) this.R.u(), 1);
    }
}
