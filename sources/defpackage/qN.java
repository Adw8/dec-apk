package defpackage;

import java.io.IOException;

/* renamed from: qN  reason: default package */
/* loaded from: classes.dex */
public abstract class qN {
    public int memoizedHashCode = 0;

    public abstract int R();

    public abstract void X(d3 d3Var);

    public final String c(String str) {
        StringBuilder U = opT.U("Serializing ");
        U.append(getClass().getName());
        U.append(" to a ");
        U.append(str);
        U.append(" threw an IOException (should never happen).");
        return U.toString();
    }

    public final byte[] e() {
        try {
            int R = R();
            byte[] bArr = new byte[R];
            d3 d3Var = new d3(bArr, R);
            X(d3Var);
            if (d3Var.f2473R - d3Var.v == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            throw new RuntimeException(c("byte array"), e);
        }
    }

    public final int v(bvr bvr) {
        csA csa = (csA) this;
        int i = csa.memoizedSerializedSize;
        if (i != -1) {
            return i;
        }
        int x = bvr.x(this);
        csa.memoizedSerializedSize = x;
        return x;
    }
}
