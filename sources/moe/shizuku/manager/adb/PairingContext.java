package moe.shizuku.manager.adb;

/* access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class PairingContext {
    public final long R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f6157R;

    public PairingContext(long j) {
        this.R = j;
        this.f6157R = nativeMsg(j);
    }

    /* access modifiers changed from: private */
    public static final native long nativeConstructor(boolean z, byte[] bArr);

    private final native byte[] nativeDecrypt(long j, byte[] bArr);

    private final native void nativeDestroy(long j);

    private final native byte[] nativeEncrypt(long j, byte[] bArr);

    private final native boolean nativeInitCipher(long j, byte[] bArr);

    private final native byte[] nativeMsg(long j);

    public final boolean X(byte[] bArr) {
        return nativeInitCipher(this.R, bArr);
    }

    public final void c() {
        nativeDestroy(this.R);
    }

    public final byte[] e(byte[] bArr) {
        return nativeEncrypt(this.R, bArr);
    }

    public final byte[] v(byte[] bArr) {
        return nativeDecrypt(this.R, bArr);
    }
}
