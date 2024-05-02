package defpackage;

import android.text.Layout;

/* renamed from: idG  reason: default package */
/* loaded from: classes.dex */
public abstract class idG {
    public static final Layout.Alignment R;
    public static final Layout.Alignment v;

    static {
        Layout.Alignment[] values = Layout.Alignment.values();
        Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
        Layout.Alignment alignment2 = alignment;
        for (Layout.Alignment alignment3 : values) {
            if (n3x.v(alignment3.name(), "ALIGN_LEFT")) {
                alignment = alignment3;
            } else if (n3x.v(alignment3.name(), "ALIGN_RIGHT")) {
                alignment2 = alignment3;
            }
        }
        R = alignment;
        v = alignment2;
    }
}
