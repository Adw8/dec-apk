package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* renamed from: hrR  reason: default package */
/* loaded from: classes.dex */
public final class hrR {
    public static final zI R = new zI("SliceMetadataManager", 0);

    /* renamed from: R  reason: collision with other field name */
    public final int f4396R;

    /* renamed from: R  reason: collision with other field name */
    public final long f4397R;

    /* renamed from: R  reason: collision with other field name */
    public final dRx f4398R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4399R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f4400R = new byte[8192];
    public int v = -1;

    /* renamed from: v  reason: collision with other field name */
    public final String f4401v;

    public hrR(dRx drx, String str, int i, long j, String str2) {
        this.f4398R = drx;
        this.f4399R = str;
        this.f4396R = i;
        this.f4397R = j;
        this.f4401v = str2;
    }

    public final void L(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.v));
        FileOutputStream fileOutputStream = new FileOutputStream(x());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void O(int i, byte[] bArr) {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.v));
        FileOutputStream fileOutputStream = new FileOutputStream(x());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            dRx drx = this.f4398R;
            String str = this.f4399R;
            int i2 = this.f4396R;
            long j = this.f4397R;
            String str2 = this.f4401v;
            drx.getClass();
            File file = new File(new File(new File(new File(drx.c(i2, j, str), "_slices"), "_metadata"), str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    public final int R() {
        dRx drx = this.f4398R;
        String str = this.f4399R;
        int i = this.f4396R;
        long j = this.f4397R;
        String str2 = this.f4401v;
        drx.getClass();
        File file = new File(new File(new File(new File(drx.c(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (!file.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new bRU("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void X(String str, long j, long j2, int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j));
        properties.put("remainingBytes", String.valueOf(j2));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.v));
        FileOutputStream fileOutputStream = new FileOutputStream(x());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void Z(byte[] bArr) {
        this.v++;
        dRx drx = this.f4398R;
        String str = this.f4399R;
        int i = this.f4396R;
        long j = this.f4397R;
        String str2 = this.f4401v;
        drx.getClass();
        File file = new File(new File(new File(drx.c(i, j, str), "_slices"), "_metadata"), str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file, String.format("%s-LFH.dat", Integer.valueOf(this.v))));
            fileOutputStream.write(bArr);
            fileOutputStream.close();
        } catch (IOException e) {
            throw new bRU("Could not write metadata file.", e);
        }
    }

    public final File c() {
        dRx drx = this.f4398R;
        String str = this.f4399R;
        int i = this.f4396R;
        long j = this.f4397R;
        String str2 = this.f4401v;
        drx.getClass();
        File file = new File(new File(new File(drx.c(i, j, str), "_slices"), "_metadata"), str2);
        if (!file.exists()) {
            file.mkdirs();
        }
        return new File(file, String.format("%s-NAM.dat", Integer.valueOf(this.v)));
    }

    public final void e(int i) {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(c().length()));
        properties.put("previousChunk", String.valueOf(i));
        properties.put("metadataFileCounter", String.valueOf(this.v));
        FileOutputStream fileOutputStream = new FileOutputStream(x());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final void m(InputStream inputStream, byte[] bArr) {
        this.v++;
        FileOutputStream fileOutputStream = new FileOutputStream(c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f4400R);
            while (read > 0) {
                fileOutputStream.write(this.f4400R, 0, read);
                read = inputStream.read(this.f4400R);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final n_J v() {
        dRx drx = this.f4398R;
        String str = this.f4399R;
        int i = this.f4396R;
        long j = this.f4397R;
        String str2 = this.f4401v;
        drx.getClass();
        File file = new File(new File(new File(new File(drx.c(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        if (file.exists()) {
            Properties properties = new Properties();
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                properties.load(fileInputStream);
                fileInputStream.close();
                if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                    throw new bRU("Slice checkpoint file corrupt.");
                }
                try {
                    int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                    String property = properties.getProperty("fileName");
                    long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                    long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                    int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                    this.v = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                    return new n_J(parseInt, property, parseLong, parseLong2, parseInt2);
                } catch (NumberFormatException e) {
                    throw new bRU("Slice checkpoint file corrupt.", e);
                }
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } else {
            throw new bRU("Slice checkpoint file does not exist.");
        }
    }

    public final File x() {
        dRx drx = this.f4398R;
        String str = this.f4399R;
        int i = this.f4396R;
        long j = this.f4397R;
        String str2 = this.f4401v;
        drx.getClass();
        File file = new File(new File(new File(new File(drx.c(i, j, str), "_slices"), "_metadata"), str2), "checkpoint.dat");
        file.getParentFile().mkdirs();
        file.createNewFile();
        return file;
    }
}
