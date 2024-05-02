package defpackage;

/* renamed from: M0  reason: default package */
/* loaded from: classes.dex */
public abstract class M0 {
    public static final boolean R;

    static {
        String property = System.getProperty("kotlin.collections.convert_arg_to_set_in_removeAll");
        R = property != null ? Boolean.parseBoolean(property) : false;
    }
}
