package defpackage;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.util.Arrays;
import javax.crypto.KeyGenerator;

/* renamed from: Uc  reason: default package */
/* loaded from: classes.dex */
public final class Uc implements l6X {
    public static final /* synthetic */ int R = 0;

    /* renamed from: R  reason: collision with other field name */
    public final String f570R;

    /* renamed from: R  reason: collision with other field name */
    public KeyStore f571R;

    public Uc() {
        this(new h5(29));
    }

    public static void R(String str) {
        if (!new Uc().c(str)) {
            String v = d_i.v(str);
            KeyGenerator instance = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            instance.init(new KeyGenParameterSpec.Builder(v, 3).setKeySize(256).setBlockModes("GCM").setEncryptionPaddings("NoPadding").build());
            instance.generateKey();
            return;
        }
        throw new IllegalArgumentException(String.format("cannot generate a new key %s because it already exists; please delete it with deleteKey() and try again", str));
    }

    public final synchronized boolean c(String str) {
        String str2;
        try {
        } catch (NullPointerException unused) {
            Log.w("Uc", "Keystore is temporarily unavailable, wait 20ms, reinitialize Keystore and try again.");
            try {
                Thread.sleep(20);
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                this.f571R = instance;
                instance.load(null);
            } catch (IOException e) {
                throw new GeneralSecurityException(e);
            } catch (InterruptedException unused2) {
            }
            return this.f571R.containsAlias(str2);
        }
        return this.f571R.containsAlias(d_i.v(str));
    }

    public final synchronized ai v(String str) {
        ai aiVar;
        String str2 = this.f570R;
        if (str2 != null && !str2.equals(str)) {
            throw new GeneralSecurityException(String.format("this client is bound to %s, cannot load keys bound to %s", this.f570R, str));
        }
        aiVar = new ai(d_i.v(str), this.f571R);
        byte[] R2 = opU.R(10);
        byte[] bArr = new byte[0];
        if (!Arrays.equals(R2, aiVar.v(aiVar.R(R2, bArr), bArr))) {
            throw new KeyStoreException("cannot use Android Keystore: encryption/decryption of non-empty message and empty aad returns an incorrect result");
        }
        return aiVar;
    }

    public Uc(h5 h5Var) {
        this.f570R = (String) h5Var.R;
        this.f571R = (KeyStore) h5Var.v;
    }
}
