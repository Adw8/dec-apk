package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;

/* renamed from: hBL  reason: default package */
/* loaded from: classes.dex */
public final class hBL extends k8u {
    public final Handler R;

    /* renamed from: R  reason: collision with other field name */
    public final hBL f4160R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4161R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f4162R;
    private volatile hBL _immediate;

    public hBL(Handler handler, String str, boolean z) {
        this.R = handler;
        this.f4161R = str;
        this.f4162R = z;
        this._immediate = z ? this : null;
        hBL hbl = this._immediate;
        if (hbl == null) {
            hbl = new hBL(handler, str, true);
            this._immediate = hbl;
        }
        this.f4160R = hbl;
    }

    @Override // defpackage.mou
    public final void C(long j, xx xxVar) {
        bx bxVar = new bx(xxVar, this, 21);
        Handler handler = this.R;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(bxVar, j)) {
            xxVar.y(new Wn(this, 5, bxVar));
        } else {
            vl(xxVar.f7480R, bxVar);
        }
    }

    public final boolean equals(Object obj) {
        return (obj instanceof hBL) && ((hBL) obj).R == this.R;
    }

    @Override // defpackage.mou
    public final jZi f(long j, Runnable runnable, nbD nbd) {
        Handler handler = this.R;
        if (j > 4611686018427387903L) {
            j = 4611686018427387903L;
        }
        if (handler.postDelayed(runnable, j)) {
            return new jZi(runnable) { // from class: oEi

                /* renamed from: R  reason: collision with other field name */
                public final /* synthetic */ Runnable f6717R;

                {
                    this.f6717R = r2;
                }

                @Override // defpackage.jZi
                public final void R() {
                    hBL hbl = hBL.this;
                    hbl.R.removeCallbacks(this.f6717R);
                }
            };
        }
        vl(nbd, runnable);
        return orE.R;
    }

    public final int hashCode() {
        return System.identityHashCode(this.R);
    }

    @Override // defpackage.kE9
    public final void mL(nbD nbd, Runnable runnable) {
        if (!this.R.post(runnable)) {
            vl(nbd, runnable);
        }
    }

    @Override // defpackage.kE9, java.lang.Object
    public final String toString() {
        String str;
        hBL hbl;
        h8R h8r = iFn.R;
        fhC fhc = hJr.R;
        if (this == fhc) {
            str = "Dispatchers.Main";
        } else {
            try {
                hbl = ((hBL) fhc).f4160R;
            } catch (UnsupportedOperationException unused) {
                hbl = null;
            }
            str = this == hbl ? "Dispatchers.Main.immediate" : null;
        }
        if (str != null) {
            return str;
        }
        String str2 = this.f4161R;
        if (str2 == null) {
            str2 = this.R.toString();
        }
        return this.f4162R ? opT.H(str2, ".immediate") : str2;
    }

    public final void vl(nbD nbd, Runnable runnable) {
        dTl.j(nbd, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        iFn.f4518R.mL(nbd, runnable);
    }

    @Override // defpackage.kE9
    public final boolean zw(nbD nbd) {
        return !this.f4162R || !n3x.v(Looper.myLooper(), this.R.getLooper());
    }

    public hBL(Handler handler) {
        this(handler, null, false);
    }
}
