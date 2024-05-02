package defpackage;

import java.io.IOException;

/* renamed from: qh  reason: default package */
/* loaded from: classes.dex */
public final class qh implements fGn {
    public s0 R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ w1 f7376R;
    public int e;

    public qh(w1 w1Var) {
        this.f7376R = w1Var;
    }

    @Override // defpackage.fGn
    public final long Y(ME me, long j) {
        s0 s0Var = this.R;
        boolean z = false;
        if (s0Var == null) {
            w1 w1Var = this.f7376R;
            w1Var.getClass();
            try {
                s0Var = (s0) w1Var.f7445R.X(w1Var.X, 1163154007);
            } catch (IOException unused) {
                w1Var.close();
                s0Var = null;
            }
            this.R = s0Var;
            this.e = 0;
        }
        if (s0Var == null) {
            return -1;
        }
        int min = Math.min((int) j, s0Var.e - this.e);
        me.write(s0Var.f7405R, this.e, min);
        int i = this.e + min;
        this.e = i;
        int i2 = s0Var.e;
        if (i <= i2) {
            z = true;
        }
        if (z) {
            if (i == i2) {
                this.R = null;
                w1 w1Var2 = this.f7376R;
                w1Var2.f7446R.R(1497451343, w1Var2.X, w1Var2.O, null, 0);
            }
            return (long) min;
        }
        throw new IllegalStateException("Check failed.".toString());
    }

    @Override // defpackage.fGn, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // defpackage.fGn
    public final hqj e() {
        return hqj.R;
    }
}
