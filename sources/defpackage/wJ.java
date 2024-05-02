package defpackage;

/* renamed from: wJ  reason: default package */
/* loaded from: classes.dex */
public final class wJ implements AutoCloseable {
    public final dxP R;

    public wJ(pZ pZVar) {
        this.R = new dxP(pZVar);
    }

    public final void R(int i, int i2, int i3, byte[] bArr, int i4) {
        pby[] pbyArr = kxm.R;
        synchronized (this.R) {
            dxP dxp = this.R;
            dxp.m(i);
            dxp.m(i2);
            dxp.m(i3);
            if (bArr == null) {
                dxp.m(0);
                dxp.m(0);
            } else {
                dxp.m(i4);
                int i5 = 0;
                for (byte b : bArr) {
                    i5 += b & 255;
                }
                dxp.m(i5);
            }
            dxp.m(~i);
            if (bArr != null) {
                dxp.x(bArr, 0, i4);
            }
            dxp.flush();
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.R.close();
    }
}
