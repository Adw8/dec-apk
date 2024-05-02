package defpackage;

/* renamed from: giU  reason: default package */
/* loaded from: classes.dex */
public enum giU implements eNc {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f3883e;

    giU(int i) {
        this.f3883e = i;
    }

    public static giU R(int i) {
        if (i == 0) {
            return UNKNOWN_CURVE;
        }
        if (i == 2) {
            return NIST_P256;
        }
        if (i == 3) {
            return NIST_P384;
        }
        if (i == 4) {
            return NIST_P521;
        }
        if (i != 5) {
            return null;
        }
        return CURVE25519;
    }

    public final int v() {
        if (this != UNRECOGNIZED) {
            return this.f3883e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
