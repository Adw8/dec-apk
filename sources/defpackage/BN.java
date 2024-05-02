package defpackage;

/* renamed from: BN  reason: default package */
/* loaded from: classes.dex */
public final class BN implements AutoCloseable {
    public final w1 R;

    public BN(w1 w1Var) {
        this.R = w1Var;
    }

    public final KM R() {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            oDA oda = this.R.R;
            byte readByte = oda.readByte();
            if (readByte == 1 || readByte == 2 || readByte == 3) {
                int g = oda.g();
                if (g >= 0) {
                    if (readByte != 3 || g == 1) {
                        byte[] N = oda.N((long) g);
                        if (readByte == 1 || readByte == 2) {
                            (readByte == 1 ? sb : sb2).append(new String(N, O1.R));
                        } else if (readByte == 3) {
                            return new KM(sb.toString(), N[0], sb2.toString());
                        } else {
                            throw new IllegalStateException(opT.Z("Invalid shell packet id: ", readByte));
                        }
                    } else {
                        throw new IllegalStateException(opT.Z("Shell exit packet does not have payload length == 1: ", g).toString());
                    }
                } else {
                    throw new IllegalStateException(opT.Z("Shell packet length must be >= 0: ", g).toString());
                }
            } else {
                throw new IllegalStateException(opT.Z("Invalid shell packet id: ", readByte).toString());
            }
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        this.R.close();
    }
}
