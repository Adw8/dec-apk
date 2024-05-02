package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/* renamed from: hFy  reason: default package */
/* loaded from: classes.dex */
public final class hFy {
    public static final zI R = new zI("ExtractorTaskFinder", 0);

    /* renamed from: R  reason: collision with other field name */
    public final be2 f4188R;

    /* renamed from: R  reason: collision with other field name */
    public final bu3 f4189R;

    /* renamed from: R  reason: collision with other field name */
    public final dRx f4190R;

    /* renamed from: R  reason: collision with other field name */
    public final nt4 f4191R;

    public hFy(nt4 nt4, dRx drx, be2 be2, bu3 bu3) {
        this.f4191R = nt4;
        this.f4190R = drx;
        this.f4188R = be2;
        this.f4189R = bu3;
    }

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b7, code lost:
        if (r0 == null) goto L_0x00b9;
     */
    /* JADX WARNING: Removed duplicated region for block: B:169:0x027f A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x0264 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.oC1 R() {
        /*
        // Method dump skipped, instructions count: 1069
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hFy.R():oC1");
    }

    public final boolean v(aKF akf, ca_ ca_) {
        dRx drx = this.f4190R;
        n9N n9n = akf.f839R;
        String str = n9n.f6323R;
        int i = akf.v;
        long j = n9n.f6322R;
        String str2 = ca_.f2149R;
        drx.getClass();
        File file = new File(new File(new File(new File(drx.c(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (!file.exists()) {
            return false;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") != null) {
                return Integer.parseInt(properties.getProperty("fileStatus")) == 4;
            }
            hrR.R.L("Slice checkpoint file corrupt while checking if extraction finished.", new Object[0]);
            return false;
        } catch (IOException e) {
            hrR.R.L("Could not read checkpoint while checking if extraction finished. %s", e);
            return false;
        }
    }
}
