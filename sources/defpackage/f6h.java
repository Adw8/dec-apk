package defpackage;

/* renamed from: f6h  reason: default package */
/* loaded from: classes.dex */
public enum f6h implements eNc {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f3308e;

    f6h(int i) {
        this.f3308e = i;
    }

    public static f6h R(int i) {
        if (i == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i == 1) {
            return SYMMETRIC;
        }
        if (i == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i != 4) {
            return null;
        }
        return REMOTE;
    }

    public final int v() {
        if (this != UNRECOGNIZED) {
            return this.f3308e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
