package defpackage;

import java.util.Arrays;

/* renamed from: l7M  reason: default package */
/* loaded from: classes.dex */
public final class l7M {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public int[] f5588R;
    public int v;

    public l7M() {
        this.R = 0;
        this.f5588R = new int[10];
    }

    public final void O(int i, int i2) {
        int[] iArr = this.f5588R;
        int i3 = iArr[i];
        iArr[i] = iArr[i2];
        iArr[i2] = i3;
        int i4 = i + 1;
        int i5 = i2 + 1;
        int i6 = iArr[i4];
        iArr[i4] = iArr[i5];
        iArr[i5] = i6;
        int i7 = i + 2;
        int i8 = i2 + 2;
        int i9 = iArr[i7];
        iArr[i7] = iArr[i8];
        iArr[i8] = i9;
    }

    public final int R() {
        switch (this.R) {
            case 0:
                int[] iArr = this.f5588R;
                int i = this.v - 1;
                this.v = i;
                return iArr[i];
            default:
                int[] iArr2 = this.f5588R;
                int i2 = this.v - 1;
                this.v = i2;
                return iArr2[i2];
        }
    }

    public final void X(int i, int i2) {
        if (i < i2) {
            int i3 = i - 3;
            for (int i4 = i; i4 < i2; i4 += 3) {
                int[] iArr = this.f5588R;
                int i5 = iArr[i4];
                int i6 = iArr[i2];
                if (i5 < i6 || (i5 == i6 && iArr[i4 + 1] <= iArr[i2 + 1])) {
                    i3 += 3;
                    O(i3, i4);
                }
            }
            int i7 = i3 + 3;
            O(i7, i2);
            X(i, i7 - 3);
            X(i7 + 3, i2);
        }
    }

    public final void c(int i, int i2, int i3) {
        int i4 = this.v;
        int i5 = i4 + 3;
        int[] iArr = this.f5588R;
        if (i5 >= iArr.length) {
            this.f5588R = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5588R;
        iArr2[i4 + 0] = i + i3;
        iArr2[i4 + 1] = i2 + i3;
        iArr2[i4 + 2] = i3;
        this.v = i5;
    }

    public final void e(int i, int i2, int i3, int i4) {
        int i5 = this.v;
        int i6 = i5 + 4;
        int[] iArr = this.f5588R;
        if (i6 >= iArr.length) {
            this.f5588R = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5588R;
        iArr2[i5 + 0] = i;
        iArr2[i5 + 1] = i2;
        iArr2[i5 + 2] = i3;
        iArr2[i5 + 3] = i4;
        this.v = i6;
    }

    public final void v(int i) {
        int i2 = this.v;
        int[] iArr = this.f5588R;
        if (i2 >= iArr.length) {
            this.f5588R = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f5588R;
        int i3 = this.v;
        this.v = i3 + 1;
        iArr2[i3] = i;
    }

    public l7M(int i) {
        this.R = 1;
        this.f5588R = new int[i];
    }
}
