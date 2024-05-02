package defpackage;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: fu8  reason: default package */
/* loaded from: classes.dex */
public final class fu8 extends InputStream {
    public h R;

    /* renamed from: R  reason: collision with other field name */
    public InputStream f3579R;

    /* renamed from: R  reason: collision with other field name */
    public final mAv f3580R;
    public boolean v = true;
    public int e = 0;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3581R = false;

    public fu8(mAv mav) {
        this.f3580R = mav;
    }

    public final h R() {
        mAv mav = this.f3580R;
        int read = ((InputStream) mav.f5962R).read();
        b e = read < 0 ? null : mav.e(read);
        if (e == null) {
            if (!this.f3581R || this.e == 0) {
                return null;
            }
            StringBuilder U = opT.U("expected octet-aligned bitstring, but found padBits: ");
            U.append(this.e);
            throw new IOException(U.toString());
        } else if (!(e instanceof h)) {
            StringBuilder U2 = opT.U("unknown object encountered: ");
            U2.append(e.getClass());
            throw new IOException(U2.toString());
        } else if (this.e == 0) {
            return (h) e;
        } else {
            throw new IOException("only the last nested bitstring can have padding");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x001f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0020  */
    @Override // java.io.InputStream
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read() {
        /*
            r3 = this;
            java.io.InputStream r0 = r3.f3579R
            r1 = -1
            if (r0 != 0) goto L_0x0017
            boolean r0 = r3.v
            if (r0 != 0) goto L_0x000a
            return r1
        L_0x000a:
            h r0 = r3.R()
            r3.R = r0
            if (r0 != 0) goto L_0x0013
            return r1
        L_0x0013:
            r2 = 0
            r3.v = r2
            goto L_0x0034
        L_0x0017:
            java.io.InputStream r0 = r3.f3579R
            int r0 = r0.read()
            if (r0 < 0) goto L_0x0020
            return r0
        L_0x0020:
            h r0 = r3.R
            int r0 = r0.R()
            r3.e = r0
            h r0 = r3.R()
            r3.R = r0
            if (r0 != 0) goto L_0x0034
            r0 = 0
            r3.f3579R = r0
            return r1
        L_0x0034:
            java.io.InputStream r0 = r0.H()
            r3.f3579R = r0
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu8.read():int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x002c A[SYNTHETIC] */
    @Override // java.io.InputStream
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int read(byte[] r6, int r7, int r8) {
        /*
            r5 = this;
            java.io.InputStream r0 = r5.f3579R
            r1 = 0
            r2 = -1
            if (r0 != 0) goto L_0x001c
            boolean r0 = r5.v
            if (r0 != 0) goto L_0x000b
            return r2
        L_0x000b:
            h r0 = r5.R()
            r5.R = r0
            if (r0 != 0) goto L_0x0014
            return r2
        L_0x0014:
            r5.v = r1
        L_0x0016:
            java.io.InputStream r0 = r0.H()
            r5.f3579R = r0
        L_0x001c:
            java.io.InputStream r0 = r5.f3579R
            int r3 = r7 + r1
            int r4 = r8 - r1
            int r0 = r0.read(r6, r3, r4)
            if (r0 < 0) goto L_0x002c
            int r1 = r1 + r0
            if (r1 != r8) goto L_0x001c
            return r1
        L_0x002c:
            h r0 = r5.R
            int r0 = r0.R()
            r5.e = r0
            h r0 = r5.R()
            r5.R = r0
            if (r0 != 0) goto L_0x0016
            r6 = 0
            r5.f3579R = r6
            r5 = 1
            if (r1 >= r5) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r2 = r1
        L_0x0044:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fu8.read(byte[], int, int):int");
    }
}
