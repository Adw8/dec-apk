package defpackage;

/* renamed from: inw  reason: default package */
/* loaded from: classes.dex */
public enum inw implements eNc {
    KEM_UNKNOWN(0),
    DHKEM_X25519_HKDF_SHA256(1),
    DHKEM_P256_HKDF_SHA256(2),
    DHKEM_P384_HKDF_SHA384(3),
    DHKEM_P521_HKDF_SHA512(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f4730e;

    inw(int i) {
        this.f4730e = i;
    }

    public static inw R(int i) {
        if (i == 0) {
            return KEM_UNKNOWN;
        }
        if (i == 1) {
            return DHKEM_X25519_HKDF_SHA256;
        }
        if (i == 2) {
            return DHKEM_P256_HKDF_SHA256;
        }
        if (i == 3) {
            return DHKEM_P384_HKDF_SHA384;
        }
        if (i != 4) {
            return null;
        }
        return DHKEM_P521_HKDF_SHA512;
    }

    public final int v() {
        if (this != UNRECOGNIZED) {
            return this.f4730e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
