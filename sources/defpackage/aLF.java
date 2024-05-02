package defpackage;

/* renamed from: aLF  reason: default package */
/* loaded from: classes.dex */
public enum aLF implements eNc {
    UNKNOWN_STATUS(0),
    ENABLED(1),
    DISABLED(2),
    DESTROYED(3),
    UNRECOGNIZED(-1);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f841e;

    aLF(int i) {
        this.f841e = i;
    }

    public final int R() {
        if (this != UNRECOGNIZED) {
            return this.f841e;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
