package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

/* renamed from: s  reason: default package */
/* loaded from: classes.dex */
public class s extends O {
    public final byte[] R;

    public s(String str) {
        this.R = aPR.v(str);
        try {
            A();
        } catch (ParseException e) {
            StringBuilder U = opT.U("invalid date string: ");
            U.append(e.getMessage());
            throw new IllegalArgumentException(U.toString());
        }
    }

    public s(byte[] bArr) {
        if (bArr.length >= 4) {
            this.R = bArr;
            if (!T(0) || !T(1) || !T(2) || !T(3)) {
                throw new IllegalArgumentException("illegal characters in GeneralizedTime string");
            }
            return;
        }
        throw new IllegalArgumentException("GeneralizedTime string too short");
    }

    public static String Q(int i) {
        return i < 10 ? opT.Z("0", i) : Integer.toString(i);
    }

    public static String r(String str) {
        StringBuilder sb;
        String str2;
        String substring = str.substring(14);
        int i = 1;
        while (i < substring.length() && '0' <= (r4 = substring.charAt(i)) && r4 <= '9') {
            i++;
        }
        int i2 = i - 1;
        if (i2 > 3) {
            str2 = substring.substring(0, 4) + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 == 1) {
            str2 = substring.substring(0, i) + "00" + substring.substring(i);
            sb = new StringBuilder();
        } else if (i2 != 2) {
            return str;
        } else {
            str2 = substring.substring(0, i) + "0" + substring.substring(i);
            sb = new StringBuilder();
        }
        sb.append(str.substring(0, 14));
        sb.append(str2);
        return sb.toString();
    }

    public final Date A() {
        SimpleDateFormat simpleDateFormat;
        String R = aPR.R(this.R);
        if (R.endsWith("Z")) {
            simpleDateFormat = d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS'Z'") : s() ? new SimpleDateFormat("yyyyMMddHHmmss'Z'") : W() ? new SimpleDateFormat("yyyyMMddHHmm'Z'") : new SimpleDateFormat("yyyyMMddHH'Z'");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        } else if (R.indexOf(45) > 0 || R.indexOf(43) > 0) {
            R = S();
            simpleDateFormat = n();
        } else {
            simpleDateFormat = d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSS") : s() ? new SimpleDateFormat("yyyyMMddHHmmss") : W() ? new SimpleDateFormat("yyyyMMddHHmm") : new SimpleDateFormat("yyyyMMddHH");
            simpleDateFormat.setTimeZone(new SimpleTimeZone(0, TimeZone.getDefault().getID()));
        }
        if (d()) {
            R = r(R);
        }
        return m8I.R(simpleDateFormat.parse(R));
    }

    @Override // defpackage.O
    public final boolean J() {
        return false;
    }

    @Override // defpackage.O
    public void K(Zz zz, boolean z) {
        zz.g(z, 24, this.R);
    }

    public final String S() {
        String str;
        String R = aPR.R(this.R);
        int i = 1;
        if (R.charAt(R.length() - 1) == 'Z') {
            return R.substring(0, R.length() - 1) + "GMT+00:00";
        }
        int length = R.length() - 6;
        char charAt = R.charAt(length);
        if ((charAt == '-' || charAt == '+') && R.indexOf("GMT") == length - 3) {
            return R;
        }
        int length2 = R.length() - 5;
        char charAt2 = R.charAt(length2);
        if (charAt2 == '-' || charAt2 == '+') {
            StringBuilder sb = new StringBuilder();
            sb.append(R.substring(0, length2));
            sb.append("GMT");
            int i2 = length2 + 3;
            sb.append(R.substring(length2, i2));
            sb.append(":");
            sb.append(R.substring(i2));
            return sb.toString();
        }
        int length3 = R.length() - 3;
        char charAt3 = R.charAt(length3);
        if (charAt3 == '-' || charAt3 == '+') {
            return R.substring(0, length3) + "GMT" + R.substring(length3) + ":00";
        }
        StringBuilder U = opT.U(R);
        TimeZone timeZone = TimeZone.getDefault();
        int rawOffset = timeZone.getRawOffset();
        if (rawOffset < 0) {
            rawOffset = -rawOffset;
            str = "-";
        } else {
            str = "+";
        }
        int i3 = rawOffset / 3600000;
        int i4 = (rawOffset - (((i3 * 60) * 60) * 1000)) / 60000;
        try {
            if (timeZone.useDaylightTime()) {
                if (d()) {
                    R = r(R);
                }
                if (timeZone.inDaylightTime(n().parse(R + "GMT" + str + Q(i3) + ":" + Q(i4)))) {
                    if (!str.equals("+")) {
                        i = -1;
                    }
                    i3 += i;
                }
            }
        } catch (ParseException unused) {
        }
        StringBuilder t = jQ.t("GMT", str);
        t.append(Q(i3));
        t.append(":");
        t.append(Q(i4));
        U.append(t.toString());
        return U.toString();
    }

    public final boolean T(int i) {
        byte b;
        byte[] bArr = this.R;
        return bArr.length > i && (b = bArr[i]) >= 48 && b <= 57;
    }

    public final boolean W() {
        return T(10) && T(11);
    }

    @Override // defpackage.O
    public int Y(boolean z) {
        return Zz.x(this.R.length, z);
    }

    public final boolean d() {
        int i = 0;
        while (true) {
            byte[] bArr = this.R;
            if (i == bArr.length) {
                return false;
            }
            if (bArr[i] == 46 && i == 14) {
                return true;
            }
            i++;
        }
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return mLz.L(this.R);
    }

    public final SimpleDateFormat n() {
        SimpleDateFormat simpleDateFormat = d() ? new SimpleDateFormat("yyyyMMddHHmmss.SSSz") : s() ? new SimpleDateFormat("yyyyMMddHHmmssz") : W() ? new SimpleDateFormat("yyyyMMddHHmmz") : new SimpleDateFormat("yyyyMMddHHz");
        simpleDateFormat.setTimeZone(new SimpleTimeZone(0, "Z"));
        return simpleDateFormat;
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof s)) {
            return false;
        }
        return Arrays.equals(this.R, ((s) o).R);
    }

    public final boolean s() {
        return T(12) && T(13);
    }

    @Override // defpackage.O
    public O u() {
        return new fI8(this.R);
    }
}
