package defpackage;

/* renamed from: j07  reason: default package */
/* loaded from: classes.dex */
public final class j07 {
    public static final j07 R = new j07(0.0f, new p6(0.0f, 0.0f), 0);

    /* renamed from: R  reason: collision with other field name */
    public final float f4787R;

    /* renamed from: R  reason: collision with other field name */
    public final int f4788R;

    /* renamed from: R  reason: collision with other field name */
    public final p6 f4789R;

    public j07(float f, p6 p6Var, int i) {
        this.f4787R = f;
        this.f4789R = p6Var;
        this.f4788R = i;
        if (!(!Float.isNaN(f))) {
            throw new IllegalArgumentException("current must not be NaN".toString());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j07)) {
            return false;
        }
        j07 j07 = (j07) obj;
        return ((this.f4787R > j07.f4787R ? 1 : (this.f4787R == j07.f4787R ? 0 : -1)) == 0) && n3x.v(this.f4789R, j07.f4789R) && this.f4788R == j07.f4788R;
    }

    public final int hashCode() {
        return ((this.f4789R.hashCode() + (Float.hashCode(this.f4787R) * 31)) * 31) + this.f4788R;
    }

    public final String toString() {
        StringBuilder U = opT.U("ProgressBarRangeInfo(current=");
        U.append(this.f4787R);
        U.append(", range=");
        U.append(this.f4789R);
        U.append(", steps=");
        return jQ.P(U, this.f4788R, ')');
    }
}
