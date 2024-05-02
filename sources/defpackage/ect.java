package defpackage;

import android.util.Log;
import java.io.Writer;

/* renamed from: ect  reason: default package */
/* loaded from: classes.dex */
public final class ect extends Writer {

    /* renamed from: R  reason: collision with other field name */
    public StringBuilder f3167R = new StringBuilder(128);
    public final String R = "FragmentManager";

    public final void R() {
        if (this.f3167R.length() > 0) {
            Log.d(this.R, this.f3167R.toString());
            StringBuilder sb = this.f3167R;
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        R();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        R();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                R();
            } else {
                this.f3167R.append(c);
            }
        }
    }
}
