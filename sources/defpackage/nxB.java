package defpackage;

/* renamed from: nxB  reason: default package */
/* loaded from: classes.dex */
public final class nxB implements Comparable {
    public static int e = 1;
    public final fue R;

    /* renamed from: R  reason: collision with other field name */
    public final gIA f6641R;

    /* renamed from: R  reason: collision with other field name */
    public final mdz f6642R;
    public final fue v;

    public nxB(fue fue, fue fue2) {
        this.R = fue;
        this.v = fue2;
        this.f6642R = fue.f3603R;
        jP7 jp7 = fue.f3600R.f4974R;
        poS L = iTI.L(fue2);
        gIA gia = null;
        if (jp7.p() && L.p()) {
            gia = jp7.j(L, true);
        }
        this.f6641R = gia;
    }

    /* renamed from: R */
    public final int compareTo(nxB nxb) {
        gIA gia = this.f6641R;
        if (gia == null) {
            return 1;
        }
        gIA gia2 = nxb.f6641R;
        if (gia2 == null) {
            return -1;
        }
        if (e == 1) {
            if (gia.e - gia2.v <= 0.0f) {
                return -1;
            }
            if (gia.v - gia2.e >= 0.0f) {
                return 1;
            }
        }
        if (this.f6642R == mdz.Ltr) {
            int i = ((gia.f3720R - gia2.f3720R) > 0.0f ? 1 : ((gia.f3720R - gia2.f3720R) == 0.0f ? 0 : -1));
            if (!(i == 0)) {
                return i < 0 ? -1 : 1;
            }
        } else {
            int i2 = ((gia.c - gia2.c) > 0.0f ? 1 : ((gia.c - gia2.c) == 0.0f ? 0 : -1));
            if (!(i2 == 0)) {
                return i2 < 0 ? 1 : -1;
            }
        }
        int i3 = ((gia.v - gia2.v) > 0.0f ? 1 : ((gia.v - gia2.v) == 0.0f ? 0 : -1));
        if (!(i3 == 0)) {
            return i3 < 0 ? -1 : 1;
        }
        gIA U = ooA.U(iTI.L(this.v));
        gIA U2 = ooA.U(iTI.L(nxb.v));
        fue m = iTI.m(this.v, new o1H(U, 0));
        fue m2 = iTI.m(nxb.v, new o1H(U2, 1));
        if (m != null && m2 != null) {
            return new nxB(this.R, m).compareTo(new nxB(nxb.R, m2));
        }
        if (m != null) {
            return 1;
        }
        if (m2 != null) {
            return -1;
        }
        int compare = fue.f3586R.compare(this.v, nxb.v);
        return compare != 0 ? -compare : this.v.e - nxb.v.e;
    }
}
