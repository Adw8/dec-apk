package dev.kdrag0n.app.debug;

import java.util.Map;

@h8S(generateAdapter = true)
/* loaded from: classes.dex */
public final class DebugInfo {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final iGi f2703R;

    /* renamed from: R  reason: collision with other field name */
    public final Integer f2704R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2705R;

    /* renamed from: R  reason: collision with other field name */
    public final Map f2706R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f2707R;
    public final String X;

    /* renamed from: X  reason: collision with other field name */
    public final boolean f2708X;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final String f2709c;

    /* renamed from: c  reason: collision with other field name */
    public final boolean f2710c;
    public final String e;

    /* renamed from: e  reason: collision with other field name */
    public final boolean f2711e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final String f2712v;

    /* renamed from: v  reason: collision with other field name */
    public final Map f2713v;

    /* renamed from: v  reason: collision with other field name */
    public final boolean f2714v;

    public DebugInfo(int i, String str, int i2, String str2, String str3, iGi igi, boolean z, boolean z2, boolean z3, Map map, Map map2, String str4, String str5, boolean z4, boolean z5, int i3, Integer num) {
        this.R = i;
        this.f2705R = str;
        this.v = i2;
        this.f2712v = str2;
        this.f2709c = str3;
        this.f2703R = igi;
        this.f2707R = z;
        this.f2714v = z2;
        this.f2710c = z3;
        this.f2706R = map;
        this.f2713v = map2;
        this.e = str4;
        this.X = str5;
        this.f2711e = z4;
        this.f2708X = z5;
        this.c = i3;
        this.f2704R = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DebugInfo)) {
            return false;
        }
        DebugInfo debugInfo = (DebugInfo) obj;
        return this.R == debugInfo.R && n3x.v(this.f2705R, debugInfo.f2705R) && this.v == debugInfo.v && n3x.v(this.f2712v, debugInfo.f2712v) && n3x.v(this.f2709c, debugInfo.f2709c) && this.f2703R == debugInfo.f2703R && this.f2707R == debugInfo.f2707R && this.f2714v == debugInfo.f2714v && this.f2710c == debugInfo.f2710c && n3x.v(this.f2706R, debugInfo.f2706R) && n3x.v(this.f2713v, debugInfo.f2713v) && n3x.v(this.e, debugInfo.e) && n3x.v(this.X, debugInfo.X) && this.f2711e == debugInfo.f2711e && this.f2708X == debugInfo.f2708X && this.c == debugInfo.c && n3x.v(this.f2704R, debugInfo.f2704R);
    }

    public final int hashCode() {
        int O = opT.O(this.f2709c, opT.O(this.f2712v, opT.e(this.v, opT.O(this.f2705R, Integer.hashCode(this.R) * 31, 31), 31), 31), 31);
        iGi igi = this.f2703R;
        int i = 0;
        int hashCode = (O + (igi == null ? 0 : igi.hashCode())) * 31;
        boolean z = this.f2707R;
        int i2 = 1;
        if (z) {
            z = true;
        }
        int i3 = z ? 1 : 0;
        int i4 = z ? 1 : 0;
        int i5 = z ? 1 : 0;
        int i6 = (hashCode + i3) * 31;
        boolean z2 = this.f2714v;
        if (z2) {
            z2 = true;
        }
        int i7 = z2 ? 1 : 0;
        int i8 = z2 ? 1 : 0;
        int i9 = z2 ? 1 : 0;
        int i10 = (i6 + i7) * 31;
        boolean z3 = this.f2710c;
        if (z3) {
            z3 = true;
        }
        int i11 = z3 ? 1 : 0;
        int i12 = z3 ? 1 : 0;
        int i13 = z3 ? 1 : 0;
        int hashCode2 = (this.f2713v.hashCode() + ((this.f2706R.hashCode() + ((i10 + i11) * 31)) * 31)) * 31;
        String str = this.e;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.X;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z4 = this.f2711e;
        if (z4) {
            z4 = true;
        }
        int i14 = z4 ? 1 : 0;
        int i15 = z4 ? 1 : 0;
        int i16 = z4 ? 1 : 0;
        int i17 = (hashCode4 + i14) * 31;
        boolean z5 = this.f2708X;
        if (!z5) {
            i2 = z5 ? 1 : 0;
        }
        int e = opT.e(this.c, (i17 + i2) * 31, 31);
        Integer num = this.f2704R;
        if (num != null) {
            i = num.hashCode();
        }
        return e + i;
    }

    public final String toString() {
        int i = this.R;
        String str = this.f2705R;
        int i2 = this.v;
        String str2 = this.f2712v;
        String str3 = this.f2709c;
        iGi igi = this.f2703R;
        boolean z = this.f2707R;
        boolean z2 = this.f2714v;
        boolean z3 = this.f2710c;
        Map map = this.f2706R;
        Map map2 = this.f2713v;
        String str4 = this.e;
        String str5 = this.X;
        boolean z4 = this.f2711e;
        boolean z5 = this.f2708X;
        int i3 = this.c;
        Integer num = this.f2704R;
        return "DebugInfo(reportVersion=" + i + ", packageName=" + str + ", versionCode=" + i2 + ", versionName=" + str2 + ", timestamp=" + str3 + ", vmStatus=" + igi + ", hasPrivPermission=" + z + ", isDevOptionsEnabled=" + z2 + ", hasVirtSupport=" + z3 + ", criticalSettings=" + map + ", settings=" + map2 + ", token=" + str4 + ", userId=" + str5 + ", isActivated=" + z4 + ", isPremium=" + z5 + ", entitlement=" + i3 + ", entitlementType=" + num + ")";
    }
}
