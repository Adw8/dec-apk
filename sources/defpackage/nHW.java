package defpackage;

/* renamed from: nHW  reason: default package */
/* loaded from: classes.dex */
public final class nHW {
    public final long R;
    public final long v;

    public nHW(long j, long j2) {
        this.R = j;
        this.v = j2;
    }

    public final String toString() {
        StringBuilder U = opT.U("HistoricalChange(uptimeMillis=");
        U.append(this.R);
        U.append(", position=");
        U.append((Object) aWo.m(this.v));
        U.append(')');
        return U.toString();
    }
}
