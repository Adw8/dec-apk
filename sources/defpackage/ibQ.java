package defpackage;

import java.nio.charset.Charset;

/* renamed from: ibQ  reason: default package */
/* loaded from: classes.dex */
public abstract class ibQ {
    public static final /* synthetic */ int R = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static cLd R(dxG dxg) {
        aZR t = cLd.t();
        int V = dxg.V();
        t.X();
        cLd.j((cLd) t.v, V);
        for (okQ okq : dxg.i()) {
            dLU V2 = h4d.V();
            String V3 = okq.i().V();
            V2.X();
            h4d.j((h4d) V2.v, V3);
            aLF K = okq.K();
            V2.X();
            h4d.y((h4d) V2.v, K);
            hPF o = okq.o();
            V2.X();
            h4d.g((h4d) V2.v, o);
            int V4 = okq.V();
            V2.X();
            h4d.t((h4d) V2.v, V4);
            t.X();
            cLd.g((cLd) t.v, (h4d) V2.v());
        }
        return (cLd) t.v();
    }
}
