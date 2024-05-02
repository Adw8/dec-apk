package defpackage;

import dev.kdrag0n.virt.vm.VmNativeCallback;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: goc  reason: default package */
/* loaded from: classes.dex */
public final class goc implements Closeable {
    public static final Logger R = Logger.getLogger(dDc.class.getName());

    /* renamed from: R  reason: collision with other field name */
    public final Jl f3941R;

    /* renamed from: R  reason: collision with other field name */
    public final f87 f3942R;

    /* renamed from: R  reason: collision with other field name */
    public final gJZ f3943R;

    /* renamed from: R  reason: collision with other field name */
    public final boolean f3944R;

    public goc(Jl jl, boolean z) {
        this.f3941R = jl;
        this.f3944R = z;
        gJZ gjz = new gJZ(jl);
        this.f3943R = gjz;
        this.f3942R = new f87(gjz);
    }

    public final void H(oSI osi, int i, int i2, int i3) {
        try {
            if (i == 4) {
                int readInt = this.f3941R.readInt();
                byte[] bArr = asb.f1481R;
                long j = 2147483647L & ((long) readInt);
                int i4 = (j > 0 ? 1 : (j == 0 ? 0 : -1));
                if (i4 != 0) {
                    Logger logger = R;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(dDc.c(true, i3, i, j));
                    }
                    if (i3 == 0) {
                        jr5 jr5 = osi.f6829R;
                        synchronized (jr5) {
                            jr5.m += j;
                            jr5.notifyAll();
                        }
                        return;
                    }
                    dj8 X = osi.f6829R.X(i3);
                    if (X != null) {
                        synchronized (X) {
                            X.e += j;
                            if (i4 > 0) {
                                X.notifyAll();
                            }
                        }
                        return;
                    }
                    return;
                }
                throw new IOException("windowSizeIncrement was 0");
            }
            throw new IOException("TYPE_WINDOW_UPDATE length !=4: " + i);
        } catch (Exception e) {
            R.fine(dDc.v(true, i3, i, 8, i2));
            throw e;
        }
    }

    public final List O(int i, int i2, int i3, int i4) {
        gJZ gjz = this.f3943R;
        gjz.L = i;
        gjz.e = i;
        gjz.Z = i2;
        gjz.X = i3;
        gjz.O = i4;
        f87 f87 = this.f3942R;
        while (!f87.f3326R.r()) {
            byte readByte = f87.f3326R.readByte();
            byte[] bArr = asb.f1481R;
            int i5 = readByte & 255;
            if (i5 != 128) {
                boolean z = false;
                if ((i5 & 128) == 128) {
                    int X = f87.X(i5, 127) - 1;
                    if (X >= 0 && X <= h13.f4021R.length - 1) {
                        z = true;
                    }
                    if (z) {
                        f87.f3325R.add(h13.f4021R[X]);
                    } else {
                        int length = f87.v + 1 + (X - h13.f4021R.length);
                        if (length >= 0) {
                            h8A[] h8aArr = f87.f3327R;
                            if (length < h8aArr.length) {
                                f87.f3325R.add(h8aArr[length]);
                            }
                        }
                        StringBuilder U = opT.U("Header index too large ");
                        U.append(X + 1);
                        throw new IOException(U.toString());
                    }
                } else if (i5 == 64) {
                    h8A[] h8aArr2 = h13.f4021R;
                    F6 e = f87.e();
                    h13.R(e);
                    f87.c(new h8A(e, f87.e()));
                } else if ((i5 & 64) == 64) {
                    f87.c(new h8A(f87.v(f87.X(i5, 63) - 1), f87.e()));
                } else if ((i5 & 32) == 32) {
                    int X2 = f87.X(i5, 31);
                    f87.R = X2;
                    if (X2 < 0 || X2 > 4096) {
                        StringBuilder U2 = opT.U("Invalid dynamic table size update ");
                        U2.append(f87.R);
                        throw new IOException(U2.toString());
                    }
                    int i6 = f87.e;
                    if (X2 < i6) {
                        if (X2 == 0) {
                            P7.G(f87.f3327R, null);
                            f87.v = f87.f3327R.length - 1;
                            f87.c = 0;
                            f87.e = 0;
                        } else {
                            f87.R(i6 - X2);
                        }
                    }
                } else if (i5 == 16 || i5 == 0) {
                    h8A[] h8aArr3 = h13.f4021R;
                    F6 e2 = f87.e();
                    h13.R(e2);
                    f87.f3325R.add(new h8A(e2, f87.e()));
                } else {
                    f87.f3325R.add(new h8A(f87.v(f87.X(i5, 15) - 1), f87.e()));
                }
            } else {
                throw new IOException("index == 0");
            }
        }
        f87 f872 = this.f3942R;
        List pG = dF.pG(f872.f3325R);
        f872.f3325R.clear();
        return pG;
    }

    public final boolean R(boolean z, oSI osi) {
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        gtp gtp;
        int readInt;
        gtp gtp2 = gtp.PROTOCOL_ERROR;
        int i = 0;
        try {
            this.f3941R.P(9);
            Jl jl = this.f3941R;
            byte[] bArr = asb.f1481R;
            int readByte = (jl.readByte() & 255) | ((jl.readByte() & 255) << 16) | ((jl.readByte() & 255) << 8);
            if (readByte <= 16384) {
                int readByte2 = this.f3941R.readByte() & 255;
                int readByte3 = this.f3941R.readByte() & 255;
                int readInt2 = this.f3941R.readInt() & Integer.MAX_VALUE;
                if (readByte2 != 8) {
                    Logger logger = R;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(dDc.v(true, readInt2, readByte, readByte2, readByte3));
                    }
                }
                if (!z || readByte2 == 4) {
                    switch (readByte2) {
                        case 0:
                            boolean z5 = true;
                            if (readInt2 != 0) {
                                boolean z6 = (readByte3 & 1) != 0;
                                if (!((readByte3 & 32) != 0)) {
                                    int readByte4 = (readByte3 & 8) != 0 ? this.f3941R.readByte() & 255 : 0;
                                    int H = atb.H(readByte, readByte3, readByte4);
                                    Jl jl2 = this.f3941R;
                                    osi.f6829R.getClass();
                                    if (readInt2 == 0 || (readInt2 & 1) != 0) {
                                        z5 = false;
                                    }
                                    if (z5) {
                                        jr5 jr5 = osi.f6829R;
                                        jr5.getClass();
                                        ME me = new ME();
                                        long j2 = (long) H;
                                        jl2.P(j2);
                                        jl2.Y(me, j2);
                                        hiT.c(jr5.f5047v, jr5.f5035R + '[' + readInt2 + "] onData", new cdH(jr5, readInt2, me, H, z6));
                                    } else {
                                        dj8 X = osi.f6829R.X(readInt2);
                                        if (X == null) {
                                            osi.f6829R.j(readInt2, gtp2);
                                            long j3 = (long) H;
                                            osi.f6829R.H(j3);
                                            jl2.J(j3);
                                        } else {
                                            bd4 bd4 = khE.R;
                                            bP9 bp9 = X.f2836R;
                                            long j4 = (long) H;
                                            bp9.getClass();
                                            while (true) {
                                                if (j4 > 0) {
                                                    synchronized (bp9.f1634R) {
                                                        z2 = bp9.f1635R;
                                                        z3 = bp9.v.R + j4 > bp9.R;
                                                    }
                                                    if (z3) {
                                                        jl2.J(j4);
                                                        bp9.f1634R.X(gtp.FLOW_CONTROL_ERROR);
                                                    } else if (z2) {
                                                        jl2.J(j4);
                                                    } else {
                                                        long Y = jl2.Y(bp9.f1632R, j4);
                                                        if (Y != -1) {
                                                            j4 -= Y;
                                                            dj8 dj8 = bp9.f1634R;
                                                            synchronized (dj8) {
                                                                if (bp9.f1636v) {
                                                                    ME me2 = bp9.f1632R;
                                                                    j = me2.R;
                                                                    me2.X();
                                                                } else {
                                                                    ME me3 = bp9.v;
                                                                    boolean z7 = me3.R == 0;
                                                                    me3.f(bp9.f1632R);
                                                                    if (z7) {
                                                                        dj8.notifyAll();
                                                                    }
                                                                    j = 0;
                                                                }
                                                            }
                                                            if (j > 0) {
                                                                dj8 dj82 = bp9.f1634R;
                                                                bd4 bd42 = khE.R;
                                                                dj82.f2840R.H(j);
                                                            }
                                                        } else {
                                                            throw new EOFException();
                                                        }
                                                    }
                                                }
                                            }
                                            if (z6) {
                                                X.m(khE.R, true);
                                            }
                                        }
                                    }
                                    this.f3941R.J((long) readByte4);
                                    return true;
                                }
                                throw new IOException("PROTOCOL_ERROR: FLAG_COMPRESSED without SETTINGS_COMPRESS_DATA");
                            }
                            throw new IOException("PROTOCOL_ERROR: TYPE_DATA streamId == 0");
                        case 1:
                            if (readInt2 != 0) {
                                boolean z8 = (readByte3 & 1) != 0;
                                int readByte5 = (readByte3 & 8) != 0 ? this.f3941R.readByte() & 255 : 0;
                                if ((readByte3 & 32) != 0) {
                                    this.f3941R.readInt();
                                    this.f3941R.readByte();
                                    osi.getClass();
                                    readByte -= 5;
                                }
                                List O = O(atb.H(readByte, readByte3, readByte5), readByte5, readByte3, readInt2);
                                osi.f6829R.getClass();
                                if (readInt2 != 0 && (readInt2 & 1) == 0) {
                                    i = 1;
                                }
                                if (i != 0) {
                                    jr5 jr52 = osi.f6829R;
                                    hiT.c(jr52.f5047v, jr52.f5035R + '[' + readInt2 + "] onHeaders", new bcD(jr52, readInt2, O, z8));
                                } else {
                                    jr5 jr53 = osi.f6829R;
                                    synchronized (jr53) {
                                        dj8 X2 = jr53.X(readInt2);
                                        if (X2 != null) {
                                            z4 = true;
                                            X2.m(khE.L(O), z8);
                                        } else if (!jr53.f5049v) {
                                            if (readInt2 > jr53.e) {
                                                if (readInt2 % 2 != jr53.X % 2) {
                                                    z4 = true;
                                                    dj8 dj83 = new dj8(readInt2, jr53, false, z8, khE.L(O));
                                                    jr53.e = readInt2;
                                                    jr53.f5037R.put(Integer.valueOf(readInt2), dj83);
                                                    hiT.c(jr53.f5034R.O(), jr53.f5035R + '[' + readInt2 + "] onStream", new _c(jr53, 28, dj83));
                                                }
                                            }
                                        }
                                    }
                                    return z4;
                                }
                                z4 = true;
                                return z4;
                            }
                            throw new IOException("PROTOCOL_ERROR: TYPE_HEADERS streamId == 0");
                        case 2:
                            if (readByte != 5) {
                                throw new IOException(opT.m("TYPE_PRIORITY length: ", readByte, " != 5"));
                            } else if (readInt2 != 0) {
                                this.f3941R.readInt();
                                this.f3941R.readByte();
                                osi.getClass();
                                z4 = true;
                                return z4;
                            } else {
                                throw new IOException("TYPE_PRIORITY streamId == 0");
                            }
                        case 3:
                            if (readByte != 4) {
                                throw new IOException(opT.m("TYPE_RST_STREAM length: ", readByte, " != 4"));
                            } else if (readInt2 != 0) {
                                int readInt3 = this.f3941R.readInt();
                                gtp[] values = gtp.values();
                                int length = values.length;
                                int i2 = 0;
                                while (true) {
                                    if (i2 < length) {
                                        gtp = values[i2];
                                        if (!(gtp.f3974e == readInt3)) {
                                            i2++;
                                        }
                                    } else {
                                        gtp = null;
                                    }
                                }
                                if (gtp != null) {
                                    osi.f6829R.getClass();
                                    if (readInt2 != 0 && (readInt2 & 1) == 0) {
                                        jr5 jr54 = osi.f6829R;
                                        hiT.c(jr54.f5047v, jr54.f5035R + '[' + readInt2 + "] onReset", new n5W(jr54, readInt2, gtp, 0));
                                    } else {
                                        dj8 O2 = osi.f6829R.O(readInt2);
                                        if (O2 != null) {
                                            synchronized (O2) {
                                                if (O2.f2837R == null) {
                                                    O2.f2837R = gtp;
                                                    O2.notifyAll();
                                                }
                                            }
                                        }
                                    }
                                    z4 = true;
                                    return z4;
                                }
                                throw new IOException(opT.Z("TYPE_RST_STREAM unexpected error code: ", readInt3));
                            } else {
                                throw new IOException("TYPE_RST_STREAM streamId == 0");
                            }
                        case 4:
                            if (readInt2 == 0) {
                                if ((readByte3 & 1) != 0) {
                                    if (readByte != 0) {
                                        throw new IOException("FRAME_SIZE_ERROR ack frame should be empty!");
                                    }
                                } else if (readByte % 6 == 0) {
                                    oWQ owq = new oWQ();
                                    ka_ i3 = caw.i(caw.V(0, readByte), 6);
                                    int i4 = i3.e;
                                    int i5 = i3.X;
                                    int i6 = i3.O;
                                    if ((i6 > 0 && i4 <= i5) || (i6 < 0 && i5 <= i4)) {
                                        while (true) {
                                            short readShort = this.f3941R.readShort();
                                            byte[] bArr2 = asb.f1481R;
                                            int i7 = readShort & 65535;
                                            readInt = this.f3941R.readInt();
                                            if (i7 != 2) {
                                                if (i7 == 3) {
                                                    i7 = 4;
                                                } else if (i7 == 4) {
                                                    i7 = 7;
                                                    if (readInt < 0) {
                                                        throw new IOException("PROTOCOL_ERROR SETTINGS_INITIAL_WINDOW_SIZE > 2^31 - 1");
                                                    }
                                                } else if (i7 == 5 && (readInt < 16384 || readInt > 16777215)) {
                                                }
                                            } else if (!(readInt == 0 || readInt == 1)) {
                                                throw new IOException("PROTOCOL_ERROR SETTINGS_ENABLE_PUSH != 0 or 1");
                                            }
                                            owq.v(i7, readInt);
                                            if (i4 != i5) {
                                                i4 += i6;
                                            }
                                        }
                                        throw new IOException(opT.Z("PROTOCOL_ERROR SETTINGS_MAX_FRAME_SIZE: ", readInt));
                                    }
                                    hiT.c(osi.f6829R.f5033R, jQ.g(new StringBuilder(), osi.f6829R.f5035R, " applyAndAckSettings"), new eOg(osi, owq));
                                } else {
                                    throw new IOException(opT.Z("TYPE_SETTINGS length % 6 != 0: ", readByte));
                                }
                                z4 = true;
                                return z4;
                            }
                            throw new IOException("TYPE_SETTINGS streamId != 0");
                        case kTo.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                            if (readInt2 != 0) {
                                if ((readByte3 & 8) != 0) {
                                    i = this.f3941R.readByte() & 255;
                                }
                                int readInt4 = this.f3941R.readInt() & Integer.MAX_VALUE;
                                List O3 = O(atb.H(readByte - 4, readByte3, i), i, readByte3, readInt2);
                                jr5 jr55 = osi.f6829R;
                                synchronized (jr55) {
                                    if (jr55.f5038R.contains(Integer.valueOf(readInt4))) {
                                        jr55.j(readInt4, gtp2);
                                    } else {
                                        jr55.f5038R.add(Integer.valueOf(readInt4));
                                        hiT.c(jr55.f5047v, jr55.f5035R + '[' + readInt4 + "] onRequest", new lIm(jr55, readInt4, O3));
                                    }
                                }
                                z4 = true;
                                return z4;
                            }
                            throw new IOException("PROTOCOL_ERROR: TYPE_PUSH_PROMISE streamId == 0");
                        case 6:
                            Z(osi, readByte, readByte3, readInt2);
                            z4 = true;
                            return z4;
                        case 7:
                            X(osi, readByte, readInt2);
                            z4 = true;
                            return z4;
                        case VmNativeCallback.$stable:
                            H(osi, readByte, readByte3, readInt2);
                            z4 = true;
                            return z4;
                        default:
                            this.f3941R.J((long) readByte);
                            return true;
                    }
                } else {
                    StringBuilder U = opT.U("Expected a SETTINGS frame but was ");
                    U.append(dDc.R(readByte2));
                    throw new IOException(U.toString());
                }
            } else {
                throw new IOException(opT.Z("FRAME_SIZE_ERROR: ", readByte));
            }
        } catch (EOFException unused) {
            return false;
        }
    }

    public final void X(oSI osi, int i, int i2) {
        gtp gtp;
        Object[] array;
        if (i < 8) {
            throw new IOException(opT.Z("TYPE_GOAWAY length < 8: ", i));
        } else if (i2 == 0) {
            int readInt = this.f3941R.readInt();
            int readInt2 = this.f3941R.readInt();
            int i3 = i - 8;
            gtp[] values = gtp.values();
            int length = values.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length) {
                    gtp = null;
                    break;
                }
                gtp = values[i4];
                if (gtp.f3974e == readInt2) {
                    break;
                }
                i4++;
            }
            if (gtp != null) {
                F6 f6 = F6.R;
                if (i3 > 0) {
                    f6 = this.f3941R.S((long) i3);
                }
                osi.getClass();
                f6.v();
                jr5 jr5 = osi.f6829R;
                synchronized (jr5) {
                    array = jr5.f5037R.values().toArray(new dj8[0]);
                    if (array != null) {
                        jr5.f5049v = true;
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                    }
                }
                dj8[] dj8Arr = (dj8[]) array;
                for (dj8 dj8 : dj8Arr) {
                    if (dj8.R > readInt && dj8.L()) {
                        gtp gtp2 = gtp.REFUSED_STREAM;
                        synchronized (dj8) {
                            if (dj8.f2837R == null) {
                                dj8.f2837R = gtp2;
                                dj8.notifyAll();
                            }
                        }
                        osi.f6829R.O(dj8.R);
                    }
                }
                return;
            }
            throw new IOException(opT.Z("TYPE_GOAWAY unexpected error code: ", readInt2));
        } else {
            throw new IOException("TYPE_GOAWAY streamId != 0");
        }
    }

    public final void Z(oSI osi, int i, int i2, int i3) {
        if (i != 8) {
            throw new IOException(opT.Z("TYPE_PING length != 8: ", i));
        } else if (i3 == 0) {
            int readInt = this.f3941R.readInt();
            int readInt2 = this.f3941R.readInt();
            if ((i2 & 1) != 0) {
                jr5 jr5 = osi.f6829R;
                synchronized (jr5) {
                    if (readInt == 1) {
                        jr5.v++;
                    } else if (readInt == 2) {
                        jr5.f5045e++;
                    } else if (readInt == 3) {
                        jr5.notifyAll();
                    }
                }
                return;
            }
            hiT.c(osi.f6829R.f5033R, jQ.g(new StringBuilder(), osi.f6829R.f5035R, " ping"), new mZH(osi.f6829R, readInt, readInt2));
        } else {
            throw new IOException("TYPE_PING streamId != 0");
        }
    }

    public final void c(oSI osi) {
        if (!this.f3944R) {
            Jl jl = this.f3941R;
            F6 f6 = dDc.R;
            F6 S = jl.S((long) f6.f115R.length);
            Logger logger = R;
            if (logger.isLoggable(Level.FINE)) {
                StringBuilder U = opT.U("<< CONNECTION ");
                U.append(S.c());
                logger.fine(khE.c(U.toString(), new Object[0]));
            }
            if (!n3x.v(f6, S)) {
                StringBuilder U2 = opT.U("Expected a connection header but was ");
                U2.append(S.m());
                throw new IOException(U2.toString());
            }
        } else if (!R(true, osi)) {
            throw new IOException("Required SETTINGS preface not received");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f3941R.close();
    }
}
