package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: dXD  reason: default package */
/* loaded from: classes.dex */
public final class dXD extends guO {
    public dXD() {
        super(lDz.class, new eF(j7x.class, 12));
    }

    public static jeE J(inw inw, oiA oia, ow2 ow2, int i) {
        dM4 K = iVb.K();
        K.X();
        iVb.j((iVb) K.v, inw);
        K.X();
        iVb.g((iVb) K.v, oia);
        K.X();
        iVb.y((iVb) K.v, ow2);
        bty y = jey.y();
        y.X();
        jey.j((jey) y.v, (iVb) K.v());
        return new jeE((jey) y.v(), i);
    }

    @Override // defpackage.Dd
    public final void K(qN qNVar) {
        lDz ldz = (lDz) qNVar;
        if (ldz.t().size() == 0) {
            throw new GeneralSecurityException("Private key is empty.");
        } else if (ldz.o()) {
            d_i.c(ldz.V());
            iZL.c(ldz.i().i());
        } else {
            throw new GeneralSecurityException("Missing public key.");
        }
    }

    @Override // defpackage.Dd
    public final String P() {
        return "type.googleapis.com/google.crypto.tink.HpkePrivateKey";
    }

    @Override // defpackage.Dd
    public final qN i(b0 b0Var) {
        return lDz.J(b0Var, nCG.R());
    }

    @Override // defpackage.Dd
    public final f6h t() {
        return f6h.ASYMMETRIC_PRIVATE;
    }

    @Override // defpackage.Dd
    public final imt y() {
        return new EP(this, jey.class, 11);
    }
}
