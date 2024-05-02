package defpackage;

import java.util.Locale;

/* renamed from: kMM  reason: default package */
/* loaded from: classes.dex */
public final class kMM {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5277R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f5278R;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final String f5279c;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final String f5280v;

    public kMM(String str, String str2, boolean z, int i, String str3, int i2) {
        this.f5277R = str;
        this.f5280v = str2;
        this.f5278R = z;
        this.v = i;
        int i3 = 5;
        if (str2 != null) {
            String upperCase = str2.toUpperCase(Locale.US);
            if (upperCase.contains("INT")) {
                i3 = 3;
            } else if (upperCase.contains("CHAR") || upperCase.contains("CLOB") || upperCase.contains("TEXT")) {
                i3 = 2;
            } else if (!upperCase.contains("BLOB")) {
                i3 = (upperCase.contains("REAL") || upperCase.contains("FLOA") || upperCase.contains("DOUB")) ? 4 : 1;
            }
        }
        this.R = i3;
        this.f5279c = str3;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        String str3;
        if (this == obj) {
            return true;
        }
        if (obj == null || kMM.class != obj.getClass()) {
            return false;
        }
        kMM kmm = (kMM) obj;
        if (this.v != kmm.v || !this.f5277R.equals(kmm.f5277R) || this.f5278R != kmm.f5278R) {
            return false;
        }
        if (this.c == 1 && kmm.c == 2 && (str3 = this.f5279c) != null && !str3.equals(kmm.f5279c)) {
            return false;
        }
        if (this.c == 2 && kmm.c == 1 && (str2 = kmm.f5279c) != null && !str2.equals(this.f5279c)) {
            return false;
        }
        int i = this.c;
        return (i == 0 || i != kmm.c || ((str = this.f5279c) == null ? kmm.f5279c == null : str.equals(kmm.f5279c))) && this.R == kmm.R;
    }

    public final int hashCode() {
        return (((((this.f5277R.hashCode() * 31) + this.R) * 31) + (this.f5278R ? 1231 : 1237)) * 31) + this.v;
    }

    public final String toString() {
        StringBuilder U = opT.U("Column{name='");
        U.append(this.f5277R);
        U.append('\'');
        U.append(", type='");
        U.append(this.f5280v);
        U.append('\'');
        U.append(", affinity='");
        U.append(this.R);
        U.append('\'');
        U.append(", notNull=");
        U.append(this.f5278R);
        U.append(", primaryKeyPosition=");
        U.append(this.v);
        U.append(", defaultValue='");
        U.append(this.f5279c);
        U.append('\'');
        U.append('}');
        return U.toString();
    }
}
