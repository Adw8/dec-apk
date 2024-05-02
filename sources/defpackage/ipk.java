package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: ipk  reason: default package */
/* loaded from: classes.dex */
public final class ipk {
    public static final zI R = new zI("PatchSliceTaskHandler", 0);

    /* renamed from: R  reason: collision with other field name */
    public final dRx f4738R;

    /* renamed from: R  reason: collision with other field name */
    public final imF f4739R;

    public ipk(dRx drx, imF imf) {
        this.f4738R = drx;
        this.f4739R = imf;
    }

    public final void R(kDW kdw) {
        File x = this.f4738R.x(kdw.v, kdw.R, (String) ((oC1) kdw).f6699R);
        dRx drx = this.f4738R;
        int i = kdw.v;
        long j = kdw.R;
        String str = kdw.f5214R;
        drx.getClass();
        File file = new File(new File(drx.x(i, j, (String) ((oC1) kdw).f6699R), "_metadata"), str);
        try {
            InputStream inputStream = kdw.f5213R;
            if (kdw.e == 2) {
                inputStream = new GZIPInputStream(inputStream, 8192);
            }
            aiw aiw = new aiw(x, file);
            File H = this.f4738R.H((String) ((oC1) kdw).f6699R, kdw.c, kdw.f5216v, kdw.f5214R);
            if (!H.exists()) {
                H.mkdirs();
            }
            hrR hrr = new hrR(this.f4738R, (String) ((oC1) kdw).f6699R, kdw.c, kdw.f5216v, kdw.f5214R);
            mxC.Q(aiw, inputStream, new exD(H, hrr), kdw.f5215c);
            hrr.L(0);
            inputStream.close();
            R.m("Patching and extraction finished for slice %s of pack %s.", kdw.f5214R, (String) ((oC1) kdw).f6699R);
            ((aUC) ((kIP) this.f4739R).R()).L(((oC1) kdw).R, 0, (String) ((oC1) kdw).f6699R, kdw.f5214R);
            try {
                kdw.f5213R.close();
            } catch (IOException unused) {
                R.x("Could not close file for slice %s of pack %s.", kdw.f5214R, (String) ((oC1) kdw).f6699R);
            }
        } catch (IOException e) {
            R.L("IOException during patching %s.", e.getMessage());
            throw new bRU(String.format("Error patching slice %s of pack %s.", kdw.f5214R, (String) ((oC1) kdw).f6699R), e, ((oC1) kdw).R);
        }
    }
}
