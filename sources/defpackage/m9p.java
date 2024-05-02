package defpackage;

/* renamed from: m9p  reason: default package */
/* loaded from: classes.dex */
public enum m9p {
    Session("session"),
    Event("event"),
    UserFeedback("user_report"),
    Attachment("attachment"),
    Transaction("transaction"),
    Profile("profile"),
    ClientReport("client_report"),
    Unknown("__unknown__");
    
    private final String itemType;

    m9p(String str) {
        this.itemType = str;
    }

    public static m9p resolve(Object obj) {
        return obj instanceof cr0 ? Event : obj instanceof dvG ? Transaction : obj instanceof h9w ? Session : obj instanceof e0 ? ClientReport : Attachment;
    }

    public static m9p valueOfLabel(String str) {
        m9p[] values = values();
        for (m9p m9p : values) {
            if (m9p.itemType.equals(str)) {
                return m9p;
            }
        }
        return Unknown;
    }

    public String getItemType() {
        return this.itemType;
    }

    public void serialize(iHO iho, g79 g79) {
        iho.R(this.itemType);
    }
}
