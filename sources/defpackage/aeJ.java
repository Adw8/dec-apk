package defpackage;

/* renamed from: aeJ  reason: default package */
/* loaded from: classes.dex */
public abstract class aeJ {
    public static final nRz R;
    public static final nRz v;

    static {
        nRz nrz;
        try {
            nrz = (nRz) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            nrz = null;
        }
        R = nrz;
        v = new nRz();
    }
}
