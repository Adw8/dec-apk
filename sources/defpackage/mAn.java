package defpackage;

import java.util.Arrays;

/* renamed from: mAn  reason: default package */
/* loaded from: classes.dex */
public final class mAn {

    /* renamed from: R  reason: collision with other field name */
    public int[] f5956R = new int[10];

    /* renamed from: v  reason: collision with other field name */
    public int[] f5961v = new int[10];
    public int R = 0;

    /* renamed from: c  reason: collision with other field name */
    public int[] f5959c = new int[10];

    /* renamed from: R  reason: collision with other field name */
    public float[] f5955R = new float[10];
    public int v = 0;

    /* renamed from: e  reason: collision with other field name */
    public int[] f5960e = new int[5];

    /* renamed from: R  reason: collision with other field name */
    public String[] f5957R = new String[5];
    public int c = 0;
    public int[] X = new int[4];

    /* renamed from: R  reason: collision with other field name */
    public boolean[] f5958R = new boolean[4];
    public int e = 0;

    public final void R(int i, float f) {
        int i2 = this.v;
        int[] iArr = this.f5959c;
        if (i2 >= iArr.length) {
            this.f5959c = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f5955R;
            this.f5955R = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f5959c;
        int i3 = this.v;
        iArr2[i3] = i;
        float[] fArr2 = this.f5955R;
        this.v = i3 + 1;
        fArr2[i3] = f;
    }

    public final void c(int i, String str) {
        int i2 = this.c;
        int[] iArr = this.f5960e;
        if (i2 >= iArr.length) {
            this.f5960e = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f5957R;
            this.f5957R = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f5960e;
        int i3 = this.c;
        iArr2[i3] = i;
        String[] strArr2 = this.f5957R;
        this.c = i3 + 1;
        strArr2[i3] = str;
    }

    public final void e(int i, boolean z) {
        int i2 = this.e;
        int[] iArr = this.X;
        if (i2 >= iArr.length) {
            this.X = Arrays.copyOf(iArr, iArr.length * 2);
            boolean[] zArr = this.f5958R;
            this.f5958R = Arrays.copyOf(zArr, zArr.length * 2);
        }
        int[] iArr2 = this.X;
        int i3 = this.e;
        iArr2[i3] = i;
        boolean[] zArr2 = this.f5958R;
        this.e = i3 + 1;
        zArr2[i3] = z;
    }

    public final void v(int i, int i2) {
        int i3 = this.R;
        int[] iArr = this.f5956R;
        if (i3 >= iArr.length) {
            this.f5956R = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f5961v;
            this.f5961v = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f5956R;
        int i4 = this.R;
        iArr3[i4] = i;
        int[] iArr4 = this.f5961v;
        this.R = i4 + 1;
        iArr4[i4] = i2;
    }
}
