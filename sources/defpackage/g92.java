package defpackage;

import java.util.Arrays;

/* renamed from: g92  reason: default package */
/* loaded from: classes.dex */
public final class g92 {
    public final byte R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f3685R;

    public g92(byte b, byte[] bArr) {
        this.R = b;
        int i = 8191;
        byte[] bArr2 = new byte[8191];
        this.f3685R = bArr2;
        int length = bArr.length;
        System.arraycopy(bArr, 0, bArr2, 0, (length <= 8191 ? length : i) - 0);
    }

    public final String toString() {
        byte b = this.R;
        String arrays = Arrays.toString(this.f3685R);
        return jQ.C("PeerInfo(", "type=" + ((int) b) + ", data=" + arrays, ")");
    }
}
