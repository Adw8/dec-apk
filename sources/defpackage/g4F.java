package defpackage;

import java.io.IOException;
import java.util.List;

/* renamed from: g4F  reason: default package */
/* loaded from: classes.dex */
public final class g4F implements kEi {
    public static final List R = khE.X("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");
    public static final List v = khE.X("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* renamed from: R  reason: collision with other field name */
    public volatile dj8 f3663R;

    /* renamed from: R  reason: collision with other field name */
    public final ety f3664R;

    /* renamed from: R  reason: collision with other field name */
    public final jFB f3665R;

    /* renamed from: R  reason: collision with other field name */
    public final jr5 f3666R;

    /* renamed from: R  reason: collision with other field name */
    public final nX1 f3667R;

    /* renamed from: R  reason: collision with other field name */
    public volatile boolean f3668R;

    public g4F(nZz nzz, ot7 ot7, ety ety, jr5 jr5) {
        this.f3665R = ot7;
        this.f3664R = ety;
        this.f3666R = jr5;
        List list = nzz.f6456e;
        nX1 nx1 = nX1.H2_PRIOR_KNOWLEDGE;
        this.f3667R = !list.contains(nx1) ? nX1.HTTP_2 : nx1;
    }

    @Override // defpackage.kEi
    public final void L() {
        gtV gtv = this.f3666R.f5032R;
        synchronized (gtv) {
            if (!gtv.v) {
                gtv.f3966R.flush();
            } else {
                throw new IOException("closed");
            }
        }
    }

    @Override // defpackage.kEi
    public final jFB O() {
        return this.f3665R;
    }

    @Override // defpackage.kEi
    public final void R() {
        this.f3663R.O().close();
    }

    @Override // defpackage.kEi
    public final axx X(j0 j0Var, long j) {
        return this.f3663R.O();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0029, code lost:
        if (r1 == false) goto L_0x002c;
     */
    @Override // defpackage.kEi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.eUn Z(boolean r11) {
        /*
        // Method dump skipped, instructions count: 269
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4F.Z(boolean):eUn");
    }

    @Override // defpackage.kEi
    public final long c(dEt det) {
        if (!nIq.R(det)) {
            return 0;
        }
        return khE.e(det);
    }

    @Override // defpackage.kEi
    public final void cancel() {
        this.f3668R = true;
        dj8 dj8 = this.f3663R;
        if (dj8 != null) {
            dj8.X(gtp.CANCEL);
        }
    }

    @Override // defpackage.kEi
    public final fGn e(dEt det) {
        return this.f3663R.f2836R;
    }

    /* JADX WARNING: Removed duplicated region for block: B:44:0x0107 A[Catch: all -> 0x01a6, TRY_LEAVE, TryCatch #3 {, blocks: (B:27:0x00c6, B:45:0x0110, B:46:0x0111, B:47:0x0113, B:59:0x0148, B:28:0x00c7, B:30:0x00ce, B:31:0x00d3, B:33:0x00d7, B:35:0x00ed, B:37:0x00f5, B:42:0x0101, B:44:0x0107, B:80:0x01a0, B:81:0x01a5, B:48:0x0114, B:50:0x0118, B:55:0x0133, B:56:0x0135, B:58:0x0144, B:78:0x0195, B:79:0x019c), top: B:85:0x00c6 }] */
    @Override // defpackage.kEi
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(defpackage.j0 r19) {
        /*
        // Method dump skipped, instructions count: 428
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g4F.m(j0):void");
    }

    @Override // defpackage.kEi
    public final bd4 v() {
        bd4 bd4;
        dj8 dj8 = this.f3663R;
        synchronized (dj8) {
            bP9 bp9 = dj8.f2836R;
            if (bp9.f1635R && bp9.f1632R.r() && dj8.f2836R.v.r()) {
                bd4 = dj8.f2836R.f1633R;
                if (bd4 == null) {
                    bd4 = khE.R;
                }
            } else if (dj8.f2837R != null) {
                IOException iOException = dj8.f2838R;
                if (iOException != null) {
                    throw iOException;
                }
                throw new aXf(dj8.f2837R);
            } else {
                throw new IllegalStateException("too early; can't read the trailers yet");
            }
        }
        return bd4;
    }
}
