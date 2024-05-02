package defpackage;

/* renamed from: iWK  reason: default package */
/* loaded from: classes.dex */
public final class iWK extends xZ {
    public static final hw1 R = new hw1();
    public int e = 0;

    /* renamed from: R  reason: collision with other field name */
    public long f4629R = 0;
    public long v = 0;

    public iWK() {
        super(R);
    }

    public final void mL(long j) {
        if (j >= 0) {
            this.f4629R = j;
            return;
        }
        throw new IllegalArgumentException(opT.x("previousDelay must be non-negative: ", j).toString());
    }

    public final String toString() {
        StringBuilder U = opT.U("RetryStatus(attempt=");
        U.append(this.e);
        U.append(", previousDelay=");
        U.append(this.f4629R);
        U.append(", cumulativeDelay=");
        U.append(this.v);
        U.append(')');
        return U.toString();
    }
}
