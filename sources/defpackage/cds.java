package defpackage;

import java.util.Locale;

/* renamed from: cds  reason: default package */
/* loaded from: classes.dex */
public enum cds {
    PORTRAIT,
    LANDSCAPE;

    public void serialize(iHO iho, g79 g79) {
        iho.R(toString().toLowerCase(Locale.ROOT));
    }
}
