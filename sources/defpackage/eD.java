package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: eD  reason: default package */
/* loaded from: classes.dex */
public final class eD implements h {
    public fu8 R;

    /* renamed from: R  reason: collision with other field name */
    public mAv f3028R;

    public eD(mAv mav) {
        this.f3028R = mav;
    }

    @Override // defpackage.h
    public final InputStream H() {
        fu8 fu8 = new fu8(this.f3028R);
        this.R = fu8;
        return fu8;
    }

    @Override // defpackage.fXm
    public final O P() {
        fu8 fu8 = new fu8(this.f3028R);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[4096];
        while (true) {
            int read = fu8.read(bArr, 0, 4096);
            if (read >= 0) {
                byteArrayOutputStream.write(bArr, 0, read);
            } else {
                return new a9(fu8.e, byteArrayOutputStream.toByteArray());
            }
        }
    }

    @Override // defpackage.h
    public final int R() {
        return this.R.e;
    }

    @Override // defpackage.b
    public final O v() {
        try {
            return P();
        } catch (IOException e) {
            StringBuilder U = opT.U("IOException converting stream to byte array: ");
            U.append(e.getMessage());
            throw new _(0, U.toString(), e);
        }
    }
}
