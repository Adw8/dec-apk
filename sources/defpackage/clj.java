package defpackage;

/* renamed from: clj  reason: default package */
/* loaded from: classes.dex */
public enum clj implements eNc {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f2189e;

    clj(int i) {
        this.f2189e = i;
    }

    public static clj R(int i) {
        if (i == 0) {
            return UNKNOWN_HASH;
        }
        if (i == 1) {
            return SHA1;
        }
        if (i == 2) {
            return SHA384;
        }
        if (i == 3) {
            return SHA256;
        }
        if (i == 4) {
            return SHA512;
        }
        if (i != 5) {
            return null;
        }
        return SHA224;
    }

    public final int v() {
        if (this != UNRECOGNIZED) {
            return this.f2189e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
