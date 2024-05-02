package defpackage;

/* renamed from: mjH  reason: default package */
/* loaded from: classes.dex */
public final class mjH {
    public int L;
    public int O;
    public final /* synthetic */ int R;

    /* renamed from: R  reason: collision with other field name */
    public boolean f6137R;
    public int X;
    public int c;

    /* renamed from: c  reason: collision with other field name */
    public boolean f6138c;
    public int e;
    public int v;

    /* renamed from: v  reason: collision with other field name */
    public boolean f6139v;

    public mjH(int i) {
        this.R = i;
        if (i != 1) {
            this.f6137R = true;
            this.O = 0;
            this.L = 0;
            return;
        }
        this.f6138c = true;
    }

    public final String toString() {
        switch (this.R) {
            case 0:
                StringBuilder U = opT.U("LayoutState{mAvailable=");
                U.append(this.v);
                U.append(", mCurrentPosition=");
                U.append(this.c);
                U.append(", mItemDirection=");
                U.append(this.e);
                U.append(", mLayoutDirection=");
                U.append(this.X);
                U.append(", mStartLine=");
                U.append(this.O);
                U.append(", mEndLine=");
                return jQ.P(U, this.L, '}');
            default:
                return super.toString();
        }
    }
}
