package defpackage;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import androidx.core.content.FileProvider;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipOutputStream;

/* renamed from: mMh  reason: default package */
/* loaded from: classes.dex */
public final class mMh implements pqh {
    public final ActivityManager R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f6018R;

    /* renamed from: R  reason: collision with other field name */
    public final doT f6019R;

    /* renamed from: R  reason: collision with other field name */
    public final hVj f6020R;

    /* renamed from: R  reason: collision with other field name */
    public final iHI f6021R;

    /* renamed from: R  reason: collision with other field name */
    public final iKP f6022R;

    /* renamed from: R  reason: collision with other field name */
    public final iQG f6023R;

    /* renamed from: R  reason: collision with other field name */
    public final k49 f6024R;

    /* renamed from: R  reason: collision with other field name */
    public final m5f f6025R;
    public final k49 v;

    static {
        kkq.R();
    }

    public mMh(Context context, hVj hvj, doT dot, iKP ikp, k49 k49, k49 k492, m5f m5f, iHI ihi) {
        this.f6018R = context;
        this.f6020R = hvj;
        this.f6019R = dot;
        this.f6022R = ikp;
        this.f6024R = k49;
        this.v = k492;
        this.f6025R = m5f;
        this.f6021R = ihi;
        Object obj = C1.R;
        this.R = (ActivityManager) dmD.v(context, ActivityManager.class);
        dxG c = new i1m(new ByteArrayInputStream(gvP.V(-3881540292475086739L).getBytes(i1m.R))).c();
        if (c.t() > 0) {
            this.f6023R = (iQG) new h5(c).N(iQG.class);
            return;
        }
        throw new GeneralSecurityException("empty keyset");
    }

    public final File R(boolean z) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(1048576);
        File file = new File(this.f6018R.getCacheDir(), gvP.V(-3881542753491347347L));
        try {
            P7.p(file);
        } catch (Exception unused) {
        }
        file.mkdirs();
        nWW nww = new nWW();
        cdU Y = mLz.Y(false, new jXa(nww, 1), 31);
        Y.join(z ? 500 : 15000);
        if (Y.isAlive()) {
            kxm.v(cUF.v(this), 5, gvP.V(-3881542805030954899L), null);
            try {
                htf htf = (htf) nww.R;
                if (htf != null) {
                    ((nfJ) htf).c(null);
                }
            } catch (Exception e) {
                kxm.v(cUF.v(this), 6, gvP.V(-3881542955354810259L), e);
            }
        }
        ZipOutputStream zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
        try {
            dKq.R(zipOutputStream, file, gvP.V(-3881543135743436691L));
            dKq.R(zipOutputStream, this.f6018R.getFilesDir(), gvP.V(-3881543286067292051L));
            Iterator it = dKq.f2563R.iterator();
            while (it.hasNext()) {
                dKq.R(zipOutputStream, file, (String) it.next());
            }
            dKq.R.getClass();
            dKq.v.getClass();
            dKq.v(zipOutputStream, gvP.V(-3881543337606899603L), new aLl(this, zipOutputStream, 0));
            dKq.v(zipOutputStream, gvP.V(-3881543380556572563L), new jq9(zipOutputStream, 0));
            try {
                int i = 0;
                for (Object obj : this.R.getHistoricalProcessExitReasons(null, 0, 0)) {
                    i++;
                    if (i >= 0) {
                        ApplicationExitInfo applicationExitInfo = (ApplicationExitInfo) obj;
                        dKq.v(zipOutputStream, "exit/" + i + ".json", new h31(applicationExitInfo, this, zipOutputStream, 9));
                        InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                        if (traceInputStream != null) {
                            try {
                                dKq.v(zipOutputStream, "exit/" + i + ".trace", new _c(traceInputStream, 16, zipOutputStream));
                                dTl.V(traceInputStream, null);
                            } catch (Throwable th) {
                                try {
                                    throw th;
                                } catch (Throwable th2) {
                                    dTl.V(traceInputStream, th);
                                    throw th2;
                                }
                            }
                        }
                    } else {
                        pdD.k();
                        throw null;
                    }
                }
            } catch (Exception e2) {
                kxm.v(cUF.v(this), 6, gvP.V(-3881543676909315987L), e2);
            }
            dKq.v(zipOutputStream, gvP.V(-3881543848708007827L), new aLl(this, zipOutputStream, 1));
            dKq.v(zipOutputStream, gvP.V(-3881543904542582675L), new jq9(zipOutputStream, 1));
            dTl.V(zipOutputStream, null);
            try {
                P7.p(file);
            } catch (Exception unused2) {
            }
            File file2 = new File(this.f6018R.getCacheDir(), gvP.V(-3881542358354356115L));
            try {
                P7.p(file2);
            } catch (Exception unused3) {
            }
            file2.mkdirs();
            File file3 = new File(file2, String.format(gvP.V(-3881542418483898259L), Arrays.copyOf(new Object[]{DateTimeFormatter.ISO_INSTANT.format(Instant.now()).replace(':', '-')}, 1)));
            FileOutputStream fileOutputStream = new FileOutputStream(file3);
            try {
                fileOutputStream.write(dKq.f2565R);
                fileOutputStream.write(this.f6023R.R(byteArrayOutputStream.toByteArray(), new byte[0]));
                dTl.V(fileOutputStream, null);
                return file3;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    dTl.V(fileOutputStream, th3);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                throw th5;
            } catch (Throwable th6) {
                dTl.V(zipOutputStream, th5);
                throw th6;
            }
        }
    }

    public final Uri v(File file) {
        Context context = this.f6018R;
        String packageName = context.getPackageName();
        jXB R = FileProvider.R(context, packageName + ".file");
        try {
            String canonicalPath = file.getCanonicalPath();
            Map.Entry entry = null;
            for (Map.Entry entry2 : R.f4951R.entrySet()) {
                String path = ((File) entry2.getValue()).getPath();
                if (canonicalPath.startsWith(path) && (entry == null || path.length() > ((File) entry.getValue()).getPath().length())) {
                    entry = entry2;
                }
            }
            if (entry != null) {
                String path2 = ((File) entry.getValue()).getPath();
                String substring = path2.endsWith("/") ? canonicalPath.substring(path2.length()) : canonicalPath.substring(path2.length() + 1);
                return new Uri.Builder().scheme("content").authority(R.R).encodedPath(Uri.encode((String) entry.getKey()) + '/' + Uri.encode(substring, "/")).build();
            }
            throw new IllegalArgumentException(opT.H("Failed to find configured root that contains ", canonicalPath));
        } catch (IOException unused) {
            throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
        }
    }
}
