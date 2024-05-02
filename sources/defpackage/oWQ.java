package defpackage;

/* renamed from: oWQ  reason: default package */
/* loaded from: classes.dex */
public final class oWQ {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public final int[] f6840R = new int[10];

    public final int R() {
        if ((this.R & 128) != 0) {
            return this.f6840R[7];
        }
        return 65535;
    }

    public final void v(int i, int i2) {
        if (i >= 0) {
            int[] iArr = this.f6840R;
            if (i < iArr.length) {
                this.R = (1 << i) | this.R;
                iArr[i] = i2;
            }
        }
    }
}
