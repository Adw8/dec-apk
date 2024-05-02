package defpackage;

/* renamed from: gtp  reason: default package */
/* loaded from: classes.dex */
public enum gtp {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    /* Fake field, exist only in values array */
    SETTINGS_TIMEOUT(4),
    /* Fake field, exist only in values array */
    STREAM_CLOSED(5),
    /* Fake field, exist only in values array */
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    /* Fake field, exist only in values array */
    COMPRESSION_ERROR(9),
    /* Fake field, exist only in values array */
    CONNECT_ERROR(10),
    /* Fake field, exist only in values array */
    ENHANCE_YOUR_CALM(11),
    /* Fake field, exist only in values array */
    INADEQUATE_SECURITY(12),
    /* Fake field, exist only in values array */
    HTTP_1_1_REQUIRED(13);
    

    /* renamed from: e  reason: collision with other field name */
    public final int f3974e;

    gtp(int i) {
        this.f3974e = i;
    }
}
