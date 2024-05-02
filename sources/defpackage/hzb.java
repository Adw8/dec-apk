package defpackage;

/* renamed from: hzb  reason: default package */
/* loaded from: classes.dex */
public abstract class hzb extends Z5 implements icv {
    public hzb(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) != 1 ? false : true);
    }

    @Override // java.lang.Object
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof hzb) {
            hzb hzb = (hzb) obj;
            return c().equals(hzb.c()) && ((Z5) this).f661R.equals(((Z5) hzb).f661R) && this.v.equals(hzb.v) && n3x.v(((Z5) this).f660R, ((Z5) hzb).f660R);
        } else if (obj instanceof icv) {
            return obj.equals(R());
        } else {
            return false;
        }
    }

    @Override // java.lang.Object
    public final int hashCode() {
        return this.v.hashCode() + opT.O(((Z5) this).f661R, c().hashCode() * 31, 31);
    }

    @Override // java.lang.Object
    public final String toString() {
        goX R = R();
        return R != this ? R.toString() : jQ.g(opT.U("property "), ((Z5) this).f661R, " (Kotlin reflection is not available)");
    }
}
