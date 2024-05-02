package defpackage;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* renamed from: j3D  reason: default package */
/* loaded from: classes.dex */
public final class j3D {

    /* renamed from: R  reason: collision with other field name */
    public byte[] f4810R;
    public byte[] v;

    /* renamed from: R  reason: collision with other field name */
    public static final String f4806R = j3D.class.getSimpleName() + ".gz";
    public static final byte[] c = {(byte) 42};

    /* renamed from: R  reason: collision with other field name */
    public static final List f4807R = Collections.singletonList("*");
    public static final j3D R = new j3D();

    /* renamed from: R  reason: collision with other field name */
    public final AtomicBoolean f4809R = new AtomicBoolean(false);

    /* renamed from: R  reason: collision with other field name */
    public final CountDownLatch f4808R = new CountDownLatch(1);

    static {
        new kgV(17, 0);
    }

    public static List c(String str) {
        int i = 0;
        List b = iH_.b(str, new char[]{'.'}, 0, 6);
        if (!n3x.v(dF.zw(b), "")) {
            return b;
        }
        int size = b.size() - 1;
        if (size >= 0) {
            i = size;
        }
        return dF.vz(b, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0031, code lost:
        if (r1 == false) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001e, code lost:
        if (r1 != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String R(java.lang.String r12) {
        /*
        // Method dump skipped, instructions count: 408
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3D.R(java.lang.String):java.lang.String");
    }

    public final void v() {
        InputStream resourceAsStream = j3D.class.getResourceAsStream(f4806R);
        if (resourceAsStream != null) {
            Logger logger = iaf.R;
            oDA oda = new oDA(new bsF(new J8(resourceAsStream, new hqj())));
            th = null;
            try {
                byte[] N = oda.N((long) oda.readInt());
                byte[] N2 = oda.N((long) oda.readInt());
                synchronized (this) {
                    this.f4810R = N;
                    this.v = N2;
                }
                this.f4808R.countDown();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        }
    }
}
