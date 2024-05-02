package defpackage;

/* renamed from: iMP  reason: default package */
/* loaded from: classes.dex */
public enum iMP {
    DESTROYED,
    INITIALIZED,
    CREATED,
    STARTED,
    RESUMED;

    public final boolean R(iMP imp) {
        return compareTo(imp) >= 0;
    }
}
