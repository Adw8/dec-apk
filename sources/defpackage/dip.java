package defpackage;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.net.InetAddress;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.ProviderException;
import java.util.Arrays;
import java.util.List;
import javax.crypto.KeyGenerator;

/* renamed from: dip  reason: default package */
/* loaded from: classes.dex */
public abstract class dip {
    public static final List R = pdD.Y(InetAddress.getByAddress(new byte[]{38, 6, 71, 0, 71, 0, 0, 0, 0, 0, 0, 0, 0, 0, 17, 17}), InetAddress.getByAddress(new byte[]{38, 6, 71, 0, 71, 0, 0, 0, 0, 0, 0, 0, 0, 0, 16, 1}), InetAddress.getByAddress(new byte[]{1, 0, 0, 1}), InetAddress.getByAddress(new byte[]{1, 1, 1, 1}));
    public static final List v = pdD.Y(afN.R(-33475001963404L), afN.R(-33560901309324L), afN.R(-33633915753356L), afN.R(-33706930197388L), afN.R(-33779944641420L));

    public static final nTM R(Context context, F4 f4) {
        XN xn;
        h5 U;
        XN xn2;
        h5 U2;
        String H = opT.H(f4.R, "_preferences2");
        String R2 = afN.R(-31907338900364L);
        Context applicationContext = context.getApplicationContext();
        boolean hasSystemFeature = context.getPackageManager().hasSystemFeature(afN.R(-32186511774604L));
        KeyGenParameterSpec.Builder keySize = new KeyGenParameterSpec.Builder(R2, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256);
        if (hasSystemFeature && applicationContext.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
            keySize.setIsStrongBoxBacked(true);
        }
        KeyGenParameterSpec build = keySize.build();
        if (build != null) {
            int i = lxN.R;
            if (build.getKeySize() != 256) {
                StringBuilder U3 = opT.U("invalid key size, want 256 bits got ");
                U3.append(build.getKeySize());
                U3.append(" bits");
                throw new IllegalArgumentException(U3.toString());
            } else if (!Arrays.equals(build.getBlockModes(), new String[]{"GCM"})) {
                StringBuilder U4 = opT.U("invalid block mode, want GCM got ");
                U4.append(Arrays.toString(build.getBlockModes()));
                throw new IllegalArgumentException(U4.toString());
            } else if (build.getPurposes() != 3) {
                StringBuilder U5 = opT.U("invalid purposes mode, want PURPOSE_ENCRYPT | PURPOSE_DECRYPT got ");
                U5.append(build.getPurposes());
                throw new IllegalArgumentException(U5.toString());
            } else if (!Arrays.equals(build.getEncryptionPaddings(), new String[]{"NoPadding"})) {
                StringBuilder U6 = opT.U("invalid padding mode, want NoPadding got ");
                U6.append(Arrays.toString(build.getEncryptionPaddings()));
                throw new IllegalArgumentException(U6.toString());
            } else if (!build.isUserAuthenticationRequired() || build.getUserAuthenticationValidityDurationSeconds() >= 1) {
                String keystoreAlias = build.getKeystoreAlias();
                KeyStore instance = KeyStore.getInstance("AndroidKeyStore");
                instance.load(null);
                if (!instance.containsAlias(keystoreAlias)) {
                    try {
                        KeyGenerator instance2 = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                        instance2.init(build);
                        instance2.generateKey();
                    } catch (ProviderException e) {
                        throw new GeneralSecurityException(e.getMessage(), e);
                    }
                }
                h5 h5Var = new h5(build, build.getKeystoreAlias());
                a0Z a0z = a0Z.R;
                fMz fmz = fMz.R;
                String str = (String) h5Var.R;
                String str2 = nKz.R;
                kWP.m(new o69());
                if (!gCW.R()) {
                    kWP.L(new Q0(9), true);
                }
                ym.R();
                Context applicationContext2 = context.getApplicationContext();
                zk zkVar = new zk();
                zkVar.f7504R = a0z.f715R;
                zkVar.c(applicationContext2, "__androidx_security_crypto_encrypted_prefs_key_keyset__", H);
                String str3 = "android-keystore://" + str;
                if (str3.startsWith("android-keystore://")) {
                    zkVar.f7502R = str3;
                    synchronized (zkVar) {
                        if (zkVar.f7502R != null) {
                            zkVar.R = zkVar.v();
                        }
                        zkVar.f7501R = zkVar.R();
                        xn = new XN(zkVar);
                    }
                    synchronized (xn) {
                        U = xn.f617R.U();
                    }
                    zk zkVar2 = new zk();
                    zkVar2.f7504R = fmz.f3399R;
                    zkVar2.c(applicationContext2, "__androidx_security_crypto_encrypted_prefs_value_keyset__", H);
                    String str4 = "android-keystore://" + str;
                    if (str4.startsWith("android-keystore://")) {
                        zkVar2.f7502R = str4;
                        synchronized (zkVar2) {
                            if (zkVar2.f7502R != null) {
                                zkVar2.R = zkVar2.v();
                            }
                            zkVar2.f7501R = zkVar2.R();
                            xn2 = new XN(zkVar2);
                        }
                        synchronized (xn2) {
                            U2 = xn2.f617R.U();
                        }
                        return new nTM(H, applicationContext2.getSharedPreferences(H, 0), (rg) U2.N(rg.class), (mZ_) U.N(mZ_.class));
                    }
                    throw new IllegalArgumentException("key URI must start with android-keystore://");
                }
                throw new IllegalArgumentException("key URI must start with android-keystore://");
            } else {
                throw new IllegalArgumentException("per-operation authentication is not supported (UserAuthenticationValidityDurationSeconds must be >0)");
            }
        } else {
            throw new NullPointerException("KeyGenParameterSpec was null after build() check");
        }
    }
}
