package defpackage;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* renamed from: mxE  reason: default package */
/* loaded from: classes.dex */
public abstract class mxE {
    public static final /* synthetic */ int R = 0;

    static {
        Charset charset = O1.R;
    }

    public static ArrayList R(String str, F6 f6) {
        ArrayList arrayList = new ArrayList();
        ME me = new ME();
        f6.x(me, f6.v());
        me.readShort();
        int readShort = me.readShort() & 65535;
        if ((readShort >> 15) != 0) {
            int i = readShort & 15;
            if (i == 2) {
                throw new UnknownHostException(opT.H(str, ": SERVFAIL"));
            } else if (i != 3) {
                int readShort2 = me.readShort() & 65535;
                int readShort3 = me.readShort() & 65535;
                me.readShort();
                me.readShort();
                for (int i2 = 0; i2 < readShort2; i2++) {
                    byte readByte = me.readByte();
                    if (readByte < 0) {
                        me.J(1);
                    } else {
                        while (readByte > 0) {
                            me.J((long) readByte);
                            readByte = me.readByte();
                        }
                    }
                    me.readShort();
                    me.readShort();
                }
                for (int i3 = 0; i3 < readShort3; i3++) {
                    byte readByte2 = me.readByte();
                    if (readByte2 < 0) {
                        me.J(1);
                    } else {
                        while (readByte2 > 0) {
                            me.J((long) readByte2);
                            readByte2 = me.readByte();
                        }
                    }
                    int readShort4 = me.readShort() & 65535;
                    me.readShort();
                    me.readInt();
                    int readShort5 = me.readShort() & 65535;
                    if (readShort4 == 1 || readShort4 == 28) {
                        byte[] bArr = new byte[readShort5];
                        me.read(bArr, 0, readShort5);
                        arrayList.add(InetAddress.getByAddress(bArr));
                    } else {
                        me.J((long) readShort5);
                    }
                }
                return arrayList;
            } else {
                throw new UnknownHostException(opT.H(str, ": NXDOMAIN"));
            }
        } else {
            throw new IllegalArgumentException("not a response".toString());
        }
    }
}
