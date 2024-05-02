package defpackage;

import java.util.UUID;

/* renamed from: esG  reason: default package */
/* loaded from: classes.dex */
public final class esG {
    public static final esG R = new esG(new UUID(0, 0));

    /* renamed from: R  reason: collision with other field name */
    public final UUID f3231R;

    public esG(UUID uuid) {
        this.f3231R = uuid == null ? UUID.randomUUID() : uuid;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && esG.class == obj.getClass() && this.f3231R.compareTo(((esG) obj).f3231R) == 0;
    }

    public final int hashCode() {
        return this.f3231R.hashCode();
    }

    public final String toString() {
        return this.f3231R.toString().replace("-", "");
    }
}
