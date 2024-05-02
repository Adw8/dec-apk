package defpackage;

import java.io.IOException;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: aFM  reason: default package */
/* loaded from: classes.dex */
public final class aFM implements eXP {
    public static final aFM R = new aFM();

    @Override // defpackage.eXP
    public final dEt R(ety ety) {
        kEi kei;
        lMx lmx = ety.f3237R;
        synchronized (lmx) {
            if (!lmx.f5676X) {
                throw new IllegalStateException("released".toString());
            } else if (!(!lmx.e)) {
                throw new IllegalStateException("Check failed.".toString());
            } else if (!(!lmx.c)) {
                throw new IllegalStateException("Check failed.".toString());
            }
        }
        oaB oab = lmx.f5672R;
        ot7 R2 = oab.R();
        nZz nzz = lmx.f5671R;
        Socket socket = R2.f7007v;
        Jl jl = R2.f6997R;
        NV nv = R2.f6998R;
        jr5 jr5 = R2.f7003R;
        if (jr5 != null) {
            kei = new g4F(nzz, R2, ety, jr5);
        } else {
            socket.setSoTimeout(ety.c);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            jl.e().L((long) ety.c, timeUnit);
            nv.e().L((long) ety.e, timeUnit);
            kei = new oIS(nzz, R2, jl, nv);
        }
        fPH fph = new fPH(lmx, lmx.X, oab, kei);
        lmx.R = fph;
        lmx.v = fph;
        synchronized (lmx) {
            lmx.c = true;
            lmx.e = true;
        }
        if (!lmx.O) {
            return ety.R(ety, 0, fph, null, 61).v(ety.f3235R);
        }
        throw new IOException("Canceled");
    }
}
