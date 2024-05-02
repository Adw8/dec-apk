package defpackage;

/* renamed from: hPF  reason: default package */
/* loaded from: classes.dex */
public enum hPF implements eNc {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f4230e;

    hPF(int i) {
        this.f4230e = i;
    }

    public static hPF R(int i) {
        if (i == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i == 1) {
            return TINK;
        }
        if (i == 2) {
            return LEGACY;
        }
        if (i == 3) {
            return RAW;
        }
        if (i != 4) {
            return null;
        }
        return CRUNCHY;
    }

    public final int v() {
        if (this != UNRECOGNIZED) {
            return this.f4230e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
