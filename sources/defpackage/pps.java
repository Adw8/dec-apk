package defpackage;

/* renamed from: pps  reason: default package */
/* loaded from: classes.dex */
public final class pps {
    public float R;

    /* renamed from: R  reason: collision with other field name */
    public final int f7287R;

    /* renamed from: R  reason: collision with other field name */
    public final lz f7288R;
    public int c;
    public int e;
    public float v;

    /* renamed from: v  reason: collision with other field name */
    public final int f7289v;

    public pps(lz lzVar, int i, int i2, int i3, int i4, float f, float f2) {
        this.f7288R = lzVar;
        this.f7287R = i;
        this.f7289v = i2;
        this.c = i3;
        this.e = i4;
        this.R = f;
        this.v = f2;
    }

    public final int R(int i) {
        return caw.x(i, this.f7287R, this.f7289v) - this.f7287R;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pps)) {
            return false;
        }
        pps pps = (pps) obj;
        return n3x.v(this.f7288R, pps.f7288R) && this.f7287R == pps.f7287R && this.f7289v == pps.f7289v && this.c == pps.c && this.e == pps.e && n3x.v(Float.valueOf(this.R), Float.valueOf(pps.R)) && n3x.v(Float.valueOf(this.v), Float.valueOf(pps.v));
    }

    public final int hashCode() {
        return Float.hashCode(this.v) + jQ.c(this.R, opT.e(this.e, opT.e(this.c, opT.e(this.f7289v, opT.e(this.f7287R, this.f7288R.hashCode() * 31, 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder U = opT.U("ParagraphInfo(paragraph=");
        U.append(this.f7288R);
        U.append(", startIndex=");
        U.append(this.f7287R);
        U.append(", endIndex=");
        U.append(this.f7289v);
        U.append(", startLineIndex=");
        U.append(this.c);
        U.append(", endLineIndex=");
        U.append(this.e);
        U.append(", top=");
        U.append(this.R);
        U.append(", bottom=");
        return jQ.N(U, this.v, ')');
    }
}
