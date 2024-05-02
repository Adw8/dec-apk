package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* renamed from: cB6  reason: default package */
/* loaded from: classes.dex */
public final class cB6 implements orq {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final List f2005R;
    public final /* synthetic */ int e = 0;

    public cB6(String str, List list) {
        this.R = str;
        this.f2005R = list;
    }

    @Override // defpackage.orq
    public final List c(String str) {
        switch (this.e) {
            case 0:
                if (n3x.v(this.R, str)) {
                    return this.f2005R;
                }
                try {
                    return P7.E(InetAddress.getAllByName(str));
                } catch (NullPointerException e) {
                    UnknownHostException unknownHostException = new UnknownHostException(opT.H("Broken system behaviour for dns lookup of ", str));
                    unknownHostException.initCause(e);
                    throw unknownHostException;
                }
            default:
                if (n3x.v(this.R, str)) {
                    return this.f2005R;
                }
                StringBuilder i = jQ.i("BootstrapDns called for ", str, " instead of ");
                i.append(this.R);
                throw new UnknownHostException(i.toString());
        }
    }
}
