package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;

/* renamed from: a50  reason: default package */
/* loaded from: classes.dex */
public final class a50 implements orq {
    public final orq R;

    public a50(jcw jcw) {
        this.R = jcw;
    }

    @Override // defpackage.orq
    public final List c(String str) {
        try {
            try {
                return this.R.c(str);
            } catch (NullPointerException e) {
                UnknownHostException unknownHostException = new UnknownHostException(opT.H("Broken system behaviour for dns lookup of ", str));
                unknownHostException.initCause(e);
                throw unknownHostException;
            }
        } catch (UnknownHostException unused) {
            return P7.E(InetAddress.getAllByName(str));
        }
    }
}
