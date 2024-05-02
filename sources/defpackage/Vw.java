package defpackage;

import android.text.TextPaint;

/* renamed from: Vw  reason: default package */
/* loaded from: classes.dex */
public final class Vw extends TextPaint {
    public a1 R;

    /* renamed from: R  reason: collision with other field name */
    public ari f580R = ari.R;

    /* renamed from: R  reason: collision with other field name */
    public hpO f581R = hpO.R;

    /* renamed from: R  reason: collision with other field name */
    public nqW f582R;

    public Vw(float f) {
        super(1);
        ((TextPaint) this).density = f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003a, code lost:
        if ((r0 == null ? false : defpackage.nqW.R(r0.f6610R, r6)) == false) goto L_0x003c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void R(defpackage.a1 r5, long r6, float r8) {
        /*
            r4 = this;
            if (r5 != 0) goto L_0x000b
            r5 = 0
            r4.setShader(r5)
            r4.R = r5
            r4.f582R = r5
            goto L_0x006d
        L_0x000b:
            boolean r0 = r5 instanceof defpackage.oSW
            if (r0 == 0) goto L_0x001b
            oSW r5 = (defpackage.oSW) r5
            long r5 = r5.R
            long r5 = defpackage.cU5.m(r8, r5)
            r4.v(r5)
            goto L_0x006d
        L_0x001b:
            boolean r0 = r5 instanceof defpackage.qD
            if (r0 == 0) goto L_0x006d
            android.graphics.Shader r0 = r4.getShader()
            r1 = 0
            if (r0 == 0) goto L_0x003c
            a1 r0 = r4.R
            boolean r0 = defpackage.n3x.v(r0, r5)
            if (r0 == 0) goto L_0x003c
            nqW r0 = r4.f582R
            if (r0 != 0) goto L_0x0034
            r0 = r1
            goto L_0x003a
        L_0x0034:
            long r2 = r0.f6610R
            boolean r0 = defpackage.nqW.R(r2, r6)
        L_0x003a:
            if (r0 != 0) goto L_0x0055
        L_0x003c:
            long r2 = defpackage.nqW.c
            int r0 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r0 == 0) goto L_0x0043
            r1 = 1
        L_0x0043:
            if (r1 == 0) goto L_0x0055
            r4.R = r5
            nqW r0 = new nqW
            r0.<init>(r6)
            r4.f582R = r0
            qD r5 = (defpackage.qD) r5
            android.graphics.Shader r5 = r5.v
            r4.setShader(r5)
        L_0x0055:
            boolean r5 = java.lang.Float.isNaN(r8)
            if (r5 != 0) goto L_0x006d
            r5 = 0
            r6 = 1065353216(0x3f800000, float:1.0)
            float r5 = defpackage.caw.m(r8, r5, r6)
            r6 = 255(0xff, float:3.57E-43)
            float r6 = (float) r6
            float r5 = r5 * r6
            int r5 = defpackage.mLz.t(r5)
            r4.setAlpha(r5)
        L_0x006d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.Vw.R(a1, long, float):void");
    }

    public final void c(hpO hpo) {
        if (hpo != null && !n3x.v(this.f581R, hpo)) {
            this.f581R = hpo;
            if (n3x.v(hpo, hpO.R)) {
                clearShadowLayer();
                return;
            }
            hpO hpo2 = this.f581R;
            float f = hpo2.f4389R;
            if (f == 0.0f) {
                f = Float.MIN_VALUE;
            }
            setShadowLayer(f, aWo.e(hpo2.v), aWo.X(this.f581R.v), aH9.vz(this.f581R.f4390R));
        }
    }

    public final void e(ari ari) {
        if (ari != null && !n3x.v(this.f580R, ari)) {
            this.f580R = ari;
            int i = ari.f1478R;
            boolean z = true;
            setUnderlineText((1 | i) == i);
            int i2 = this.f580R.f1478R;
            if ((2 | i2) != i2) {
                z = false;
            }
            setStrikeThruText(z);
        }
    }

    public final void v(long j) {
        int i = n3.R;
        if (j != n3.O) {
            int vz = aH9.vz(j);
            if (getColor() != vz) {
                setColor(vz);
            }
            setShader(null);
            this.R = null;
            this.f582R = null;
        }
    }
}
