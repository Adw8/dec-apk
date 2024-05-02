package defpackage;

import java.net.Socket;
import java.security.Principal;
import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import javax.net.ssl.X509ExtendedKeyManager;

/* renamed from: zN  reason: default package */
/* loaded from: classes.dex */
public final class zN extends X509ExtendedKeyManager {
    public final /* synthetic */ jY R;

    /* renamed from: R  reason: collision with other field name */
    public final String f7500R = "key";

    public zN(jY jYVar) {
        this.R = jYVar;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseClientAlias(String[] strArr, Principal[] principalArr, Socket socket) {
        pby[] pbyArr = kxm.R;
        for (String str : strArr) {
            if (n3x.v(str, "RSA")) {
                return this.f7500R;
            }
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String chooseServerAlias(String str, Principal[] principalArr, Socket socket) {
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final X509Certificate[] getCertificateChain(String str) {
        pby[] pbyArr = kxm.R;
        if (n3x.v(str, this.f7500R)) {
            return new X509Certificate[]{this.R.f4957R};
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getClientAliases(String str, Principal[] principalArr) {
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final PrivateKey getPrivateKey(String str) {
        pby[] pbyArr = kxm.R;
        if (n3x.v(str, this.f7500R)) {
            return this.R.f4958R;
        }
        return null;
    }

    @Override // javax.net.ssl.X509KeyManager
    public final String[] getServerAliases(String str, Principal[] principalArr) {
        return null;
    }
}
