package defpackage;

/* renamed from: iG8  reason: default package */
/* loaded from: classes.dex */
public abstract class iG8 {
    public static final mxz R;
    public static final mxz v;

    static {
        mxz mxz;
        try {
            mxz = (mxz) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            mxz = null;
        }
        R = mxz;
        v = new mxz();
    }
}
