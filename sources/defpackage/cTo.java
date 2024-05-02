package defpackage;

import java.util.Objects;

/* renamed from: cTo  reason: default package */
/* loaded from: classes.dex */
public abstract class cTo {
    public static boolean R(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static int v(Object... objArr) {
        return Objects.hash(objArr);
    }
}
