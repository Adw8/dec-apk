package defpackage;

/* renamed from: heu  reason: default package */
/* loaded from: classes.dex */
public final class heu extends ka_ {
    public static final heu R = new heu(1, 0);

    public heu(int i, int i2) {
        super(i, i2, 1);
    }

    @Override // defpackage.ka_, java.lang.Object
    public final boolean equals(Object obj) {
        if (obj instanceof heu) {
            if (!isEmpty() || !((heu) obj).isEmpty()) {
                heu heu = (heu) obj;
                if (!(this.e == heu.e && this.X == heu.X)) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // defpackage.ka_, java.lang.Object
    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return this.X + (this.e * 31);
    }

    @Override // defpackage.ka_
    public final boolean isEmpty() {
        return this.e > this.X;
    }

    @Override // defpackage.ka_, java.lang.Object
    public final String toString() {
        return this.e + ".." + this.X;
    }
}
