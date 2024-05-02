package com.google.android.play.core.assetpacks;

import android.os.Bundle;

/* loaded from: classes.dex */
public final class zzbn {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final long f2406R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2407R;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final String f2408c;
    public final int e;
    public final int v;

    /* renamed from: v  reason: collision with other field name */
    public final long f2409v;

    /* renamed from: v  reason: collision with other field name */
    public final String f2410v;

    public zzbn(String str, int i, int i2, long j, long j2, int i3, int i4, String str2, String str3) {
        if (str != null) {
            this.f2407R = str;
            this.R = i;
            this.v = i2;
            this.f2406R = j;
            this.f2409v = j2;
            this.c = i3;
            this.e = i4;
            if (str2 != null) {
                this.f2410v = str2;
                if (str3 != null) {
                    this.f2408c = str3;
                    return;
                }
                throw new NullPointerException("Null installedVersionTag");
            }
            throw new NullPointerException("Null availableVersionTag");
        }
        throw new NullPointerException("Null name");
    }

    public static zzbn R(String str, int i, int i2, long j, long j2, double d, int i3, String str2, String str3) {
        return new zzbn(str, i, i2, j, j2, (int) Math.rint(100.0d * d), i3, str2, str3);
    }

    public static zzbn v(Bundle bundle, String str, gMW gmw, n2N n2n, jOW jow) {
        double doubleValue;
        int e = jow.e(bundle.getInt(biy.I("status", str)));
        int i = bundle.getInt(biy.I("error_code", str));
        long j = bundle.getLong(biy.I("bytes_downloaded", str));
        long j2 = bundle.getLong(biy.I("total_bytes_to_download", str));
        synchronized (gmw) {
            Double d = (Double) gmw.R.get(str);
            doubleValue = d == null ? 0.0d : d.doubleValue();
        }
        long j3 = bundle.getLong(biy.I("pack_version", str));
        long j4 = bundle.getLong(biy.I("pack_base_version", str));
        int i2 = 1;
        int i3 = 4;
        if (e != 4) {
            i2 = 1;
            i3 = e;
        } else if (!(j4 == 0 || j4 == j3)) {
            i2 = 2;
        }
        return R(str, i3, i, j, j2, doubleValue, i2, bundle.getString(biy.I("pack_version_tag", str), String.valueOf(bundle.getInt("app_version_code"))), n2n.R(str));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbn) {
            zzbn zzbn = (zzbn) obj;
            if (this.f2407R.equals(zzbn.f2407R) && this.R == zzbn.R && this.v == zzbn.v && this.f2406R == zzbn.f2406R && this.f2409v == zzbn.f2409v && this.c == zzbn.c && this.e == zzbn.e && this.f2410v.equals(zzbn.f2410v) && this.f2408c.equals(zzbn.f2408c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f2407R.hashCode();
        int i = this.R;
        int i2 = this.v;
        long j = this.f2406R;
        long j2 = this.f2409v;
        return this.f2408c.hashCode() ^ ((((((((((((((((hashCode ^ 1000003) * 1000003) ^ i) * 1000003) ^ i2) * 1000003) ^ ((int) ((j >>> 32) ^ j))) * 1000003) ^ ((int) ((j2 >>> 32) ^ j2))) * 1000003) ^ this.c) * 1000003) ^ this.e) * 1000003) ^ this.f2410v.hashCode()) * 1000003);
    }

    public final String toString() {
        String str = this.f2407R;
        int i = this.R;
        int i2 = this.v;
        long j = this.f2406R;
        long j2 = this.f2409v;
        int i3 = this.c;
        int i4 = this.e;
        String str2 = this.f2410v;
        String str3 = this.f2408c;
        StringBuilder sb = new StringBuilder(str3.length() + str2.length() + str.length() + 261);
        sb.append("AssetPackState{name=");
        sb.append(str);
        sb.append(", status=");
        sb.append(i);
        sb.append(", errorCode=");
        sb.append(i2);
        sb.append(", bytesDownloaded=");
        sb.append(j);
        sb.append(", totalBytesToDownload=");
        sb.append(j2);
        sb.append(", transferProgressPercentage=");
        sb.append(i3);
        sb.append(", updateAvailability=");
        sb.append(i4);
        sb.append(", availableVersionTag=");
        sb.append(str2);
        sb.append(", installedVersionTag=");
        sb.append(str3);
        sb.append("}");
        return sb.toString();
    }
}
