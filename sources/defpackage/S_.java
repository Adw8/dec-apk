package defpackage;

import java.security.GeneralSecurityException;

/* renamed from: S_  reason: default package */
/* loaded from: classes.dex */
public abstract class S_ {
    public static final aS_ R;

    /* renamed from: R  reason: collision with other field name */
    public static final oTE f518R;

    /* renamed from: R  reason: collision with other field name */
    public static final jlw f517R = new jlw();

    /* renamed from: R  reason: collision with other field name */
    public static final eVr f516R = new eVr();

    static {
        nE I = lTs.I("type.googleapis.com/google.crypto.tink.AesCmacKey");
        R = new aS_(I);
        f518R = new oTE(new gkL(4), I);
    }

    public static U9 R(X0 x0, hPF hpf) {
        o7 o7Var;
        int y = x0.y();
        int ordinal = hpf.ordinal();
        if (ordinal == 1) {
            o7Var = o7.R;
        } else if (ordinal == 2) {
            o7Var = o7.c;
        } else if (ordinal == 3) {
            o7Var = o7.e;
        } else if (ordinal == 4) {
            o7Var = o7.v;
        } else {
            StringBuilder U = opT.U("Unable to parse OutputPrefixType: ");
            U.append(hpf.v());
            throw new GeneralSecurityException(U.toString());
        }
        if (y >= 10 && 16 >= y) {
            return new U9(y, o7Var);
        }
        throw new GeneralSecurityException(opT.Z("Invalid tag size for AesCmacParameters: ", y));
    }
}
