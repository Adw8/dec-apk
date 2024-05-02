package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: eQL  reason: default package */
/* loaded from: classes.dex */
public final class eQL extends guO {
    public static final byte[] R = new byte[0];

    public eQL() {
        super(apQ.class, new eF(j7x.class, 10));
    }

    public static jeE J(ljd ljd, lV8 lv8, byte[] bArr, int i) {
        hPF hpf;
        fo3 y = ge4.y();
        juz K = lVo.K();
        K.X();
        lVo.j((lVo) K.v);
        K.X();
        lVo.g((lVo) K.v);
        MH H = b0.H(bArr, 0, bArr.length);
        K.X();
        lVo.y((lVo) K.v, H);
        lVo lvo = (lVo) K.v();
        a4y K2 = k1p.K();
        String V = lv8.R.V();
        K2.X();
        k1p.j((k1p) K2.v, V);
        MH c = b0.c(lv8.R.o().t());
        K2.X();
        k1p.g((k1p) K2.v, c);
        int ordinal = lv8.R.i().ordinal();
        int i2 = 4;
        if (ordinal == 1) {
            i2 = 1;
        } else if (ordinal == 2) {
            i2 = 2;
        } else if (ordinal == 3) {
            i2 = 3;
        } else if (ordinal != 4) {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        int I = jQ.I(i2);
        if (I == 0) {
            hpf = hPF.TINK;
        } else if (I == 1) {
            hpf = hPF.LEGACY;
        } else if (I == 2) {
            hpf = hPF.RAW;
        } else if (I == 3) {
            hpf = hPF.CRUNCHY;
        } else {
            throw new IllegalArgumentException("Unknown output prefix type");
        }
        K2.X();
        k1p.y((k1p) K2.v, hpf);
        blC t = cMp.t();
        t.X();
        cMp.j((cMp) t.v, (k1p) K2.v());
        bTS K3 = jhs.K();
        K3.X();
        jhs.j((jhs) K3.v, lvo);
        K3.X();
        jhs.g((jhs) K3.v, (cMp) t.v());
        K3.X();
        jhs.y((jhs) K3.v, ljd);
        y.X();
        ge4.j((ge4) y.v, (jhs) K3.v());
        return new jeE((ge4) y.v(), i);
    }

    @Override // defpackage.Dd
    public final void K(qN qNVar) {
        apQ apq = (apQ) qNVar;
        if (!(apq.t().size() == 0)) {
            d_i.c(apq.V());
            hDC.E(apq.i().V());
            return;
        }
        throw new GeneralSecurityException("invalid ECIES private key");
    }

    @Override // defpackage.Dd
    public final String P() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // defpackage.Dd
    public final qN i(b0 b0Var) {
        return apQ.K(b0Var, nCG.R());
    }

    @Override // defpackage.Dd
    public final f6h t() {
        return f6h.ASYMMETRIC_PRIVATE;
    }

    @Override // defpackage.Dd
    public final imt y() {
        return new EP(this, ge4.class, 10);
    }
}
