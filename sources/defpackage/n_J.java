package defpackage;

/* renamed from: n_J  reason: default package */
/* loaded from: classes.dex */
public final class n_J {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f6464R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6465R;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final long f6466v;

    public n_J(int i, String str, long j, long j2, int i2) {
        this.R = i;
        this.f6465R = str;
        this.f6464R = j;
        this.f6466v = j2;
        this.v = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof n_J) {
            n_J n_j = (n_J) obj;
            if (this.R == n_j.R && ((str = this.f6465R) != null ? str.equals(n_j.f6465R) : n_j.f6465R == null) && this.f6464R == n_j.f6464R && this.f6466v == n_j.f6466v && this.v == n_j.v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.R ^ 1000003) * 1000003;
        String str = this.f6465R;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.f6464R;
        long j2 = this.f6466v;
        return this.v ^ ((((((i ^ hashCode) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003);
    }

    public final String toString() {
        int i = this.R;
        String str = this.f6465R;
        long j = this.f6464R;
        long j2 = this.f6466v;
        int i2 = this.v;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 157);
        sb.append("SliceCheckpoint{fileExtractionStatus=");
        sb.append(i);
        sb.append(", filePath=");
        sb.append(str);
        sb.append(", fileOffset=");
        sb.append(j);
        sb.append(", remainingBytes=");
        sb.append(j2);
        sb.append(", previousChunk=");
        sb.append(i2);
        sb.append("}");
        return sb.toString();
    }
}
