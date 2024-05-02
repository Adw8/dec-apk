package defpackage;

/* renamed from: ikX  reason: default package */
/* loaded from: classes.dex */
public final class ikX implements gBU {
    public static final ikX R = new ikX();

    @Override // defpackage.gBU
    public final bWV R(Class cls) {
        if (csA.class.isAssignableFrom(cls)) {
            try {
                return (bWV) csA.Z(cls.asSubclass(csA.class)).L(hZW.BUILD_MESSAGE_INFO);
            } catch (Exception e) {
                StringBuilder U = opT.U("Unable to get message info for ");
                U.append(cls.getName());
                throw new RuntimeException(U.toString(), e);
            }
        } else {
            StringBuilder U2 = opT.U("Unsupported message type: ");
            U2.append(cls.getName());
            throw new IllegalArgumentException(U2.toString());
        }
    }

    @Override // defpackage.gBU
    public final boolean v(Class cls) {
        return csA.class.isAssignableFrom(cls);
    }
}
