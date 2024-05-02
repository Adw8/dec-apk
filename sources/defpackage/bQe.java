package defpackage;

/* renamed from: bQe  reason: default package */
/* loaded from: classes.dex */
public final class bQe {
    public final String R;
    public final String v;

    public bQe(String str, String str2) {
        this.R = str;
        this.v = str2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bQe) {
            bQe bqe = (bQe) obj;
            bqe.getClass();
            String str = this.R;
            if (str != null ? str.equals(bqe.R) : bqe.R == null) {
                String str2 = this.v;
                if (str2 != null ? str2.equals(bqe.v) : bqe.v == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.R;
        int i = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ -721379959) * 1000003;
        String str2 = this.v;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.R;
        String str2 = this.v;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 68 + String.valueOf(str2).length());
        sb.append("AssetPackLocation{packStorageMethod=");
        sb.append(0);
        sb.append(", path=");
        sb.append(str);
        sb.append(", assetsPath=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
