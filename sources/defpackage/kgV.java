package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.util.Arrays;
import javax.net.ssl.SSLSocket;

/* renamed from: kgV  reason: default package */
/* loaded from: classes.dex */
public final class kgV {
    public final /* synthetic */ int R;

    public /* synthetic */ kgV(int i) {
        this.R = i;
    }

    public static F6 O(byte[] bArr) {
        F6 f6 = F6.R;
        int length = bArr.length;
        iTI.e((long) bArr.length, (long) 0, (long) length);
        int i = length + 0;
        gvP.j(i, bArr.length);
        return new F6(Arrays.copyOfRange(bArr, 0, i));
    }

    public static final String R(byte[] bArr, byte[][] bArr2, int i) {
        int i2;
        int i3;
        int i4;
        String str = j3D.f4806R;
        int length = bArr.length;
        int i5 = 0;
        while (i5 < length) {
            int i6 = (i5 + length) / 2;
            while (i6 > -1 && bArr[i6] != ((byte) 10)) {
                i6--;
            }
            int i7 = i6 + 1;
            int i8 = 1;
            while (true) {
                i2 = i7 + i8;
                if (bArr[i2] == ((byte) 10)) {
                    break;
                }
                i8++;
            }
            int i9 = i2 - i7;
            int i10 = i;
            boolean z = false;
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (z) {
                    i3 = 46;
                    z = false;
                } else {
                    byte b = bArr2[i10][i11];
                    byte[] bArr3 = asb.f1481R;
                    i3 = b & 255;
                    z = z;
                }
                byte b2 = bArr[i7 + i12];
                byte[] bArr4 = asb.f1481R;
                i4 = i3 - (b2 & 255);
                if (i4 != 0) {
                    break;
                }
                i12++;
                i11++;
                if (i12 == i9) {
                    break;
                } else if (bArr2[i10].length == i11) {
                    if (i10 == bArr2.length - 1) {
                        break;
                    }
                    i10++;
                    i11 = -1;
                    z = true;
                }
            }
            if (i4 >= 0) {
                if (i4 <= 0) {
                    int i13 = i9 - i12;
                    int length2 = bArr2[i10].length - i11;
                    int length3 = bArr2.length;
                    for (int i14 = i10 + 1; i14 < length3; i14++) {
                        length2 += bArr2[i14].length;
                    }
                    if (length2 >= i13) {
                        if (length2 <= i13) {
                            return new String(bArr, i7, i9, O1.R);
                        }
                    }
                }
                i5 = i2 + 1;
            }
            length = i7 - 1;
        }
        return null;
    }

    public static F6 c(String str) {
        if (str.length() % 2 == 0) {
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) (me6.R(str.charAt(i2 + 1)) + (me6.R(str.charAt(i2)) << 4));
            }
            return new F6(bArr);
        }
        throw new IllegalArgumentException(opT.H("Unexpected hex string: ", str).toString());
    }

    public static F6 e(String str) {
        F6 f6 = new F6(str.getBytes(O1.R));
        f6.f114R = str;
        return f6;
    }

    public final boolean X() {
        switch (this.R) {
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                kgV kgv = Xe.R;
                return false;
            case 12:
            default:
                oMv omv = oMv.f6773R;
                return atb.Z();
            case 13:
                return moq.f6165R;
        }
    }

    public final oMv v() {
        switch (this.R) {
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                if (X()) {
                    return new Xe();
                }
                return null;
            default:
                try {
                    if (Integer.parseInt(System.getProperty("java.specification.version", "unknown")) >= 9) {
                        return null;
                    }
                } catch (NumberFormatException unused) {
                }
                try {
                    Class<?> cls = Class.forName("org.eclipse.jetty.alpn.ALPN", true, null);
                    Class<?> cls2 = Class.forName("org.eclipse.jetty.alpn.ALPN$Provider", true, null);
                    return new n77(cls.getMethod("put", SSLSocket.class, cls2), cls.getMethod("get", SSLSocket.class), cls.getMethod("remove", SSLSocket.class), Class.forName("org.eclipse.jetty.alpn.ALPN$ClientProvider", true, null), Class.forName("org.eclipse.jetty.alpn.ALPN$ServerProvider", true, null));
                } catch (ClassNotFoundException | NoSuchMethodException unused2) {
                    return null;
                }
        }
    }

    /* JADX INFO: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kgV(int i, int i2) {
        this(20);
        this.R = i;
        switch (i) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
                this(4);
                return;
            case kTo.CATALOGUE_NAME_FIELD_NUMBER:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case VmNativeCallback.$stable:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                return;
            default:
                this(0);
                return;
        }
    }
}
