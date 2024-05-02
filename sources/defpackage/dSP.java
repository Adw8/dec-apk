package defpackage;

/* renamed from: dSP  reason: default package */
/* loaded from: classes.dex */
public final class dSP extends xZ {
    public static final hw1 R = new hw1();

    /* renamed from: R  reason: collision with other field name */
    public final h22 f2611R;

    /* JADX INFO: 'super' call moved to the top of the method (can break code semantics) */
    public dSP() {
        super(R);
        dZc dzc = h22.R;
        this.f2611R = dzc;
    }

    public final String toString() {
        StringBuilder U = opT.U("RetryRandom(");
        U.append(this.f2611R);
        U.append(')');
        return U.toString();
    }
}
