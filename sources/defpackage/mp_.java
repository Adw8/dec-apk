package defpackage;

import java.io.FilterInputStream;
import java.io.InputStream;
import java.util.Arrays;

/* renamed from: mp_  reason: default package */
/* loaded from: classes.dex */
public final class mp_ extends FilterInputStream {
    public long R;

    /* renamed from: R  reason: collision with other field name */
    public final l2S f6170R = new l2S();

    /* renamed from: R  reason: collision with other field name */
    public byte[] f6172R = new byte[4096];

    /* renamed from: R  reason: collision with other field name */
    public boolean f6171R = false;
    public boolean v = false;

    public mp_(InputStream inputStream) {
        super(inputStream);
    }

    public final e9S R() {
        byte[] bArr;
        if (this.R > 0) {
            do {
                bArr = this.f6172R;
            } while (read(bArr, 0, bArr.length) != -1);
            if (!this.f6171R || this.v) {
                return new e9S(null, -1, -1, false, false, null);
            }
            if (!c(30)) {
                this.f6171R = true;
                return this.f6170R.v();
            }
            e9S v = this.f6170R.v();
            if (v.v) {
                this.v = true;
                return v;
            } else if (v.f2991R != 4294967295L) {
                int i = this.f6170R.c - 30;
                long j = (long) i;
                int length = this.f6172R.length;
                if (j > ((long) length)) {
                    do {
                        length += length;
                    } while (((long) length) < j);
                    this.f6172R = Arrays.copyOf(this.f6172R, length);
                }
                if (!c(i)) {
                    this.f6171R = true;
                    return this.f6170R.v();
                }
                e9S v2 = this.f6170R.v();
                this.R = v2.f2991R;
                return v2;
            } else {
                throw new bRU("Files bigger than 4GiB are not supported.");
            }
        } else {
            if (!this.f6171R) {
            }
            return new e9S(null, -1, -1, false, false, null);
        }
    }

    public final boolean c(int i) {
        int max = Math.max(0, super.read(this.f6172R, 0, i));
        if (max != i) {
            int i2 = i - max;
            if (Math.max(0, super.read(this.f6172R, max, i2)) != i2) {
                this.f6170R.R(this.f6172R, 0, max);
                return false;
            }
        }
        this.f6170R.R(this.f6172R, 0, i);
        return true;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.R;
        if (j <= 0 || this.f6171R) {
            return -1;
        }
        int max = Math.max(0, super.read(bArr, i, (int) Math.min(j, (long) i2)));
        this.R -= (long) max;
        if (max != 0) {
            return max;
        }
        this.f6171R = true;
        return 0;
    }
}
