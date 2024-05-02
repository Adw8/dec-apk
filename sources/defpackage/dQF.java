package defpackage;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Arrays;

/* renamed from: dQF  reason: default package */
/* loaded from: classes.dex */
public final class dQF {
    public final dq R;

    /* renamed from: R  reason: collision with other field name */
    public final hw1 f2604R;

    /* renamed from: R  reason: collision with other field name */
    public final wg f2605R;

    public dQF(dq dqVar, dq dqVar2, hw1 hw1) {
        this.f2605R = dqVar;
        this.R = dqVar2;
        this.f2604R = hw1;
    }

    public static void R(byte b, byte b2, int i, long j) {
        if (b == 3) {
            throw new iH7("unsynchronized server");
        } else if (b2 != 4 && b2 != 5) {
            throw new iH7(opT.Z("untrusted mode: ", b2));
        } else if (i == 0 || i > 15) {
            throw new iH7(opT.Z("untrusted stratum: ", i));
        } else if (j == 0) {
            throw new iH7("zero transmitTime");
        }
    }

    public static long c(int i, byte[] bArr) {
        long v = v(i, bArr);
        return ((v(i + 4, bArr) * 1000) / 4294967296L) + ((v - 2208988800L) * 1000);
    }

    public static long v(int i, byte[] bArr) {
        byte b = bArr[i];
        byte b2 = bArr[i + 1];
        byte b3 = bArr[i + 2];
        byte b4 = bArr[i + 3];
        int i2 = b & 128;
        byte b5 = b;
        if (i2 == 128) {
            b5 = (b & Byte.MAX_VALUE) + 128;
        }
        int i3 = b2 & 128;
        byte b6 = b2;
        if (i3 == 128) {
            b6 = (b2 & Byte.MAX_VALUE) + 128;
        }
        int i4 = b3 & 128;
        byte b7 = b3;
        if (i4 == 128) {
            b7 = (b3 & Byte.MAX_VALUE) + 128;
        }
        int i5 = b4 & 128;
        byte b8 = b4;
        if (i5 == 128) {
            b8 = (b4 & Byte.MAX_VALUE) + 128;
        }
        return ((b5 == 1 ? 1 : 0) << 24) + ((b6 == 1 ? 1 : 0) << 16) + ((b7 == 1 ? 1 : 0) << 8) + (b8 == 1 ? 1 : 0);
    }

    public final b05 e(String str, Long l) {
        Throwable th;
        InetAddress byName;
        DatagramSocket datagramSocket;
        DatagramSocket datagramSocket2 = null;
        try {
            this.R.getClass();
            byName = InetAddress.getByName(str);
            this.f2604R.getClass();
            datagramSocket = new DatagramSocket();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            datagramSocket.setSoTimeout(l.intValue());
            byte[] bArr = new byte[48];
            this.f2604R.getClass();
            DatagramPacket datagramPacket = new DatagramPacket(bArr, 48, byName, 123);
            bArr[0] = 27;
            long R = this.f2605R.R();
            long m = this.f2605R.m();
            long j = R / 1000;
            long j2 = R - (j * 1000);
            long j3 = j + 2208988800L;
            bArr[40] = (byte) ((int) (j3 >> 24));
            bArr[41] = (byte) ((int) (j3 >> 16));
            bArr[42] = (byte) ((int) (j3 >> 8));
            bArr[43] = (byte) ((int) (j3 >> 0));
            long j4 = (j2 * 4294967296L) / 1000;
            bArr[44] = (byte) ((int) (j4 >> 24));
            bArr[45] = (byte) ((int) (j4 >> 16));
            bArr[46] = (byte) ((int) (j4 >> 8));
            bArr[47] = (byte) ((int) (Math.random() * 255.0d));
            datagramSocket.send(datagramPacket);
            byte[] copyOf = Arrays.copyOf(bArr, 48);
            this.f2604R.getClass();
            datagramSocket.receive(new DatagramPacket(copyOf, copyOf.length));
            long m2 = this.f2605R.m();
            long j5 = (m2 - m) + R;
            byte b = copyOf[0];
            long c = c(24, copyOf);
            long c2 = c(32, copyOf);
            long c3 = c(40, copyOf);
            R((byte) ((b >> 6) & 3), (byte) (b & 7), copyOf[1] & 255, c3);
            b05 b05 = new b05(j5, m2, ((c3 - j5) + (c2 - c)) / 2, this.f2605R);
            datagramSocket.close();
            return b05;
        } catch (Throwable th3) {
            th = th3;
            datagramSocket2 = datagramSocket;
            if (datagramSocket2 != null) {
                datagramSocket2.close();
            }
            throw th;
        }
    }
}
