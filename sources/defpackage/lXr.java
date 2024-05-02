package defpackage;

import java.util.Locale;

/* renamed from: lXr  reason: default package */
/* loaded from: classes.dex */
public enum lXr {
    DEBUG,
    INFO,
    WARNING,
    ERROR,
    FATAL;

    public void serialize(iHO iho, g79 g79) {
        iho.R(name().toLowerCase(Locale.ROOT));
    }
}
