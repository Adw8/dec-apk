package defpackage;

import android.security.keystore.KeyGenParameterSpec;

/* renamed from: lxN  reason: default package */
/* loaded from: classes.dex */
public abstract class lxN {
    public static final /* synthetic */ int R = 0;

    static {
        new KeyGenParameterSpec.Builder("_androidx_security_master_key_", 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setKeySize(256).build();
    }
}
