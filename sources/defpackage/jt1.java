package defpackage;

/* renamed from: jt1  reason: default package */
/* loaded from: classes.dex */
public final class jt1 {
    public final int R;

    /* renamed from: R  reason: collision with other field name */
    public final Object f5095R;
    public final int v;

    public jt1(int i, int i2, ipI ipi) {
        this.R = i;
        this.v = i2;
        this.f5095R = ipi;
        boolean z = true;
        if (i >= 0) {
            if (!(i2 <= 0 ? false : z)) {
                throw new IllegalArgumentException(opT.Z("size should be >0, but was ", i2).toString());
            }
            return;
        }
        throw new IllegalArgumentException(opT.Z("startIndex should be >= 0, but was ", i).toString());
    }
}
