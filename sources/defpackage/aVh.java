package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: aVh  reason: default package */
/* loaded from: classes.dex */
public final class aVh implements aUC {
    public static final zI R = new zI("FakeAssetPackService", 0);

    /* renamed from: R  reason: collision with other field name */
    public final Handler f895R = new Handler(Looper.getMainLooper());

    /* renamed from: R  reason: collision with other field name */
    public final chm f896R;

    /* renamed from: R  reason: collision with other field name */
    public final e4X f897R;

    /* renamed from: R  reason: collision with other field name */
    public final imF f898R;

    /* renamed from: R  reason: collision with other field name */
    public final String f899R;

    static {
        new AtomicInteger(1);
    }

    public aVh(File file, e4X e4x, Context context, chm chm, imF imf) {
        this.f899R = file.getAbsolutePath();
        this.f897R = e4x;
        this.f896R = chm;
        this.f898R = imf;
    }

    @Override // defpackage.aUC
    public final void L(int i, int i2, String str, String str2) {
        R.m("notifyChunkTransferred", new Object[0]);
    }

    @Override // defpackage.aUC
    public final b1t O(HashMap hashMap) {
        R.m("syncPacks()", new Object[0]);
        ArrayList arrayList = new ArrayList();
        b1t b1t = new b1t();
        synchronized (b1t.R) {
            if (!b1t.f1511R) {
                b1t.f1511R = true;
                b1t.c = arrayList;
            } else {
                throw new IllegalStateException("Task is already complete");
            }
        }
        ((aAx) b1t.v).c(b1t);
        return b1t;
    }

    @Override // defpackage.aUC
    public final void R(int i, String str) {
        R.m("notifyModuleCompleted", new Object[0]);
        ((Executor) ((kIP) this.f898R).R()).execute(new kBb(this, i, str));
    }

    @Override // defpackage.aUC
    public final void X(int i) {
        R.m("notifySessionFailed", new Object[0]);
    }

    public final void Z(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("app_version_code", this.f896R.R());
        bundle.putInt("session_id", i);
        File[] m = m(str);
        ArrayList<String> arrayList = new ArrayList<>();
        long j = 0;
        for (File file : m) {
            j += file.length();
            ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
            arrayList2.add(null);
            String C = cUF.C(file);
            bundle.putParcelableArrayList(biy.z("chunk_intents", str, C), arrayList2);
            try {
                bundle.putString(biy.z("uncompressed_hash_sha256", str, C), mxC.n(Arrays.asList(file)));
                bundle.putLong(biy.z("uncompressed_size", str, C), file.length());
                arrayList.add(C);
            } catch (IOException e) {
                throw new iuG(String.format("Could not digest file: %s.", file), e);
            } catch (NoSuchAlgorithmException e2) {
                throw new iuG("SHA256 algorithm not supported.", e2);
            }
        }
        bundle.putStringArrayList(biy.I("slice_ids", str), arrayList);
        bundle.putLong(biy.I("pack_version", str), (long) this.f896R.R());
        bundle.putInt(biy.I("status", str), 4);
        bundle.putInt(biy.I("error_code", str), 0);
        bundle.putLong(biy.I("bytes_downloaded", str), j);
        bundle.putLong(biy.I("total_bytes_to_download", str), j);
        bundle.putStringArrayList("pack_names", new ArrayList<>(Arrays.asList(str)));
        bundle.putLong("bytes_downloaded", j);
        bundle.putLong("total_bytes_to_download", j);
        this.f895R.post(new bx(this, new Intent("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE").putExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE", bundle), 13));
    }

    @Override // defpackage.aUC
    public final void c() {
        R.m("keepAlive", new Object[0]);
    }

    @Override // defpackage.aUC
    public final b1t e(int i, int i2, String str, String str2) {
        File[] m;
        int i3;
        R.m("getChunkFileDescriptor(session=%d, %s, %s, %d)", Integer.valueOf(i), str, str2, Integer.valueOf(i2));
        b1t b1t = new b1t();
        try {
            m = m(str);
        } catch (iuG e) {
            R.x("getChunkFileDescriptor failed", e);
            b1t.Z(e);
        } catch (FileNotFoundException e2) {
            R.x("getChunkFileDescriptor failed", e2);
            b1t.Z(new iuG("Asset Slice file not found.", e2));
        }
        for (File file : m) {
            if (cUF.C(file).equals(str2)) {
                ParcelFileDescriptor open = ParcelFileDescriptor.open(file, 268435456);
                synchronized (b1t.R) {
                    if (!b1t.f1511R) {
                        b1t.f1511R = true;
                        b1t.c = open;
                    } else {
                        throw new IllegalStateException("Task is already complete");
                    }
                }
                ((aAx) b1t.v).c(b1t);
                return b1t;
            }
        }
        throw new iuG(String.format("Local testing slice for '%s' not found.", str2));
    }

    public final File[] m(String str) {
        File file = new File(this.f899R);
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles(new FilenameFilter(str) { // from class: cIQ
                public final /* synthetic */ String R;

                {
                    this.R = r1;
                }

                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str2) {
                    return str2.startsWith(String.valueOf(this.R).concat("-")) && str2.endsWith(".apk");
                }
            });
            if (listFiles != null) {
                int length = listFiles.length;
                if (length != 0) {
                    for (File file2 : listFiles) {
                        if (cUF.C(file2).equals(str)) {
                            return listFiles;
                        }
                    }
                    throw new iuG(String.format("No main slice available for pack '%s'.", str));
                }
                throw new iuG(String.format("No APKs available for pack '%s'.", str));
            }
            throw new iuG(String.format("Failed fetching APKs for pack '%s'.", str));
        }
        throw new iuG(String.format("Local testing directory '%s' not found.", file));
    }

    @Override // defpackage.aUC
    public final void v(List list) {
        R.m("cancelDownload(%s)", list);
    }
}
