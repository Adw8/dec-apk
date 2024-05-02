package defpackage;

import android.graphics.Path;
import android.util.Log;

/* renamed from: k6t  reason: default package */
/* loaded from: classes.dex */
public final class k6t {
    public char R;

    /* renamed from: R  reason: collision with other field name */
    public float[] f5199R;

    public k6t(char c, float[] fArr) {
        this.R = c;
        this.f5199R = fArr;
    }

    public static void R(Path path, float f, float f2, float f3, float f4, float f5, float f6, float f7, boolean z, boolean z2) {
        double d;
        double d2;
        double radians = Math.toRadians((double) f7);
        double cos = Math.cos(radians);
        double sin = Math.sin(radians);
        double d3 = (double) f;
        double d4 = (double) f2;
        double d5 = (d4 * sin) + (d3 * cos);
        double d6 = d3;
        double d7 = (double) f5;
        double d8 = d5 / d7;
        double d9 = (double) f6;
        double d10 = ((d4 * cos) + (((double) (-f)) * sin)) / d9;
        double d11 = d4;
        double d12 = (double) f4;
        double d13 = ((d12 * sin) + (((double) f3) * cos)) / d7;
        double d14 = ((d12 * cos) + (((double) (-f3)) * sin)) / d9;
        double d15 = d8 - d13;
        double d16 = d10 - d14;
        double d17 = (d8 + d13) / 2.0d;
        double d18 = (d10 + d14) / 2.0d;
        double d19 = (d16 * d16) + (d15 * d15);
        if (d19 == 0.0d) {
            Log.w("PathParser", " Points are coincident");
            return;
        }
        double d20 = (1.0d / d19) - 0.25d;
        if (d20 < 0.0d) {
            Log.w("PathParser", "Points are too far apart " + d19);
            float sqrt = (float) (Math.sqrt(d19) / 1.99999d);
            R(path, f, f2, f3, f4, f5 * sqrt, f6 * sqrt, f7, z, z2);
            return;
        }
        double sqrt2 = Math.sqrt(d20);
        double d21 = d15 * sqrt2;
        double d22 = sqrt2 * d16;
        if (z == z2) {
            d2 = d17 - d22;
            d = d18 + d21;
        } else {
            d2 = d17 + d22;
            d = d18 - d21;
        }
        double atan2 = Math.atan2(d10 - d, d8 - d2);
        double atan22 = Math.atan2(d14 - d, d13 - d2) - atan2;
        int i = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z2 != (i >= 0)) {
            atan22 = i > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d23 = d2 * d7;
        double d24 = d * d9;
        double d25 = (d23 * cos) - (d24 * sin);
        double d26 = (d24 * cos) + (d23 * sin);
        int ceil = (int) Math.ceil(Math.abs((atan22 * 4.0d) / 3.141592653589793d));
        double cos2 = Math.cos(radians);
        double sin2 = Math.sin(radians);
        double cos3 = Math.cos(atan2);
        double sin3 = Math.sin(atan2);
        double d27 = -d7;
        double d28 = d27 * cos2;
        double d29 = d9 * sin2;
        double d30 = (d28 * sin3) - (d29 * cos3);
        double d31 = d27 * sin2;
        double d32 = d9 * cos2;
        double d33 = (cos3 * d32) + (sin3 * d31);
        double d34 = d32;
        double d35 = atan22 / ((double) ceil);
        int i2 = 0;
        while (i2 < ceil) {
            double d36 = atan2 + d35;
            double sin4 = Math.sin(d36);
            double cos4 = Math.cos(d36);
            double d37 = (((d7 * cos2) * cos4) + d25) - (d29 * sin4);
            double d38 = (d34 * sin4) + (d7 * sin2 * cos4) + d26;
            double d39 = (d28 * sin4) - (d29 * cos4);
            double d40 = (cos4 * d34) + (sin4 * d31);
            double d41 = d36 - atan2;
            double tan = Math.tan(d41 / 2.0d);
            double sqrt3 = ((Math.sqrt(((tan * 3.0d) * tan) + 4.0d) - 1.0d) * Math.sin(d41)) / 3.0d;
            path.rLineTo(0.0f, 0.0f);
            path.cubicTo((float) ((d30 * sqrt3) + d6), (float) ((d33 * sqrt3) + d11), (float) (d37 - (sqrt3 * d39)), (float) (d38 - (sqrt3 * d40)), (float) d37, (float) d38);
            i2++;
            atan2 = d36;
            d31 = d31;
            cos2 = cos2;
            ceil = ceil;
            d33 = d40;
            d7 = d7;
            d30 = d39;
            d6 = d37;
            d11 = d38;
            d25 = d25;
            d35 = d35;
            d34 = d34;
        }
    }

    public static void v(k6t[] k6tArr, Path path) {
        int i;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        k6t[] k6tArr2 = k6tArr;
        int i2 = 6;
        float[] fArr = new float[6];
        char c = 'm';
        int i3 = 0;
        char c2 = 'm';
        int i4 = 0;
        while (i4 < k6tArr2.length) {
            k6t k6t = k6tArr2[i4];
            char c3 = k6t.R;
            float[] fArr2 = k6t.f5199R;
            float f13 = fArr[i3];
            float f14 = fArr[1];
            float f15 = fArr[2];
            float f16 = fArr[3];
            float f17 = fArr[4];
            float f18 = fArr[5];
            switch (c3) {
                case 'A':
                case 'a':
                    i2 = 7;
                    break;
                case 'C':
                case 'c':
                    break;
                case 'H':
                case 'V':
                case 'h':
                case 'v':
                    i2 = 1;
                    break;
                case 'Q':
                case 'S':
                case 'q':
                case 's':
                    i2 = 4;
                    break;
                case 'Z':
                case 'z':
                    path.close();
                    path.moveTo(f17, f18);
                    f13 = f17;
                    f15 = f13;
                    f14 = f18;
                    f16 = f14;
                default:
                    i2 = 2;
                    break;
            }
            float f19 = f17;
            float f20 = f18;
            int i5 = i3;
            while (i5 < fArr2.length) {
                if (c3 != 'A') {
                    if (c3 != 'C') {
                        if (c3 == 'H') {
                            i = i5;
                            fArr2 = fArr2;
                            c2 = c3;
                            i4 = i4;
                            int i6 = i + 0;
                            path.lineTo(fArr2[i6], f14);
                            f13 = fArr2[i6];
                        } else if (c3 == 'Q') {
                            i = i5;
                            fArr2 = fArr2;
                            c2 = c3;
                            i4 = i4;
                            int i7 = i + 0;
                            int i8 = i + 1;
                            int i9 = i + 2;
                            int i10 = i + 3;
                            path.quadTo(fArr2[i7], fArr2[i8], fArr2[i9], fArr2[i10]);
                            f15 = fArr2[i7];
                            f16 = fArr2[i8];
                            f13 = fArr2[i9];
                            f14 = fArr2[i10];
                        } else if (c3 == 'V') {
                            i = i5;
                            fArr2 = fArr2;
                            c2 = c3;
                            i4 = i4;
                            int i11 = i + 0;
                            path.lineTo(f13, fArr2[i11]);
                            f14 = fArr2[i11];
                        } else if (c3 != 'a') {
                            if (c3 != 'c') {
                                if (c3 == 'h') {
                                    i = i5;
                                    int i12 = i + 0;
                                    path.rLineTo(fArr2[i12], 0.0f);
                                    f13 += fArr2[i12];
                                } else if (c3 != 'q') {
                                    if (c3 == 'v') {
                                        i = i5;
                                        f3 = f14;
                                        int i13 = i + 0;
                                        path.rLineTo(0.0f, fArr2[i13]);
                                        f4 = fArr2[i13];
                                    } else if (c3 != 'L') {
                                        if (c3 == 'M') {
                                            i = i5;
                                            f13 = fArr2[i + 0];
                                            f14 = fArr2[i + 1];
                                            if (i > 0) {
                                                path.lineTo(f13, f14);
                                            } else {
                                                path.moveTo(f13, f14);
                                                f19 = f13;
                                                f20 = f14;
                                            }
                                        } else if (c3 == 'S') {
                                            i = i5;
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f6 = (f13 * 2.0f) - f15;
                                                f5 = (f14 * 2.0f) - f16;
                                            } else {
                                                f6 = f13;
                                                f5 = f14;
                                            }
                                            int i14 = i + 0;
                                            int i15 = i + 1;
                                            int i16 = i + 2;
                                            int i17 = i + 3;
                                            path.cubicTo(f6, f5, fArr2[i14], fArr2[i15], fArr2[i16], fArr2[i17]);
                                            f15 = fArr2[i14];
                                            f16 = fArr2[i15];
                                            f13 = fArr2[i16];
                                            f14 = fArr2[i17];
                                        } else if (c3 == 'T') {
                                            i = i5;
                                            if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                f7 = (f13 * 2.0f) - f15;
                                                f8 = (f14 * 2.0f) - f16;
                                            } else {
                                                f7 = f13;
                                                f8 = f14;
                                            }
                                            int i18 = i + 0;
                                            int i19 = i + 1;
                                            path.quadTo(f7, f8, fArr2[i18], fArr2[i19]);
                                            f13 = fArr2[i18];
                                            f14 = fArr2[i19];
                                            f16 = f8;
                                            f15 = f7;
                                            fArr2 = fArr2;
                                            c2 = c3;
                                            i4 = i4;
                                        } else if (c3 == 'l') {
                                            i = i5;
                                            f3 = f14;
                                            int i20 = i + 0;
                                            int i21 = i + 1;
                                            path.rLineTo(fArr2[i20], fArr2[i21]);
                                            f13 += fArr2[i20];
                                            f4 = fArr2[i21];
                                        } else if (c3 == c) {
                                            i = i5;
                                            float f21 = fArr2[i + 0];
                                            f13 += f21;
                                            float f22 = fArr2[i + 1];
                                            f14 += f22;
                                            if (i > 0) {
                                                path.rLineTo(f21, f22);
                                            } else {
                                                path.rMoveTo(f21, f22);
                                                f20 = f14;
                                                f19 = f13;
                                            }
                                        } else if (c3 != 's') {
                                            if (c3 == 't') {
                                                if (c2 == 'q' || c2 == 't' || c2 == 'Q' || c2 == 'T') {
                                                    f11 = f13 - f15;
                                                    f12 = f14 - f16;
                                                } else {
                                                    f12 = 0.0f;
                                                    f11 = 0.0f;
                                                }
                                                int i22 = i5 + 0;
                                                int i23 = i5 + 1;
                                                path.rQuadTo(f11, f12, fArr2[i22], fArr2[i23]);
                                                f15 = f11 + f13;
                                                f16 = f12 + f14;
                                                f13 += fArr2[i22];
                                                f14 += fArr2[i23];
                                            }
                                            i = i5;
                                        } else {
                                            if (c2 == 'c' || c2 == 's' || c2 == 'C' || c2 == 'S') {
                                                f10 = f13 - f15;
                                                f9 = f14 - f16;
                                            } else {
                                                f10 = 0.0f;
                                                f9 = 0.0f;
                                            }
                                            int i24 = i5 + 0;
                                            int i25 = i5 + 1;
                                            int i26 = i5 + 2;
                                            int i27 = i5 + 3;
                                            i = i5;
                                            f = f14;
                                            path.rCubicTo(f10, f9, fArr2[i24], fArr2[i25], fArr2[i26], fArr2[i27]);
                                            f15 = fArr2[i24] + f13;
                                            f16 = fArr2[i25] + f;
                                            f13 += fArr2[i26];
                                            f2 = fArr2[i27];
                                        }
                                        f13 = f19;
                                        f14 = f20;
                                    } else {
                                        i = i5;
                                        int i28 = i + 0;
                                        int i29 = i + 1;
                                        path.lineTo(fArr2[i28], fArr2[i29]);
                                        f13 = fArr2[i28];
                                        f14 = fArr2[i29];
                                    }
                                    f14 = f3 + f4;
                                } else {
                                    i = i5;
                                    f = f14;
                                    int i30 = i + 0;
                                    int i31 = i + 1;
                                    int i32 = i + 2;
                                    int i33 = i + 3;
                                    path.rQuadTo(fArr2[i30], fArr2[i31], fArr2[i32], fArr2[i33]);
                                    f15 = fArr2[i30] + f13;
                                    f16 = fArr2[i31] + f;
                                    f13 += fArr2[i32];
                                    f2 = fArr2[i33];
                                }
                                fArr2 = fArr2;
                                c2 = c3;
                                i4 = i4;
                            } else {
                                i = i5;
                                f = f14;
                                int i34 = i + 2;
                                int i35 = i + 3;
                                int i36 = i + 4;
                                int i37 = i + 5;
                                path.rCubicTo(fArr2[i + 0], fArr2[i + 1], fArr2[i34], fArr2[i35], fArr2[i36], fArr2[i37]);
                                f15 = fArr2[i34] + f13;
                                f16 = fArr2[i35] + f;
                                f13 += fArr2[i36];
                                f2 = fArr2[i37];
                            }
                            f14 = f + f2;
                            fArr2 = fArr2;
                            c2 = c3;
                            i4 = i4;
                        } else {
                            i = i5;
                            int i38 = i + 5;
                            int i39 = i + 6;
                            fArr2 = fArr2;
                            c2 = c3;
                            i4 = i4;
                            R(path, f13, f14, fArr2[i38] + f13, fArr2[i39] + f14, fArr2[i + 0], fArr2[i + 1], fArr2[i + 2], fArr2[i + 3] != 0.0f, fArr2[i + 4] != 0.0f);
                            f13 += fArr2[i38];
                            f14 += fArr2[i39];
                        }
                        i5 = i + i2;
                        c3 = c2;
                        c = 'm';
                        i3 = 0;
                    } else {
                        i = i5;
                        fArr2 = fArr2;
                        c2 = c3;
                        i4 = i4;
                        int i40 = i + 2;
                        int i41 = i + 3;
                        int i42 = i + 4;
                        int i43 = i + 5;
                        path.cubicTo(fArr2[i + 0], fArr2[i + 1], fArr2[i40], fArr2[i41], fArr2[i42], fArr2[i43]);
                        f13 = fArr2[i42];
                        f14 = fArr2[i43];
                        f15 = fArr2[i40];
                        f16 = fArr2[i41];
                    }
                    i5 = i + i2;
                    c3 = c2;
                    c = 'm';
                    i3 = 0;
                } else {
                    i = i5;
                    fArr2 = fArr2;
                    c2 = c3;
                    i4 = i4;
                    int i44 = i + 5;
                    int i45 = i + 6;
                    R(path, f13, f14, fArr2[i44], fArr2[i45], fArr2[i + 0], fArr2[i + 1], fArr2[i + 2], fArr2[i + 3] != 0.0f, fArr2[i + 4] != 0.0f);
                    f13 = fArr2[i44];
                    f14 = fArr2[i45];
                }
                f16 = f14;
                f15 = f13;
                i5 = i + i2;
                c3 = c2;
                c = 'm';
                i3 = 0;
            }
            fArr[i3] = f13;
            fArr[1] = f14;
            fArr[2] = f15;
            fArr[3] = f16;
            fArr[4] = f19;
            fArr[5] = f20;
            c2 = k6tArr[i4].R;
            i4++;
            i2 = 6;
            c = 'm';
            k6tArr2 = k6tArr;
        }
    }

    public k6t(k6t k6t) {
        this.R = k6t.R;
        float[] fArr = k6t.f5199R;
        this.f5199R = gvP.P(fArr, fArr.length);
    }
}
