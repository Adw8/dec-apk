package defpackage;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* renamed from: eW  reason: default package */
/* loaded from: classes.dex */
public final class eW implements rg {
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public final kKl f3129R;

    public eW(int i, byte[] bArr) {
        this.R = i;
        if (i != 1) {
            this.f3129R = new kKl(0, bArr);
        } else {
            this.f3129R = new kKl(1, bArr);
        }
    }

    @Override // defpackage.rg
    public final byte[] R(byte[] bArr, byte[] bArr2) {
        switch (this.R) {
            case 0:
                ByteBuffer allocate = ByteBuffer.allocate(bArr.length + 12 + 16);
                byte[] R = opU.R(12);
                allocate.put(R);
                this.f3129R.v(allocate, R, bArr, bArr2);
                return allocate.array();
            default:
                ByteBuffer allocate2 = ByteBuffer.allocate(bArr.length + 24 + 16);
                byte[] R2 = opU.R(24);
                allocate2.put(R2);
                this.f3129R.v(allocate2, R2, bArr, bArr2);
                return allocate2.array();
        }
    }

    @Override // defpackage.rg
    public final byte[] v(byte[] bArr, byte[] bArr2) {
        switch (this.R) {
            case 0:
                if (bArr.length >= 28) {
                    byte[] copyOf = Arrays.copyOf(bArr, 12);
                    return this.f3129R.R(ByteBuffer.wrap(bArr, 12, bArr.length - 12), copyOf, bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
            default:
                if (bArr.length >= 40) {
                    byte[] copyOf2 = Arrays.copyOf(bArr, 24);
                    return this.f3129R.R(ByteBuffer.wrap(bArr, 24, bArr.length - 24), copyOf2, bArr2);
                }
                throw new GeneralSecurityException("ciphertext too short");
        }
    }
}
