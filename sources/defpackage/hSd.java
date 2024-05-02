package defpackage;

import java.math.BigDecimal;

/* renamed from: hSd  reason: default package */
/* loaded from: classes.dex */
public final class hSd extends Number {
    public final String R;

    public hSd(String str) {
        this.R = str;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return Double.parseDouble(this.R);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hSd)) {
            return false;
        }
        String str = this.R;
        String str2 = ((hSd) obj).R;
        return str == str2 || str.equals(str2);
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return Float.parseFloat(this.R);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.R.hashCode();
    }

    @Override // java.lang.Number
    public final int intValue() {
        try {
            try {
                return Integer.parseInt(this.R);
            } catch (NumberFormatException unused) {
                return (int) Long.parseLong(this.R);
            }
        } catch (NumberFormatException unused2) {
            return new BigDecimal(this.R).intValue();
        }
    }

    @Override // java.lang.Number
    public final long longValue() {
        try {
            return Long.parseLong(this.R);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.R).longValue();
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        return this.R;
    }
}
