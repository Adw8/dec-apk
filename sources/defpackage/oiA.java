package defpackage;

/* renamed from: oiA  reason: default package */
/* loaded from: classes.dex */
public enum oiA implements eNc {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f6897e;

    oiA(int i) {
        this.f6897e = i;
    }

    public final int R() {
        if (this != UNRECOGNIZED) {
            return this.f6897e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
