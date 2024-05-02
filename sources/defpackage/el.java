package defpackage;

import android.view.Choreographer;
import androidx.compose.ui.platform.e;

/* renamed from: el  reason: default package */
/* loaded from: classes.dex */
public final class el implements kJx {
    public final Choreographer R;

    public el(Choreographer choreographer) {
        this.R = choreographer;
    }

    @Override // defpackage.nbD
    public final nbD H(e86 e86) {
        return dTl.d(this, e86);
    }

    @Override // defpackage.nbD
    public final nbD M(nbD nbd) {
        return jjU.t(this, nbd);
    }

    @Override // defpackage.hdJ, defpackage.nbD
    public final hdJ O(e86 e86) {
        return dTl.J(this, e86);
    }

    @Override // defpackage.kJx
    public final Object W(kg9 kg9, aOO aoo) {
        hdJ O = aoo.v().O(hw1.c);
        hk hkVar = O instanceof hk ? (hk) O : null;
        xx xxVar = new xx(1, n3x.U(aoo));
        xxVar.j();
        Ya ya = new Ya(xxVar, this, kg9);
        if (hkVar == null || !n3x.v(hkVar.f4362R, this.R)) {
            this.R.postFrameCallback(ya);
            xxVar.y(new e(this, 3, ya));
        } else {
            synchronized (hkVar.f4365R) {
                hkVar.f4366R.add(ya);
                if (!hkVar.f4368v) {
                    hkVar.f4368v = true;
                    hkVar.f4362R.postFrameCallback(hkVar.f4360R);
                }
            }
            xxVar.y(new e(hkVar, 2, ya));
        }
        return xxVar.P();
    }

    @Override // defpackage.nbD
    public final Object o(Object obj, iv7 iv7) {
        return iv7.J(obj, this);
    }
}
