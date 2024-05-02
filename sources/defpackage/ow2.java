package defpackage;

/* renamed from: ow2  reason: default package */
/* loaded from: classes.dex */
public enum ow2 implements eNc {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f7031e;

    ow2(int i) {
        this.f7031e = i;
    }

    public final int R() {
        if (this != UNRECOGNIZED) {
            return this.f7031e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
