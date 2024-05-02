package defpackage;

import java.util.List;

/* renamed from: bz  reason: default package */
/* loaded from: classes.dex */
public final class bz implements CharSequence {
    public final String R;

    /* renamed from: R  reason: collision with other field name */
    public final List f1883R;
    public final List c;
    public final List v;

    public bz(String str, List list, List list2, List list3) {
        this.R = str;
        this.f1883R = list;
        this.v = list2;
        this.c = list3;
        List ZW = dF.ZW(list2, new gvk(2));
        int size = ZW.size();
        int i = -1;
        for (int i2 = 0; i2 < size; i2++) {
            m3 m3Var = (m3) ZW.get(i2);
            boolean z = true;
            if (!(m3Var.R >= i)) {
                throw new IllegalArgumentException("ParagraphStyle should not overlap".toString());
            } else if (m3Var.v > this.R.length() ? false : z) {
                i = m3Var.v;
            } else {
                StringBuilder U = opT.U("ParagraphStyle range [");
                U.append(m3Var.R);
                U.append(", ");
                throw new IllegalArgumentException(jQ.j(U, m3Var.v, ") is out of boundary").toString());
            }
        }
    }

    /* renamed from: R */
    public final bz subSequence(int i, int i2) {
        if (i <= i2) {
            return (i == 0 && i2 == this.R.length()) ? this : new bz(this.R.substring(i, i2), Tf.R(i, i2, this.f1883R), Tf.R(i, i2, this.v), Tf.R(i, i2, this.c));
        }
        throw new IllegalArgumentException(("start (" + i + ") should be less or equal to end (" + i2 + ')').toString());
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.R.charAt(i);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bz)) {
            return false;
        }
        bz bzVar = (bz) obj;
        return n3x.v(this.R, bzVar.R) && n3x.v(this.f1883R, bzVar.f1883R) && n3x.v(this.v, bzVar.v) && n3x.v(this.c, bzVar.c);
    }

    @Override // java.lang.Object
    public final int hashCode() {
        int hashCode = this.f1883R.hashCode();
        int hashCode2 = this.v.hashCode();
        return this.c.hashCode() + ((hashCode2 + ((hashCode + (this.R.hashCode() * 31)) * 31)) * 31);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.R.length();
    }

    @Override // java.lang.CharSequence, java.lang.Object
    public final String toString() {
        return this.R;
    }

    public bz(String str, List list, int i) {
        this(str, (i & 2) != 0 ? fcD.R : list, (i & 4) != 0 ? fcD.R : null, fcD.R);
    }
}
