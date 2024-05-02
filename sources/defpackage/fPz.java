package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: fPz  reason: default package */
/* loaded from: classes.dex */
public final class fPz implements gOQ {
    public static final foJ R = new foJ();

    @Override // defpackage.gOQ
    public final boolean R(SSLSocket sSLSocket) {
        return Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.gOQ
    public final boolean c() {
        boolean z = lkW.R;
        return lkW.R;
    }

    @Override // defpackage.gOQ
    public final String e(SSLSocket sSLSocket) {
        if (R(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.gOQ
    public final void v(SSLSocket sSLSocket, String str, List list) {
        if (R(sSLSocket)) {
            Conscrypt.setUseSessionTickets(sSLSocket, true);
            oMv omv = oMv.f6773R;
            Object[] array = atb.R(list).toArray(new String[0]);
            if (array != null) {
                Conscrypt.setApplicationProtocols(sSLSocket, (String[]) array);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
    }
}
