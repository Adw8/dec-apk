package defpackage;

/* renamed from: fPS  reason: default package */
/* loaded from: classes.dex */
public abstract class fPS {
    public static final bV5 R = new bV5(mY_.m);

    public static final String R(byte[] bArr) {
        String R2 = afN.R(-49271891678092L);
        g5M g5m = g5M.C;
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (byte b : bArr) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) R2);
            }
            sb.append((CharSequence) g5m.x(Byte.valueOf(b)));
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }
}
