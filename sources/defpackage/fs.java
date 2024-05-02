package defpackage;

import android.graphics.Color;

/* renamed from: fs  reason: default package */
/* loaded from: classes.dex */
public final class fs {
    public final float O;
    public final float R;
    public final float X;
    public final float c;
    public final float e;
    public final float v;

    public fs(float f, float f2, float f3, float f4, float f5, float f6) {
        this.R = f;
        this.v = f2;
        this.c = f3;
        this.e = f4;
        this.X = f5;
        this.O = f6;
    }

    public static fs R(int i) {
        cvo cvo = cvo.R;
        float H = mLz.H(Color.red(i));
        float H2 = mLz.H(Color.green(i));
        float H3 = mLz.H(Color.blue(i));
        float[][] fArr = mLz.f6006c;
        float[] fArr2 = fArr[0];
        float f = (fArr2[2] * H3) + (fArr2[1] * H2) + (fArr2[0] * H);
        float[] fArr3 = fArr[1];
        float f2 = (fArr3[2] * H3) + (fArr3[1] * H2) + (fArr3[0] * H);
        float[] fArr4 = fArr[2];
        float f3 = (H3 * fArr4[2]) + (H2 * fArr4[1]) + (H * fArr4[0]);
        float[][] fArr5 = mLz.f6005R;
        float[] fArr6 = fArr5[0];
        float f4 = (fArr6[2] * f3) + (fArr6[1] * f2) + (fArr6[0] * f);
        float[] fArr7 = fArr5[1];
        float f5 = fArr7[1] * f2;
        float f6 = fArr7[2] * f3;
        float[] fArr8 = fArr5[2];
        float f7 = f * fArr8[0];
        float f8 = f3 * fArr8[2];
        float[] fArr9 = cvo.f2458R;
        float f9 = fArr9[0] * f4;
        float f10 = fArr9[1] * (f6 + f5 + (fArr7[0] * f));
        float f11 = fArr9[2] * (f8 + (f2 * fArr8[1]) + f7);
        float pow = (float) Math.pow(((double) (Math.abs(f9) * cvo.L)) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow(((double) (Math.abs(f10) * cvo.L)) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow(((double) (Math.abs(f11) * cvo.L)) / 100.0d, 0.42d);
        float signum = ((Math.signum(f9) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f10) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f11) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d = (double) signum3;
        float f12 = ((float) (((((double) signum2) * -12.0d) + (((double) signum) * 11.0d)) + d)) / 11.0f;
        float f13 = ((float) (((double) (signum + signum2)) - (d * 2.0d))) / 9.0f;
        float f14 = signum2 * 20.0f;
        float f15 = ((21.0f * signum3) + ((signum * 20.0f) + f14)) / 20.0f;
        float f16 = (((signum * 40.0f) + f14) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2((double) f13, (double) f12)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f17 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((double) ((f16 * cvo.v) / cvo.f2457R), (double) (cvo.e * cvo.m))) * 100.0f;
        Math.sqrt((double) (pow4 / 100.0f));
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, (double) cvo.O), 0.73d)) * ((float) Math.pow((double) ((((((((float) (Math.cos(((((double) (((double) atan2) < 20.14d ? 360.0f + atan2 : atan2)) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * cvo.X) * cvo.c) * ((float) Math.sqrt((double) ((f13 * f13) + (f12 * f12))))) / (f15 + 0.305f)), 0.9d));
        float sqrt = pow5 * ((float) Math.sqrt(((double) pow4) / 100.0d));
        Math.sqrt((double) ((pow5 * cvo.e) / (cvo.f2457R + 4.0f)));
        float f18 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((double) ((cvo.Z * sqrt * 0.0228f) + 1.0f))) * 43.85965f;
        double d2 = (double) f17;
        return new fs(atan2, sqrt, pow4, f18, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public static fs v(float f, float f2, float f3) {
        cvo cvo = cvo.R;
        float f4 = cvo.e;
        double d = ((double) f) / 100.0d;
        Math.sqrt(d);
        Math.sqrt((double) (((f2 / ((float) Math.sqrt(d))) * cvo.e) / (cvo.f2457R + 4.0f)));
        float f5 = (1.7f * f) / ((0.007f * f) + 1.0f);
        float log = ((float) Math.log((((double) (cvo.Z * f2)) * 0.0228d) + 1.0d)) * 43.85965f;
        double d2 = (double) ((3.1415927f * f3) / 180.0f);
        return new fs(f3, f2, f, f5, log * ((float) Math.cos(d2)), log * ((float) Math.sin(d2)));
    }

    public final int c(cvo cvo) {
        float f;
        float f2 = this.v;
        if (((double) f2) != 0.0d) {
            double d = (double) this.c;
            if (d != 0.0d) {
                f = f2 / ((float) Math.sqrt(d / 100.0d));
                float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) cvo.O), 0.73d), 1.1111111111111112d);
                double d2 = (double) ((this.R * 3.1415927f) / 180.0f);
                float pow2 = cvo.f2457R * ((float) Math.pow(((double) this.c) / 100.0d, (1.0d / ((double) cvo.e)) / ((double) cvo.m)));
                float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * cvo.X * cvo.c;
                float f3 = pow2 / cvo.v;
                float sin = (float) Math.sin(d2);
                float cos2 = (float) Math.cos(d2);
                float f4 = 11.0f * pow * cos2;
                float f5 = (((0.305f + f3) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f4 + (cos * 23.0f)));
                float f6 = cos2 * f5;
                float f7 = f5 * sin;
                float f8 = f3 * 460.0f;
                float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
                float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
                float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
                float max = (float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))));
                float signum = (100.0f / cvo.L) * Math.signum(f9) * ((float) Math.pow((double) max, 2.380952380952381d));
                float signum2 = (100.0f / cvo.L) * Math.signum(f10) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10))))), 2.380952380952381d));
                float signum3 = (100.0f / cvo.L) * Math.signum(f11) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))))), 2.380952380952381d));
                float[] fArr = cvo.f2458R;
                float f12 = signum / fArr[0];
                float f13 = signum2 / fArr[1];
                float f14 = signum3 / fArr[2];
                float[][] fArr2 = mLz.f6007v;
                float[] fArr3 = fArr2[0];
                float f15 = fArr3[1] * f13;
                float f16 = (fArr3[2] * f14) + f15 + (fArr3[0] * f12);
                float[] fArr4 = fArr2[1];
                float f17 = fArr4[1] * f13;
                float f18 = fArr4[2] * f14;
                float[] fArr5 = fArr2[2];
                float f19 = f12 * fArr5[0];
                return B7.R((double) f16, (double) (f18 + f17 + (fArr4[0] * f12)), (double) ((f14 * fArr5[2]) + (f13 * fArr5[1]) + f19));
            }
        }
        f = 0.0f;
        float pow = (float) Math.pow(((double) f) / Math.pow(1.64d - Math.pow(0.29d, (double) cvo.O), 0.73d), 1.1111111111111112d);
        double d2 = (double) ((this.R * 3.1415927f) / 180.0f);
        float pow2 = cvo.f2457R * ((float) Math.pow(((double) this.c) / 100.0d, (1.0d / ((double) cvo.e)) / ((double) cvo.m)));
        float cos = ((float) (Math.cos(2.0d + d2) + 3.8d)) * 0.25f * 3846.1538f * cvo.X * cvo.c;
        float f3 = pow2 / cvo.v;
        float sin = (float) Math.sin(d2);
        float cos2 = (float) Math.cos(d2);
        float f4 = 11.0f * pow * cos2;
        float f5 = (((0.305f + f3) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (f4 + (cos * 23.0f)));
        float f6 = cos2 * f5;
        float f7 = f5 * sin;
        float f8 = f3 * 460.0f;
        float f9 = ((288.0f * f7) + ((451.0f * f6) + f8)) / 1403.0f;
        float f10 = ((f8 - (891.0f * f6)) - (261.0f * f7)) / 1403.0f;
        float f11 = ((f8 - (f6 * 220.0f)) - (f7 * 6300.0f)) / 1403.0f;
        float max = (float) Math.max(0.0d, (((double) Math.abs(f9)) * 27.13d) / (400.0d - ((double) Math.abs(f9))));
        float signum = (100.0f / cvo.L) * Math.signum(f9) * ((float) Math.pow((double) max, 2.380952380952381d));
        float signum2 = (100.0f / cvo.L) * Math.signum(f10) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f10)) * 27.13d) / (400.0d - ((double) Math.abs(f10))))), 2.380952380952381d));
        float signum3 = (100.0f / cvo.L) * Math.signum(f11) * ((float) Math.pow((double) ((float) Math.max(0.0d, (((double) Math.abs(f11)) * 27.13d) / (400.0d - ((double) Math.abs(f11))))), 2.380952380952381d));
        float[] fArr = cvo.f2458R;
        float f12 = signum / fArr[0];
        float f13 = signum2 / fArr[1];
        float f14 = signum3 / fArr[2];
        float[][] fArr2 = mLz.f6007v;
        float[] fArr3 = fArr2[0];
        float f15 = fArr3[1] * f13;
        float f16 = (fArr3[2] * f14) + f15 + (fArr3[0] * f12);
        float[] fArr4 = fArr2[1];
        float f17 = fArr4[1] * f13;
        float f18 = fArr4[2] * f14;
        float[] fArr5 = fArr2[2];
        float f19 = f12 * fArr5[0];
        return B7.R((double) f16, (double) (f18 + f17 + (fArr4[0] * f12)), (double) ((f14 * fArr5[2]) + (f13 * fArr5[1]) + f19));
    }
}
