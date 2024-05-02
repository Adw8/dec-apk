package defpackage;

/* renamed from: oRt  reason: default package */
/* loaded from: classes.dex */
public enum oRt {
    All("__all__"),
    Default("default"),
    Error("error"),
    Session("session"),
    Attachment("attachment"),
    Transaction("transaction"),
    Security("security"),
    UserReport("user_report"),
    Unknown("unknown");
    
    private final String category;

    oRt(String str) {
        this.category = str;
    }

    public String getCategory() {
        return this.category;
    }
}
