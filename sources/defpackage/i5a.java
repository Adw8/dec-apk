package defpackage;

import java.io.File;
import java.util.concurrent.Executor;

/* renamed from: i5a  reason: default package */
/* loaded from: classes.dex */
public final class i5a {
    public final dRx R;

    /* renamed from: R  reason: collision with other field name */
    public final gMW f4458R;

    /* renamed from: R  reason: collision with other field name */
    public final imF f4459R;

    /* renamed from: R  reason: collision with other field name */
    public final nt4 f4460R;
    public final imF v;

    public i5a(dRx drx, imF imf, nt4 nt4, imF imf2, gMW gmw) {
        this.R = drx;
        this.f4459R = imf;
        this.f4460R = nt4;
        this.v = imf2;
        this.f4458R = gmw;
    }

    public final void R(fMm fmm) {
        File x = this.R.x(fmm.v, fmm.R, (String) ((oC1) fmm).f6699R);
        if (x.exists()) {
            File x2 = this.R.x(fmm.c, fmm.R, (String) ((oC1) fmm).f6699R);
            x2.mkdirs();
            if (x.renameTo(x2)) {
                ((Executor) ((kIP) this.v).R()).execute(new bx(this, fmm, 15));
                nt4 nt4 = this.f4460R;
                int i = fmm.c;
                long j = fmm.R;
                nt4.getClass();
                nt4.c(new cDk(nt4, (String) ((oC1) fmm).f6699R, i, j));
                this.f4458R.R((String) ((oC1) fmm).f6699R);
                ((aUC) ((kIP) this.f4459R).R()).R(((oC1) fmm).R, (String) ((oC1) fmm).f6699R);
                return;
            }
            throw new bRU(String.format("Cannot promote pack %s from %s to %s", (String) ((oC1) fmm).f6699R, x.getAbsolutePath(), x2.getAbsolutePath()), ((oC1) fmm).R);
        }
        throw new bRU(String.format("Cannot find pack files to promote for pack %s at %s", (String) ((oC1) fmm).f6699R, x.getAbsolutePath()), ((oC1) fmm).R);
    }
}
