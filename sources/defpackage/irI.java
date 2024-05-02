package defpackage;

/* renamed from: irI  reason: default package */
/* loaded from: classes.dex */
public abstract class irI {
    public static final aVf R = new aVf();
    public static final aVf v;

    static {
        aVf avf;
        try {
            avf = (aVf) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            avf = null;
        }
        v = avf;
    }
}
