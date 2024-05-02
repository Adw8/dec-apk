package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: s4  reason: default package */
/* loaded from: classes.dex */
public final class s4 implements A {
    public Object R;
    public final /* synthetic */ int e;

    public /* synthetic */ s4(int i, Object obj) {
        this.e = i;
        this.R = obj;
    }

    @Override // defpackage.A
    public final InputStream C() {
        switch (this.e) {
            case 0:
                return new oVx((mAv) this.R);
            default:
                return (gWT) this.R;
        }
    }

    @Override // defpackage.fXm
    public final O P() {
        switch (this.e) {
            case 0:
                oVx ovx = new oVx((mAv) this.R);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byte[] bArr = new byte[4096];
                while (true) {
                    int read = ovx.read(bArr, 0, 4096);
                    if (read < 0) {
                        return new CB(byteArrayOutputStream.toByteArray());
                    }
                    byteArrayOutputStream.write(bArr, 0, read);
                }
            default:
                return new nP9(((gWT) this.R).c());
        }
    }

    @Override // defpackage.b
    public final O v() {
        switch (this.e) {
            case 0:
                try {
                    return P();
                } catch (IOException e) {
                    StringBuilder U = opT.U("IOException converting stream to byte array: ");
                    U.append(e.getMessage());
                    throw new _(0, U.toString(), e);
                }
            default:
                try {
                    return P();
                } catch (IOException e2) {
                    StringBuilder U2 = opT.U("IOException converting stream to byte array: ");
                    U2.append(e2.getMessage());
                    throw new _(0, U2.toString(), e2);
                }
        }
    }
}
