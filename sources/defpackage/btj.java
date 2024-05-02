package defpackage;

/* renamed from: btj  reason: default package */
/* loaded from: classes.dex */
public final class btj {
    public int L;
    public int O;

    /* renamed from: R  reason: collision with other field name */
    public long f1838R;
    public int R = -1;
    public int v = 0;
    public int c = 0;
    public int e = 1;
    public int X = 0;

    /* renamed from: R  reason: collision with other field name */
    public boolean f1839R = false;

    /* renamed from: v  reason: collision with other field name */
    public boolean f1843v = false;

    /* renamed from: c  reason: collision with other field name */
    public boolean f1841c = false;

    /* renamed from: e  reason: collision with other field name */
    public boolean f1842e = false;

    /* renamed from: X  reason: collision with other field name */
    public boolean f1840X = false;

    /* renamed from: O  reason: collision with other field name */
    public boolean f1837O = false;

    public final void R(int i) {
        if ((this.e & i) == 0) {
            StringBuilder U = opT.U("Layout state should be one of ");
            U.append(Integer.toBinaryString(i));
            U.append(" but it is ");
            U.append(Integer.toBinaryString(this.e));
            throw new IllegalStateException(U.toString());
        }
    }

    public final String toString() {
        StringBuilder U = opT.U("State{mTargetPosition=");
        U.append(this.R);
        U.append(", mData=");
        U.append((Object) null);
        U.append(", mItemCount=");
        U.append(this.X);
        U.append(", mIsMeasuring=");
        U.append(this.f1842e);
        U.append(", mPreviousLayoutItemCount=");
        U.append(this.v);
        U.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        U.append(this.c);
        U.append(", mStructureChanged=");
        U.append(this.f1839R);
        U.append(", mInPreLayout=");
        U.append(this.f1843v);
        U.append(", mRunSimpleAnimations=");
        U.append(this.f1840X);
        U.append(", mRunPredictiveAnimations=");
        U.append(this.f1837O);
        U.append('}');
        return U.toString();
    }

    public final int v() {
        return this.f1843v ? this.v - this.c : this.X;
    }
}
