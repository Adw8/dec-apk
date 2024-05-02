package defpackage;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/* renamed from: ym  reason: default package */
/* loaded from: classes.dex */
public abstract class ym {
    public static final String R = new Q0(0).P();
    public static final String v = new Q0(3).P();

    static {
        new Q0(4);
        new Q0(2);
        new Q0(6);
        new Q0(7);
        new Q0(5);
        new Q0(8);
        int i = fax.CONFIG_NAME_FIELD_NUMBER;
        try {
            R();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void R() {
        kWP.m(new Q5());
        irb.R();
        boolean z = false;
        kWP.L(new Q0(0), true);
        kWP.L(new Q0(3), true);
        if (!gCW.R()) {
            kWP.L(new Q0(2), true);
            try {
                Cipher.getInstance("AES/GCM-SIV/NoPadding");
                z = true;
            } catch (NoSuchAlgorithmException | NoSuchPaddingException unused) {
            }
            if (z) {
                kWP.L(new Q0(4), true);
            }
            kWP.L(new Q0(5), true);
            kWP.L(new Q0(6), true);
            kWP.L(new Q0(7), true);
            kWP.L(new Q0(8), true);
        }
    }
}
