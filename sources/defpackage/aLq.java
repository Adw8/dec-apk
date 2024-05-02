package defpackage;

import java.util.Arrays;

/* renamed from: aLq  reason: default package */
/* loaded from: classes.dex */
public final class aLq implements Comparable {
    public int L;
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f843R;
    public int e = -1;
    public int X = -1;
    public int O = 0;
    public boolean v = false;

    /* renamed from: R  reason: collision with other field name */
    public float[] f844R = new float[9];

    /* renamed from: v  reason: collision with other field name */
    public float[] f846v = new float[9];

    /* renamed from: R  reason: collision with other field name */
    public Wz[] f845R = new Wz[16];
    public int Z = 0;
    public int m = 0;

    public aLq(int i) {
        this.L = i;
    }

    public final void R(Wz wz) {
        int i = 0;
        while (true) {
            int i2 = this.Z;
            if (i >= i2) {
                Wz[] wzArr = this.f845R;
                if (i2 >= wzArr.length) {
                    this.f845R = (Wz[]) Arrays.copyOf(wzArr, wzArr.length * 2);
                }
                Wz[] wzArr2 = this.f845R;
                int i3 = this.Z;
                wzArr2[i3] = wz;
                this.Z = i3 + 1;
                return;
            } else if (this.f845R[i] != wz) {
                i++;
            } else {
                return;
            }
        }
    }

    public final void X(fhh fhh, Wz wz) {
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            this.f845R[i2].m(fhh, wz, false);
        }
        this.Z = 0;
    }

    public final void c() {
        this.L = 5;
        this.O = 0;
        this.e = -1;
        this.X = -1;
        this.R = 0.0f;
        this.v = false;
        int i = this.Z;
        for (int i2 = 0; i2 < i; i2++) {
            this.f845R[i2] = null;
        }
        this.Z = 0;
        this.m = 0;
        this.f843R = false;
        Arrays.fill(this.f846v, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.e - ((aLq) obj).e;
    }

    public final void e(fhh fhh, float f) {
        this.R = f;
        this.v = true;
        int i = this.Z;
        this.X = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.f845R[i2].Z(fhh, this, false);
        }
        this.Z = 0;
    }

    @Override // java.lang.Object
    public final String toString() {
        StringBuilder U = opT.U("");
        U.append(this.e);
        return U.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 >= (r0 - 1)) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x000f, code lost:
        r5 = r4.f845R;
        r2 = r1 + 1;
        r5[r1] = r5[r2];
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.Z--;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.Wz r5) {
        /*
            r4 = this;
            int r0 = r4.Z
            r1 = 0
        L_0x0003:
            if (r1 >= r0) goto L_0x0023
            Wz[] r2 = r4.f845R
            r2 = r2[r1]
            if (r2 != r5) goto L_0x0020
        L_0x000b:
            int r5 = r0 + -1
            if (r1 >= r5) goto L_0x0019
            Wz[] r5 = r4.f845R
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto L_0x000b
        L_0x0019:
            int r5 = r4.Z
            int r5 = r5 + -1
            r4.Z = r5
            return
        L_0x0020:
            int r1 = r1 + 1
            goto L_0x0003
        L_0x0023:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aLq.v(Wz):void");
    }
}
