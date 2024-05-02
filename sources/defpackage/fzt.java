package defpackage;

import java.io.Serializable;

/* renamed from: fzt  reason: default package */
/* loaded from: classes.dex */
public enum fzt {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(b0.class, b0.f1499R),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);
    

    /* renamed from: R  reason: collision with other field name */
    public final Object f3646R;

    fzt(Class cls, Serializable serializable) {
        this.f3646R = serializable;
    }
}
