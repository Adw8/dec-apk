package defpackage;

import android.os.Build;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.Signature;
import java.security.SignatureException;
import java.security.interfaces.ECPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import java.util.Map;

/* renamed from: cGy  reason: default package */
/* loaded from: classes.dex */
public final class cGy {
    public final F4 R;

    /* renamed from: R  reason: collision with other field name */
    public final ao9 f2048R;

    /* renamed from: R  reason: collision with other field name */
    public final String f2049R = Build.PRODUCT;

    /* renamed from: R  reason: collision with other field name */
    public final jsT f2050R;

    /* renamed from: R  reason: collision with other field name */
    public final k2z f2051R;

    /* renamed from: R  reason: collision with other field name */
    public final k49 f2052R;
    public final jsT v;

    public cGy(F4 f4, k2z k2z, ao9 ao9, k49 k49) {
        this.R = f4;
        this.f2051R = k2z;
        this.f2048R = ao9;
        this.f2052R = k49;
        KeyFactory instance = KeyFactory.getInstance(afN.R(-3672223896460L));
        this.f2050R = new jsT(afN.R(-3685108798348L), (ECPublicKey) instance.generatePublic(new X509EncodedKeySpec(caw.P(afN.R(-3693698732940L)))));
        this.v = new jsT(afN.R(-4548397224844L), (ECPublicKey) instance.generatePublic(new X509EncodedKeySpec(caw.P(afN.R(-4569872061324L)))));
    }

    public final Map R(String str, jsT jst) {
        boolean z;
        boolean z2;
        boolean z3;
        byte[] bArr;
        int i;
        int i2 = 1;
        List b = iH_.b(str, new char[]{'.'}, 0, 6);
        String str2 = (String) b.get(0);
        String str3 = (String) b.get(1);
        Map map = (Map) this.f2052R.v(iH_.u(caw.y(str2)));
        piu piu = new piu(map, (Map) this.f2052R.v(iH_.u(caw.y(str3))), caw.y((String) b.get(2)), jQ.C(str2, ".", str3));
        Map map2 = (Map) piu.f7203v;
        byte[] bArr2 = (byte[]) piu.c;
        String str4 = (String) piu.e;
        if (!n3x.v(map.get(afN.R(-6859089630092L)), afN.R(-6876269499276L))) {
            throw new IllegalArgumentException(afN.R(-6893449368460L).toString());
        } else if (!n3x.v(map.get(afN.R(-6979348714380L)), afN.R(-6996528583564L))) {
            throw new IllegalArgumentException(afN.R(-7022298387340L).toString());
        } else if (n3x.v(map.get(afN.R(-7108197733260L)), (String) jst.v)) {
            Signature instance = Signature.getInstance(afN.R(-7211276948364L));
            instance.initVerify((ECPublicKey) jst.R);
            instance.update(iH_.z(str4));
            ECPublicKey eCPublicKey = (ECPublicKey) jst.R;
            if (bArr2.length == 64) {
                int length = bArr2.length;
                int i3 = 0;
                while (true) {
                    if (i3 >= length) {
                        z = true;
                        break;
                    } else if (bArr2[i3] != 0) {
                        z = false;
                        break;
                    } else {
                        i3++;
                    }
                }
                if (!z) {
                    byte[] bArr3 = new byte[32];
                    System.arraycopy(bArr2, 0, bArr3, 0, 32);
                    BigInteger bigInteger = new BigInteger(1, bArr3);
                    int i4 = 0;
                    while (true) {
                        if (i4 >= 32) {
                            z2 = true;
                            break;
                        } else if (bArr3[i4] != 0) {
                            z2 = false;
                            break;
                        } else {
                            i4++;
                        }
                    }
                    if (!z2) {
                        byte[] bArr4 = new byte[32];
                        System.arraycopy(bArr2, 32, bArr4, 0, 32);
                        BigInteger bigInteger2 = new BigInteger(1, bArr4);
                        int i5 = 0;
                        while (true) {
                            if (i5 >= 32) {
                                z3 = true;
                                break;
                            } else if (bArr4[i5] != 0) {
                                z3 = false;
                                break;
                            } else {
                                i5++;
                            }
                        }
                        if (z3) {
                            throw new SignatureException("Invalid signature format.");
                        } else if ((32 - hDC.m(bArr2, 0, 32)) + 2 + 2 + (32 - hDC.m(bArr2, 32, bArr2.length)) <= 255) {
                            BigInteger order = eCPublicKey.getParams().getOrder();
                            if (order.compareTo(bigInteger) < 1) {
                                throw new SignatureException("Invalid signature format.");
                            } else if (order.compareTo(bigInteger2) >= 1) {
                                int m = hDC.m(bArr2, 0, 32);
                                int m2 = hDC.m(bArr2, 32, bArr2.length);
                                int i6 = 32 - m;
                                int i7 = 32 - m2;
                                int i8 = i6 + 2 + 2 + i7;
                                if (i8 > 127) {
                                    bArr = new byte[i8 + 3];
                                    bArr[1] = -127;
                                    i2 = 2;
                                } else {
                                    bArr = new byte[i8 + 2];
                                }
                                bArr[0] = 48;
                                int i9 = i2 + 1;
                                bArr[i2] = (byte) (i8 & 255);
                                int i10 = i9 + 1;
                                bArr[i9] = 2;
                                int i11 = i10 + 1;
                                bArr[i10] = (byte) i6;
                                if (m < 0) {
                                    int i12 = i11 + 1;
                                    bArr[i11] = 0;
                                    System.arraycopy(bArr2, 0, bArr, i12, 32);
                                    i = i12 + 32;
                                } else {
                                    int min = Math.min(32, i6);
                                    System.arraycopy(bArr2, m, bArr, i11, min);
                                    i = min + i11;
                                }
                                int i13 = i + 1;
                                bArr[i] = 2;
                                int i14 = i13 + 1;
                                bArr[i13] = (byte) i7;
                                if (m2 < 0) {
                                    bArr[i14] = 0;
                                    System.arraycopy(bArr2, 32, bArr, i14 + 1, 32);
                                } else {
                                    System.arraycopy(bArr2, m2 + 32, bArr, i14, Math.min(32, i7));
                                }
                                if (instance.verify(bArr)) {
                                    return map2;
                                }
                                throw new IllegalArgumentException(afN.R(-7279996425100L).toString());
                            } else {
                                throw new SignatureException("Invalid signature format.");
                            }
                        } else {
                            throw new SignatureException("Invalid JOSE signature format.");
                        }
                    } else {
                        throw new SignatureException("Invalid signature format.");
                    }
                } else {
                    throw new SignatureException("Invalid signature format.");
                }
            } else {
                throw new SignatureException("Invalid JOSE signature format.");
            }
        } else {
            throw new IllegalArgumentException(afN.R(-7125377602444L).toString());
        }
    }

    public final biy c(String str, boolean z) {
        try {
            nb7 v = v(str);
            boolean z2 = true;
            if (!(v.c == 3)) {
                throw new IllegalArgumentException(afN.R(-5450340357004L).toString());
            } else if (!n3x.v(v.f6483v, this.R.R)) {
                throw new IllegalArgumentException(afN.R(-5536239702924L).toString());
            } else if (!n3x.v(v.f6481c, this.f2049R)) {
                throw new IllegalArgumentException(afN.R(-5622139048844L).toString());
            } else if (n3x.v(v.e, (String) this.f2051R.v.getValue())) {
                if (z) {
                    int i = v.v;
                    this.R.getClass();
                    if (!(i == 999957)) {
                        throw new IllegalArgumentException(afN.R(-5793937740684L).toString());
                    }
                }
                long R = this.f2048R.R();
                if (v.f6480c <= R) {
                    if (v.f6482v < R) {
                        z2 = false;
                    }
                    if (z2) {
                        return new nOH(v.f6479R, v.f6477R, v.R, v.f6478R);
                    }
                    throw new IllegalArgumentException(afN.R(-5965736432524L).toString());
                }
                throw new IllegalArgumentException(afN.R(-5879837086604L).toString());
            } else {
                throw new IllegalArgumentException(afN.R(-5708038394764L).toString());
            }
        } catch (Exception unused) {
            return dpb.R;
        }
    }

    public final nb7 v(String str) {
        Map R = R(str, this.f2050R);
        String str2 = (String) R.get(afN.R(-7365895771020L));
        int longValue = (int) ((Long) R.get(afN.R(-7383075640204L))).longValue();
        Long l = (Long) R.get(afN.R(-7610708906892L));
        Integer valueOf = l != null ? Integer.valueOf((int) l.longValue()) : null;
        String str3 = (String) R.get(afN.R(-8091745244044L));
        String str4 = (String) R.get(afN.R(-8327968445324L));
        String str5 = (String) R.get(afN.R(-8564191646604L));
        long j = (long) 1000;
        return new nb7(str2, longValue, valueOf, (String) R.get(afN.R(-7627888776076L)), (int) ((Long) R.get(afN.R(-7864111977356L))).longValue(), str3, str4, ((Long) R.get(afN.R(-8800414847884L))).longValue() * j, ((Long) R.get(afN.R(-9028048114572L))).longValue() * j, ((Long) R.get(afN.R(-9255681381260L))).longValue() * j, (int) ((Long) R.get(afN.R(-9483314647948L))).longValue());
    }
}
