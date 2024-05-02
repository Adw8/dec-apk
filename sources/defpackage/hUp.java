package defpackage;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Arrays;

/* renamed from: hUp  reason: default package */
/* loaded from: classes.dex */
public final class hUp {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f4281R;

    /* renamed from: R  reason: collision with other field name */
    public final String f4282R;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final String f4283v;

    public hUp(int i, int i2, long j, String str, String str2) {
        this.f4281R = j;
        this.R = i;
        this.v = i2;
        this.f4282R = str;
        this.f4283v = str2;
    }

    public final String toString() {
        return String.format("%s %5d %c %-8s: %s\n", Arrays.copyOf(new Object[]{LocalDateTime.ofInstant(Instant.ofEpochMilli(this.f4281R), ZoneId.systemDefault()).format(e72.R), Integer.valueOf(this.R), e72.f2982R[this.v], this.f4282R, this.f4283v}, 5));
    }
}
