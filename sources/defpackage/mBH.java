package defpackage;

/* renamed from: mBH  reason: default package */
/* loaded from: classes.dex */
public final class mBH {
    public static final mBH R = new mBH(19, ru.Up, 20, ru.Down, 21, ru.Left, 22, ru.Right);
    public static final mBH v = new mBH(92, ru.PageUp, 93, ru.PageDown, 122, ru.Home, 123, ru.End);

    /* renamed from: R  reason: collision with other field name */
    public final int f5970R;

    /* renamed from: R  reason: collision with other field name */
    public final ru f5971R;
    public final int c;

    /* renamed from: c  reason: collision with other field name */
    public final ru f5972c;
    public final int e;

    /* renamed from: e  reason: collision with other field name */
    public final ru f5973e;

    /* renamed from: v  reason: collision with other field name */
    public final int f5974v;

    /* renamed from: v  reason: collision with other field name */
    public final ru f5975v;

    public mBH(int i, ru ruVar, int i2, ru ruVar2, int i3, ru ruVar3, int i4, ru ruVar4) {
        this.f5970R = i;
        this.f5971R = ruVar;
        this.f5974v = i2;
        this.f5975v = ruVar2;
        this.c = i3;
        this.f5972c = ruVar3;
        this.e = i4;
        this.f5973e = ruVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mBH)) {
            return false;
        }
        mBH mbh = (mBH) obj;
        return this.f5970R == mbh.f5970R && this.f5971R == mbh.f5971R && this.f5974v == mbh.f5974v && this.f5975v == mbh.f5975v && this.c == mbh.c && this.f5972c == mbh.f5972c && this.e == mbh.e && this.f5973e == mbh.f5973e;
    }

    public final int hashCode() {
        int hashCode = this.f5971R.hashCode();
        int e = opT.e(this.f5974v, (hashCode + (Integer.hashCode(this.f5970R) * 31)) * 31, 31);
        int e2 = opT.e(this.c, (this.f5975v.hashCode() + e) * 31, 31);
        return this.f5973e.hashCode() + opT.e(this.e, (this.f5972c.hashCode() + e2) * 31, 31);
    }

    public final String toString() {
        int i = this.f5970R;
        ru ruVar = this.f5971R;
        int i2 = this.f5974v;
        ru ruVar2 = this.f5975v;
        int i3 = this.c;
        ru ruVar3 = this.f5972c;
        int i4 = this.e;
        ru ruVar4 = this.f5973e;
        return "DpadConfig(upCode=" + i + ", upIcon=" + ruVar + ", downCode=" + i2 + ", downIcon=" + ruVar2 + ", leftCode=" + i3 + ", leftIcon=" + ruVar3 + ", rightCode=" + i4 + ", rightIcon=" + ruVar4 + ")";
    }
}
