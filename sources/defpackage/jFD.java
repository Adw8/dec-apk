package defpackage;

/* renamed from: jFD  reason: default package */
/* loaded from: classes.dex */
public final class jFD implements mKb {
    public final int R;
    public final int v;

    public jFD(int i, int i2) {
        this.R = i;
        this.v = i2;
        if (!(i >= 0 && i2 >= 0)) {
            throw new IllegalArgumentException(("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i + " and " + i2 + " respectively.").toString());
        }
    }

    @Override // defpackage.mKb
    public final void R(p3R p3r) {
        int i = this.R;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2++;
            int i4 = p3r.R;
            if (i4 > i2) {
                if (Character.isHighSurrogate(p3r.v((i4 - i2) + -1)) && Character.isLowSurrogate(p3r.v(p3r.R - i2))) {
                    i2++;
                }
            }
            if (i2 == p3r.R) {
                break;
            }
        }
        int i5 = this.v;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            i6++;
            if (p3r.v + i6 < p3r.e()) {
                if (Character.isHighSurrogate(p3r.v((p3r.v + i6) + -1)) && Character.isLowSurrogate(p3r.v(p3r.v + i6))) {
                    i6++;
                }
            }
            if (p3r.v + i6 == p3r.e()) {
                break;
            }
        }
        int i8 = p3r.v;
        p3r.R(i8, i6 + i8);
        int i9 = p3r.R;
        p3r.R(i9 - i2, i9);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jFD)) {
            return false;
        }
        jFD jfd = (jFD) obj;
        return this.R == jfd.R && this.v == jfd.v;
    }

    public final int hashCode() {
        return (this.R * 31) + this.v;
    }

    public final String toString() {
        StringBuilder U = opT.U("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        U.append(this.R);
        U.append(", lengthAfterCursor=");
        return jQ.P(U, this.v, ')');
    }
}
