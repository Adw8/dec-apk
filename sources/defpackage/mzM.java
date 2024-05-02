package defpackage;

import java.security.GeneralSecurityException;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: mzM  reason: default package */
/* loaded from: classes.dex */
public final class mzM {
    public static final mzM R = new mzM();

    /* renamed from: R  reason: collision with other field name */
    public final AtomicReference f6265R = new AtomicReference(new k7d(new piu(10)));

    public final TV R(iey iey) {
        k7d k7d = (k7d) this.f6265R.get();
        k7d.getClass();
        jj1 jj1 = new jj1(iey.class, iey.f4687R);
        if (k7d.v.containsKey(jj1)) {
            ((oTE) k7d.v.get(jj1)).R.getClass();
            jlw jlw = S_.f517R;
            if (iey.f4686R.equals("type.googleapis.com/google.crypto.tink.AesCmacKey")) {
                try {
                    pA K = pA.K(iey.R, nCG.R());
                    if (K.V() == 0) {
                        return TV.I(S_.R(K.i(), iey.f4684R), new gL6(29, nE.R(K.t().t())), iey.f4685R);
                    }
                    throw new GeneralSecurityException("Only version 0 keys are accepted");
                } catch (b7b | IllegalArgumentException unused) {
                    throw new GeneralSecurityException("Parsing AesCmacKey failed");
                }
            } else {
                throw new IllegalArgumentException("Wrong type URL in call to AesCmacParameters.parseParameters");
            }
        } else {
            throw new GeneralSecurityException("No Key Parser for requested key type " + jj1 + " available");
        }
    }
}
