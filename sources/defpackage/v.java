package defpackage;

import java.util.Arrays;

/* renamed from: v  reason: default package */
/* loaded from: classes.dex */
public final class v {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f7430R;

    public v(byte[] bArr) {
        this.R = mLz.L(bArr);
        this.f7430R = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof v) {
            return Arrays.equals(this.f7430R, ((v) obj).f7430R);
        }
        return false;
    }

    public final int hashCode() {
        return this.R;
    }
}
