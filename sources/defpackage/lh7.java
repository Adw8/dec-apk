package defpackage;

/* renamed from: lh7  reason: default package */
/* loaded from: classes.dex */
public final class lh7 {
    public int R;

    /* renamed from: R  reason: collision with other field name */
    public h9X f5801R;
    public int c;
    public int e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public h9X f5802v;

    public lh7(h9X h9x, h9X h9x2, int i, int i2, int i3, int i4) {
        this.f5801R = h9x;
        this.f5802v = h9x2;
        this.R = i;
        this.v = i2;
        this.c = i3;
        this.e = i4;
    }

    public final String toString() {
        StringBuilder U = opT.U("ChangeInfo{oldHolder=");
        U.append(this.f5801R);
        U.append(", newHolder=");
        U.append(this.f5802v);
        U.append(", fromX=");
        U.append(this.R);
        U.append(", fromY=");
        U.append(this.v);
        U.append(", toX=");
        U.append(this.c);
        U.append(", toY=");
        return jQ.P(U, this.e, '}');
    }
}
