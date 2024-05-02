package defpackage;

import java.util.List;

/* renamed from: hPJ  reason: default package */
/* loaded from: classes.dex */
public final class hPJ implements bF9 {
    public final /* synthetic */ float R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ int f4231R = 1;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ aH9 f4232R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ cEt f4233R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jkN f4234R;

    public hPJ(float f, lpN lpn, cEt cet, jkN jkn) {
        this.f4233R = cet;
        this.R = f;
        this.f4234R = jkn;
        this.f4232R = lpn;
    }

    @Override // defpackage.bF9
    public final int R(poS pos, List list, int i) {
        return ((Number) (this.f4233R == cEt.Horizontal ? G9.X : G9.m).y(list, Integer.valueOf(i), Integer.valueOf(pos.B(this.R)))).intValue();
    }

    @Override // defpackage.bF9
    public final int X(poS pos, List list, int i) {
        return ((Number) (this.f4233R == cEt.Horizontal ? G9.O : G9.x).y(list, Integer.valueOf(i), Integer.valueOf(pos.B(this.R)))).intValue();
    }

    @Override // defpackage.bF9
    public final int c(poS pos, List list, int i) {
        return ((Number) (this.f4233R == cEt.Horizontal ? G9.e : G9.Z).y(list, Integer.valueOf(i), Integer.valueOf(pos.B(this.R)))).intValue();
    }

    @Override // defpackage.bF9
    public final int e(poS pos, List list, int i) {
        return ((Number) (this.f4233R == cEt.Horizontal ? G9.c : G9.L).y(list, Integer.valueOf(i), Integer.valueOf(pos.B(this.R)))).intValue();
    }

    @Override // defpackage.bF9
    public final mET v(mZf mzf, List list, long j) {
        oG1[] og1Arr;
        int i;
        int i2;
        List list2 = list;
        cEt cet = cEt.Horizontal;
        cEt cet2 = this.f4233R;
        int x = cet2 == cet ? oys.x(j) : oys.m(j);
        int Z = cet2 == cet ? oys.Z(j) : oys.L(j);
        int m = cet2 == cet ? oys.m(j) : oys.x(j);
        int L = cet2 == cet ? oys.L(j) : oys.Z(j);
        int B = mzf.B(this.R);
        l0f[] l0fArr = new l0f[list.size()];
        int size = list.size();
        oG1[] og1Arr2 = new oG1[size];
        for (int i3 = 0; i3 < size; i3++) {
            og1Arr2[i3] = msU.G((cxM) list2.get(i3));
        }
        int size2 = list.size();
        float f = 0.0f;
        float f2 = 0.0f;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        while (i4 < size2) {
            pc0 pc0 = (pc0) list2.get(i4);
            float M = msU.M(og1Arr2[i4]);
            if (M > f) {
                f2 += M;
                i6++;
                size2 = size2;
            } else {
                if (Z == Integer.MAX_VALUE) {
                    size2 = size2;
                    i2 = Integer.MAX_VALUE;
                } else {
                    i2 = Z - i7;
                    size2 = size2;
                }
                l0f L2 = pc0.L(this.f4233R == cet ? dtx.R(0, i2, 0, L) : dtx.R(0, L, 0, i2));
                i8 = Math.min(B, (Z - i7) - (this.f4233R == cet ? L2.e : L2.X));
                cEt cet3 = this.f4233R;
                i7 = (cet3 == cet ? L2.e : L2.X) + i8 + i7;
                i5 = Math.max(i5, cet3 == cet ? L2.X : L2.e);
                l0fArr[i4] = L2;
            }
            i4++;
            f = 0.0f;
        }
        int i9 = i5;
        if (i6 == 0) {
            i7 -= i8;
            og1Arr = og1Arr2;
            i = 0;
        } else {
            int i10 = (f2 > 0.0f ? 1 : (f2 == 0.0f ? 0 : -1));
            int i11 = (i6 - 1) * B;
            int i12 = (((i10 <= 0 || Z == Integer.MAX_VALUE) ? x : Z) - i7) - i11;
            float f3 = i10 > 0 ? ((float) i12) / f2 : 0.0f;
            int i13 = 0;
            for (int i14 = 0; i14 < size; i14++) {
                i13 = mLz.t(msU.M(og1Arr2[i14]) * f3) + i13;
            }
            int i15 = i12 - i13;
            int size3 = list.size();
            int i16 = i9;
            int i17 = 0;
            int i18 = 0;
            while (i18 < size3) {
                if (l0fArr[i18] == null) {
                    pc0 pc02 = (pc0) list2.get(i18);
                    size3 = size3;
                    oG1 og1 = og1Arr2[i18];
                    float M2 = msU.M(og1);
                    boolean z = true;
                    if (M2 > 0.0f) {
                        int i19 = i15 < 0 ? -1 : i15 > 0 ? 1 : 0;
                        i15 -= i19;
                        f3 = f3;
                        int max = Math.max(0, mLz.t(M2 * f3) + i19);
                        if (og1 != null) {
                            z = og1.f6719R;
                        }
                        int i20 = (!z || max == Integer.MAX_VALUE) ? 0 : max;
                        og1Arr2 = og1Arr2;
                        l0f L3 = pc02.L(this.f4233R == cet ? dtx.R(i20, max, 0, L) : dtx.R(0, L, i20, max));
                        cEt cet4 = this.f4233R;
                        i17 = (cet4 == cet ? L3.e : L3.X) + i17;
                        i16 = Math.max(i16, cet4 == cet ? L3.X : L3.e);
                        l0fArr[i18] = L3;
                    } else {
                        throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                    }
                } else {
                    f3 = f3;
                    size3 = size3;
                    og1Arr2 = og1Arr2;
                }
                i18++;
                list2 = list;
            }
            og1Arr = og1Arr2;
            i = i17 + i11;
            int i21 = Z - i7;
            if (i > i21) {
                i = i21;
            }
            i9 = i16;
        }
        blo blo = new blo();
        int max2 = Math.max(i7 + i, x);
        int max3 = (L == Integer.MAX_VALUE || this.f4231R != 2) ? Math.max(i9, Math.max(m, blo.e + 0)) : L;
        cEt cet5 = this.f4233R;
        int i22 = cet5 == cet ? max2 : max3;
        int i23 = cet5 == cet ? max3 : max2;
        int size4 = list.size();
        int[] iArr = new int[size4];
        for (int i24 = 0; i24 < size4; i24++) {
            iArr[i24] = 0;
        }
        return mzf.f(i22, i23, iia.R, new bQ7(list, l0fArr, this.f4234R, max2, mzf, iArr, this.f4233R, og1Arr, this.f4232R, max3, blo));
    }
}
