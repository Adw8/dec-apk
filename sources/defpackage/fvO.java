package defpackage;

import android.content.Context;
import java.io.File;

/* renamed from: fvO  reason: default package */
/* loaded from: classes.dex */
public final class fvO implements fIY {
    public final Dn R;

    /* renamed from: R  reason: collision with other field name */
    public final Context f3615R;

    /* renamed from: R  reason: collision with other field name */
    public h_u f3616R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f3617R = new Object();

    /* renamed from: R  reason: collision with other field name */
    public final String f3618R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3619R;
    public boolean v;

    public fvO(Context context, String str, Dn dn, boolean z) {
        this.f3615R = context;
        this.f3618R = str;
        this.R = dn;
        this.f3619R = z;
    }

    @Override // defpackage.fIY
    public final gEL L() {
        return R().c();
    }

    public final h_u R() {
        h_u h_u;
        synchronized (this.f3617R) {
            if (this.f3616R == null) {
                iUj[] iujArr = new iUj[1];
                if (this.f3618R == null || !this.f3619R) {
                    this.f3616R = new h_u(this.f3615R, this.f3618R, iujArr, this.R);
                } else {
                    this.f3616R = new h_u(this.f3615R, new File(this.f3615R.getNoBackupFilesDir(), this.f3618R).getAbsolutePath(), iujArr, this.R);
                }
                this.f3616R.setWriteAheadLoggingEnabled(this.v);
            }
            h_u = this.f3616R;
        }
        return h_u;
    }

    @Override // defpackage.fIY, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        R().close();
    }

    @Override // defpackage.fIY
    public final String getDatabaseName() {
        return this.f3618R;
    }

    @Override // defpackage.fIY
    public final void setWriteAheadLoggingEnabled(boolean z) {
        synchronized (this.f3617R) {
            h_u h_u = this.f3616R;
            if (h_u != null) {
                h_u.setWriteAheadLoggingEnabled(z);
            }
            this.v = z;
        }
    }
}
