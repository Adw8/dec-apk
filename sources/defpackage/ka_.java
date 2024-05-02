package defpackage;

/* renamed from: ka_  reason: default package */
/* loaded from: classes.dex */
public class ka_ implements Iterable, dsi {
    public final int O;
    public final int X;
    public final int e;

    public ka_(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        } else if (i3 != Integer.MIN_VALUE) {
            this.e = i;
            this.X = pdD.V(i, i2, i3);
            this.O = i3;
        } else {
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
    }

    /* renamed from: R */
    public final jrc iterator() {
        return new jrc(this.e, this.X, this.O);
    }

    @Override // java.lang.Object
    public boolean equals(Object obj) {
        if (obj instanceof ka_) {
            if (!isEmpty() || !((ka_) obj).isEmpty()) {
                ka_ ka_ = (ka_) obj;
                if (!(this.e == ka_.e && this.X == ka_.X && this.O == ka_.O)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.O + (((this.e * 31) + this.X) * 31);
    }

    public boolean isEmpty() {
        if (this.O > 0) {
            if (this.e > this.X) {
                return true;
            }
        } else if (this.e < this.X) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Object
    public String toString() {
        int i;
        StringBuilder sb;
        if (this.O > 0) {
            sb = new StringBuilder();
            sb.append(this.e);
            sb.append("..");
            sb.append(this.X);
            sb.append(" step ");
            i = this.O;
        } else {
            sb = new StringBuilder();
            sb.append(this.e);
            sb.append(" downTo ");
            sb.append(this.X);
            sb.append(" step ");
            i = -this.O;
        }
        sb.append(i);
        return sb.toString();
    }
}
