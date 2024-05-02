package dev.kdrag0n.app.data.debug;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class CrashInfo {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f2697R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2698R;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final String f2699c;
    public final String e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final long f2700v;

    /* renamed from: v  reason: collision with other field name */
    public final String f2701v;

    public CrashInfo(String str, String str2, int i, int i2, int i3, String str3, String str4, long j, long j2) {
        this.f2698R = str;
        this.f2701v = str2;
        this.R = i;
        this.v = i2;
        this.c = i3;
        this.f2699c = str3;
        this.e = str4;
        this.f2697R = j;
        this.f2700v = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrashInfo)) {
            return false;
        }
        CrashInfo crashInfo = (CrashInfo) obj;
        return n3x.v(this.f2698R, crashInfo.f2698R) && n3x.v(this.f2701v, crashInfo.f2701v) && this.R == crashInfo.R && this.v == crashInfo.v && this.c == crashInfo.c && n3x.v(this.f2699c, crashInfo.f2699c) && n3x.v(this.e, crashInfo.e) && this.f2697R == crashInfo.f2697R && this.f2700v == crashInfo.f2700v;
    }

    public final int hashCode() {
        int O = opT.O(this.f2699c, opT.e(this.c, opT.e(this.v, opT.e(this.R, opT.O(this.f2701v, this.f2698R.hashCode() * 31, 31), 31), 31), 31), 31);
        String str = this.e;
        return Long.hashCode(this.f2700v) + opT.X(this.f2697R, (O + (str == null ? 0 : str.hashCode())) * 31, 31);
    }

    public final String toString() {
        String str = this.f2698R;
        String str2 = this.f2701v;
        int i = this.R;
        int i2 = this.v;
        int i3 = this.c;
        String str3 = this.f2699c;
        String str4 = this.e;
        long j = this.f2697R;
        long j2 = this.f2700v;
        return "CrashInfo(timestamp=" + str + ", reason=" + str2 + ", status=" + i + ", importance=" + i2 + ", pid=" + i3 + ", processName=" + str3 + ", description=" + str4 + ", rss=" + j + ", pss=" + j2 + ")";
    }
}
