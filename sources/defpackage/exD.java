package defpackage;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

/* renamed from: exD  reason: default package */
/* loaded from: classes.dex */
public final class exD extends OutputStream {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public e9S f3252R;

    /* renamed from: R  reason: collision with other field name */
    public final hrR f3253R;

    /* renamed from: R  reason: collision with other field name */
    public final File f3254R;

    /* renamed from: R  reason: collision with other field name */
    public FileOutputStream f3255R;

    /* renamed from: R  reason: collision with other field name */
    public final l2S f3256R = new l2S();
    public long v;

    public exD(File file, hrR hrr) {
        this.f3254R = file;
        this.f3253R = hrr;
    }

    @Override // java.io.OutputStream
    public final void write(int i) {
        write(new byte[]{(byte) i}, 0, 1);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }

    /* JADX INFO: finally extract failed */
    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        while (i2 > 0) {
            boolean z3 = true;
            if (this.R == 0 && this.v == 0) {
                int R = this.f3256R.R(bArr, i, i2);
                if (R != -1) {
                    i += R;
                    i2 -= R;
                    e9S v = this.f3256R.v();
                    this.f3252R = v;
                    if (v.v) {
                        this.R = 0;
                        hrR hrr = this.f3253R;
                        byte[] bArr2 = v.f2994R;
                        int length = bArr2.length;
                        hrr.v++;
                        FileOutputStream fileOutputStream = new FileOutputStream(hrr.c());
                        try {
                            fileOutputStream.write(bArr2, 0, length);
                            fileOutputStream.close();
                            this.v = (long) this.f3252R.f2994R.length;
                        } catch (Throwable th) {
                            try {
                                fileOutputStream.close();
                            } catch (Throwable unused) {
                            }
                            throw th;
                        }
                    } else {
                        if (v.R == 0) {
                            String str = v.f2992R;
                            if (str == null) {
                                z2 = false;
                            } else {
                                z2 = str.endsWith("/");
                            }
                            if (!z2) {
                                this.f3253R.Z(this.f3252R.f2994R);
                                File file = new File(this.f3254R, this.f3252R.f2992R);
                                file.getParentFile().mkdirs();
                                this.R = this.f3252R.f2991R;
                                this.f3255R = new FileOutputStream(file);
                            }
                        }
                        byte[] bArr3 = this.f3252R.f2994R;
                        hrR hrr2 = this.f3253R;
                        int length2 = bArr3.length;
                        hrr2.v++;
                        FileOutputStream fileOutputStream2 = new FileOutputStream(hrr2.c());
                        try {
                            fileOutputStream2.write(bArr3, 0, length2);
                            fileOutputStream2.close();
                            this.R = this.f3252R.f2991R;
                        } catch (Throwable th2) {
                            try {
                                fileOutputStream2.close();
                            } catch (Throwable unused2) {
                            }
                            throw th2;
                        }
                    }
                } else {
                    return;
                }
            }
            String str2 = this.f3252R.f2992R;
            if (str2 == null) {
                z = false;
            } else {
                z = str2.endsWith("/");
            }
            if (!z) {
                e9S e9s = this.f3252R;
                if (e9s.v) {
                    hrR hrr3 = this.f3253R;
                    long j = this.v;
                    RandomAccessFile randomAccessFile = new RandomAccessFile(hrr3.c(), "rw");
                    try {
                        randomAccessFile.seek(j);
                        randomAccessFile.write(bArr, i, i2);
                        randomAccessFile.close();
                        this.v += (long) i2;
                        i3 = i2;
                    } catch (Throwable th3) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable unused3) {
                        }
                        throw th3;
                    }
                } else {
                    if (e9s.R != 0) {
                        z3 = false;
                    }
                    if (z3) {
                        i3 = (int) Math.min((long) i2, this.R);
                        this.f3255R.write(bArr, i, i3);
                        long j2 = this.R - ((long) i3);
                        this.R = j2;
                        if (j2 == 0) {
                            this.f3255R.close();
                        }
                    } else {
                        i3 = (int) Math.min((long) i2, this.R);
                        e9S e9s2 = this.f3252R;
                        long length3 = (((long) e9s2.f2994R.length) + e9s2.f2991R) - this.R;
                        RandomAccessFile randomAccessFile2 = new RandomAccessFile(this.f3253R.c(), "rw");
                        try {
                            randomAccessFile2.seek(length3);
                            randomAccessFile2.write(bArr, i, i3);
                            randomAccessFile2.close();
                            this.R -= (long) i3;
                        } catch (Throwable th4) {
                            try {
                                randomAccessFile2.close();
                            } catch (Throwable unused4) {
                            }
                            throw th4;
                        }
                    }
                }
                i += i3;
                i2 -= i3;
            }
        }
    }
}
