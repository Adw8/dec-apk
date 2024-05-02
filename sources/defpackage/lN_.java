package defpackage;

import java.time.Instant;

/* renamed from: lN_  reason: default package */
/* loaded from: classes.dex */
public final class lN_ extends k49 {
    public static final lN_ R = new lN_();

    @Override // defpackage.k49
    public final void O(mot mot, Object obj) {
        Instant instant = (Instant) obj;
        mot.o(instant != null ? Long.valueOf(instant.toEpochMilli()) : null);
    }

    @Override // defpackage.k49
    public final Object R(csz csz) {
        return Instant.ofEpochMilli(csz.t());
    }
}
