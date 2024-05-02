package defpackage;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* renamed from: ibk  reason: default package */
/* loaded from: classes.dex */
public abstract class ibk {

    /* renamed from: R  reason: collision with other field name */
    public static final byte[] f4663R;
    public static final Charset R = Charset.forName("US-ASCII");
    public static final Charset v = Charset.forName("UTF-8");

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f4663R = bArr;
        ByteBuffer.wrap(bArr);
        int i = (0 - 0) + 0;
        try {
            if (i < 0) {
                throw b7b.X();
            } else if (i > Integer.MAX_VALUE) {
                throw b7b.O();
            }
        } catch (b7b e) {
            throw new IllegalArgumentException(e);
        }
    }

    public static int R(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static csA v(Object obj, Object obj2) {
        csA csa = (csA) ((qN) obj);
        c_m c_m = (c_m) csa.L(hZW.NEW_BUILDER);
        c_m.O(csa);
        qN qNVar = (qN) obj2;
        if (c_m.R.getClass().isInstance(qNVar)) {
            c_m.O((csA) qNVar);
            return c_m.e();
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
