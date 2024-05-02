package defpackage;

import java.util.Arrays;

/* renamed from: jE7  reason: default package */
/* loaded from: classes.dex */
public final class jE7 extends nMl {
    public final dHi R;
    public final dHi v;

    /* renamed from: v  reason: collision with other field name */
    public final float[] f4865v;

    public jE7(dHi dhi, dHi dhi2, int i) {
        super(dhi, dhi2, (float[]) null);
        float[] fArr;
        this.R = dhi;
        this.v = dhi2;
        if (msU.u(dhi.f2548R, dhi2.f2548R)) {
            fArr = msU.X4(dhi2.c, dhi.f2556v);
        } else {
            float[] fArr2 = dhi.f2556v;
            float[] fArr3 = dhi2.c;
            float[] R = dhi.f2548R.R();
            float[] R2 = dhi2.f2548R.R();
            bSx bsx = dhi.f2548R;
            bSx bsx2 = iWF.v;
            fArr2 = !msU.u(bsx, bsx2) ? msU.X4(msU.K(Ws.R.f609R, R, Arrays.copyOf(iWF.f4626R, 3)), dhi.f2556v) : fArr2;
            fArr = msU.X4(!msU.u(dhi2.f2548R, bsx2) ? msU.F(msU.X4(msU.K(Ws.R.f609R, R2, Arrays.copyOf(iWF.f4626R, 3)), dhi2.f2556v)) : fArr3, i == 3 ? msU.zw(new float[]{R[0] / R2[0], R[1] / R2[1], R[2] / R2[2]}, fArr2) : fArr2);
        }
        this.f4865v = fArr;
    }

    @Override // defpackage.nMl
    public final void R(float[] fArr) {
        fArr[0] = (float) ((Number) this.R.f2555v.x(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.R.f2555v.x(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.R.f2555v.x(Double.valueOf((double) fArr[2]))).doubleValue();
        msU.vl(this.f4865v, fArr);
        fArr[0] = (float) ((Number) this.v.f2550R.x(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.v.f2550R.x(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.v.f2550R.x(Double.valueOf((double) fArr[2]))).doubleValue();
    }
}
