package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* renamed from: foJ  reason: default package */
/* loaded from: classes.dex */
public final class foJ implements cwg {
    @Override // defpackage.cwg
    public final gOQ O(SSLSocket sSLSocket) {
        return new fPz();
    }

    @Override // defpackage.cwg
    public final boolean R(SSLSocket sSLSocket) {
        boolean z = lkW.R;
        return e23.e() && Conscrypt.isConscrypt(sSLSocket);
    }
}
