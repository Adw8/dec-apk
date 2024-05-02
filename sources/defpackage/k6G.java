package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* renamed from: k6G  reason: default package */
/* loaded from: classes.dex */
public final class k6G implements gOQ {
    public final cwg R;

    /* renamed from: R  reason: collision with other field name */
    public gOQ f5198R;

    public k6G(cwg cwg) {
        this.R = cwg;
    }

    @Override // defpackage.gOQ
    public final boolean R(SSLSocket sSLSocket) {
        return this.R.R(sSLSocket);
    }

    @Override // defpackage.gOQ
    public final boolean c() {
        return true;
    }

    @Override // defpackage.gOQ
    public final String e(SSLSocket sSLSocket) {
        gOQ goq;
        synchronized (this) {
            if (this.f5198R == null && this.R.R(sSLSocket)) {
                this.f5198R = this.R.O(sSLSocket);
            }
            goq = this.f5198R;
        }
        if (goq != null) {
            return goq.e(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.gOQ
    public final void v(SSLSocket sSLSocket, String str, List list) {
        gOQ goq;
        synchronized (this) {
            if (this.f5198R == null && this.R.R(sSLSocket)) {
                this.f5198R = this.R.O(sSLSocket);
            }
            goq = this.f5198R;
        }
        if (goq != null) {
            goq.v(sSLSocket, str, list);
        }
    }
}
