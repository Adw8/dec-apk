package defpackage;

/* renamed from: cyq  reason: default package */
/* loaded from: classes.dex */
public final class cyq extends ift {
    public final float R;

    public cyq(float f) {
        super(0);
        this.R = f - 0.001f;
    }

    @Override // defpackage.ift
    public final void L(float f, float f2, float f3, okT okt) {
        float sqrt = (float) ((Math.sqrt(2.0d) * ((double) this.R)) / 2.0d);
        float sqrt2 = (float) Math.sqrt(Math.pow((double) this.R, 2.0d) - Math.pow((double) sqrt, 2.0d));
        okt.e(f2 - sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.R)) - ((double) this.R)))) + sqrt2, 270.0f, 0.0f);
        okt.c(f2, (float) (-((Math.sqrt(2.0d) * ((double) this.R)) - ((double) this.R))));
        okt.c(f2 + sqrt, ((float) (-((Math.sqrt(2.0d) * ((double) this.R)) - ((double) this.R)))) + sqrt2);
    }
}
