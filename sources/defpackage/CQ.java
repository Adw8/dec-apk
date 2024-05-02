package defpackage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;

/* renamed from: CQ  reason: default package */
/* loaded from: classes.dex */
public class CQ extends O {
    public final byte[] R;

    public CQ(String str) {
        this.R = aPR.v(str);
        try {
            m8I.R(new SimpleDateFormat("yyMMddHHmmssz").parse(n()));
        } catch (ParseException e) {
            StringBuilder U = opT.U("invalid date string: ");
            U.append(e.getMessage());
            throw new IllegalArgumentException(U.toString());
        }
    }

    @Override // defpackage.O
    public final boolean J() {
        return false;
    }

    @Override // defpackage.O
    public final void K(Zz zz, boolean z) {
        zz.g(z, 23, this.R);
    }

    @Override // defpackage.O
    public final int Y(boolean z) {
        return Zz.x(this.R.length, z);
    }

    @Override // defpackage.O, defpackage.t
    public final int hashCode() {
        return mLz.L(this.R);
    }

    public final String n() {
        String str;
        StringBuilder sb;
        String R = aPR.R(this.R);
        if (R.indexOf(45) >= 0 || R.indexOf(43) >= 0) {
            int indexOf = R.indexOf(45);
            if (indexOf < 0) {
                indexOf = R.indexOf(43);
            }
            if (indexOf == R.length() - 3) {
                R = opT.H(R, "00");
            }
            if (indexOf == 10) {
                sb = new StringBuilder();
                sb.append(R.substring(0, 10));
                sb.append("00GMT");
                sb.append(R.substring(10, 13));
                sb.append(":");
                str = R.substring(13, 15);
            } else {
                sb = new StringBuilder();
                sb.append(R.substring(0, 12));
                sb.append("GMT");
                sb.append(R.substring(12, 15));
                sb.append(":");
                str = R.substring(15, 17);
            }
        } else if (R.length() == 11) {
            sb = new StringBuilder();
            sb.append(R.substring(0, 10));
            str = "00GMT+00:00";
        } else {
            sb = new StringBuilder();
            sb.append(R.substring(0, 12));
            str = "GMT+00:00";
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // defpackage.O
    public final boolean o(O o) {
        if (!(o instanceof CQ)) {
            return false;
        }
        return Arrays.equals(this.R, ((CQ) o).R);
    }

    public final String toString() {
        return aPR.R(this.R);
    }

    public CQ(byte[] bArr) {
        byte b;
        byte b2;
        if (bArr.length >= 2) {
            this.R = bArr;
            boolean z = true;
            if (bArr.length > 0 && (b2 = bArr[0]) >= 48 && b2 <= 57) {
                if ((bArr.length <= 1 || (b = bArr[1]) < 48 || b > 57) ? false : z) {
                    return;
                }
            }
            throw new IllegalArgumentException("illegal characters in UTCTime string");
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }
}
