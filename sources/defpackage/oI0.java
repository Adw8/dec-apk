package defpackage;

/* renamed from: oI0  reason: default package */
/* loaded from: classes.dex */
public final class oI0 {
    public static final oMs R = new oMs();

    /* renamed from: R  reason: collision with other field name */
    public final int[] f6727R = new int[260];

    public oI0() {
        v();
    }

    public static int R(String str) {
        int i;
        int i2;
        try {
            i = 1;
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
        }
        if (str.charAt(0) == '#') {
            i2 = 0;
        } else {
            if (str.startsWith("rgb:")) {
                i = 4;
                i2 = 1;
            }
            return 0;
        }
        int length = (str.length() - i) - (i2 * 2);
        if (length % 3 != 0) {
            return 0;
        }
        int i3 = length / 3;
        double pow = 255.0d / (Math.pow(2.0d, (double) (i3 * 4)) - 1.0d);
        String substring = str.substring(i, i + i3);
        int i4 = i2 + i3;
        int i5 = i + i4;
        String substring2 = str.substring(i5, i5 + i3);
        int i6 = i5 + i4;
        return ((int) (((double) Integer.parseInt(str.substring(i6, i3 + i6), 16)) * pow)) | -16777216 | (((int) (((double) Integer.parseInt(substring, 16)) * pow)) << 16) | (((int) (((double) Integer.parseInt(substring2, 16)) * pow)) << 8);
    }

    public final void v() {
        System.arraycopy(R.R, 0, this.f6727R, 0, 260);
    }
}
