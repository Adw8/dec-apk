package defpackage;

import java.util.Locale;

/* renamed from: nse  reason: default package */
/* loaded from: classes.dex */
public enum nse {
    OK(200, 299),
    CANCELLED(499),
    INTERNAL_ERROR(500),
    UNKNOWN(500),
    UNKNOWN_ERROR(500),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(500),
    UNAUTHENTICATED(401);
    
    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    nse(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    public static nse fromHttpStatusCode(int i) {
        nse[] values = values();
        for (nse nse : values) {
            if (nse.matches(i)) {
                return nse;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    public void serialize(iHO iho, g79 g79) {
        iho.R(name().toLowerCase(Locale.ROOT));
    }

    public static nse fromHttpStatusCode(Integer num, nse nse) {
        nse fromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : nse;
        return fromHttpStatusCode != null ? fromHttpStatusCode : nse;
    }

    nse(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }
}
