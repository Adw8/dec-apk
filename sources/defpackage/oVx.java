package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: oVx  reason: default package */
/* loaded from: classes.dex */
public final class oVx extends InputStream {
    public InputStream R;

    /* renamed from: R  reason: collision with other field name */
    public final mAv f6838R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6839R = true;

    public oVx(mAv mav) {
        this.f6838R = mav;
    }

    public final A R() {
        mAv mav = this.f6838R;
        int read = ((InputStream) mav.f5962R).read();
        b e = read < 0 ? null : mav.e(read);
        if (e == null) {
            return null;
        }
        if (e instanceof A) {
            return (A) e;
        }
        StringBuilder U = opT.U("unknown object encountered: ");
        U.append(e.getClass());
        throw new IOException(U.toString());
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x001e  */
    @Override // java.io.InputStream
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.R
            r1 = -1
            if (r0 != 0) goto L_0x0015
            boolean r0 = r3.f6839R
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            A r0 = r3.R()
            if (r0 != 0) goto L_0x0011
            return r1
        L_0x0011:
            r2 = 0
            r3.f6839R = r2
            goto L_0x0028
        L_0x0015:
            java.io.InputStream r0 = r3.R
            int r0 = r0.read()
            if (r0 < 0) goto L_0x001e
            return r0
        L_0x001e:
            A r0 = r3.R()
            if (r0 != 0) goto L_0x0028
            r0 = 0
            r3.R = r0
            return r1
        L_0x0028:
            java.io.InputStream r0 = r0.C()
            r3.R = r0
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oVx.read():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002a A[SYNTHETIC] */
    @Override // java.io.InputStream
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.R
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001a
            boolean r0 = r5.f6839R
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            A r0 = r5.R()
            if (r0 != 0) goto L_0x0012
            return r2
        L_0x0012:
            r5.f6839R = r1
        L_0x0014:
            java.io.InputStream r0 = r0.C()
            r5.R = r0
        L_0x001a:
            java.io.InputStream r0 = r5.R
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002a
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001a
            return r1
        L_0x002a:
            A r0 = r5.R()
            if (r0 != 0) goto L_0x0014
            r6 = 0
            r5.R = r6
            r5 = 1
            if (r1 >= r5) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r2 = r1
        L_0x0038:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oVx.read(byte[], int, int):int");
    }
}
