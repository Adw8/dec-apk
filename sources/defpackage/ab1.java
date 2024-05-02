package defpackage;

/* renamed from: ab1  reason: default package */
/* loaded from: classes.dex */
public final class ab1 implements lDA {
    public final float R;

    /* renamed from: R  reason: collision with other field name */
    public final j9k f931R;

    public ab1(float f, float f2, float f3) {
        this.R = f3;
        j9k j9k = new j9k();
        if (f >= 0.0f) {
            j9k.f4849v = f;
            j9k.f4848R = false;
            double d = j9k.R;
            if (((float) (d * d)) > 0.0f) {
                j9k.R = Math.sqrt((double) f2);
                j9k.f4848R = false;
                this.f931R = j9k;
                return;
            }
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    @Override // defpackage.lDA
    public final float R(float f, float f2, float f3) {
        return 0.0f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0266, code lost:
        if (r20 > 0.0d) goto L_0x0275;
     */
    @Override // defpackage.lDA
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long X(float r37, float r38, float r39) {
        /*
        // Method dump skipped, instructions count: 735
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab1.X(float, float, float):long");
    }

    @Override // defpackage.jM
    public final iHW c(oHg ohg) {
        return new izz(this);
    }

    @Override // defpackage.lDA
    public final float e(long j, float f, float f2, float f3) {
        j9k j9k = this.f931R;
        j9k.f4847R = f2;
        return Float.intBitsToFloat((int) (j9k.R(f, f3, j / 1000000) >> 32));
    }

    @Override // defpackage.lDA
    public final float v(long j, float f, float f2, float f3) {
        j9k j9k = this.f931R;
        j9k.f4847R = f2;
        return Float.intBitsToFloat((int) (j9k.R(f, f3, j / 1000000) & 4294967295L));
    }
}
