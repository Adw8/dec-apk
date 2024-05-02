package defpackage;

/* renamed from: Pe  reason: default package */
/* loaded from: classes.dex */
public final class Pe {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public int f386R;
    public float c;

    /* renamed from: c  reason: collision with other field name */
    public int f388c;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public int f390v;

    /* renamed from: R  reason: collision with other field name */
    public long f387R = Long.MIN_VALUE;

    /* renamed from: c  reason: collision with other field name */
    public long f389c = -1;

    /* renamed from: v  reason: collision with other field name */
    public long f391v = 0;

    public final float R(long j) {
        long j2 = this.f387R;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = this.f389c;
        if (j3 < 0 || j < j3) {
            return flU.v(((float) (j - j2)) / ((float) this.f386R), 0.0f, 1.0f) * 0.5f;
        }
        float f = this.c;
        return (flU.v(((float) (j - j3)) / ((float) this.f388c), 0.0f, 1.0f) * f) + (1.0f - f);
    }
}
