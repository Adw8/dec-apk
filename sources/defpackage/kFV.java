package defpackage;

import java.net.Socket;
import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: kFV  reason: default package */
/* loaded from: classes.dex */
public final class kFV implements AutoCloseable {
    public final jY R;

    /* renamed from: R  reason: collision with other field name */
    public final String f5225R = "127.0.0.1";

    /* renamed from: R  reason: collision with other field name */
    public kSh f5226R;

    /* renamed from: R  reason: collision with other field name */
    public final mV f5227R;
    public final int e;

    public kFV(int i, mV mVVar, jY jYVar) {
        this.e = i;
        this.f5227R = mVVar;
        this.R = jYVar;
    }

    public final kSh R() {
        Socket socket = new Socket(this.f5225R, this.e);
        socket.setTcpNoDelay(true);
        mV mVVar = this.f5227R;
        jY jYVar = this.R;
        J8 V = mLz.V(socket);
        pZ i = mLz.i(socket);
        yn ynVar = new yn(V);
        wJ wJVar = new wJ(i);
        try {
            return new kSh(aYa.Z(ynVar, wJVar, mVVar, jYVar, socket), socket);
        } catch (Throwable th) {
            ynVar.close();
            wJVar.close();
            throw th;
        }
    }

    public final KM c(String str) {
        e_ e_Var;
        String H = opT.H("shell,v2,raw:", str);
        synchronized (this) {
            kSh ksh = this.f5226R;
            if (ksh == null || ((Socket) ksh.v).isClosed()) {
                ksh = R();
                this.f5226R = ksh;
            }
            e_Var = (e_) ksh.R;
        }
        int nextInt = e_Var.f3137R.nextInt();
        or orVar = e_Var.f3138R;
        orVar.R.add(Integer.valueOf(nextInt));
        orVar.f6971R.putIfAbsent(Integer.valueOf(nextInt), new ConcurrentHashMap());
        try {
            wJ wJVar = e_Var.f3139R;
            wJVar.getClass();
            ByteBuffer allocate = ByteBuffer.allocate(H.length() + 1);
            allocate.put(H.getBytes(O1.R));
            allocate.put((byte) 0);
            byte[] array = allocate.array();
            wJVar.R(1313165391, nextInt, 0, array, array.length);
            BN bn = new BN(new w1(e_Var.f3138R, e_Var.f3139R, e_Var.e, nextInt, ((s0) e_Var.f3138R.X(nextInt, 1497451343)).v));
            th = null;
            try {
                return bn.R();
            } finally {
                try {
                    throw th;
                } finally {
                }
            }
        } catch (Throwable th) {
            or orVar2 = e_Var.f3138R;
            orVar2.R.remove(Integer.valueOf(nextInt));
            orVar2.f6971R.remove(Integer.valueOf(nextInt));
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        e_ e_Var;
        kSh ksh = this.f5226R;
        if (ksh != null && (e_Var = (e_) ksh.R) != null) {
            e_Var.close();
        }
    }

    @Override // java.lang.Object
    public final String toString() {
        String str = this.f5225R;
        int i = this.e;
        return str + ":" + i;
    }
}
