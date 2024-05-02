package defpackage;

/* renamed from: gDn  reason: default package */
/* loaded from: classes.dex */
public enum gDn {
    ENQUEUED,
    RUNNING,
    SUCCEEDED,
    FAILED,
    BLOCKED,
    CANCELLED;

    public final boolean R() {
        return this == SUCCEEDED || this == FAILED || this == CANCELLED;
    }
}
