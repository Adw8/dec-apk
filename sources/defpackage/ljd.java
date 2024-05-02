package defpackage;

/* renamed from: ljd  reason: default package */
/* loaded from: classes.dex */
public enum ljd implements eNc {
    UNKNOWN_FORMAT(0),
    UNCOMPRESSED(1),
    COMPRESSED(2),
    DO_NOT_USE_CRUNCHY_UNCOMPRESSED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f5807e;

    ljd(int i) {
        this.f5807e = i;
    }

    public final int R() {
        if (this != UNRECOGNIZED) {
            return this.f5807e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
