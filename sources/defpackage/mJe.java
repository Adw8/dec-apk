package defpackage;

/* renamed from: mJe  reason: default package */
/* loaded from: classes.dex */
public abstract class mJe implements Comparable {

    /* renamed from: R  reason: collision with other field name */
    public static final ift f6002R = new ift(28, 0);
    public static final float R = Float.intBitsToFloat(1056964608);

    static {
        R(1.0f);
        R(-1.0f);
    }

    public static short R(float f) {
        int i;
        f6002R.getClass();
        int floatToRawIntBits = Float.floatToRawIntBits(f);
        int i2 = floatToRawIntBits >>> 31;
        int i3 = (floatToRawIntBits >>> 23) & 255;
        int i4 = floatToRawIntBits & 8388607;
        int i5 = 0;
        if (i3 == 255) {
            if (i4 != 0) {
                i5 = 512;
            }
            i5 = 31;
        } else {
            int i6 = (i3 - 127) + 15;
            if (i6 >= 31) {
                i5 = 49;
                i5 = 0;
            } else if (i6 > 0) {
                int i7 = i4 >> 13;
                if ((i4 & 4096) != 0) {
                    i5 = ((i6 << 10) | i7) + 1;
                    i = i2 << 15;
                    return (short) (i5 | i);
                }
                i5 = i7;
                i5 = i6;
            } else if (i6 >= -10) {
                int i8 = (i4 | 8388608) >> (1 - i6);
                if ((i8 & 4096) != 0) {
                    i8 += 8192;
                }
                i5 = i8 >> 13;
            } else {
                i5 = 0;
            }
        }
        i = (i2 << 15) | (i5 << 10);
        return (short) (i5 | i);
    }

    public static final float v(short s) {
        int i;
        int i2 = s & 65535;
        int i3 = 32768 & i2;
        int i4 = (i2 >>> 10) & 31;
        int i5 = i2 & 1023;
        int i6 = 0;
        if (i4 != 0) {
            i = i5 << 13;
            if (i4 == 31) {
                i6 = 255;
                if (i != 0) {
                    i |= 4194304;
                }
            } else {
                i6 = (i4 - 15) + 127;
            }
        } else if (i5 != 0) {
            float intBitsToFloat = Float.intBitsToFloat(i5 + 1056964608) - R;
            return i3 == 0 ? intBitsToFloat : -intBitsToFloat;
        } else {
            i = 0;
        }
        return Float.intBitsToFloat(i | (i3 << 16) | (i6 << 23));
    }
}
