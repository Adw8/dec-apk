package defpackage;

/* renamed from: i0e  reason: default package */
/* loaded from: classes.dex */
public final class i0e extends jy3 {
    @Override // defpackage.jy3
    public final void R(float f, float f2, okT okt) {
        okt.e(0.0f, f2 * f, 180.0f, 90.0f);
        float f3 = f2 * 2.0f * f;
        lRf lrf = new lRf(0.0f, 0.0f, f3, f3);
        lrf.X = 180.0f;
        lrf.O = 90.0f;
        okt.f6900R.add(lrf);
        haJ haj = new haJ(lrf);
        okt.R(180.0f);
        okt.f6901v.add(haj);
        okt.X = 270.0f;
        float f4 = (f3 + 0.0f) * 0.5f;
        float f5 = (f3 - 0.0f) / 2.0f;
        double d = (double) 270.0f;
        okt.c = (((float) Math.cos(Math.toRadians(d))) * f5) + f4;
        okt.e = (f5 * ((float) Math.sin(Math.toRadians(d)))) + f4;
    }
}
