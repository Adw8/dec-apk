package defpackage;

/* renamed from: dqB  reason: default package */
/* loaded from: classes.dex */
public abstract class dqB {
    public static boolean R;

    static {
        try {
            R = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            R = false;
        }
    }
}
