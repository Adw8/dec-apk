package defpackage;

import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.security.GeneralSecurityException;
import java.util.IllegalFormatException;
import java.util.Locale;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.net.ssl.SSLSocket;

/* renamed from: zI  reason: default package */
/* loaded from: classes.dex */
public final class zI implements cwg {
    public final String R;

    public /* synthetic */ zI(String str, int i) {
        if (i != 1) {
            int myUid = Process.myUid();
            int myPid = Process.myPid();
            StringBuilder sb = new StringBuilder(39);
            sb.append("UID: [");
            sb.append(myUid);
            sb.append("]  PID: [");
            sb.append(myPid);
            sb.append("] ");
            String sb2 = sb.toString();
            this.R = str.length() != 0 ? sb2.concat(str) : new String(sb2);
            return;
        }
        this.R = str;
    }

    public static String H(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e) {
                String valueOf = String.valueOf(str2);
                Log.e("PlayCore", valueOf.length() != 0 ? "Unable to format ".concat(valueOf) : new String("Unable to format "), e);
                String join = TextUtils.join(", ", objArr);
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 3 + String.valueOf(join).length());
                sb.append(str2);
                sb.append(" [");
                sb.append(join);
                sb.append("]");
                str2 = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 3 + String.valueOf(str2).length());
        sb2.append(str);
        sb2.append(" : ");
        sb2.append(str2);
        return sb2.toString();
    }

    public void L(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", H(this.R, str, objArr));
        }
    }

    @Override // defpackage.cwg
    public gOQ O(SSLSocket sSLSocket) {
        Class<?> cls = sSLSocket.getClass();
        Class<?> cls2 = cls;
        while (!n3x.v(cls2.getSimpleName(), "OpenSSLSocketImpl")) {
            cls2 = cls2.getSuperclass();
            if (cls2 == null) {
                throw new AssertionError("No OpenSSLSocketImpl superclass of socket of type " + cls);
            }
        }
        return new S5(cls2);
    }

    @Override // defpackage.cwg
    public boolean R(SSLSocket sSLSocket) {
        String name = sSLSocket.getClass().getName();
        return iH_._(name, this.R + '.', false);
    }

    public void X(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 3)) {
            Log.d("PlayCore", H(this.R, str, objArr));
        }
    }

    public void Z(Exception exc, String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 6)) {
            Log.e("PlayCore", H(this.R, str, objArr), exc);
        }
    }

    public byte[] c(byte[] bArr, byte[] bArr2) {
        Mac mac = (Mac) aXa.v.R(this.R);
        if (bArr2 == null || bArr2.length == 0) {
            mac.init(new SecretKeySpec(new byte[mac.getMacLength()], this.R));
        } else {
            mac.init(new SecretKeySpec(bArr2, this.R));
        }
        return mac.doFinal(bArr);
    }

    public byte[] e() {
        String str = this.R;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case 984523022:
                if (str.equals("HmacSha256")) {
                    c = 0;
                    break;
                }
                break;
            case 984524074:
                if (str.equals("HmacSha384")) {
                    c = 1;
                    break;
                }
                break;
            case 984525777:
                if (str.equals("HmacSha512")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return iZL.O;
            case 1:
                return iZL.L;
            case 2:
                return iZL.Z;
            default:
                throw new GeneralSecurityException("Could not determine HPKE KDF ID");
        }
    }

    public void m(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", H(this.R, str, objArr));
        }
    }

    public byte[] v(byte[] bArr, byte[] bArr2, int i) {
        Mac mac = (Mac) aXa.v.R(this.R);
        if (i <= mac.getMacLength() * 255) {
            byte[] bArr3 = new byte[i];
            mac.init(new SecretKeySpec(bArr, this.R));
            byte[] bArr4 = new byte[0];
            int i2 = 1;
            int i3 = 0;
            while (true) {
                mac.update(bArr4);
                mac.update(bArr2);
                mac.update((byte) i2);
                bArr4 = mac.doFinal();
                if (bArr4.length + i3 < i) {
                    System.arraycopy(bArr4, 0, bArr3, i3, bArr4.length);
                    i3 += bArr4.length;
                    i2++;
                } else {
                    System.arraycopy(bArr4, 0, bArr3, i3, i - i3);
                    return bArr3;
                }
            }
        } else {
            throw new GeneralSecurityException("size too large");
        }
    }

    public void x(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 5)) {
            Log.w("PlayCore", H(this.R, str, objArr));
        }
    }

    public /* synthetic */ zI() {
        this.R = "com.google.android.gms.org.conscrypt";
    }
}
