package defpackage;

/* renamed from: i2m  reason: default package */
/* loaded from: classes.dex */
public enum i2m {
    QUEUE_OVERFLOW("queue_overflow"),
    CACHE_OVERFLOW("cache_overflow"),
    RATELIMIT_BACKOFF("ratelimit_backoff"),
    NETWORK_ERROR("network_error"),
    SAMPLE_RATE("sample_rate"),
    BEFORE_SEND("before_send"),
    EVENT_PROCESSOR("event_processor");
    
    private final String reason;

    i2m(String str) {
        this.reason = str;
    }

    public String getReason() {
        return this.reason;
    }
}
