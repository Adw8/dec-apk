package defpackage;

/* renamed from: m7I  reason: default package */
/* loaded from: classes.dex */
public final class m7I extends jy3 {
    @Override // defpackage.jy3
    public final void R(float f, float f2, okT okt) {
        okt.e(0.0f, f2 * f, 180.0f, 90.0f);
        double d = (double) f2;
        double d2 = (double) f;
        okt.c((float) (Math.sin(Math.toRadians((double) 90.0f)) * d * d2), (float) (Math.sin(Math.toRadians((double) 0.0f)) * d * d2));
    }
}
