package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: N  reason: default package */
/* loaded from: classes.dex */
public final class N extends FilterInputStream {
    public final boolean R;

    /* renamed from: R  reason: collision with other field name */
    public final byte[][] f301R;
    public final int e;

    public N(ByteArrayInputStream byteArrayInputStream, int i, boolean z) {
        this(byteArrayInputStream, i, z, new byte[11]);
    }

    public N(InputStream inputStream, int i, boolean z, byte[][] bArr) {
        super(inputStream);
        this.e = i;
        this.R = z;
        this.f301R = bArr;
    }

    public N(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length, true);
    }

    public static int H(InputStream inputStream, int i) {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int read = inputStream.read();
        if (read >= 31) {
            int i3 = read & 127;
            if (i3 != 0) {
                while ((read & 128) != 0) {
                    if ((i3 >>> 24) == 0) {
                        int i4 = i3 << 7;
                        int read2 = inputStream.read();
                        if (read2 >= 0) {
                            i3 = i4 | (read2 & 127);
                            read = read2;
                        } else {
                            throw new EOFException("EOF found inside tag value.");
                        }
                    } else {
                        throw new IOException("Tag number more than 31 bits");
                    }
                }
                return i3;
            }
            throw new IOException("corrupted stream - invalid high tag number found");
        } else if (read < 0) {
            throw new EOFException("EOF found inside tag value.");
        } else {
            throw new IOException("corrupted stream - high tag number < 31 found");
        }
    }

    public static int O(InputStream inputStream, int i, boolean z) {
        int read = inputStream.read();
        if ((read >>> 7) == 0) {
            return read;
        }
        if (128 == read) {
            return -1;
        }
        if (read < 0) {
            throw new EOFException("EOF found when length expected");
        } else if (255 != read) {
            int i2 = read & 127;
            int i3 = 0;
            int i4 = 0;
            do {
                int read2 = inputStream.read();
                if (read2 < 0) {
                    throw new EOFException("EOF found reading length");
                } else if ((i3 >>> 23) == 0) {
                    i3 = (i3 << 8) + read2;
                    i4++;
                } else {
                    throw new IOException("long form definite-length more than 31 bits");
                }
            } while (i4 < i2);
            if (i3 < i || z) {
                return i3;
            }
            throw new IOException(jQ.U("corrupted stream - out of bounds length found: ", i3, " >= ", i));
        } else {
            throw new IOException("invalid long form definite-length 0xFF");
        }
    }

    public static byte[] X(gWT gwt, byte[][] bArr) {
        int i = gwt.O;
        if (i >= bArr.length) {
            return gwt.c();
        }
        byte[] bArr2 = bArr[i];
        if (bArr2 == null) {
            bArr2 = new byte[i];
            bArr[i] = bArr2;
        }
        if (i == bArr2.length) {
            if (i != 0) {
                int i2 = gwt.e;
                if (i < i2) {
                    int d = i - l6.d(gwt.R, bArr2, bArr2.length);
                    gwt.O = d;
                    if (d == 0) {
                        gwt.R();
                    } else {
                        StringBuilder U = opT.U("DEF length ");
                        U.append(gwt.X);
                        U.append(" object truncated by ");
                        U.append(gwt.O);
                        throw new EOFException(U.toString());
                    }
                } else {
                    StringBuilder U2 = opT.U("corrupted stream - out of bounds length found: ");
                    U2.append(gwt.O);
                    U2.append(" >= ");
                    U2.append(i2);
                    throw new IOException(U2.toString());
                }
            }
            return bArr2;
        }
        throw new IllegalArgumentException("buffer length not right for data");
    }

    public static O c(int i, gWT gwt, byte[][] bArr) {
        int i2 = 0;
        switch (i) {
            case 1:
                return g.n(X(gwt, bArr));
            case 2:
                return new X(gwt.c());
            case 3:
                return e.n(gwt.c());
            case 4:
                byte[] c = gwt.c();
                Y y = F.R;
                return new nP9(c);
            case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                if (gwt.c().length == 0) {
                    return eVe.R;
                }
                throw new IllegalStateException("malformed NULL encoding encountered");
            case 6:
                byte[] X = X(gwt, bArr);
                ConcurrentHashMap concurrentHashMap = u.R;
                u uVar = (u) u.R.get(new v(X));
                return uVar == null ? new u(true, X) : uVar;
            case 7:
                return new I(new lfP(gwt.c()));
            case VmNativeCallback.$stable /* 8 */:
            case 9:
            case lVo.HKDF_SALT_FIELD_NUMBER /* 11 */:
            case 14:
            case 15:
            case 16:
            case 17:
            case 29:
            default:
                throw new IOException(opT.m("unknown tag ", i, " encountered"));
            case 10:
                byte[] X2 = X(gwt, bArr);
                if (X2.length > 1) {
                    return new l(true, X2);
                }
                if (X2.length != 0) {
                    int i3 = X2[0] & 255;
                    l[] lVarArr = l.R;
                    if (i3 >= 12) {
                        return new l(true, X2);
                    }
                    l lVar = lVarArr[i3];
                    if (lVar == null) {
                        lVar = new l(true, X2);
                        lVarArr[i3] = lVar;
                    }
                    return lVar;
                }
                throw new IllegalArgumentException("ENUMERATED has zero length");
            case 12:
                return new nhO(gwt.c());
            case 13:
                return new M(gwt.c());
            case 18:
                return new c0t(gwt.c());
            case 19:
                return new d1S(gwt.c());
            case 20:
                return new niD(gwt.c());
            case 21:
                return new iM_(gwt.c());
            case 22:
                return new hP2(gwt.c());
            case 23:
                return new CQ(gwt.c());
            case 24:
                return new s(gwt.c());
            case 25:
                return new lfP(gwt.c());
            case 26:
                return new lhd(gwt.c());
            case 27:
                return new nk7(gwt.c());
            case 28:
                return new kRc(gwt.c());
            case 30:
                int i4 = gwt.O;
                if ((i4 & 1) == 0) {
                    int i5 = i4 / 2;
                    char[] cArr = new char[i5];
                    byte[] bArr2 = new byte[8];
                    int i6 = 0;
                    while (i4 >= 8) {
                        if (l6.d(gwt, bArr2, 8) == 8) {
                            cArr[i6] = (char) ((bArr2[0] << 8) | (bArr2[1] & 255));
                            cArr[i6 + 1] = (char) ((bArr2[2] << 8) | (bArr2[3] & 255));
                            cArr[i6 + 2] = (char) ((bArr2[4] << 8) | (bArr2[5] & 255));
                            cArr[i6 + 3] = (char) ((bArr2[6] << 8) | (bArr2[7] & 255));
                            i6 += 4;
                            i4 -= 8;
                        } else {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                    }
                    if (i4 > 0) {
                        if (l6.d(gwt, bArr2, i4) == i4) {
                            while (true) {
                                int i7 = i2 + 1;
                                int i8 = i7 + 1;
                                int i9 = i6 + 1;
                                cArr[i6] = (char) ((bArr2[i2] << 8) | (bArr2[i7] & 255));
                                if (i8 >= i4) {
                                    i6 = i9;
                                } else {
                                    i2 = i8;
                                    i6 = i9;
                                }
                            }
                        } else {
                            throw new EOFException("EOF encountered in middle of BMPString");
                        }
                    }
                    if (gwt.O == 0 && i5 == i6) {
                        return new bbP(cArr);
                    }
                    throw new IllegalStateException();
                }
                throw new IOException("malformed BMPString encoding encountered");
        }
    }

    public final W C(gWT gwt) {
        N n;
        O Z;
        int i = gwt.O;
        if (i >= 1 && (Z = (n = new N(gwt, i, this.R, this.f301R)).Z()) != null) {
            W w = new W();
            do {
                w.R(Z);
                Z = n.Z();
            } while (Z != null);
            return w;
        }
        return new W(0);
    }

    public final O R(int i, int i2, int i3) {
        gWT gwt = new gWT(this, i3, this.e);
        if ((i & 224) == 0) {
            return c(i2, gwt, this.f301R);
        }
        int i4 = i & 192;
        int i5 = 0;
        if (i4 != 0) {
            if ((i & 32) != 0) {
                i5 = 1;
            }
            if (i5 != 0) {
                return Vz.n(i4, i2, C(gwt));
            }
            oU oUVar = new oU(4, i4, i2, new nP9(gwt.c()), 2);
            return i4 != 64 ? oUVar : new k61(oUVar);
        } else if (i2 == 3) {
            W C = C(gwt);
            int i6 = C.R;
            e[] eVarArr = new e[i6];
            while (i5 != i6) {
                b c = C.c(i5);
                if (c instanceof e) {
                    eVarArr[i5] = (e) c;
                    i5++;
                } else {
                    StringBuilder U = opT.U("unknown object encountered in constructed BIT STRING: ");
                    U.append(c.getClass());
                    throw new P(U.toString());
                }
            }
            return new a9(eVarArr);
        } else if (i2 == 4) {
            W C2 = C(gwt);
            int i7 = C2.R;
            F[] fArr = new F[i7];
            while (i5 != i7) {
                b c2 = C2.c(i5);
                if (c2 instanceof F) {
                    fArr[i5] = (F) c2;
                    i5++;
                } else {
                    StringBuilder U2 = opT.U("unknown object encountered in constructed OCTET STRING: ");
                    U2.append(c2.getClass());
                    throw new P(U2.toString());
                }
            }
            return new CB(CB.Q(fArr), fArr);
        } else if (i2 == 8) {
            return k2D.R(C(gwt)).k();
        } else {
            if (i2 == 16) {
                return gwt.O < 1 ? k2D.f5182R : this.R ? new nEm(gwt.c()) : k2D.R(C(gwt));
            }
            if (i2 == 17) {
                W C3 = C(gwt);
                fSU fsu = k2D.f5182R;
                return C3.R < 1 ? k2D.R : new cza(C3);
            }
            throw new IOException(opT.m("unknown tag ", i2, " encountered"));
        }
    }

    public final O Z() {
        int read = read();
        if (read > 0) {
            int H = H(this, read);
            int O = O(this, this.e, false);
            if (O >= 0) {
                try {
                    return R(read, H, O);
                } catch (IllegalArgumentException e) {
                    throw new P("corrupted stream detected", e);
                }
            } else if ((read & 32) != 0) {
                mAv mav = new mAv(new bNV(this, this.e), this.e, this.f301R);
                int i = read & 192;
                if (i != 0) {
                    return mav.O(i, H);
                }
                if (H == 3) {
                    fu8 fu8 = new fu8(mav);
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read2 = fu8.read(bArr, 0, 4096);
                        if (read2 >= 0) {
                            byteArrayOutputStream.write(bArr, 0, read2);
                        } else {
                            return new a9(fu8.e, byteArrayOutputStream.toByteArray());
                        }
                    }
                } else if (H == 4) {
                    oVx ovx = new oVx(mav);
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    byte[] bArr2 = new byte[4096];
                    while (true) {
                        int read3 = ovx.read(bArr2, 0, 4096);
                        if (read3 < 0) {
                            return new CB(byteArrayOutputStream2.toByteArray());
                        }
                        byteArrayOutputStream2.write(bArr2, 0, read3);
                    }
                } else if (H == 8) {
                    try {
                        return new k2F(mav.Z());
                    } catch (IllegalArgumentException e2) {
                        throw new P(e2.getMessage(), e2);
                    }
                } else if (H == 16) {
                    return new d7(mav.Z());
                } else {
                    if (H == 17) {
                        return new D9(mav.Z());
                    }
                    throw new IOException("unknown BER object encountered");
                }
            } else {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
        } else if (read != 0) {
            return null;
        } else {
            throw new IOException("unexpected end-of-contents marker");
        }
    }
}
