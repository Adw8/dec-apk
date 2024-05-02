package defpackage;

/* renamed from: j3H  reason: default package */
/* loaded from: classes.dex */
public final class j3H {
    public static String R(lbd lbd) {
        String obj = lbd.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
