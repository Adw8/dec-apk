package moe.shizuku.manager.adb;

import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class d implements Closeable {
    public final g92 R;

    /* renamed from: R  reason: collision with other field name */
    public final jY f6158R;

    /* renamed from: R  reason: collision with other field name */
    public DataInputStream f6159R;

    /* renamed from: R  reason: collision with other field name */
    public DataOutputStream f6160R;

    /* renamed from: R  reason: collision with other field name */
    public final String f6161R;

    /* renamed from: R  reason: collision with other field name */
    public Socket f6162R;

    /* renamed from: R  reason: collision with other field name */
    public PairingContext f6163R;
    public int X = 1;
    public final int e;

    public d(int i, String str, jY jYVar) {
        this.e = i;
        this.f6161R = str;
        this.f6158R = jYVar;
        this.R = new g92((byte) 0, (byte[]) jYVar.f4955R.getValue());
    }

    public final meP R() {
        byte[] bArr = new byte[6];
        DataInputStream dataInputStream = this.f6159R;
        if (dataInputStream == null) {
            dataInputStream = null;
        }
        dataInputStream.readFully(bArr);
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        ppN ppn = meP.R;
        byte b = order.get();
        byte b2 = order.get();
        int i = order.getInt();
        if (b < 1 || b > 1) {
            kxm.v(cUF.v(ppn), 6, opT.m("PairingPacketHeader version mismatch (us=1 them=", b, ")"), null);
            return null;
        } else if (b2 != 0 && b2 != 1) {
            kxm.v(cUF.v(ppn), 6, opT.Z("Unknown PairingPacket type=", b2), null);
            return null;
        } else if (i <= 0 || i > 16384) {
            kxm.v(cUF.v(ppn), 6, opT.m("header payload not within a safe payload size (size=", i, ")"), null);
            return null;
        } else {
            meP mep = new meP(b, b2, i);
            pby[] pbyArr = kxm.R;
            return mep;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x019d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
        // Method dump skipped, instructions count: 434
        */
        throw new UnsupportedOperationException("Method not decompiled: moe.shizuku.manager.adb.d.c():boolean");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        PairingContext pairingContext = null;
        try {
            DataInputStream dataInputStream = this.f6159R;
            if (dataInputStream == null) {
                dataInputStream = null;
            }
            dataInputStream.close();
        } catch (Throwable unused) {
        }
        try {
            DataOutputStream dataOutputStream = this.f6160R;
            if (dataOutputStream == null) {
                dataOutputStream = null;
            }
            dataOutputStream.close();
        } catch (Throwable unused2) {
        }
        try {
            Socket socket = this.f6162R;
            if (socket == null) {
                socket = null;
            }
            socket.close();
        } catch (Exception unused3) {
        }
        if (this.X != 1) {
            PairingContext pairingContext2 = this.f6163R;
            if (pairingContext2 != null) {
                pairingContext = pairingContext2;
            }
            pairingContext.c();
        }
    }
}
