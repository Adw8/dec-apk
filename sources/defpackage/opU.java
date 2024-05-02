package defpackage;

import java.security.SecureRandom;

/* renamed from: opU  reason: default package */
/* loaded from: classes.dex */
public abstract class opU {
    public static final Fl R = new Fl(6);

    public static byte[] R(int i) {
        byte[] bArr = new byte[i];
        ((SecureRandom) R.get()).nextBytes(bArr);
        return bArr;
    }
}
