package defpackage;

import android.graphics.Canvas;
import android.widget.EdgeEffect;

/* renamed from: nyw  reason: default package */
/* loaded from: classes.dex */
public final class nyw extends mjG implements g4j {
    public final pU R;

    public nyw(pU pUVar) {
        this.R = pUVar;
    }

    @Override // defpackage.g4j
    public final void A(ohT oht) {
        jDh jdh = (jDh) oht;
        jdh.v();
        pU pUVar = this.R;
        if (!nqW.X(pUVar.R)) {
            Gp R = jdh.R.R.R();
            pUVar.f7094R.getValue();
            Canvas canvas = dO.R;
            Canvas canvas2 = ((W3) R).R;
            boolean z = true;
            if (!(iTI.U(pUVar.L) == 0.0f)) {
                pUVar.H(oht, pUVar.L, canvas2);
                pUVar.L.finish();
            }
            if (!pUVar.c.isFinished()) {
                z = pUVar.x(oht, pUVar.c, canvas2);
                VS.R.c(pUVar.L, iTI.U(pUVar.c), 0.0f);
            } else {
                z = false;
            }
            if (!(iTI.U(pUVar.X) == 0.0f)) {
                pUVar.m(oht, pUVar.X, canvas2);
                pUVar.X.finish();
            }
            if (!pUVar.f7089R.isFinished()) {
                EdgeEffect edgeEffect = pUVar.f7089R;
                int save = canvas2.save();
                canvas2.translate(0.0f, ((jDh) oht).mZ(pUVar.f7093R.f6700R.v()));
                boolean draw = edgeEffect.draw(canvas2);
                canvas2.restoreToCount(save);
                z = draw || z;
                VS.R.c(pUVar.X, iTI.U(pUVar.f7089R), 0.0f);
            }
            if (!(iTI.U(pUVar.Z) == 0.0f)) {
                pUVar.x(oht, pUVar.Z, canvas2);
                pUVar.Z.finish();
            }
            if (!pUVar.e.isFinished()) {
                z = pUVar.H(oht, pUVar.e, canvas2) || z;
                VS.R.c(pUVar.Z, iTI.U(pUVar.e), 0.0f);
            }
            if (!(iTI.U(pUVar.O) == 0.0f)) {
                EdgeEffect edgeEffect2 = pUVar.O;
                int save2 = canvas2.save();
                canvas2.translate(0.0f, ((jDh) oht).mZ(pUVar.f7093R.f6700R.v()));
                edgeEffect2.draw(canvas2);
                canvas2.restoreToCount(save2);
                pUVar.O.finish();
            }
            if (!pUVar.v.isFinished()) {
                if (!pUVar.m(oht, pUVar.v, canvas2) && !z) {
                    z = false;
                }
                VS.R.c(pUVar.O, iTI.U(pUVar.v), 0.0f);
            }
            if (z) {
                pUVar.U();
            }
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nyw)) {
            return false;
        }
        return n3x.v(this.R, ((nyw) obj).R);
    }

    public final int hashCode() {
        return this.R.hashCode();
    }

    public final String toString() {
        StringBuilder U = opT.U("DrawOverscrollModifier(overscrollEffect=");
        U.append(this.R);
        U.append(')');
        return U.toString();
    }
}
