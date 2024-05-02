package defpackage;

/* renamed from: iGi  reason: default package */
/* loaded from: classes.dex */
public enum iGi {
    Preparing("Preparing"),
    Starting("Starting"),
    WaitInitServices("Starting services"),
    WaitLxd("Starting containers"),
    DrmPending("Checking license");
    
    private final String message;

    iGi(String str) {
        this.message = str;
    }

    public final String R() {
        return this.message;
    }
}
