package defpackage;

import java.io.IOException;

/* renamed from: oSI  reason: default package */
/* loaded from: classes.dex */
public final class oSI implements f_c {
    public final goc R;

    /* renamed from: R  reason: collision with other field name */
    public final /* synthetic */ jr5 f6829R;

    public oSI(jr5 jr5, goc goc) {
        this.f6829R = jr5;
        this.R = goc;
    }

    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:21:0x0000 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:18:0x0032 */
    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: oSI */
    /* JADX DEBUG: Multi-variable search result rejected for r5v1, resolved type: oSI */
    /* JADX DEBUG: Multi-variable search result rejected for r2v3, resolved type: jr5 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, o8s] */
    @Override // defpackage.f_c
    public final Object g() {
        Throwable th;
        gtp gtp;
        IOException e;
        gtp gtp2;
        try {
            gtp2 = gtp.INTERNAL_ERROR;
            e = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.R.c(this);
            do {
            } while (this.R.R(false, this));
            gtp gtp3 = gtp.NO_ERROR;
            try {
                gtp2 = gtp.CANCEL;
                this.f6829R.R(gtp3, gtp2, null);
                gtp = gtp3;
            } catch (IOException e2) {
                e = e2;
                gtp2 = gtp.PROTOCOL_ERROR;
                jr5 jr5 = this.f6829R;
                jr5.R(gtp2, gtp2, e);
                gtp = jr5;
                asb.v(this.R);
                this = o8s.R;
                return this;
            }
        } catch (IOException e3) {
            e = e3;
        } catch (Throwable th3) {
            th = th3;
            gtp = gtp2;
            this.f6829R.R(gtp, gtp2, e);
            asb.v(this.R);
            throw th;
        }
        asb.v(this.R);
        this = o8s.R;
        return this;
    }
}
