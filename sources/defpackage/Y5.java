package defpackage;

import android.os.Build;

/* renamed from: Y5  reason: default package */
/* loaded from: classes.dex */
public abstract class Y5 {
    public static final boolean O;
    public static final int R;

    /* renamed from: R  reason: collision with other field name */
    public static final boolean f623R;
    public static final boolean X;
    public static final boolean c;
    public static final boolean e;
    public static final boolean v;

    static {
        boolean z = true;
        int i = 0;
        int i2 = Build.VERSION.SDK_INT + (Build.VERSION.PREVIEW_SDK_INT > 0 ? 1 : 0);
        f623R = i2 >= 24;
        v = i2 >= 26;
        c = i2 >= 28;
        e = i2 >= 30;
        boolean z2 = i2 >= 31;
        X = z2;
        if (i2 < 33) {
            z = false;
        }
        O = z;
        if (z2) {
            i = 33554432;
        }
        R = i;
    }
}
