package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

/* renamed from: cAd  reason: default package */
/* loaded from: classes.dex */
public final class cAd {
    public final bu3 R;

    /* renamed from: R  reason: collision with other field name */
    public final dRx f1984R;

    /* renamed from: R  reason: collision with other field name */
    public final gMW f1985R;

    /* renamed from: R  reason: collision with other field name */
    public final imF f1986R;

    /* renamed from: R  reason: collision with other field name */
    public final n2N f1987R;

    /* renamed from: R  reason: collision with other field name */
    public final nt4 f1988R;
    public final imF v;

    public cAd(dRx drx, imF imf, nt4 nt4, imF imf2, gMW gmw, bu3 bu3, n2N n2n) {
        this.f1984R = drx;
        this.f1986R = imf;
        this.f1988R = nt4;
        this.v = imf2;
        this.f1985R = gmw;
        this.R = bu3;
        this.f1987R = n2n;
    }

    public final void R(i5M i5m) {
        dRx drx = this.f1984R;
        int i = i5m.v;
        long j = i5m.R;
        drx.getClass();
        File file = new File(drx.c(i, j, (String) ((oC1) i5m).f6699R), "_packs");
        dRx drx2 = this.f1984R;
        int i2 = i5m.v;
        long j2 = i5m.R;
        drx2.getClass();
        File file2 = new File(new File(drx2.c(i2, j2, (String) ((oC1) i5m).f6699R), "_slices"), "_metadata");
        if (!file.exists() || !file2.exists()) {
            throw new bRU(String.format("Cannot find pack files to move for pack %s.", (String) ((oC1) i5m).f6699R), ((oC1) i5m).R);
        }
        File x = this.f1984R.x(i5m.v, i5m.R, (String) ((oC1) i5m).f6699R);
        x.mkdirs();
        if (file.renameTo(x)) {
            new File(this.f1984R.x(i5m.v, i5m.R, (String) ((oC1) i5m).f6699R), "merge.tmp").delete();
            dRx drx3 = this.f1984R;
            int i3 = i5m.v;
            long j3 = i5m.R;
            drx3.getClass();
            File file3 = new File(drx3.x(i3, j3, (String) ((oC1) i5m).f6699R), "_metadata");
            file3.mkdirs();
            if (file2.renameTo(file3)) {
                if (this.R.R()) {
                    try {
                        this.f1987R.v((String) ((oC1) i5m).f6699R, i5m.v, i5m.R, i5m.f4454R);
                        ((Executor) ((kIP) this.v).R()).execute(new bx(this, i5m, 14));
                    } catch (IOException e) {
                        throw new bRU(String.format("Could not write asset pack version tag for pack %s: %s", (String) ((oC1) i5m).f6699R, e.getMessage()), ((oC1) i5m).R);
                    }
                } else {
                    dRx drx4 = this.f1984R;
                    drx4.getClass();
                    ((Executor) ((kIP) this.v).R()).execute(new k0f(16, drx4));
                }
                nt4 nt4 = this.f1988R;
                int i4 = i5m.v;
                long j4 = i5m.R;
                nt4.getClass();
                nt4.c(new cDk(nt4, (String) ((oC1) i5m).f6699R, i4, j4));
                this.f1985R.R((String) ((oC1) i5m).f6699R);
                ((aUC) ((kIP) this.f1986R).R()).R(((oC1) i5m).R, (String) ((oC1) i5m).f6699R);
                return;
            }
            throw new bRU("Cannot move metadata files to final location.", ((oC1) i5m).R);
        }
        throw new bRU("Cannot move merged pack files to final location.", ((oC1) i5m).R);
    }
}
