package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: t  reason: default package */
/* loaded from: classes.dex */
public abstract class t implements b {
    public final byte[] V() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        v().t(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return v().h(((b) obj).v());
    }

    public int hashCode() {
        return v().hashCode();
    }

    public final byte[] i() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        O v = v();
        v.getClass();
        v.K(new Zz(byteArrayOutputStream), true);
        return byteArrayOutputStream.toByteArray();
    }

    public void t(OutputStream outputStream) {
        v().t(outputStream);
    }

    @Override // defpackage.b
    public abstract O v();
}
