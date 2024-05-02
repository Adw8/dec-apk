package defpackage;

import java.util.Arrays;

/* renamed from: dHi  reason: default package */
/* loaded from: classes.dex */
public final class dHi extends u_ {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final bSx f2548R;

    /* renamed from: R  reason: collision with other field name */
    public final kg9 f2549R;

    /* renamed from: R  reason: collision with other field name */
    public final lEB f2550R;

    /* renamed from: R  reason: collision with other field name */
    public final nTx f2551R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2552R;

    /* renamed from: R  reason: collision with other field name */
    public final float[] f2553R;
    public final float[] c;
    public final float v;

    /* renamed from: v  reason: collision with other field name */
    public final kg9 f2554v;

    /* renamed from: v  reason: collision with other field name */
    public final lEB f2555v;

    /* renamed from: v  reason: collision with other field name */
    public final float[] f2556v;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dHi(java.lang.String r12, float[] r13, defpackage.bSx r14, defpackage.nTx r15, int r16) {
        /*
            r11 = this;
            r9 = r15
            double r0 = r9.O
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000d
            r5 = r1
            goto L_0x000e
        L_0x000d:
            r5 = r4
        L_0x000e:
            if (r5 == 0) goto L_0x0021
            double r5 = r9.L
            int r5 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r5 != 0) goto L_0x0018
            r5 = r1
            goto L_0x0019
        L_0x0018:
            r5 = r4
        L_0x0019:
            if (r5 == 0) goto L_0x0021
            aMZ r5 = new aMZ
            r5.<init>(r15, r4)
            goto L_0x0026
        L_0x0021:
            aMZ r5 = new aMZ
            r5.<init>(r15, r1)
        L_0x0026:
            if (r0 != 0) goto L_0x002a
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r4
        L_0x002b:
            if (r0 == 0) goto L_0x003e
            double r6 = r9.L
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 != 0) goto L_0x0034
            goto L_0x0035
        L_0x0034:
            r1 = r4
        L_0x0035:
            if (r1 == 0) goto L_0x003e
            aMZ r0 = new aMZ
            r1 = 2
            r0.<init>(r15, r1)
            goto L_0x0044
        L_0x003e:
            aMZ r0 = new aMZ
            r1 = 3
            r0.<init>(r15, r1)
        L_0x0044:
            r6 = r0
            r7 = 0
            r8 = 1065353216(0x3f800000, float:1.0)
            r4 = 0
            r0 = r11
            r1 = r12
            r2 = r13
            r3 = r14
            r9 = r15
            r10 = r16
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dHi.<init>(java.lang.String, float[], bSx, nTx, int):void");
    }

    @Override // defpackage.u_
    public final float[] R(float[] fArr) {
        msU.vl(this.c, fArr);
        fArr[0] = (float) ((Number) this.f2550R.x(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.f2550R.x(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.f2550R.x(Double.valueOf((double) fArr[2]))).doubleValue();
        return fArr;
    }

    @Override // defpackage.u_
    public final float[] X(float[] fArr) {
        fArr[0] = (float) ((Number) this.f2555v.x(Double.valueOf((double) fArr[0]))).doubleValue();
        fArr[1] = (float) ((Number) this.f2555v.x(Double.valueOf((double) fArr[1]))).doubleValue();
        fArr[2] = (float) ((Number) this.f2555v.x(Double.valueOf((double) fArr[2]))).doubleValue();
        msU.vl(this.f2556v, fArr);
        return fArr;
    }

    @Override // defpackage.u_
    public final float c(int i) {
        return this.R;
    }

    @Override // defpackage.u_
    public final boolean e() {
        return this.f2552R;
    }

    @Override // defpackage.u_
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !n3x.v(g8d.R(dHi.class), g8d.R(obj.getClass())) || !super.equals(obj)) {
            return false;
        }
        dHi dhi = (dHi) obj;
        if (Float.compare(dhi.R, this.R) != 0 || Float.compare(dhi.v, this.v) != 0 || !n3x.v(this.f2548R, dhi.f2548R) || !Arrays.equals(this.f2553R, dhi.f2553R)) {
            return false;
        }
        nTx ntx = this.f2551R;
        if (ntx != null) {
            return n3x.v(ntx, dhi.f2551R);
        }
        if (dhi.f2551R == null) {
            return true;
        }
        if (!n3x.v(this.f2549R, dhi.f2549R)) {
            return false;
        }
        return n3x.v(this.f2554v, dhi.f2554v);
    }

    @Override // defpackage.u_
    public final int hashCode() {
        int hashCode = (Arrays.hashCode(this.f2553R) + ((this.f2548R.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.R;
        boolean z = true;
        int i = 0;
        int floatToIntBits = (hashCode + (!((f > 0.0f ? 1 : (f == 0.0f ? 0 : -1)) == 0) ? Float.floatToIntBits(f) : 0)) * 31;
        float f2 = this.v;
        if (f2 != 0.0f) {
            z = false;
        }
        int floatToIntBits2 = (floatToIntBits + (!z ? Float.floatToIntBits(f2) : 0)) * 31;
        nTx ntx = this.f2551R;
        if (ntx != null) {
            i = ntx.hashCode();
        }
        int i2 = floatToIntBits2 + i;
        if (this.f2551R != null) {
            return i2;
        }
        return this.f2554v.hashCode() + ((this.f2549R.hashCode() + (i2 * 31)) * 31);
    }

    @Override // defpackage.u_
    public final float v(int i) {
        return this.v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    public dHi(String str, float[] fArr, bSx bsx, float[] fArr2, kg9 kg9, kg9 kg92, float f, float f2, nTx ntx, int i) {
        super(str, q2.f7347R, i);
        boolean z;
        boolean z2;
        this.f2548R = bsx;
        this.R = f;
        this.v = f2;
        this.f2551R = ntx;
        this.f2549R = kg9;
        boolean z3 = true;
        this.f2550R = new lEB(this, 1);
        this.f2554v = kg92;
        this.f2555v = new lEB(this, 0);
        if (fArr.length != 6 && fArr.length != 9) {
            throw new IllegalArgumentException("The color space's primaries must be defined as an array of 6 floats in xyY or 9 floats in XYZ");
        } else if (f < f2) {
            float[] fArr3 = new float[6];
            if (fArr.length == 9) {
                float f3 = fArr[0];
                float f4 = fArr[1];
                float f5 = f3 + f4 + fArr[2];
                fArr3[0] = f3 / f5;
                fArr3[1] = f4 / f5;
                float f6 = fArr[3];
                float f7 = fArr[4];
                float f8 = f6 + f7 + fArr[5];
                fArr3[2] = f6 / f8;
                fArr3[3] = f7 / f8;
                float f9 = fArr[6];
                float f10 = fArr[7];
                float f11 = f9 + f10 + fArr[8];
                fArr3[4] = f9 / f11;
                fArr3[5] = f10 / f11;
            } else {
                System.arraycopy(fArr, 0, fArr3, 0, 6);
            }
            this.f2553R = fArr3;
            if (fArr2 == null) {
                float f12 = fArr3[0];
                float f13 = fArr3[1];
                float f14 = fArr3[2];
                float f15 = fArr3[3];
                float f16 = fArr3[4];
                float f17 = fArr3[5];
                float f18 = bsx.R;
                float f19 = bsx.v;
                float f20 = (float) 1;
                float f21 = (f20 - f12) / f13;
                float f22 = f12 / f13;
                float f23 = (f14 / f15) - f22;
                float f24 = (f18 / f19) - f22;
                float f25 = ((f20 - f14) / f15) - f21;
                float f26 = (f16 / f17) - f22;
                float f27 = (((((f20 - f18) / f19) - f21) * f23) - (f24 * f25)) / (((((f20 - f16) / f17) - f21) * f23) - (f25 * f26));
                float f28 = (f24 - (f26 * f27)) / f23;
                float f29 = (1.0f - f28) - f27;
                float f30 = f29 / f13;
                float f31 = f28 / f15;
                float f32 = f27 / f17;
                this.f2556v = new float[]{f30 * f12, f29, ((1.0f - f12) - f13) * f30, f31 * f14, f28, ((1.0f - f14) - f15) * f31, f32 * f16, f27, ((1.0f - f16) - f17) * f32};
            } else if (fArr2.length == 9) {
                this.f2556v = fArr2;
            } else {
                StringBuilder U = opT.U("Transform must have 9 entries! Has ");
                U.append(fArr2.length);
                throw new IllegalArgumentException(U.toString());
            }
            this.c = msU.F(this.f2556v);
            float N = dq.N(fArr3);
            float[] fArr4 = K6.f230R;
            if (N / dq.N(K6.f232v) > 0.9f) {
                float[] fArr5 = K6.f230R;
                z = false;
                float f33 = fArr3[0];
                float f34 = fArr5[0];
                float f35 = f33 - f34;
                float f36 = fArr3[1];
                float f37 = fArr5[1];
                float f38 = f36 - f37;
                float f39 = fArr3[2];
                float f40 = fArr5[2];
                float f41 = f39 - f40;
                float f42 = fArr3[3];
                float f43 = fArr5[3];
                float f44 = f42 - f43;
                float f45 = fArr3[4];
                float f46 = fArr5[4];
                float f47 = f45 - f46;
                float f48 = fArr3[5];
                float f49 = fArr5[5];
                float f50 = f48 - f49;
                if (((f37 - f49) * f35) - ((f34 - f46) * f38) >= 0.0f && ((f34 - f40) * f38) - ((f37 - f43) * f35) >= 0.0f && ((f43 - f37) * f41) - ((f40 - f34) * f44) >= 0.0f && ((f40 - f46) * f44) - ((f43 - f49) * f41) >= 0.0f && ((f49 - f43) * f47) - ((f46 - f40) * f50) >= 0.0f) {
                    int i2 = ((((f46 - f34) * f50) - ((f49 - f37) * f47)) > 0.0f ? 1 : ((((f46 - f34) * f50) - ((f49 - f37) * f47)) == 0.0f ? 0 : -1));
                }
            } else {
                z = false;
            }
            if (i != 0) {
                float[] fArr6 = K6.f230R;
                if (fArr3 != fArr6) {
                    int i3 = z;
                    while (i3 < 6) {
                        if (Float.compare(fArr3[i3 == true ? 1 : 0], fArr6[i3]) != 0 && Math.abs(fArr3[i3] - fArr6[i3]) > 0.001f) {
                            z2 = z;
                            break;
                        }
                        i3 = (i3 == true ? 1 : 0) + 1;
                    }
                }
                z2 = true;
                if (z2 && msU.u(bsx, iWF.e)) {
                    if (f == 0.0f ? true : z) {
                        if (f2 == 1.0f ? true : z) {
                            float[] fArr7 = K6.f230R;
                            dHi dhi = K6.R;
                            for (double d = 0.0d; d <= 1.0d; d += 0.00392156862745098d) {
                                if (dq.j(d, kg9, dhi.f2549R) && dq.j(d, kg92, dhi.f2554v)) {
                                }
                            }
                        }
                    }
                }
                z3 = z;
                break;
            }
            this.f2552R = z3;
        } else {
            throw new IllegalArgumentException("Invalid range: min=" + f + ", max=" + f2 + "; min must be strictly < max");
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public dHi(java.lang.String r18, float[] r19, defpackage.bSx r20, double r21, float r23, float r24, int r25) {
        /*
            r17 = this;
            r1 = r21
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000c
            r5 = r3
            goto L_0x000d
        L_0x000c:
            r5 = r4
        L_0x000d:
            if (r5 == 0) goto L_0x0012
            nqF r5 = defpackage.nqF.i
            goto L_0x0017
        L_0x0012:
            iI2 r5 = new iI2
            r5.<init>(r1, r4)
        L_0x0017:
            r11 = r5
            if (r0 != 0) goto L_0x001b
            r4 = r3
        L_0x001b:
            if (r4 == 0) goto L_0x0020
            nqF r0 = defpackage.nqF.i
            goto L_0x0025
        L_0x0020:
            iI2 r0 = new iI2
            r0.<init>(r1, r3)
        L_0x0025:
            r12 = r0
            nTx r15 = new nTx
            r3 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r5 = 0
            r7 = 0
            r9 = 0
            r0 = r15
            r1 = r21
            r0.<init>(r1, r3, r5, r7, r9)
            r10 = 0
            r6 = r17
            r7 = r18
            r8 = r19
            r9 = r20
            r13 = r23
            r14 = r24
            r16 = r25
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dHi.<init>(java.lang.String, float[], bSx, double, float, float, int):void");
    }
}
