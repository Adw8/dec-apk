package defpackage;

import java.util.Arrays;

/* renamed from: n9T  reason: default package */
/* loaded from: classes.dex */
public final class n9T {
    public boolean R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f6326R;

    /* renamed from: R  reason: collision with other field name */
    public final long[] f6327R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean[] f6328R;
    public boolean v;

    public n9T(int i) {
        long[] jArr = new long[i];
        this.f6327R = jArr;
        boolean[] zArr = new boolean[i];
        this.f6328R = zArr;
        this.f6326R = new int[i];
        Arrays.fill(jArr, 0L);
        Arrays.fill(zArr, false);
    }

    public final int[] R() {
        synchronized (this) {
            if (this.R && !this.v) {
                int length = this.f6327R.length;
                int i = 0;
                while (true) {
                    int i2 = 1;
                    if (i < length) {
                        boolean z = this.f6327R[i] > 0;
                        boolean[] zArr = this.f6328R;
                        if (z != zArr[i]) {
                            int[] iArr = this.f6326R;
                            if (!z) {
                                i2 = 2;
                            }
                            iArr[i] = i2;
                        } else {
                            this.f6326R[i] = 0;
                        }
                        zArr[i] = z;
                        i++;
                    } else {
                        this.v = true;
                        this.R = false;
                        return this.f6326R;
                    }
                }
            }
            return null;
        }
    }
}
