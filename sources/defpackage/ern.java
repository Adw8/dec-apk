package defpackage;

/* renamed from: ern  reason: default package */
/* loaded from: classes.dex */
public final class ern implements f11 {
    public final long R;
    public final long v;

    public ern(long j, long j2) {
        this.R = j;
        this.v = j2;
        boolean z = true;
        if (j >= 0) {
            if (!(j2 < 0 ? false : z)) {
                throw new IllegalArgumentException(("replayExpiration(" + j2 + " ms) cannot be negative").toString());
            }
            return;
        }
        throw new IllegalArgumentException(("stopTimeout(" + j + " ms) cannot be negative").toString());
    }

    @Override // defpackage.f11
    public final nWQ R(cro cro) {
        kCt kct = new kCt(this, null);
        int i = oVA.R;
        return l6.o(new hzK(new l7(kct, cro, aIH.R, -2, h9.SUSPEND), new jfX(null), 0));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ern) {
            ern ern = (ern) obj;
            if (this.R == ern.R && this.v == ern.v) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.v) + (Long.hashCode(this.R) * 31);
    }

    public final String toString() {
        b5G b5g = new b5G(new Object[2], 0, 0, false, null, null);
        if (this.R > 0) {
            StringBuilder U = opT.U("stopTimeout=");
            U.append(this.R);
            U.append("ms");
            b5g.add(U.toString());
        }
        if (this.v < Long.MAX_VALUE) {
            StringBuilder U2 = opT.U("replayExpiration=");
            U2.append(this.v);
            U2.append("ms");
            b5g.add(U2.toString());
        }
        if (b5g.R == null) {
            b5g.C();
            b5g.f1526R = true;
            StringBuilder U3 = opT.U("SharingStarted.WhileSubscribed(");
            U3.append(dF.X4(b5g, null, null, null, null, 63));
            U3.append(')');
            return U3.toString();
        }
        throw new IllegalStateException();
    }
}
