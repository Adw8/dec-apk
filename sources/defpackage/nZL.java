package defpackage;

/* renamed from: nZL  reason: default package */
/* loaded from: classes.dex */
public abstract class nZL extends Z5 implements lbd, aNf {
    public final int X;
    public final int e;

    public nZL(int i, Class cls, String str, String str2, int i2) {
        super(OV.R, cls, str, str2, (i2 & 1) == 1);
        this.e = i;
        this.X = i2 >> 1;
    }

    /* renamed from: O */
    public final String toString() {
        goX R = R();
        return R != this ? R.toString() : "<init>".equals(((Z5) this).f661R) ? "constructor (Kotlin reflection is not available)" : jQ.g(opT.U("function "), ((Z5) this).f661R, " (Kotlin reflection is not available)");
    }

    @Override // defpackage.lbd
    public final int W() {
        return this.e;
    }

    /* renamed from: X */
    public final int hashCode() {
        return this.v.hashCode() + opT.O(((Z5) this).f661R, c() == null ? 0 : c().hashCode() * 31, 31);
    }

    /* renamed from: e */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nZL) {
            nZL nzl = (nZL) obj;
            return ((Z5) this).f661R.equals(((Z5) nzl).f661R) && this.v.equals(nzl.v) && this.X == nzl.X && this.e == nzl.e && n3x.v(((Z5) this).f660R, ((Z5) nzl).f660R) && n3x.v(c(), nzl.c());
        } else if (obj instanceof aNf) {
            return obj.equals(R());
        } else {
            return false;
        }
    }

    @Override // defpackage.Z5
    public final goX v() {
        g8d.R.getClass();
        return this;
    }

    public nZL(Object obj, Class cls, String str, String str2, int i) {
        super(obj, cls, str, str2, (i & 1) == 1);
        this.e = 1;
        this.X = i >> 1;
    }
}
