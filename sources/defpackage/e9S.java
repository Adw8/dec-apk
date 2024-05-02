package defpackage;

import java.util.Arrays;

/* renamed from: e9S  reason: default package */
/* loaded from: classes.dex */
public final class e9S {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f2991R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2992R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2993R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[] f2994R;
    public final boolean v;

    public e9S(String str, long j, int i, boolean z, boolean z2, byte[] bArr) {
        this.f2992R = str;
        this.f2991R = j;
        this.R = i;
        this.f2993R = z;
        this.v = z2;
        this.f2994R = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e9S) {
            e9S e9s = (e9S) obj;
            String str = this.f2992R;
            if (str != null ? str.equals(e9s.f2992R) : e9s.f2992R == null) {
                if (this.f2991R == e9s.f2991R && this.R == e9s.R && this.f2993R == e9s.f2993R && this.v == e9s.v && Arrays.equals(this.f2994R, e9s.f2994R)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f2992R;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f2991R;
        int i = 1237;
        int i2 = (((((((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.R) * 1000003) ^ (true != this.f2993R ? 1237 : 1231)) * 1000003;
        if (true == this.v) {
            i = 1231;
        }
        return Arrays.hashCode(this.f2994R) ^ ((i2 ^ i) * 1000003);
    }

    public final String toString() {
        String str = this.f2992R;
        long j = this.f2991R;
        int i = this.R;
        boolean z = this.f2993R;
        boolean z2 = this.v;
        String arrays = Arrays.toString(this.f2994R);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 126 + String.valueOf(arrays).length());
        sb.append("ZipEntry{name=");
        sb.append(str);
        sb.append(", size=");
        sb.append(j);
        sb.append(", compressionMethod=");
        sb.append(i);
        sb.append(", isPartial=");
        sb.append(z);
        sb.append(", isEndOfArchive=");
        sb.append(z2);
        sb.append(", headerBytes=");
        sb.append(arrays);
        sb.append("}");
        return sb.toString();
    }
}
